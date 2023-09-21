// var name = "modcom"

class triangle {
    private var base: Double = 2.4
    private var height: Double = 5.4

    fun area(){
        var area = 0.5*(base*height)
        println("The area of the triangle is : $area")
    }
}

class PayRoll{
    private var basic: Double =24000.0
    private var allowance: Double =2000.0
    private var tax: Double =3444.0
    private var name: String ="Hassan"

    fun findGross() {
        val gross: Double = (basic + allowance) - tax
        println("Your name was:"+ name)
        println("Gross Pay is:"+ gross)
    }
}

class health{
    private var weight:Double = 70.0
    private var height:Double = 1.73

    fun findBMI(){
        var BMI = weight/(height*height)
        println("the bmi is : $BMI")
    }
}

fun main(args: Array<String>) {
    //we create an object using val,
    //we initialize it to Triangle class.
    // create object of Triangle class

    val triangle_object = triangle()
    //using the created object we call findArea() function
    triangle_object.area()

    val gross_income = PayRoll()
    gross_income.findGross()

    val health = health()
    health.findBMI()
}
