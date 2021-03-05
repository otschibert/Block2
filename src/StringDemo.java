public class StringDemo {

    public static void main(String[] args) {
        System.out.println();

        String demo = "Heute ist Freitag.";

        System.out.println("demo.length() = " + demo.length());
        System.out.println("demo.carAt(0) = " + demo.charAt(0));
        System.out.println("demo.contains(\"Frei\") = " + demo.contains("Frei"));

        String demo2 = "Heute ist Freitag.";

        if (demo.equals(demo2)) {       //bei Strings immer equals und nicht == !!
            System.out.println("demo entspricht demo2");
        }

    } //psvm
} //pc
