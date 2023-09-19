fun main(args: Array<String>) {
    var age = 18
    var weight = 54

    if (age>=18){
        if (weight>=50){
            println("you can donate blood")
        } else{
            println("you cannot donate blood")
            println("you're under weight")
        }
    } else{
        println("you cannot donate blood")
        println("you must have 18 yrs and above")
    }
    
}