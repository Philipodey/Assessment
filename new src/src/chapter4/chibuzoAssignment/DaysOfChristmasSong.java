package chibuzoAssignment;


import java.util.Scanner;

public class DaysOfChristmasSong {
    public static void christmasCarol() {




    Scanner scanner = new Scanner(System.in);
    System.out.print("""
            WELCOME TO 12 DAYS OF CHRISTMAS SONG

                                                    """);
    int bonny = scanner.nextInt();
    switch (bonny) {
        case 1 -> System.out.println("on the first day of christmas\n" + firstDay());
        case 2 -> System.out.println("on the second day of christmas\n" + secondDay());
        case 3 -> System.out.println("on the third day of christmas\n" + thirdDay());
        case 4 -> System.out.println("on the fourth day of christmas\n" + fourthDay());
        case 5 -> System.out.println("on the fifth day of christmas\n" + fifthDay());
        case 6 -> System.out.println("on the sixth day of christmas\n"+ sixthDay());
        case 7 -> System.out.println("on the seventh day of christmas\n"+ seventhDay());
        case 8 -> System.out.println("on the eigth day of christmas\n"+ eighthDay());
        case 9 -> System.out.println("on the nineth day of christmas\n"+ ninethDay());
        case 10 -> System.out.println("on the tenth day of christmas\n" + tenthDay());
        case 11 -> System.out.println("on the eleventh day of christmas\n"+ eleventhDay());
        case 12 -> System.out.println("on the twelveth day of christmas\n" + twelvethDay());
    }
//    int carol = scanner.nextInt();
}
//            switch (carol) {
//                case 12 -> System.out.println("Twelve drummers drumming");
//                case 11 -> System.out.println("Eleven pipers pipping");
//                case 10 -> System.out.println("Ten lords a-leaping");
//                case 9 -> System.out.println("Nine ladies dancing");
//                case 8  -> System.out.println("Eight maids a-milking");
//                case 7  -> System.out.println("Seven swans a-swimming");
//                case 6  -> System.out.println("Six geese a-laying");
//                case 5  -> System.out.println("Five golden rings");
//                case 4 -> System.out.println("Four calling birds");
//                case 3 -> System.out.println("Three French hens");
//                case 2 -> System.out.println("Two turtle doves");
//                case 1 -> System.out.println("A patridge in a pear tree");
//
//        }m
    private static String firstDay(){
        return "A patridge in a pair tree";
    }
    private static String secondDay(){
        return "Two turtle dove and\n" +
                "A patridge in a pair tree";
    }
    private static String thirdDay(){
        return "Three French hens\n" +
                "Two turtle dove and\n" +
                "A patridge in a pair tree";
    }
    private static String fourthDay(){
        return "Four calling birds\n" +
                "Three French hens\n" +
                "Two turtle dove and\n" +
                "A patridge in a pair tree";
    }
    private static String fifthDay(){
        return"Five Golden rings\n" +
                "Four calling birds\n" +
                "Three French hens\n" +
                "Two turtle dove and\n" +
                "A patridge in a pair tree";
    }
    private static String sixthDay(){
        return "Six geese a-laying\n"+
                "Five Golden rings\n" +
                "Four calling birds\n" +
                "Three French hens\n" +
                "Two turtle dove and\n" +
                "A patridge in a pair tree";
    }
    private static String seventhDay() {
        return "Seven swan a-swimmimg\n" +
                "Six geese a-laying\n" +
                "Five Golden rings\n" +
                "Four calling birds\n" +
                "Three French hens\n" +
                "Two turtle dove and\n" +
                "A patridge in a pair tree";
    }
    private static String eighthDay() {
        return "Eight maids a-milking\n"+
                "Seven swan a-swimmimg\n" +
                "Six geese a-laying\n" +
                "Five Golden rings\n" +
                "Four calling birds\n" +
                "Three French hens\n" +
                "Two turtle dove and\n"+
                "A patridge in a pair tree";
    }
    private static String ninethDay(){
        return "Nine ladies dancing\n"+
                "Eight maids a-milking\n"+
                "Seven swan a-swimmimg\n" +
                "Six geese a-laying\n" +
                "Five Golden rings\n" +
                "Four calling birds\n" +
                "Three French hens\n" +
                "Two turtle dove and\n" +
                "A patridge in a pair tree";

    }
    private static String tenthDay() {
        return "Ten lords a-leaping\n" +
                "Nine ladies dancing\n" +
                "Eight maids a-milking\n" +
                "Seven swan a-swimmimg\n" +
                "Six geese a-laying\n" +
                "Five Golden rings\n" +
                "Four calling birds\n" +
                "Three French hens\n" +
                "Two turtle dove and\n" +
                "A patridge in a pair tree";
    }
    private static String eleventhDay() {
        return "Eleven pipers piping\n" +
                "Ten lords a-leaping\n" +
                "Nine ladies dancing\n" +
                "Eight maids a-milking\n" +
                "Seven swan a-swimmimg\n" +
                "Six geese a-laying\n" +
                "Five Golden rings\n" +
                "Four calling birds\n" +
                "Three French hens\n" +
                "Two turtle dove and\n" +
                "A patridge in a pair tree";
    }
    private static String twelvethDay() {
        return  "Twelve drummers drumming\n"+
                "Eleven pipers piping\n" +
                "Ten lords a-leaping\n" +
                "Nine ladies dancing\n" +
                "Eight maids a-milking\n" +
                "Seven swan a-swimmimg\n" +
                "Six geese a-laying\n" +
                "Five Golden rings\n" +
                "Four calling birds\n" +
                "Three French hens\n" +
                "Two turtle dove and\n" +
                "A patridge in a pair tree";
    }
}