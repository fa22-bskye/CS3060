import scala.collection.mutable.HashMap
import scala.io.StdIn.readLine



    def foo(s: String): Int= {

        val myMap = new HashMap[Char, Int]
        //val s = readLine(): String
        // val y = s.toSet //Gets the characters 
        
        for (x <- s) {  //Iterates through the chars
            
            if (myMap.contains(x)) {
                myMap(x) = myMap(x) + 1 //Uses hashmap to count the frequency
            }
            else {
                myMap += ((x, 1))
            }
        }
        
        val fooCount = myMap.count(_._2 == 1)   //Assigns a val for unique the words
        println(s"There are: ${fooCount} unique chars for foo")
        fooCount    //Returns the values for def bar

    }

    def bar(barList: List[String]): Unit ={ 
        
         println(barList.map(x => foo(x)).toList)   //Creates a list of the num unique chars in the list.
       
    }


    foo("Hi my name is Skye")
    bar(List("mmmhjjk", "llop", "pppoohp"))