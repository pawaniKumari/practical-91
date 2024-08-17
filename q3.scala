object Format {
    def toUpper(name:String):String = name.toUpperCase()
    def toLower(name:String):String = name.toLowerCase()
    def formatNames(name:String)(formatFunction:String => String):String = formatFunction(name)
}


object Main extends App {
  
  println(Format.formatNames("Benny")(Format.toUpper))
  println(Format.formatNames("Niroshan")(name => name.substring(0,2).toUpperCase() + name.substring(2)))
  println(Format.formatNames("Saman")(Format.toLower))
  println(Format.formatNames("Kumara")(name => name.substring(0,1).toUpperCase() + 
            name.substring(1,name.length()-1).toLowerCase() + name.substring(name.length() -1).toUpperCase()))

}