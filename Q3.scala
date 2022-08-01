
def main(args: Array[String]): Unit = {

    println(formatNames("Benny")()(toUpper(_)))
    println(formatNames("Niroshan")(1)(toUpper(_)))
    println(formatNames("Saman")()(toLower(_)))
    println(formatNames("Kumara")(5)(toUpper(_)))
    
}
    
def toUpper(str: String): String = {
      return str.toUpperCase()
}
    
def toLower(str: String): String = {
      return str.toLowerCase()
}
    
def formatNames(name: String)( newList : Int* )(func: String => String): String = {
      
    if(newList.isEmpty){

      return func(name)
    }

    var tp = ""

    var i = 0

    while(i< name.length()){

       if (newList.contains(i)){
        tp = tp + func(name.charAt(i).toString)
       }

       else{
        tp = tp + name.charAt(i).toString
       }

       i = i+1

    }
   
    tp

}