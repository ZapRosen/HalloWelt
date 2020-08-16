public class Arrays {
    public static void main(String[] args){
        // Array der Laenge 5 deklarieren
        int[] zahl = new int[5];
        int i=0;
        while(i<zahl.length){
            zahl[i]=i;
            System.out.println(zahl[i]);
            i++;
        }
    }
}
