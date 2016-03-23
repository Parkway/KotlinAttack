fun rec(//normalizeCase: Boolean = true,
      //  upperCaseFirstLetter: Boolean = true
        ) {
    var greet = "Hello there. What would you like to do? \n"
    var roundx = "Addition \nSubtraction \nMultiplication \nDivision"
    println(greet + roundx)
    var myScn = readLine()?.toLowerCase()

    loop@when (myScn) {
        "addition", "+" -> {
            println("Let's do some addition!")
            println("\nFirst Number?")
            var ScnAdd1 = readLine()
            println("Second number?")
            var ScnAdd2 = readLine()
            var plus0 = ScnAdd1!!.toDouble()
            var plus1 = ScnAdd2!!.toDouble()
            var addanswer = plus0 + plus1
            println(addanswer)
        }
        "subtraction" -> {
            println("\nFirst Number?")
            var ScnMinus = readLine()
            println("Second number?")
            var ScnMinus2 = readLine()
            var min0 = ScnMinus!!.toDouble()
            var min1 = ScnMinus2!!.toDouble()
            var subanswer = min0 - min1
            println(subanswer)
        }
        "division" -> {
            println("Let's do some division.")
            println("\nFirst Number?")
            var ScnDiv = readLine()
            println("Second number?")
            var ScnDiv2 = readLine()
            var div0 = ScnDiv!!.toDouble()
            var div1 = ScnDiv2!!.toDouble()
            var divanswer = div0 / div1
            println(divanswer)
        }
        "multiplication" -> {
            println("Let's \"multiply\" ;)")
            println("\nFirst Number?")
            var ScnMult = readLine()
            println("Second number?")
            var ScnMult2 = readLine()
            var mult0 = ScnMult!!.toDouble()
            var mult1 = ScnMult2!!.toDouble()
            var multanswer = mult0 * mult1
            println(multanswer)
        }
        "dicks" -> {
            var x = 5
            while (x <= 5 && x >= 1) {
                println("You love cocks")
                x--
            }
        }
        else -> {
            println("Not an option")
            println("Would you like to try again?")
            var yes = readLine()
            if (yes == "no") {
                println("\nHave a nice day.")
                return
            } else {
                rec()
            }
        }
    }
    println("\nWould you like to do another?")
        var io = readLine()
        if (io == "yes" || io == "Yes")
            rec()
        else
            println("\nHave a nice day.")
            return
}

fun main(args: Array<String>) {
    rec()
}
