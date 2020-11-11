class Calculator(name: String) {

    init {
        println("This is $name's calculator")
    }

    fun add(num1: Int, num2: Int): String {
        return "$num1 + $num2 = ${num1 + num2}"
    }

    //inline function
    fun subtract(num1: Int, num2: Int): String = "$num1 - $num2 = ${num1 - num2}"

    //lambda expression
    val multiply = {num1: Int, num2: Int -> num1 * num2}

    fun divide(num1: Int, num2: Int): Any {
        return if (num1 == 0 || num2 == 0) {
            "Error: Can not divide by 0"
        } else {
            num1 / num2
        }
    }

    fun power(num1: Int, num2: Int): Int {
        var result = 1
        for (i in 1..num2) {
            result *= num1
        }
        return result
    }
}

fun main() {
    val cal = Calculator("Chris")
    println(cal.add(5, 5))
    println(cal.subtract(20, 6))
    println(cal.multiply(4, 5))
    println(cal.divide(0, 6))
    println(cal.divide(9, 3))
    println(cal.power(10, 4))
}