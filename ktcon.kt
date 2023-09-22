class Cars(var brand:String, var model:String, var year:Int){
    // functions
    fun drive() {
        println("Wrooom!")
      }
    
    fun speed(maxSpeed: Int) {
    println("Max speed is: " + maxSpeed)
    }
}

fun main() {

    // CONSTRUCTOR
    val c1 = Cars("BMW","X5",2000)

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    c1.drive()
    c1.speed(180)
}