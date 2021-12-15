package com.geekbrains;

public class Main {
    /*public static void main(String[] args) { // Первая часть урока про переменные
        System.out.println("Привет Виталий");

        byte b = (byte) 128;
        short s = 1234;
        int a = 11;
        long l = 12313123123L;

        float f = 12.3f;
        double d = 14.5;

        char c = '1';
        boolean bool = false;

        double d1 = 0.1;
        double d2 = 0.2;

        int a1 = 10;
        int a2 = 15;

        int sum = a1 + a2;

        int inc = 1;
        inc = inc + 1;
        System.out.println(inc);
        inc = inc + 1;
        inc++;
        inc--;
        inc += 2;
        int hard = inc + a1 / a2 * 10;

        System.out.println(b);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(d1 + d2);
        System.out.println(sum);
        System.out.println(inc);
    }*/

    /*public static void main(String[] args) {
        int a = 41;

        *//*if(a > 40) {
            System.out.println("a больше 40");
        } else if(a > 39) {
            System.out.println("a больше 39");
        } else {
            System.out.println("а не больше 39");
        }*//*

        String result = "";
        if(a > 40) {
            result = "a больше 40";
        } else if(a > 39) {
            result = "a больше 39";
        } else {
            result = "а не больше 39";
        }

        int b = 1;
        System.out.println(result);
        System.out.println(result + ". Переменная a = " + a);
        System.out.println("Результат суммы равен: " + (a + b));

        if(a == 41 && b == 0) {
            System.out.println("a == 41 и b == 1");
        }

        if(a == 40 || b == 1) {
            System.out.println("a == 41 или b == 1");
        }

        if(a == 40) {
            System.out.println("а равно 40");
        }

        boolean ternar = 10 > 5 ? true : false;
        if(ternar) {
            System.out.println("10 > 5");
        } else {
            System.out.println("10 < 5");
        }

    }*/

    /*public static void main(String[] args) {
        printValue();
        printSum(5, 10);
        drawCat();
        drawCat();
        drawCat();
        drawCat();
        drawCat();
        int a = sum(10, 11);
        int b = sum(a, 23, 13);
        String result = sumString(a, 23, 13);
        System.out.println(a);
        System.out.println(b);
        System.out.println(result);
    }*/

    public static void main(String[] args) {
        int a = 20;
        String b = "myNumber = ";
        a *= a;
        System.out.println(b + a);
    }


    public static void printValue() {
        System.out.println("value");
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String sumString(int a, int b, int c) {
        int temp = a + b + c;
        String result = String.valueOf(temp);
        return result;
    }

    public static void drawCat() {
        System.out.println("           _..---...,\"\"-._     ,/}/)\n" +
                "        .''        ,      ``..'(/-<\n" +
                "       /   _      {      )         \\\n" +
                "      ;   _ `.     `.   <         a(\n" +
                "    ,'   ( \\  )      `.  \\ __.._ .: y\n" +
                "   (  <\\_-) )'-.____...\\  `._   //-'\n" +
                "    `. `-' /-._)))      `-._)))\n" +
                "      `...'         ");
    }

}