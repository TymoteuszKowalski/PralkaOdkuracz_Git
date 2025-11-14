public class pralka {
    private int numerProgramu = 0;

    public int ustawProgram(int numer) {
        if (numer >= 1 && numer <= 12) {
            numerProgramu = numer;
            Main.komunikat("Ustawiono program prania nr: " + numerProgramu);
        } else {
            numerProgramu = 0;
            Main.komunikat("Niepoprawny numer programu prania!");
        }
        return numerProgramu;
    }
}