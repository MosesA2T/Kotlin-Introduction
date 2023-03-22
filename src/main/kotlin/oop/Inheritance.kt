package oop

fun main(args: Array<String>) {
    // InheritanceAndPolymorphism
    var std1 = Student("Delphine", "delphine@gmail.com", "delphine123")
    std1.login()
    std1.register()

    var t1 = Teacher("King", "meepmeep@gmail.com", "king123")

    t1.register()
    t1.login()
    t1.suspendStudent()

    var ht1 = HeadTeacher("Ken", "king1@gmail.com", "messing123")

    ht1.register()
    ht1.login()
    ht1.suspendStudent()
    ht1.approveFunds()
}
open class Student(open var name:String, open var email:String, open var password:String){

    fun register(){
        println("You registered with email $email and password $password")
    }
    fun login(){
        println("You logged in with email $email and password $password")
    }
}

open class Teacher(name:String, email:String, password: String):Student(name, email, password){
    fun suspendStudent(){
        println("Yeah, I can suspend a student")
    }
}

open class HeadTeacher(name:String, email: String, password:String):Teacher(name, email, password){
    fun approveFunds(){
        println("Yeah, I can ")
    }
}