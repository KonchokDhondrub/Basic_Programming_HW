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
        System.out.println(num + "! = " + getFactorialRecCorrect(num));
        System.out.println(num + " это " + getFibonacci(num));
//        System.out.println(num + " это " + getFibonacciRecCorrect(num));

        for (int i = 0; i < 10; i++) {
            System.out.println("("+i + ") ="+ getFibonacciCorrect(i));
        }
    }

    public static long getFactorialRecCorrect(int num){
        return num == 1 ? 1 : getFactorialRecCorrect(num - 1) * num;
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


    public static long getFibonacciCorrect(int num) {
        return (num == 0 || num == 1) ? 1 :
                getFibonacciCorrect(num - 1) + getFibonacciCorrect(num - 2);
    }

    // Метод не мой, но благодаря ему я постиг новые приёмы магии!
    public static String getFibonacci(int num) {
        if (num < 2) {
            return String.valueOf(num);
        }
        return getFibonacciHelper(num, 0, 1);
    }

    private static String getFibonacciHelper(int num, int a, int b) {
        if (a + b == num) {
            return a + "+" + b;
        }
        return getFibonacciHelper(num, b, a + b);
    }
}
