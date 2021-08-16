package kot

fun main() {
    val time = 14
    val goodWeather = false
    val doing = when {
        time in 6..22 && goodWeather -> "Go walking"
        time in 6..22 && !goodWeather -> "Read the book"
        time in 23 downTo 5 -> "Time to sleep"
        else -> "Wrong time!!!"
    }
    println(doing)
}