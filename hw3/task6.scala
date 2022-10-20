def main() {

    var funny = scala.io.StdIn.readInt() //reading in the given numbers
    var squared = funny * funny 
    var sqString = squared.toString //Makes it a string 
    


    var aList = s"$squared".splitAt(s"$squared".length - s"$funny".length)  //Makes a list of strings of when it split. Hence string interpol
    var portion1 = aList._1.toInt
    var portion2 = aList._2.toInt
    var totalForKap = portion1 + portion2

    if ((portion1 + portion2) == funny) {
    
        println(s"$funny" + " is a kaprekar number because " + s"$funny" + " is equal to " + s"$totalForKap")
    }
    else {
        println("Not a kaprekar number because " + s"$funny" + " does not equal " + s"$totalForKap")
    }

}

main()