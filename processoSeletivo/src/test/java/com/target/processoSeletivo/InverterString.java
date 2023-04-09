package com.target.processoSeletivo;

import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma palavra!");
        String palavra = scanner.nextLine();

        System.out.println(reverse(palavra));
    }

    static String reverse(String original) {
        String reversed = "";
        for (int i = original.length() - 1;  0 <= i; i--) {
            reversed += original.charAt(i);
        }
        return reversed;
    }
}
