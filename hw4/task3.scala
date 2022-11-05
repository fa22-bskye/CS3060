//Polymorphism, using rand numbers 0 to 1 pick either Hexagon or Circle, from there fill the 
//list with the 25 objects. Then foreach object in the list, call the area function
//to add all the areas of the objects into one result area.
import scala.math._

class Shape {
    var color:String = "white"
}

class Circle() extends Shape {
    var radius:Double = 3.0
    var sum = 3.14 * (pow(radius, 2))
    def circle: Double = sum
    def area: Double = sum  //Passes the sum
}

class Hexagon() extends Shape {
    var side:Double = 4.0
    var sum = (3 * sqrt(3) * pow(side,2)) / 2
    def hexagon: Double = sum   
    def area: Double = sum  //Passes the sum
 
}

var list:List[Shape] = Nil  //Empty list to fill with shape objects
val r = new scala.util.Random

for (i <- 1 until 25) {
    var j:Int = r.nextInt(2)    //Randomizes either 1 or 0

    if (j == 0) {   //Creates a circle object
        val c = new Circle()
        list = list :+ c
    }
    else if(j == 1) {   //Creates a hexagon object.
        val h = new Hexagon()
        list = list :+ h
    }
}
var sum:Double = 0
var sumC:Double = 0
var sumH:Double = 0

list.foreach {  //Iterates through the list of shape objects to get the totals for Both shapes and individual.
    case x:Circle => {sum += x.area; sumC += x.area}
    case x:Hexagon => {sum += x.area; sumH += x.area}   //Uses cases
}
println(s"The total area of both Circle and Hexagon is: $sum")
println(s"The total area for Circle is: $sumC")
println(s"The total area for Hexagon is: $sumH")
