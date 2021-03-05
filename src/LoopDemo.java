public class LoopDemo {

    public static void main(String[] args) {
        System.out.println();

        /*
        //while . solange die Bedingung
        while (true) {
            System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        }
        */

        // 100 mal ausgeben
        int counter = 100;
        while (counter > 0) {
            counter --;
            System.out.println(counter + ": Der Pinguin schlug die Zeitung auf, da stand: ");
        }

        System.out.println();

        // while loop der von 1 bis hundert hochzählt - Zahl soll ausgegeben werden
        //odd --> "ping", even --> "pong"

        int counter1 = 1;
        while (counter1 <= 100) {
            if (counter1 % 2 == 0) {
                System.out.println(counter1 + " pong");
            }
            else {
                System.out.println(counter1 + " ping");
            }
            counter1 ++;
        }

        System.out.println();

        // Zahlen zwischen 1 und 500 die durch 3, 5 und 7 teilbar sind

        int counter2 = 1;
        while (counter2 <= 500) {
            if (counter2 % 3 == 0 || counter2 % 5 == 0 || counter2 % 7 == 0) {
                System.out.println(counter2);
            }
            counter2 ++;
        }

        int counter3 = 500;
        while (counter3 < 100) {
            System.out.println("counter < 100");
        }


    }
}
