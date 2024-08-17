object NumberIdentifier {
    def identifier(n:Int):String = {
        val identify:Int => String = n match {
            case x if x <= 0 => _=> "Negative/Zero is input"
            case x if x % 2 == 0 => _=> "Even number is input"
            case _ => _=> "Odd number is input"
        }
        identify(n)
    }
}

object Main extends App {
  
    println("Enter a number:")
    val n = scala.io.StdIn.readLine().toInt
    println(NumberIdentifier.identifier(n))

}