//  Задание 1
//  a) В математике факториал обозначается символом '!'. И означает произведение всех чисел от 1 и до заданного числа. Например:
//  5! = 1*2*3*4*5
//  1! = 1
//  9! = 1*2*3*4*5*6*7*8*9
//Напишите рекурсивный метод, который считает факториал.

public class Main {
    public static void main(String[] args) {
        int factorial = 5;
        System.out.println(factorial + "! = " + getFactorialRec(factorial));
    }

    public static String getFactorialRec(int factorial) {
        if (factorial < 0) {
            return "";
        }
        if (factorial == 0 || factorial == 1) {
            return "1";
        }
        return getFactorialRec(factorial - 1) + "*" + factorial;
    }
}