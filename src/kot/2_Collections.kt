package kot

fun main() {
    val array = arrayOf(2,12,85,0,6)
    array[4] = 10 // null - не можем добавить, потому что компилятор определил тип, как int
    //чтобы иметь возможность добавить null надо: val array: Array<Int?> = arrayOfNulls(10)
    println(array[4])

    val listOfNumbers: MutableList<Int> = mutableListOf<Int>() // mutableListOf создает ArrayList
    listOfNumbers.add(5) // в List, Set и Map нельзя добавлять элементы. Чтобы избежать этого делаем List Mutable
    println(listOfNumbers[0])
}
// ПРАВИЛА при работе с коллекциями
// 1. Используйте абстракции вместо реализаций val listOfNumbers: List<Int> = ArrayList<>() - т.е. создаем массив через родительский класс List (но см. п.2)
//2. Базовые интерфейсы коллекций неизменяемые. Чтобы изменить коллекцию - интерфейсы с приставкой Mutable
//3. Обращаться к элементам коллекций можно так же, как к элементам массива, через []
//4. Быстро проинициализировать коллекцию можно через listOf, setOf, mapOf, arrayOf. Изменяемость - через Mutable
