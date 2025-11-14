public class Pralka extends Urzadzenie{
    private int numerProgramu = 0;

    public int ustawProgram(int numer) {
        if (numer >= 1 && numer <= 12) {
            numerProgramu = numer;
            komunikat("Ustawiono program prania nr: " + numerProgramu);
        } else {
            numerProgramu = 0;
            komunikat("Niepoprawny numer programu prania!");
        }
        return numerProgramu;
    }
}