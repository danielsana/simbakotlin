class Car{
    var brand =""
    var model =""
    var year =0
}

fun main(args: Array<String>) {
    val c1 = Car()

    c1.brand ="Ford"
    c1.model ="Mustang"
    c1.year =1989

    val c2 = Car()

    c2.brand ="BMW"
    c2.model ="X5"
    c2.year =1990

    
    println(c1.brand)
    println(c1.model)
    println(c1.year)

    println(c2.brand)
    println(c2.model)
    println(c2.year)

}