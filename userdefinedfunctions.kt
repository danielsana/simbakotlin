fun main(args: Array<String>) {
 callme() 
 addnumbers()  
 check()
 add_numbers(12.0,13.5)
 si(6000.0, 11.0, 3.0)
 checkmarks(75.0, 7390)
}

fun callme(){
    println("hello student")
}

fun addnumbers(){
    var num1:Int = 16
    var num2:Int =24
    var sum =num1+num2
    println("the sum is $sum")
}

fun check(){
    val number = -78

    if (number<0){
        println("$number negative number")
    }else if(number>0){
        println("$number positive number")
    }else{
        println("$number invalid input")
    }
}

// functions with parameters

fun add_numbers(number1:Double,number2:Double){
    val answer = number1+number2
    println("the sum is $answer")
}

fun si(principle:Double,rate:Double,time:Double){
    val answer =principle*rate/100*time
    println("si is $answer")
}

fun checkmarks(marks:Double,AdminNo:Int){
    if(marks<30){
        println("your admission no is: $AdminNo, you've failed")
        println("you've scored $marks")
    }else if(marks>=30 && marks<75){
        println("your admission no is: $AdminNo, you've passed")
        println("you've scored $marks")
    }else if(marks>=75 && marks<=100){
        println("your admission no is: $AdminNo, very good")
        println("you've scored $marks")
    }else{
        println("your admission no is: $AdminNo, enter valid marks")
    }
}