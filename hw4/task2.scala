
def foo(theList: List[Int]): Unit ={

    var theReturn =  List[Int]()
    var i = 0   //For odd sized
    var j = 0   //for even sized
    if (theList.size % 2 != 0) { // Checks the list to see if it has odd number size, if yes, keep last num in the last pos.

        while(i != theList.size - 1) {
            theReturn = theReturn :+ theList(i + 1)
            theReturn = theReturn :+ theList(i)
            i += 2
            }                                     //Iterate by 2, do i and i + 1 to get the pairs.
            
        theReturn = theReturn :+ theList.last
        }
        

    if (theList.size % 2 == 0) {
        while (j != theList.size) {
            theReturn = theReturn :+ theList(j + 1)
            theReturn = theReturn :+ theList(j)
            j += 2
        }
    }
println(theReturn)
    
}

foo(List(2,3,4,5,6,10,8))