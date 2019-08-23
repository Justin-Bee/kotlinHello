/*this is my first
kotlin class
Playing around with different things
 */

fun main(){
    println("please enter your name.....")
    var name = readLine()
    println("you entered $name")

    println("please enter a number to add")
    var num1= readLine()
    println("please enter another number to add")
    var num2 = readLine()
    var x=0
    var y=0
    try{
        x = num1!!.toInt()
        y = num2!!.toInt()

    }catch( nfe: NumberFormatException){

    }
    println("The result is "+ add(x, y))
}

fun add(x: Int, y: Int) = x + y



