package guru.qa;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        double v = 3.12;
        double w = 9.99;

        System.out.println("Операция сложения int - "+ (a+b));
        System.out.println("Операция вычитания int  - "+ (a-b));
        System.out.println("Операция умножения int - "+ (a*b));
        System.out.println("Операция деления int - "+ (b/a));
        System.out.println("Операция остаток от деления  - "+ (b%a));
        System.out.println("Несколько операций int, double - "+ ((a+b)*(v)+ (v+w)));
        System.out.println("Логические операторы - "+ (a>=b)+", " +(a<=b));
        System.out.println("Переполнение - "+ (2147483647+1));
    }
}