package kot

//исключения практически не отличаются от Джава, но некоторые отличия всё-таки есть

fun main() {
    println(sum("10", "67"))
}

fun sum(a: String, b: String): Int {
//    return try { // в отличие от Джава try/catch является выражением и умеет возвращать значения. Эти значения необязательно возвращать их
//        //можно сохранить в переменную, а потом с ней что-нибудь сделать (см. ***)
//        val numA = a.toInt()
//        val numB = b.toInt()
//        numA + numB
//    } catch (e: Exception) {
//        0
//    }

    // ***
    val result = try {
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numB
    } catch (e: Exception) {
        0
    }
    println(result)
    return result
}