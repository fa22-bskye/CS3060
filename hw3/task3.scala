import scala.util.Random

def doThis() ={

    var i = 1
    val r = new scala.util.Random

    while(i <= 20) {

        val x = 5 + r.nextInt((24 - 5) + 1)
        val y = scala.math.pow(x, 0.5)
        //print (x + " " + y + " \n")
        print("The square root of " + x +" is " + y +"\n")
        i += 1
    } 
}

doThis()