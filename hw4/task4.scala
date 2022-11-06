def foo(s: String): Boolean ={  //Used recursively for bar

    val orig = s
    val rev = s.reverse 

    if (s.equals(rev)) {    //Used to compare the 2 strings if they are equal when reversed and not
        return true
    }
    else {
        return false
    }
}

def bar(b: List[String]): List[String] ={
    b.filter(word => foo(word) == true) //Creates the list by filter. An argument in placed to assure filtering.
}


println(bar(List("malayalam", "cczze","yxzxy")))    //prints the list