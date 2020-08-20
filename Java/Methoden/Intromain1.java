//Kapitel 9 Kofler, Java Projekt Methode-intro1
public class Intromain1 {
    public static void main(String[] args) {
        System.out.println("Jetzt:In der Mainmethode");
        Methode1();
        System.out.println("Nach Aufruf M1 wieder main");
    }
    public static void Methode1() {
        System.out.println("In  Methode1()");
        int ergebnis = Methode2(7,12);
        System.out.println("Ergebnis: "+ergebnis);
    }
    public static int Methode2(int a, int b) {
        System.out.println("In Methode2()");
        if(a>b)
            return a*b;
        else
            return a+2*b;
    }
}
