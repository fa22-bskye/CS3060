object Task
{
    def main(args: Array[String]) 
    {
    println("Input a string to use as input")
    var string = scala.io.StdIn.readLine() 
    println("Input a Character to seperate the string by")
    var character = scala.io.StdIn.readChar() 
    print(doSplit(string, character))
    }
    def doSplit(string: String, character: Char) : List[String] = 
    {
     var len = string.length();
     var characterCount = 0;
     var answerList = List("");    
     var answer = "";

      
        for (i <- 0 to len-1)
        {
         if(characterCount >= 1 && string(i)!=character){
                answer += string(i);
            }
           
            if( string(i) == character){
                characterCount += 1;
               
                if(characterCount>1){
                    answerList = answerList :+ answer;
                    answer = "";
                }
            }
        }
      
        return answerList.tail
    }
}