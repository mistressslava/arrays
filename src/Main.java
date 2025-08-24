import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name1 = "Jojo Dore";
        String name2 = "Lolo Gore";
        String name3 = "Ping Deep";

        //Array -> Datentypen[] namen = new Datentyp[] / = {Wert, wert, weert, ...}
        String[] names = new String[2]; // 0, 1
        names[0] = "Max";
        names[1] = "Maxi";
        // names[3] = "Maxim";

        String[] names2 = {"Max", "Maxi", "Maxim"};

//        System.out.println("Hallo, " + names2[0]);
//        System.out.println("Hallo, " + names2[1]);
//        System.out.println("Hallo, " + names2[2]);

        for (int i = 0; i < names2.length; i++) {
            System.out.println("Hello, " + names2[i]);
        }

        System.out.println();

        for (String s : names2) {
            System.out.println("Hello, " + s);
        }

        //Level 1
        System.out.println();
        System.out.println("-----------Level 1----------");
        System.out.println();

        System.out.println("Task 1");
        System.out.println();

        Integer[] nums = new Integer[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        for (Integer num : nums) {
            System.out.printf("Number %d%n", num);
        }

        System.out.println();
        System.out.println("Task 2");
        System.out.println();

        String[] namen = new String[5];
        namen[0] = "Vovchuk Chernenko";
        namen[1] = "Lida Luchenko";
        namen[2] = "Roman Pleshko";
        namen[3] = "Myhailo KOvalenko";
        namen[4] = "Anetta Polishko";

        for (String name : namen) {
            System.out.println(name);
        }

        System.out.println();
        System.out.println("Task3");
        System.out.println();

        Integer[] integers = {2, 4, 6, 8};
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i] * integers[i]);
        }


        //Level 2
        System.out.println();
        System.out.println("-----------Level 2----------");
        System.out.println();

        System.out.println("Task 1");
        System.out.println();

        Integer[] fromOneToTen = new Integer[10];

        for (int i = 0; i < fromOneToTen.length; i++) {
            fromOneToTen[i] = i + 1;
        }

//        for (int a : fromOneToTen) {
//            System.out.println(a);
//        }
        System.out.println();

        for (int a : fromOneToTen) {
            if (a % 2 == 0) System.out.print(a + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Task 2");
        System.out.println();

        int sum = 0;
        for (int a : fromOneToTen) {
            sum += a;
        }

        System.out.println(sum);

        System.out.println();
        System.out.println("Task 3");
        System.out.println();

        String[] cities = {"Lviv", "Kyiv", "Barcelona", "Offenburg", "Berlin"};

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("Index %d: %s%n", i, cities[i]);
        }

        System.out.println();
        System.out.println("Task 4");
        System.out.println();

        Integer[] randomNumber = {4, 2890, 34, 200, 567, 2, 4405, -2239, 504};

        // maximum
        int temp = randomNumber[0];
        for (int num : randomNumber) {
            if (num > temp) {
                temp = num;
                System.out.println(temp);
            }
        }
        System.out.println("The maximum is " + temp);

        // minimum

        int temp2 = randomNumber[0];
        for (int num : randomNumber) {
            if (num < temp2) {
                temp2 = num;
                System.out.println(temp2);
            }
        }
        System.out.println("The minimum is " + temp2);

        System.out.println();
        System.out.println("-----------Bonus------------");
        System.out.println();

        System.out.println("Task 1");
        System.out.println();

        Integer[] ganzenZahlen = {9, 8, 4, 6, 10, 11, 15};
        for (int i = 0; i < ganzenZahlen.length; i++) {
            ganzenZahlen[i] *=2;
        }

        for (int zahl : ganzenZahlen) {
            System.out.print(zahl + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Task 2");
        System.out.println();

        String[] str1 = {"Viktoria", "Ksenia", "Yaroslava", "VItalii", "Tatijana"};
        String[] str2 = {"Horlova", "Mueller", "Verba", "Koskovna", "Boiko"};

        String[] kombi = new String[str2.length];

        for (int i = 0; i < str2.length; i++) {
            kombi[i] = str1[i] + " " + str2[i];
            System.out.println(kombi[i]);
        }

        System.out.println();
        System.out.println("Task 3");
        System.out.println();

        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];

//        System.out.println("Enter 5 integer numbers: ");
//
//        for (int i = 0; i < 5; i++) {
//            array[i] = scan.nextInt();
//        }
//
//        for (int num : array) {
//            System.out.print(num + " ");
//        }

        System.out.println();

        System.out.println();
        System.out.println("Task 4");
        System.out.println();

        int[] examScores = {74, 95, 99, 60, 65, 63, 89};

        int sumOfExamScores = 0;
        for (int score : examScores) {
            sumOfExamScores += score;
        }
        double averageScore = (double) sumOfExamScores / examScores.length;

        System.out.printf("Average score: %.2f%n", averageScore);

        if (averageScore <= 70) {
            System.out.println("You failed this");
        } else {
            System.out.println("You passed, congratulation");
        }

        //Task 5

        System.out.println();

        System.out.println();
        System.out.println("Task 5");
        System.out.println();

        int[] randomNums = new int[10];
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(randomNums));
        Arrays.sort(randomNums);
        System.out.println(Arrays.toString(randomNums));
        System.out.println("The minimum is: " + randomNums[0]);
        System.out.println("The maximum is: " + randomNums[randomNums.length - 1]);
        int sumOfRandomNumbers = 0;
        for (int num : randomNums) {
            sumOfRandomNumbers += num;
        }
        double averageOfRandomNumbers = (double) sumOfRandomNumbers / randomNums.length;
        System.out.println("The average is: " + String.format("%.2f", averageOfRandomNumbers));



    }
}