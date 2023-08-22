//import Tasks.BallTask

fun main() {


}















/*
    println(testSimple(3, 10))
    println(testString(10))

    testNamedArguments(y = 4, z = 2, x = 5)

    testDefaultArguments()
    testDefaultArguments(y = 1)

    val items = listOf("apple", "banana", "orange")

    var items2 = mutableListOf("ggs", "hi", "buy")
    items2.addAll(items)
    println("HI, $items2")



fun testSimple(x: Int, y: Int): Int = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}*/


/*for (item in items)
    println(item)

var index = 0
while (index < items.size) {
    println("Item at $index is ${items[index]}")
    index++
    if(index > 2)
        println("HEHE - BOI")
}*/

//Диапазоны
/*println(5 in 3..10)
if(true){
    println("da est' zhe")
}

for (i in 1..10)
    println(i)

for (i in 1 until 10)
    println(i)

for (i in 10 downTo 1)
    println(i)

for (i in 0..100 step 10)
    println(i)*/


/*val numberOfOrders: Int = 42

    var notificationText: String = "Don't forget your mask and gloves!"

    println("$numberOfOrders and $notificationText");

    notificationText = "You don't need masks anymore"

    println("$numberOfOrders and $notificationText");


    // целочисленные
    val intNum1: Int = -2147483648 // 32 bit
    val intNum2: Int = 2147483647 // 32 bit
    val longNum: Long = 0 // 64 bit
    val shortNum: Short = 0 // 16 bit
    val byteNum: Byte = 0 // 8 bit
    val unsignedNum: UInt = 2147483648u // 32 bit

    // вещественные
    val doubleNum: Double = 234.42 // 64 bit
    val floatNum: Float = 847.2f // 32 bit

    // строковые
    val stringValue: String = ""
    val charValue: Char = '1'

    // логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false*/


/*    //BallTask().Ball()

//    data input
    val a = 13
    val b = 10

//    finding the maximum number
    val maxNumber: Int = getMaxNumber(a, b)
//    data output on screen
    println(maxNumber)
}

fun getMaxNumber(firstNumber: Int, secondNumber: Int): Int {
    return if (firstNumber > secondNumber)
        firstNumber
    else
        secondNumber*/

/*
    var a: Int = 5
    var name: String = "rectangle"
    var diagonal: Double = 5.83
    var isSquare: Boolean = false
*/


/*//input value A
    print("Enter A: ")
    val a: Int = readln().toInt()
    println("A = $a.")

    //input value B
    print("Enter B: ")
    val b: Int = readln().toInt()
    println("B = $b.")

    //data processing
    val sum: Int = a + b

    //data output
    println("Sum of A and B = $sum!")*/


/*Переменные всегда с маленькой буквы!
val salary: Int = 3400

val userName: String = "Kirill"
println(salary)*/

/*var text: String = "Hello"

text += " World!"

val letter: Char = 't'
println(letter)*/


/*
val name: String = "Kirill"
val age: Int = 27
val document: String = "passport"

//ticket buy

//passenger Kirill, age: 27, document type: passport

println("Name: $name | Age: $age | Document type: $document")*/

/*val text: String = "4"
val a: Int = 25
val txt: String = a.toString() + " Yeah!"
val sum: Int = text.toInt()+10
println(txt)
println(sum)*/


/*
//    if age of passenger > 14, then need a passport, otherwise need birth certificate

    val passengerAge: Int = 15

    val document = if (passengerAge > 14)
        "passport"
    else
        "birth certificate"

    println(document)
*/

/*    val number1: Int = 32
    val number2: Int = 23
    val number3: Int = 68

    val answer = if(number1 > number2 && number1 > number3)
        "number 1 is bigger - $number1"
    else if (number2 > number1 && number2 > number3)
        "number 2 is bigger - $number2"
    else
        "number 3 is bigger - $number3"

    println(answer)*/


/*print("Please enter your rating: ")
val rating: Int = readln().toInt()

//    for 1 will be - bad
//    for 2 will be - bad
//    for 3 will be - normal
//    for 4 will be - good
//    for 5 will be - excellent


*//*val answer: String = when {
        rating == 1 || rating == 2 -> "Bad = $rating"
        rating == 3 -> "Normal = $rating"
        rating == 4 -> "Good = $rating"
        rating > 4 && rating <= 10 -> "Excellent = $rating"
        else -> "Insane = $rating"
    }
    println(answer)*//*

    val condition1: Boolean = rating == 1 || rating == 2

    println(condition1)

*/
