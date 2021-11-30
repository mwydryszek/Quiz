package quiz;

public class Parametry {

    private int punkty;
    private boolean czyKolor;
    private boolean czyTimer;
    private boolean czyLosowac;

    public void setPunkty(int punkty) {
        this.punkty=punkty;
    }

    public int getPunkty() {
        return punkty;
    }

    public void addPunkty() {
        punkty++;
    }

    public void setCzyKolor(boolean kolor) {
        this.czyKolor=kolor;
    }

    public boolean getCzyKolor() {
        return czyKolor;
    }

    public void setCzyTimer(boolean timer) {
        this.czyTimer=timer;
    }

    public boolean getCzyTimer() {
        return czyTimer;
    }

    public void setCzyLosowac(boolean los) {
        this.czyLosowac=los;
    }

    public boolean getCzyLosowac() {
        return czyLosowac;
    }

    public Parametry() {
        punkty=0;
        czyKolor=false;
        czyTimer=false;
        czyLosowac=false;
    };

}
