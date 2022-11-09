import scala.util.matching.Regex
import scala.io.Source

val imgRegex = """(http)?s?:?(\/\/[^"']*\.(jpg|jpeg|gif|png|svg))""".r
val scriptRegex =   """(?s)<script.*?</script>""".r
val linkRegex = "(?i)<a.+?href=\"(http.+?)\".*?>(.+?)</a>".r

def getImgs(x: String): Int= {  //Returns count of imgs from the given url
    val page = io.Source.fromURL(x)("ISO-8859-1").mkString
    val imgs = imgRegex.findAllIn(page).matchData.toList.size
    return imgs
}

def getScpt(x: String) : Int= { //Returns the count of scripts from the given url
    val page = io.Source.fromURL(x)("ISO-8859-1").mkString
    val scripts = scriptRegex.findAllIn(page).matchData.toList.size
    return scripts
}

def getPageSize(x: String) = {  //Uses in comparison to find which link has more than 50 characters.
    scala.io.Source.fromURL(x)("ISO-8859-1").mkString.size
}

def getCount(x: String): Int ={ //Sequential count of all the URLS and also a if to print out links.size > 50. RETURNS THE SUM OF IMGS
    
    val t1 = System.currentTimeMillis() //start time
    val page = io.Source.fromURL(x)("ISO-8859-1").mkString
    val innerWebpages = linkRegex.findAllIn(page).matchData.toList.map(_.group(1))
    val combo = innerWebpages :+ x

    val imgListCount = combo.map {  //Gathers all the images found in ALL the URLS and inputs them into a map. Remember URL .size is returned
        x => getImgs(x.toString())  //To string to ensure
    }

    combo.foreach { //combo is the URL and the URLs, iterates through and if a url size is greater than 50 chars prints
        x => if(getPageSize(x.toString()) > 50) {   //out the urls which is x with over 50 chars
            println(s"Website $x is over 50 chars")
        }
    }
    val sum = imgListCount.reduce(_+_)   
    val t2 = System.currentTimeMillis() //end time
    val sTime = t2 - t1
    println(s"Total exec time for Sequential is $sTime")
    return sum
}


def parGetCount(x: String): Int ={  //Parallel count, same as seq but uses .par which results in better run times.

    val t3 = System.currentTimeMillis() //start time
    val page = io.Source.fromURL(x)("ISO-8859-1").mkString
    val innerWebpages = linkRegex.findAllIn(page).matchData.toList.map(_.group(1)).par  //Par is used here
    val combo = innerWebpages :+ x

    val imgListCount = combo.map {  //Gathers all the images found in ALL the URLS and inputs them into a map. Remember URL .size is returned
        x => getImgs(x.toString())  //To string to ensure
    }

    combo.foreach { //combo is the URL and the URLs, iterates through and if a url size is greater than 50 chars prints
        x => if(getPageSize(x.toString()) > 50) {   //out the urls which is x with over 50 chars
            println(s"Website $x is over 50 chars")
        }
    }
    val sum = imgListCount.reduce(_+_) 
    val t4 = System.currentTimeMillis() //end time
    val pTime = t4 - t3  
    println(s"Total exec time for Parallel is $pTime")
    return sum
}


println(getImgs("https://www.cnn.com"))
println(getScpt("https://www.cnn.com"))
val result = getCount("https://www.cnn.com")
val resultP = parGetCount("https://www.cnn.com")
println(s"Tadaaa total number of the images Parallelly in the selected url and urls of this webpage is $resultP")
println(s"Tadaaa total number of the images Sequentially in the selected url and urls of this webpage is $result")



