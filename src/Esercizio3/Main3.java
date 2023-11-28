package Esercizio3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;

        while (true) {
            System.out.println("Inserisci una stringa");
            inputString = String.valueOf(scanner.nextLine());

            if (inputString.equals(":q")) {
                System.out.println("Uscita dal programma");
                break;
            }

            for (int i = 0; i < inputString.length(); i++) {
                System.out.println(inputString.charAt(i));
                if (i != inputString.length() - 1) {
                    System.out.println(", ");
                }
            }
            System.out.println();
        }
    }
}
