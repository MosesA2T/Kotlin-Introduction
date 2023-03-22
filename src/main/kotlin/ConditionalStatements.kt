fun main(args: Array<String>) {
    // IF STATEMENTS
    var age = 20
    if (age < 18){
        println("You are underage")
    }else{
        println("Welcome to the party")
    }

    var weight = 100
    var height = 1.9
    var bmi = weight / (height * height)
    if (bmi <=  18) {
        println("Underweight")
    }else if (bmi <= 29) {
        println("Normal weight")
    }else if (bmi <= 34){
        println("Overweight")
    }else{
        println("Obese")
    }

    var English = 90
    var Maths = 80
    var Science = 87
    var Kiswahili = 89
    var mean = (English + Maths + Science + Kiswahili) / 4
    if (mean <=20){
        println("E")
    }else if (mean <= 40){
        println("D")
    }else if (mean <= 60){
        println("C")
    }else if (mean <= 80){
        println("B")
    }else
        println("A")
    // WHEN STATEMENTS
    var bettingnumber = 0
    when (bettingnumber){
        1 ->{
            println("You lost")
        }
        2 ->{
            println("You lost")
        }
        3 ->{
            println("You lost")
        }
        4 ->{
            println("You lost")
        }
        else ->{
            println("Enter a number from 1 - 4 to bet")
        }
    }
}


