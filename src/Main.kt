fun main() {
    println("Enter first number:")
    val digit1 = readlnOrNull() ?: return
    println("Enter secod number:")
    val digit2 = readlnOrNull() ?: return

    if (digit1.length == 1 && digit2.length == 1 && digit1 != digit2) {
        val oddNumber1 = digit1 + digit2
        val oddNumber2 = digit2 + digit1

        if (digit1.toInt() % 2 != 0) {
            println("an odd number: $oddNumber1")
        } else if (digit2.toInt() % 2 != 0) {
            println("an odd number: $oddNumber2")
        } else {
            println("it is impossible to create an odd number.")
        }
    } else {
        println("please enter two different numbers.")
    }
}
