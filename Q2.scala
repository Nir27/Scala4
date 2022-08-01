

def main(args: Array[String]): Unit = {
    
    print("Enter a number ");
    var num = scala.io.StdIn.readInt ;
    print(identify(num));
    
}  
def identify(num:Int):String = num match{

        case  x  if x<=0   =>    "Negative/Zero is input."
        case  x  if x%2==0 =>    "Even number is given."
        case  x  if x%2==1 =>    "Odd number is given."
}

 
   
    
    