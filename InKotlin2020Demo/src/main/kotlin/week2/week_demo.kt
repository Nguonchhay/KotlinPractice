package week2

fun week2Main() {
    println("*** Week 2 ***")
    task2()
}

fun task2() {
    println("- Task 2")

//    print("Enter width: ")
//    val width = readLine()!!.toInt()
//
//    print("\nEnter height: ")s
//    val height = readLine()!!.toInt()

    print("Enter width and height: ")
    val (width, height) = readLine()!!.split(' ').map(String::toInt)

    print("\n S = ${width * height}, P = ${2 * (width + height)}")
}
