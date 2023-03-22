package oop

import java.awt.Color

fun main(args: Array<String>) {
    // These are objects
    var f1 = Fruit("Mango", "Yellow", "200g", 30.0)
    var f2 = Fruit("Apple", "Pink", "250g", 50.0)
    println(f1.name)
    println(f2.color)

    var car1 = Car("Toyota Supra", "KDK 560J", 7400000.00)
    var car2 = Car("Lamborghini Urus", "KDJ 452K", 14000000.00)
    println(car1.model)
    println(car2.reg_no)
}

// This is a class
class Fruit(name:String, color: String, size:String, price:Double){
    // declare the properties to be initialised
    var name:String
    var color:String
    var size:String
    var price:Double
    // Initialise the properties
    init{
        this.name = name
        this.color = color
        this.size = size
        this.price = price

    }

}
class Car(model:String, reg_no:String, price: Double){
    var model:String
    var reg_no:String
    var price:Double
    init{
        this.model = model
        this.reg_no = reg_no
        this.price = price
    }
    // These  are class functions
    fun acceleration(){
        println("Yeah, I can accelerate.")
    }
    fun brake(){
        println("I am a $model and I can brake.")
    }

}