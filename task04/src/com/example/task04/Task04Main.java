package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double sum = 0;
        while(scanner.hasNextDouble())
        {
            sum += scanner.nextDouble();
        }
        System.out.printf(Locale.US, "%.6f", sum);
    }
}
