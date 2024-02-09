package HomeWorks.Seminar2;

/*Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
Если b равен нулю, программа должна вывести сообщение о невозможности выполнения операции и вернуть результат равный нулю.
После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
Если аргументы не переданы через командную строку, используйте значения по умолчанию.

На входе:


'12'
'5'
На выходе:


17
2.4*/

public class Task3 {

    public static double expr(int a, int b) {
        // Введите свое решение ниже
        double result=0;
        printSum(a, b);
        if (b!=0)
            result=(double) a/b;
        return result;
    }

    public static void printSum(int a, int b) {
        // Введите свое решение ниже
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        System.out.println(expr(12,5));
    }


}
