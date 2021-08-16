public class Fallunterscheidung {
    public static void main(String[] args) {
        String monat ="März";
        int tage =0;
        switch(monat){
            case "Januar" : case "März": case "Mai": case "Juli": case "August": case "Oktober": case "Dezember": tage=31;
                break;
        }
        switch (monat){
            case "Februar" : tage = 28;
                break;
        }
        switch (monat){
            case "April": case "Juni": case "September": case "November": tage =30;
        }

        if(tage!=0){
            System.out.println("Der  " + monat  + "hat " + tage + " Tage");
        }
    }
}
