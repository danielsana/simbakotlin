open class myParentClass {
    val x = 5
    var name = "modcom"
}

class myChildClass:myParentClass() {
    fun myfunction(){
        println(x)
    }
}

fun main(args: Array<String>) {
    val child = myChildClass()
    child.myfunction()

    val names =  myParentClass()
    names.name
    println(names.name)
}