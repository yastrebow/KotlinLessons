package kot

import javax.print.attribute.IntegerSyntax


fun main() {
    val a = 50
    if (a < 40) {
        println("Меньше 40")
    } else if (a < 60) {
        println("Меньше 60, но больше 40")
    } else {
        println("Больше или равно 60")
    }

    // if
    var count = 800
    val food = if (count > 500) {
        count -= 500
        "Пицца"
    } else if (count > 200) {
        count -= 200
        "Шаурма"
    } else {
       count -= 50
        "Доширак"
    }
    println("Вы можете позволить себе следующий продукт: $food. У вас осталось: $count рублей")

//    when
    val nameOfMounth = "February"
    val season1 = when(nameOfMounth) {
       "December", "January", "February" -> {
           "Winter"
       }
       "March", "April", "May" -> {
           "Spring";
       }
       "June", "July", "August" -> {
            "Summer";
       }
       "September", "October", "November" -> {
           "Fall";
       }
        else -> {
            "Wrong month!!!"
        }
    }
    println(season1)

    val indexOfMonth = 8
    val season2 = when(indexOfMonth) {
        12,1,2 -> {
            "Winter"
        }
        in 3..5 -> {
            "Spring";
        }
        in 6..8 -> {
            "Summer";
        }
        in 9..11 -> {
            "Fall";
        }
        else -> {
            "Wrong month!!!"
        }
    }
    println(season2)

    val temperature = 80
    val condition = when {
        temperature < 100 -> {
            "Вода находится в жидком состоянии"
        }
        temperature < 0 -> {
            "Вода находится в твердом состоянии"
        }
        else -> {
            "Вода находится в газообразном состоянии"
        }
    }
    println(condition)

}

