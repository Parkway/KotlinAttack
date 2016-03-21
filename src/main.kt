fun main(args: Array<String>) {
    var greet = "Hello there. What would you like to do? \nAddition? \nSubtraction \nMultiplication \nDivision"
    var greetx = "Hello again. Have you decided on what you'd like to do? \nAddition? \nSubtraction \nMultiplication \nDivision"
    println(greet)

    var myScn = readLine()
fun readLine() = double?
    when (myScn) {
        "Addition","+" -> {
            println("Let's do some addition!")
            println("\nFirst Number?")
            var plus0_raw = readLine()
            println("Second number?")
            var plus1_raw = readLine()
            val plus0 = plus0_raw.toLong()
            val plus1 = plus1_raw.toLong()
            val addanswer = plus0 + plus1
            println(addanswer)
        }
        "Subtraction" -> {
            println("\nFirst Number?")
            var ScnMinus = readLine()
            println("Second number?")
            var ScnMinus2 = readLine()
            var subanswer = ScnMinus + ScnMinus2
            println(subanswer)
        }
        "Division" -> {
            println("Let's do some division.")
            println("\nFirst Number?")
            var ScnDiv = readLine()
            println("Second number?")
            var ScnDiv2 = readLine()
            var divanswer = ScnDiv + ScnDiv2
            println(divanswer)
        }
        "Multiplication" -> {
            println("Let's multiply ;)")
            println("\nFirst Number?")
            var ScnMult = readLine()
            println("Second number?")
            var ScnMult2 = readLine()
            var multanswer = ScnMult + ScnMult2
            println(multanswer)
        }
        else -> {
            println("Not an option")
            println("Would you like to try again?")
                var no = readLine()
                if (no == "no") {
                    println("\nHave a nice day.")
                    }
            else {
                    println(greetx)
                }
        }
    }

}
// Education. All of the education.
