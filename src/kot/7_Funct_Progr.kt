package kot

fun main() {
    val sum: (Int, Int) -> Int = {a, b -> a + b} //присвоили переменной функцию через лямбда-выражение
    println(sum(2,12))

//    val square: (Int) -> Int = {c -> c*c}
//    println(square(7))

    val square: (Int) -> Int = {it * it}// В случае, когда мы задали тип переменной, и она всего одна, в скобках можно не указывать эту переменную,
                                        // а сразу написать функцию; для того, чтобы компилятор это понял переменной присваиваем имя "it"
    println(square(15))

    // Функция, которая принимает две стороны прямоугольника и возвращает его периметр
    val perimeter: (Int, Int) -> Int = {d, e -> d*2 + e*2}
    println(perimeter(4,5))

    //Принимает имя в качестве параметра, выводит на экран строчку: "Привет, (Имя)!", ничего не возвращает
    val sayHello: (String) -> Unit = {println("Hello, $it!")}
    sayHello("Andrey")

//    Принимает массив чисел в качестве параметра, возвращает массив, отсортированный по убыванию
    val sort: (Array<Int>) -> Array<Int> = {it
    for (i in it.size - 2 downTo 0) {
        for (j in 0..i) {
            if (it[j] < it[j+1]) {
                val temp = it[j]
                it[j] = it[j + 1]
                it[j + 1] = temp
            }
            }
        }
        it
    }
    val sortedArray = sort(arrayOf(57, 84, 13, 43, 97, -2, 28))
    for(i in sortedArray) {
        println(i)
    }

}