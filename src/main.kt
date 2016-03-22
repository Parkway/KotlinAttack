fun main(args: Array<String>) {
    var greet = "Hello there. What would you like to do? \n"
    var greetx = "Hello again, \nhave you decided on what you'd like to do? \n"
    var roundx = "Addition \nSubtraction \nMultiplication \nDivision"
    println(greet + roundx)

    var myScn = readLine()
    loop@ while(true) {
        when (myScn) {
            "Addition", "+" -> {
                println("Let's do some addition!")
                println("\nFirst Number?")
                var ScnAdd1 = readLine()
                println("Second number?")
                var ScnAdd2 = readLine()
                var plus0 = ScnAdd1!!.toDouble()
                var plus1 = ScnAdd2!!.toDouble()
                var addanswer = plus0 + plus1
                println(addanswer)
                break@loop

            }
            "Subtraction" -> {
                println("\nFirst Number?")
                var ScnMinus = readLine()
                println("Second number?")
                var ScnMinus2 = readLine()
                var min0 = ScnMinus!!.toDouble()
                var min1 = ScnMinus2!!.toDouble()
                var subanswer = min0 - min1
                println(subanswer)
                break@loop
            }
            "Division" -> {
                println("Let's do some division.")
                println("\nFirst Number?")
                var ScnDiv = readLine()
                println("Second number?")
                var ScnDiv2 = readLine()
                var div0 = ScnDiv!!.toDouble()
                var div1 = ScnDiv2!!.toDouble()
                var divanswer = div0 / div1
                println(divanswer)
                break@loop
            }
            "Multiplication" -> {
                println("Let's \"multiply\" ;)")
                println("\nFirst Number?")
                var ScnMult = readLine()
                println("Second number?")
                var ScnMult2 = readLine()
                var mult0 = ScnMult!!.toDouble()
                var mult1 = ScnMult2!!.toDouble()
                var multanswer = mult0 * mult1
                println(multanswer)
                break@loop
            }
            else -> {
                println("Not an option")
                println("Would you like to try again?")
                var yes = readLine()
                if (yes == "no") {
                    println("\nHave a nice day.")
                    return
                } else {
                    println(greetx)
                    break@loop
                }
            }
        }
    }
    println("Would you like to do another?")
    var yesno = readLine()
    if (yesno == "Yes" || yesno == "Yeah")
        println(roundx)
    else
        println("Have a nice day.")
}
