public class Schaltjahr2 {

    private static boolean schaltjahr;

    int jahr;
   // Date dt = new Date();

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Gib die Jahreszahl ein");
        int jahr = scan.nextInt();
        scan.close();
        if (jahr % 400 == 0) {
            schaltjahr = true;
        }
            else if (jahr % 100 == 0){
                schaltjahr = false;
        }
            else if(jahr % 4 ==0 ){
                schaltjahr = true;
            }else {
                schaltjahr = false;
        }
            if(schaltjahr == true) {
                System.out.println(jahr + " ist ein Schaltjahr.");
            }
                else if(schaltjahr == false){
                    System.out.println(jahr + " ist kein Schaltjahr");
            }

    }
}

