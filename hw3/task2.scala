import scala.io.StdIn.readLine
import scala.io.Source


def findFun() {
    val theFile = readLine(): String
    val lines = Source.fromFile(theFile).getLines

    val keys1 = List("cpp","ruby")
    val keys2 = List("haskell","scala")

    for (line <- lines) {

        if (keys1.exists(line.contains)) {
        print ("The file content is good." + "\n")
        }
        else if (keys2.exists(line.contains)) {
        print ("The file is awesome." + "\n")
        }
        else {
        print ("The file is boring." + "\n")
        }
    }
}

findFun()