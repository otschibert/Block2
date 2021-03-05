public class DemoCalkDigitSum {

    public static void main(String[] args) {
        System.out.println();

        // 54321 = 15
        // 9876543 = 42
        // 12 = 3



        System.out.println("berechneZiffernsumme(54321) = " + berechneZiffernsumme(54321));
        System.out.println("berechneZiffernsumme(9876543) = " + berechneZiffernsumme(9876543));
        System.out.println("berechneZiffernsumme(12) = " + berechneZiffernsumme(12));



    }

    // METHODEN

    public static int berechneZiffernsumme(int value){
        int ziffersumme = 0;
        while (value > 0) {
            ziffersumme = ziffersumme + (value % 10);
            value = value / 10;
            }
            return ziffersumme;

    }
}
