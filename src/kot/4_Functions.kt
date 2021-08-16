package kot

import kotlin.collections.ArrayList as ArrayList1

fun main() {
    println(max(15, 26))
    println(cut("Престидижитация"))
    println(sum(5, 17, 33, 54, 41))
    val numbers = mutableListOf(15, 24, 16, 64, 32, 57, 16, 72, -2, 9, 97, 41)//если заменить mutableListOf на arrayOf - тоже сработает
    val result = sort(16, 64, 32, 57, 16, 72, -2)
    for (i in result) {
        println(i)
    }
}

fun max(a: Int, b: Int): Int = if (a > b) a else b //третий Int - тип возвращаемого значения, но его можно и не указывать, аоскольку и так понятно

fun cut(str: String) = str.substring(0, Math.min(20, str.length)) //или 20 символов или всю строку

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (num in numbers) {
        result += num
    }
   return result
}

//HomeTask:
//    Написать метод sort, который возвращает коллекцию чисел в отсортированном виде
//    Тип возвращаемой коллекции д.б. неизменяемым (List)
//    В качестве параметра массив может принимать коллекцию, массив или аргументы переменной длины
//    если передаваемая коллекция содержит одинаковые элементы, то они должны сохраниться

fun sort(numbers: MutableList<Int>) : List<Int> {
    for (i in 1 until numbers.size) {
    for (j in numbers.size - 1 downTo i) {
         if (numbers[j] < numbers[j-1]) {
           val temp = numbers[j]
            numbers[j] = numbers[j - 1]
            numbers[j - 1] = temp
    }
    }
}
    return numbers
}

fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())//на входе - массив; метод возвращает сортированный массив приведенный к типу МутаблЛист
fun sort(vararg numbers:Int) = sort(numbers.toMutableList())//на входе - аргшументы переменной длины