object InterestCalculator{
  def calculate(amount:Double):Double = {
    val interest:Double => Double = amount match {
      case x if x <= 20000   => _ * 0.02
      case x if x <= 200000  => _ * 0.04
      case x if x <= 2000000 => _ * 0.035
      case _                 => _ * 0.065 
    }
    interest(amount)
  }
}

object Main extends App {
  
  println("Interest Amount for 450000:" + InterestCalculator.calculate(450000))

}