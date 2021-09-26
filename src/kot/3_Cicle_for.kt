package kot

fun main() {
    val array = arrayOfNulls<Int?>(101)
    for (i in 0 until array.size) { // until указывает на невключение верхнего элемента, т.е. = array.size - 1, эквивалентен (i in 0..100)
        array[i] = i
    }
    for (i in array) {
        println(i)
    }

    // для вывода от 100 до 0

    for (i in 100 downTo 0 step 2) { // step добавляет шаг
        println(i)
    }

    for ((index, i) in array.withIndex()) { //index - итерационная переменная - для обращения к переменной по ее индексу
        array[index] = i?.times(2) //times - метод - умножение i на 2 с учетом возможного i == null
    }
    for (i in array) {
        println(i)
    }

//    Home Task:
//    1. Создать массив чисел от 300 до 600
//    2. Вывести на экран в порядке убывания все значения массива, которые делятся на 5

    val array1 = arrayOfNulls<Int?>(301)
    for ((index, i) in (300..600).withIndex()) {
        array1[index] = i
    }
    for (i in array1.size - 1 downTo 0 step 5) {
        println(array1[i])
    }

}