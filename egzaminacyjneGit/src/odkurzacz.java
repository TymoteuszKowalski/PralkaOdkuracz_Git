public class odkurzacz {
    private boolean wlaczony = false;
    public void on() {
        if (!wlaczony) {
            wlaczony = true;
            Main.komunikat("Odkurzacz włączono");
        }
    }
    public void off() {
        if (wlaczony) {
            wlaczony = false;
            Main.komunikat("Odkurzacz wyłączono");
        }
    }
}
