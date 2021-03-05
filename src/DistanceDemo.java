public class DistanceDemo {

    public static void main(String[] args) {

    int kilometerValue = 27;
    double miles = kilometerToMiles(kilometerValue);
    System.out.println();
    System.out.println(kilometerValue + " Kilometer sind " + miles + " Meilen" );





    } // public static void main

    //METHODEN

    public static double kilometerToMiles (int kilometer) {
        double result = kilometer / 1.609;
        return result;

    } //method kilometerToMiles

    public static double milesToKilometer (double miles) {
        double result = miles * 1.609344;
        return result;
    }



} //public class
