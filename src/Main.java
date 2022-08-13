
/*
Написать программу вычисления n-ого треугольного числа
Формула треугольного числа:
T = (n*(n+1))/2
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n = iScanner.nextInt();
        int result = ((n+1)*n)/2;
        System.out.printf("Triangular number %d = %d", n, result);
    }
}