fun main(args: Array<String>) {
    var marks = -23

    if (marks>0 && marks<40){
        println("you have $marks marks")
        println("you've failed")
    } else if(marks>=40 && marks<70){
        println("you have $marks marks")
        println("you've passed")
    } else if (marks>=70 && marks<=100){
        println("you have $marks marks")
        println("very good")
    } else{
        println("invalid marks")
    }
}