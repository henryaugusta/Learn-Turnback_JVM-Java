package _10_TIpe_Data_Bukan_Primitif;

public class NonPrimitiveVariable {
    public static void main(String[] args) {
        /*
        Tipe data primitif =  bawaan bahasa pemrograman.
        Tipe data non-primitive bisa punya fungsi/method.
        sering disebut juga Reference.
        example : Class,Object,Array,String
         */

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        // byte iniByte = null; Error karena primitive,
        Byte iniByte = null; // bisa null karena non-primitive

        // Method at non-primitive
        int iniInt = 200;
        Integer iniIntNonPrimitive = iniInt;

        int iniIntBaru = iniIntNonPrimitive;
        long iniLongBaru = iniIntNonPrimitive.longValue();

        System.out.println(iniLongBaru);

    }
}
