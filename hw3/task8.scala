import scala.collection.mutable.ListBuffer
def foo(listA: List[Int], listB: List[Int]): Unit={

    var i = 0

    var theReturn =  List[Int]()
    while (i != listA.length && i != listB.length) {
        var currTuple = (listA(i), listB(i))
        var a = theReturn :+ currTuple
        println(currTuple)
        println(a)
        i += 1
    }
}


foo(List(1, 2, 3), List(21, 22, 23))