package jav;

import java.util.Scanner;

public class Main {

//    private static String  name = null;

    public static void main(String[] args) {
//
//        if (name != null) {
//            System.out.println(name.length());
//        } else {
//            System.out.println("null");
//        }

//        if/else
    int sum = 3000;
    String eat;
    if (sum > 500) {
        eat = "Pizza";
    } else if (sum > 200) {
        eat = "Donner Kebab";
    } else {
       eat = "Doshirak";
    }
        System.out.println("You can buy " + eat);
//    }

//    when
    String month = "Octoberary";
    String season;
    switch(month) {
        case "December":
        case "January":
        case "February":
            season = "Winter";
            break;
        case "March":
        case "April":
        case "May":
            season = "Spring";
            break;
        case "June":
        case "July":
        case "August":
            season = "Summer";
            break;
        case "September":
        case "October":
        case "November":
            season = "Fall";
            break;
        default:
             season = "Wrong month!!!";
       }
        System.out.println(season);
    }
}

