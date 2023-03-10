fun main(args: Array<String>) {
    print("Введите строку: ")
    val inp = readln()
    if (inp.isEmpty()) {
        print("Ошибочка, вы ввели пустую строчку..")
        return
    }
    findLengths(inp.uppercase().toCharArray())
}

fun findLengths(inp: CharArray) {
    val x = inp.sorted().toCharArray()
    var a = x[0]
    val lengths = ArrayList<Int>()
    val chars = ArrayList<Char>()
    var n = 0
    var i = 0
    for (b in x) {
        if (b != a) {
            lengths.add(n)
            chars.add(a)
            n = 0
        }
        a = b
        n++
    }
    lengths.add(n)
    chars.add(a)

    for (k in 0 until lengths.size) {
        println(chars[k] + " - " + lengths[k])
    }
}