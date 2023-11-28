// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       //ESERCIZIO 1
       //1 parte
       String stringaPariDispari = "ciao";
       int stringLenght = stringaPariDispari.length();
       if (stringLenght % 2 == 0){
           System.out.println("true");
       } else {
           System.out.println("false");
       }

       int annoBisestile = 2024;
       if (annoBisestile % 4 == 0){
           System.out.println("true");
       } else {
           System.out.println("false");
       }
    }
}