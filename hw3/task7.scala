import scala.io.Source
import scala.collection.mutable.HashMap
import java.io.File


object FileReader {
    def main(args: Array[String]) {
        
        val lines1 = Source.fromFile("story1.txt").getLines
        val lines2 = Source.fromFile("story2.txt").getLines
        val myMap1 = new HashMap[String, Int]
        val myMap2 = new HashMap[String, Int]
        var i = 0


        for(line <- lines1) { //For story1, fills the Hashmap1 for the words, then counts the frequency.
            var zeWords = line.split(" ")

            for (word <- zeWords) { //The words for story1
                
              if( myMap1.contains(word) && word != "" ) {
                var tmp1 = myMap1(word)
                tmp1 += 1
                myMap1(word) = tmp1
              }

              else if (word != "") {
                myMap1 += ((word, 1))
              }
            }
        }
        //println(myMap1) //To test to see if map has filled


        for(line <- lines2) {
          var zeWords = line.split(" ")

          for(word <- zeWords) {

            if (myMap2.contains(word) && word != "") {
              var tmp2 = myMap2(word)
              tmp2 += 1
              myMap2(word) = tmp2
            }

            else if (word != "") {
              myMap2 += ((word, 1))
            }
          }
        }
        //println(myMap2)
        println(s"There are  ${myMap1.filter(_._2 == 1).size} unique words in Story 1 as listed \n")
        println(myMap1.filter(_._2 == 1).map(_._1))
        print("\n" + "\n")
        println(s"There are ${myMap2.filter(_._2 == 1).size} unique words in Story 2 as listed \n")
        println(myMap2.filter(_._2 == 1).map(_._1) + "\n")
        print("\n" + "\n")

        
      
        var theMax1 = myMap1.valuesIterator.max
        var maxThirdFreq1 = myMap1.filter(_._2 == 15)
        println(s"The 3rd frequent word in Story 2 is: ${maxThirdFreq1.map(_._1)} with ${maxThirdFreq1.map(_._2)} frequencies. \n")

        var theMax2 = myMap2.valuesIterator.max
        var maxThirdFreq2 = myMap2.filter(_._2 == 21)
        println(s"The 3rd frequent word in Story 2 is: ${maxThirdFreq2.map(_._1)} with ${maxThirdFreq2.map(_._2)} frequencies. \n")


        val mapCombo = new HashMap[String, Int]

        println("Listed here are the combined story1 and 2 frequent common and unique words: \n")
        for ((k, v) <- myMap1) {  //These for loops compare and fill a new hashmap to inclue the combined stories and increment the frequency.
          mapCombo += ((k, v))
        }
        
        for ((k, v) <- myMap2) {

          for ((key, value) <- myMap1) {

            if (key == k) {
              mapCombo += ((key, v + 1))
            }
            else {
              mapCombo += ((key, value))
            }
          }
        }

        println(mapCombo)

    }
}


