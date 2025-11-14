import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pralka pralka = new pralka();
        odkurzacz odkurzacz = new odkurzacz();

        System.out.print("Podaj numer programu prania 1 miedzy 12\n");
        int numer = sc.nextInt();

        pralka.ustawProgram(numer);

        odkurzacz.on();
        odkurzacz.on();
        odkurzacz.on();

        komunikat("Odkurzacz wyładował się");
        odkurzacz.off();

        sc.close();
    }

    public static void komunikat(String tekst) {
        System.out.println(tekst);
    }
}