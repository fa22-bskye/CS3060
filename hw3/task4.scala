def sumOfPower() ={
    var exponent: Long = 1
    var answerToLife: Long = 0
    
  for (i <- 1 to 10) {
    exponent = 1
    for (j <- 1 to i) {
        exponent = exponent * i
    }

    answerToLife += exponent
  }
  print(answerToLife)
}

sumOfPower()