package kot

//when как и if является выражением

fun main() {
    val time = 14 //время
    val goodWeather = true //хорошая погода
    val doing = when { //что делаем?
        time in 6..22 && goodWeather -> "Go walking"
        time in 6..22 && !goodWeather -> "Read the book"
        time in 23 downTo 5 -> "Time to sleep"
        else -> "Wrong time!!!"
    }
    println(doing)
}