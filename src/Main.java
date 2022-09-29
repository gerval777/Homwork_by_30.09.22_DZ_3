public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");

        int age2 = 27;// Введите возраст человека
        if ( age2 >= 2 && age2 <=6) {
            System.out.println("Если возраст человека равен " + age2 + " г. , то ему нужно ужно ходить в детский сад");
        } else {
            System.out.println("");
        }
        if ( age2 >= 7 && age2 <=18) {
            System.out.println("Если возраст человека равен " + age2 + " г. , то ему нужно ходить в школу");
        } else {
            System.out.println("");
        }
        if ( age2 >= 18 && age2 <=24) {
            System.out.println("Если возраст человека равен " + age2 + " г. , то ему место в университете");
        } else {
            System.out.println("");
        }
        if ( age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + " г. , то ему пора ходить на работу");
        } else {
            System.out.println("");
        }

        //Задача 2
        System.out.println("Задача 2");

        int ageChild = 11;// Введите возраст ребенка

        if ( ageChild < 5) {
            System.out.println("Если возраст ребенка " + ageChild + " , то он не может кататься на аттракционе.");
        } else {
            System.out.println("");
        }
        if ( ageChild >= 5 && ageChild <14) {
            System.out.println("Если возраст ребенка " + ageChild + " , то он может кататься только в сопровождении взрослого");
        } else {
            System.out.println("");
        }
        if ( ageChild >= 5 && ageChild <14) {
            System.out.println("А если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("");
        }
        if ( ageChild >= 14 ) {
            System.out.println("Если возраст ребенка " + ageChild + " , то он может кататься без сопровождения взрослого.");
        } else {
            System.out.println("");
        }

        //Задача 3
        System.out.println("Задача 3");

        int one = 1;
        int two = 2;
        int three = 3;
        boolean greaterValueOne = one > two && one > three;
        boolean greaterValueTwo = two > one && two > three;
        boolean greaterValueThree = three > one && three > two;
        if (greaterValueOne) {
            System.out.println(one);
        }
        if (greaterValueTwo) {
            System.out.println(two);
        }
        if (greaterValueThree) {
            System.out.println(three);
        }
        if (greaterValueOne || greaterValueTwo || greaterValueThree) {
            System.out.println("Является наибольшим числом");
        } else {
            System.out.println("Проверь решение задачи и попробуй снова");
        }
    }
}