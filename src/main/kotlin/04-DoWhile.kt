fun testDoWhile() {
    var sum: Int = 0
    var input: String

    do {
        print("Enter an Integer: ")
        input = readln()!!
        sum += input.toInt()
    } while (input != "0")
    println("sum = $sum")
}