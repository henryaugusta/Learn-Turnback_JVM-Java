package _12_Operasi_Matematika;

public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;

        System.out.println("Operator Biasa");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        double a1 = 100;
        double a2 = 30;
        System.out.println(a1 + a2);

        //Augmented Assignment
        int ca = 100;
        ca += 110;
        System.out.println("Augmented Assigment " + ca);
        System.out.println();

        // Unary Operator
        int as = 100;
        as++;
        as++;
        as++;
        System.out.println("AS " + as);
        System.out.println();


        var jml = 5;
        var jml2 = 5;
        System.out.println("Pre-increment " + ++jml + " Value added instantly");
        System.out.println("Post-increment " + jml2++ + " Value added at the next line");
        System.out.println("Prove of post-increment (printing jml2) : " + jml2);

        System.out.println();
        boolean betul = true;
        System.out.println("betul sebenarnya adalah " + !betul);

    }
}
