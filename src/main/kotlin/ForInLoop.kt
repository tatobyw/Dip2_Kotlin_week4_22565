fun  testForInLoop(){
    for (x in 1..5){
        println(x)
    }
}

fun testForInloop2(){
    val min = 1
    val max = 5
    var count = 0
    for(i in min..max ){
        if(i % 3 == 0){
            count++
        }
    }
    println("Count = " + count)
}

fun tesForInloop3(){
    for(i in 0 until 101 step 20){
        println(i)
    }
}

fun testForLoop4(){
    for (i in 10 downTo 1){
        println(i)
    }
}

fun testForLoop5(){
    for (i in 1 ..5) print(i)
    println()
    for (i in 5 ..1) print(i)
    println()
    for (i in 1 downTo  5) print(i)
}

fun  testForLoopArray(){
    var language = arrayOf("Ruby","Kotlin","Python","Java")
    for(item in language){
        print(item + ",")
    }
}

fun testForLoopString(){
    var text = "Kotlin"

    for(letter in text){
        print(letter)
    }
}
