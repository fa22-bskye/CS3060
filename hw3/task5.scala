object theMain {
    
    def main(args: Array[String]) {
        println("Input a string to use as input")
        var aStr = scala.io.StdIn.readLine()
        println("Input a Character to seperate the string by")
        var aChar = scala.io.StdIn.readChar()

        print(doSplit(aStr, aChar))
    }

    def doSplit(aStr: String, aChar: Char): List[String]= {
        var theSize = aStr.length();
        var charCount = 0;
        var theImportantList = List("");
        var chrSubStr = "";

        for(i <- 0 to theSize - 1) {
            if(charCount >= 1 && aStr(i) != aChar) {
                chrSubStr += aStr(i);
            }

            if (aStr(i) == aChar) {
                charCount += 1;

                if(charCount > 1) {
                    theImportantList = theImportantList :+ chrSubStr;
                    chrSubStr = "";
                }
            }
        }
        return theImportantList.tail
    }
}


