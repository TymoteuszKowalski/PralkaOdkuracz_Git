public class Odkurzacz extends Urzadzenie{
    private boolean wlaczony = false;
    public void on() {
        if (!wlaczony) {
            wlaczony = true;
            komunikat("Odkurzacz włączono");
        }
    }
    public void off() {
        if (wlaczony) {
            wlaczony = false;
            komunikat("Odkurzacz wyłączono");
        }
    }
}
