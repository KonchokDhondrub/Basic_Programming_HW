//  Задание 1
//  a) В математике факториал обозначается символом '!'. И означает произведение всех чисел от 1 и до заданного числа. Например:
//  5! = 1*2*3*4*5
//  1! = 1
//  9! = 1*2*3*4*5*6*7*8*9
//  Напишите рекурсивный метод, который считает факториал.

//  b) (чуть сложнее) Последовательность Фибоначчи: 1,1,2,3,5,8,13 ...... Т.е. каждое следующее число это сумма двух предыдущих:
//  5 это 2+3
//  8 это 3+5
//  13 это 5+8 и тд.

public class Main {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num + "! = " + getFactorialRec(num));
    }

    public static String getFactorialRec(int factorial) {
        if (factorial <= 0) {
            return "error";
        }
        if (factorial == 1) {
            return "1";
        }
        return getFactorialRec(factorial - 1) + "*" + factorial;
    }
}
