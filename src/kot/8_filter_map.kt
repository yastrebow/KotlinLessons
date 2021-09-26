package kot

import kotlin.random.Random

fun main() {

    //filter отсортировывает коллекцию по какому-то условию
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }
    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }

    for (i in listOfEvenNumbers) {
        println(i)
    }

    //Создать коллекцию имен. Из первой коллекции оставить только имена, которые начинаются с буквы "А"
    // и добавить их в новую коллекцию
    val names = listOf<String>("Andrey", "Max", "Nick", "Audrey", "Ann", "John", "Eugene", "Steve")

    val namesStartsFromA = names.filter { it.startsWith("A") }

    for (name in namesStartsFromA) {
        println(name)
    }

        // map - преобразовывает коллекцию в любую другую

    val numbers = (0..100).toList()
//    val doubledNumbers = numbers.map { it * 2 }
//    for (i in doubledNumbers) {
//        println(i)

        //коллекцию чисел преобразует в коллекцию строк
        val employees = numbers.map { "Employee №$it" }
        for(employee in employees) {
            println(employee)
        }
//    }

    // sorted - метод для сортировки коллекции или массива

    val array = arrayOf(5, 16, 57, 24, -3, 0, 89, 73, 92)
    val sortedArray = array.sortedDescending() //sorted - сортировка по возрастанию; sortedDescending - сортировка по убыванию
    for (i in sortedArray) {
        println(i)
    }

        //HomeTask
        // 1. Создать коллекцию случайных чисел в диапазоне от 0 до 1000 размером 1000 элементов
    //2. Произвести следующие манипуляции:
    //а)Оставить только те числа, которые без остатка делятся на 3 или на 5
    //б) Каждое число из полученной коллекции возвести в квадрат
    //в) Полученную коллекцию отсортировать по убыванию
    //г) Преобразовать в коллекцию типа String

    //my variant
    val homeTaskList: Array<Int?> = arrayOfNulls(1000)
    for (i in 0..999) {
      homeTaskList[i] = Random.nextInt(1000)
    }
    for(i in homeTaskList) {
        println(i)
    }
    val threeOrFive = homeTaskList.filter { it!! % 3 == 0 || it % 5 ==0 }
    for(num in threeOrFive) {
        println(num)
    }

    val squareList = threeOrFive.map { it!! * it }
    for(sq in squareList) {
        println(sq)
    }
    val sortedList = squareList.sortedDescending()
    for(srtd in sortedList) {
        println(srtd)
    }
    val strngList = sortedList.map { "String volume: $it" }
            for(strng in strngList){
                println(strng)
            }

    //His variant

    val initArray = mutableListOf<Int>()
    for (i in 0..1000) {
        initArray.add((Math.random() * 1000).toInt())
    }
    val result = initArray.filter { it % 5 == 0 || it % 3 == 0 }.map{ it * it}.sortedDescending().map{"$it"}
    for(rslt in result) {
        println(rslt)
    }

}