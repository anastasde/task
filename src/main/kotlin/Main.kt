fun main() {
    var result = 0
    print("Введите первую цифру: ")
    val a = readln()
    print("Введите вторую цифру: ")
    val b = readln()
    if (b.toInt() % 2 != 0 && a != "0")
    {
        result = (a + b).toInt();
    } else if (a.toInt() % 2 != 0 && b != "0"){
        result = (b + a).toInt();
    }
    else
        println("Создать нечетное число невозможно")
    println(result)
}