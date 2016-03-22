fun main(args: Array<String>) {
    var greet = "Hello there. What would you like to do? \nAddition? \nSubtraction \nMultiplication \nDivision"
    var greetx = "Hello again. Have you decided on what you'd like to do? \nAddition? \nSubtraction \nMultiplication \nDivision"
    println(greet)
    var x = 5

    var myScn = readLine()
    while (x == 5) {
            when (myScn) {
                "Addition", "+" -> {
                    println("Let's do some addition!")
                    println("\nFirst Number?")
                    var ScnPlus = readLine(); Double
                    println("Second number?")
                    var ScnPlus2 = readLine(); Double
                    var addanswer = ScnPlus + ScnPlus2
                    println(addanswer)
                }
                "Subtraction", "-" -> {
                    println("\nFirst Number?")
                    var ScnMinus = readLine(); Double
                    println("Second number?")
                    var ScnMinus2 = readLine()
                    var subanswer = ScnMinus + ScnMinus2
                    println(subanswer)
                }
                "Division", "/" -> {
                    println("Let's do some division.")
                    println("\nFirst Number?")
                    var ScnDiv = readLine()
                    println("Second number?")
                    var ScnDiv2 = readLine()
                    var divanswer = ScnDiv + ScnDiv2
                    println(divanswer)
                }
                "Multiplication", "x", "*" -> {
                    println("Let's multiply ;)")
                    println("\nFirst Number?")
                    var ScnMult = readLine()
                    println("Second number?")
                    var ScnMult2 = readLine()
                    var multanswer = ScnMult + ScnMult2
                    println(multanswer)
                }
                else -> {
                    println("Not an option. \nWould you like to try again?")
                    var userinput = readLine()
                    if (userinput == "yes")
                        return
                }
            }
        }
    }

// Education. All of the education.