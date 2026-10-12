fun main() {
    System.setOut(java.io.PrintStream(System.out, true, Charsets.UTF_8))
    print("Введите выражение в формате: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ ")
    val input = readln().trim()
    val parts = input.split(" ")
    if (parts.size != 3) {
        println("Неверный формат ввода.")
        return
    }
    val num1 = parts[0].toIntOrNull()
    val num2 = parts[1].toIntOrNull()
    val operation = parts[2]
    if (num1 == null || num2 == null) {
        println("Введенные значения не являются числами.")
        return
    }
    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0) {
                println("На ноль делить нельзя.")
                return
            }
            num1 / num2
        }
        else -> {
            println("Неизвестная операция '$operation'. Используйте +, -, *, /")
            return
        }
    }
    println("Результат: $result")
}