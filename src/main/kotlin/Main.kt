fun main() {
    System.setOut(java.io.PrintStream(System.out, true, Charsets.UTF_8))
    print("Введите натуральное число в 10-ичной системы: ")
    val str = readln()
    var number = str.toInt()
    if (number == 0) {
        println(0)
        return
    }
    var result = ""
    while (number > 0) {
        result = (number % 2).toString() + result
        number /= 2
    }
    print("Число в двоичной системе: ")
    print(result)
}