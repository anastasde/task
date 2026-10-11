fun main() {
    System.setOut(java.io.PrintStream(System.out, true, Charsets.UTF_8))
    print("Введите строку: ")
    val input = readln()
    val chars = input.toCharArray()
    var count = 1
    for (i in 0 until chars.size - 1) {
        for (j in 0 until chars.size - 1 - i) {
            if (chars[j] > chars[j + 1])
            {
                val a = chars[j]
                chars[j] = chars[j + 1]
                chars[j + 1] = a
            }
        }
    }
    for (i in chars.indices)
    {
        if (i == chars.size - 1)
        {
            if (chars[i] == chars[i - 1])
            {
                count++
            } else
                count = 1
            println(chars[i] + " - " + count)
        } else
            if (chars[i] == chars[i + 1])
            {
                count ++
            }
            else
            {
                println(chars[i] + " - " + count)
                count = 1
            }
    }
}