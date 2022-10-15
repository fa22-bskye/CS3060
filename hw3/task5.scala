import scala.io.StdIn.readLine
import scala.io.StdIn

object theMain {
    
    def startingPoint(args: Array[String]) {
        val aStr = readLine(): String
        val aChar = readChar(): Char

        print(doSplit(aStr, aChar))
    }

    def doSplit(aStr: String, aChar: Char): List[String]= {
        var theSize = aStr.length()
        var charCount = 0
        var theImportantList = List("")
        var chrSubStr = ""

        for(i <- 0 to theSize - 1) {
            if(charCount >= 1 && aStr(i) != aChar) {
                chrSubStr += aStr(i)
            }

            if (aStr(i) == aChar) {
                charCount += 1

                if(charCount > 1) {
                    theImportantList = theImportantList :+ chrSubStr
                    chrSubStr = ""
                }
            }
        }
        return theImportantList.tail
    }
}


