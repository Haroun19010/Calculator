package com.solwt;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Intrest Rate: ");
        float annualIntrest = scanner.nextFloat();
        float monthlyIntrest = annualIntrest / PERCENT / MONTHS_IN_YEAR ;

        System.out.print("period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                *(monthlyIntrest * Math.pow(1 + monthlyIntrest, numberOfPayments));
               // /Math.pow(1 + monthlyIntrest, numberOfPayments) - 1);

                String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
                System.out.println("Mortgage "+ mortgageFormated);

    }
}
