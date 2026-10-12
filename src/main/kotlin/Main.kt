fun main() {
    System.setOut(java.io.PrintStream(System.out, true, Charsets.UTF_8))
    print("Введите число n: ")
    val n = readln().toInt()
    print("Введите основание x: ")
    val x = readln().toInt()
    if (x <= 1 || n <= 0) {
        println("Целочисленный показатель не существует")
        return
    }
    var current = 1
    var y = 0
    while (current < n) {
        current *= x
        y++
    }
    if (current == n) {
        println("Целочисленный показатель y = $y")
    } else {
        println("Целочисленный показатель не существует")
    }
}