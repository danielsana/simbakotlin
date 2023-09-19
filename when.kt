// fun main(args: Array<String>) {
//     var a = 2

//     when{
//         a<10 -> println("$a is less than 10")
//         a==10 -> println("$a is equals to 10")
//         a>10 -> println("$a is greater than 10")
//         else ->{
//             println("invalid")
//         }
//     } 
// }

fun main(args: Array<String>) {
    var marks:Int = 90 //we set some marks here
    when(marks){
    in 1..30 -> println("You have $marks - Below average")
    in 31..50 -> println("You have $marks - Average")
    in 51..75 -> println("You have $marks - Above average")
    in 76..99 -> println("You have $marks - Excellent")
    else -> println("You have $marks - Invalid Marks try again")
    }
    }