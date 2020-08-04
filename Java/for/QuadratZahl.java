package com.example.quadratzahl;

/**
 * Beispielprogramm aus Java ist auch eine Insel
 * openbook.rheinwerk-verlag.de/javainsel.de
 */
public class QuadratZahl {
    //variablendeklaration
    static int quadrat(int n){
        return n*n;
    }
    static void ausgabe( int n ){
        for ( int i= 1; i<=n; i=i+1){
            String s = "Quadrat(" + 1 +") =" + quadrat( i );
            System.out.println( s );
        }
    }
    public static void main(String[] args) {
        ausgabe( 4 );
    }
}
