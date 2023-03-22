import java.time.Year

fun main(args: Array<String>) {
    addition(23, 45.5)
    addition(32, 54.3, 2)
}

fun addition(x:Int, y:Double){
    var jibu = x + y
    println("Answer from Addition1 is $jibu")
}
fun addition(x:Int, y:Double, z:Int){
    var jibu = x + y + z
    println("Answer from addition2 is $jibu")
}