@file:Suppress("UNUSED_PARAMETER")

fun main(args: Array<String>) {
    println("Hello World!")
}

fun calcCal(input: String): String {
    val items = input.split("\n\n").filter { it.isNotBlank() }
    var count = 0

    for (item in items){
        val calories = item.split("\n").mapNotNull { it.toIntOrNull() }
        println(calories)
        val totalCals = calories.sum()

        if (totalCals > count) {
            count = totalCals
        }
    }
    return count.toString()
}


