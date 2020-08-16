public class Array1 {
    public static void main(String[] args) {
        //Deklaration array-Variable als Integer-Variable
        int x[] = {2, 5, 9, 18, 32};
        //kleinste Zahl, im array im Element [0]<?
        int i, min = x[0];
        //array mit for durchsuchen bis zum Ende -- x.length !
        for (i = 1; i < x.length;i++){
            //Bedingung: Wenn x[i]kleiner als Variable i
            if (x[i] < min) {
                min = x[i];
            }
        }
        System.out.println("Kleinste Zahl im array: " + min);
        //Maximum
        int max=x[0];
        for(i=1;i<x.length;i++)
            if(x[i]>max)
                max=x[i];
            System.out.println("Maximum: " + max);
        //arithmetisches Mittel
        long summe=0;
        for(i=0;i<x.length;i++)
            summe+=x[i];
        double arithmetischesM =(double)summe/x.length;
        System.out.println("Bei einer Summe von "+ summe + " und " + x.length + " Fällen liegt");
        System.out.println("das arithmetische Mittel bei " + arithmetischesM );

    }
}
