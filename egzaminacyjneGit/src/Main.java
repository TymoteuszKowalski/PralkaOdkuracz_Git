import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pralka pralka = new Pralka();
        Odkurzacz odkurzacz = new Odkurzacz();

        System.out.print("Podaj numer programu prania 1 miedzy 12\n");
        int numer = sc.nextInt();

        pralka.ustawProgram(numer);

        odkurzacz.on();
        odkurzacz.on();
        odkurzacz.on();

        Urzadzenie.komunikat("Odkurzacz wyładował się");
        odkurzacz.off();

        sc.close();
    }
}