package _15_Expression_Statement_Block;

import javax.xml.crypto.Data;
import java.util.Date;

public class ESB {
    public static void main(String[] args) {
        /*
        Konstruksi dari variabel, operator, dan pemanggilan method yang
        mengevaluasi single value

        INTINYA : semua kode yang menjadikan sebuah single value -> expression
         */

        //Contoh Expression
        int value; // ini expression
        value = 10; // ini expression
        System.out.println(value = 100);
        // value == 100 adalah statement
        // STATEMENT : Gabungan expression, kalimat lengkap dalam bahasa

        // Jenis statement
        double aValue = 921.31;
        // Increment statement
        aValue++;
        //Method invocation
        System.out.println("Hello World");
        //Object Creation
        for (int i = 0; i < 20000; i++) {
            Date a = new Date();
            System.out.println(a.getTime());
        }
    }

}
