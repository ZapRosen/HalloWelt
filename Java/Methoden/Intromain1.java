/*Kofler Seite183 ff
* Methoden m1 bis m...
 */


import java.awt.Point;
public class Kap9Point2 {

    // Startpunkt des Programms
    public static void main(String[] args) {
        System.out.println("In main()");
        m1();   // Aufruf der Methode m1
        System.out.println("Wieder in main()");
    }

    // Methode m1
    public static void m1() {
        String s ="abc";
        String t ="xyz"; /*Der String t hat den
        *Anfangswert von xyz. In m4 wird das Attribut irgendwas übergeben.
*/
        m2(s); //Aufruf Methode m2
        System.out.println(s); //Ausgabe abc
        m3(0); //Aufruf Methode m3
        System.out.println(m3(0));
        m4(t); //Aufruf Methode m4
        System.out.println(m4(t));

      }

    // Methode m2
    public static void m2(String p) {
        p = p+"x"; // p+"x" wird nicht zurückgegeben.
       }
    public static int m3(int p){
        p=4;
        return p;
    }
    public static String m4(String t){
        t="irgendwas"; //Es wird der String "irgendwas" zurücckgegeben.
        return t;

    }
}
