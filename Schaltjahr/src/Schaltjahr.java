public class Schaltjahr {
    int jahreszahl;
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Geben Sie die Schaltjahr an: ");
        boolean jahreszahl = scan.nextInt();
        scan.close();
        if(jahreszahl % 400 == 0){
            jahreszahl=true;     }

    }
}
