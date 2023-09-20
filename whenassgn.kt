fun main() {
    var income:Int =-10000000

    when(income){
       in 1..5999 -> println("charges 150")
       in 6000..7999 -> println("charges 300")
       in 8000..11999 -> println("charges 400")
       in 12000..14999 -> println("charges 500")
       in 15000..19999 -> println("charges 650")
       in 20000..24999 -> println("charges 750")
       in 25000..29999 -> println("charges 850")
       in 30000..49999 -> println("charges 1000")
       in 50000..99999 -> println("charges 1500")
        else ->
            if (income >= 100000){
                println("charges 2000")
            }else {
                println("invalid entry")
        } 
}}