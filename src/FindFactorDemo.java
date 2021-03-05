public class FindFactorDemo {

    public static void main(String[] args) {
        System.out.println();

        findFactors(21);
        findFactors(10);
        findFactors(30);



    }

    //METHODEN

    /*
    alle Zahlen finden, durch die die ZAHL teilbar ist
    zB 21 = 1, 3, 7, 21
    30 = 1, 2, 3, 5, 6, 10, 15, 30
    Was ist der Zweck der Methode - findFactors()
    Parameter - int number
    Return - return value - void
     */

    public static void findFactors (int number) {
        int counter = 1;
        while (counter <= number) {
            if (number % counter == 0) {
                System.out.print(counter + ", ");
            }
            counter ++;
        }

        System.out.println();
    }




}
