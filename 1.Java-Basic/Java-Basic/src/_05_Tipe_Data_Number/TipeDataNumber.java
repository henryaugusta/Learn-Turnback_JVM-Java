package _05_Tipe_Data_Number;

public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        int iniInt = 100;
        long iniLong = 100;
        double iniDouble = 100.9;
        float iniFloat = 32.767f;


        System.out.println(String.valueOf(iniLong));
//        int cobaInt = iniDouble; this is error
        double cobaDouble = iniInt; // no error

        //int can be assigned to double, double can't be assigned to int
        // because double is larger than int

        //Widening vs Shortening Conversion
        //Widening : from smaller to bigger var, shortening vice versa
        long iniLong2 = 100;
        System.out.println(String.valueOf(iniLong2));
        double iniInt2 = iniLong2;

        // NUMBER OVERFLOW
        // When bigger variable forced to enter smaller variable
        // example : double converted to byte
        double testDouble = 1000;
        byte newByte = (byte) testDouble;
        System.out.println("Int to Byte of 1000 : " + newByte);
        // The result will be -24 because the number is overflowing while byte iteration doesn't meet 100;
        // byte max number is 127, when reach 127, byte going back to -128 until meet 1000
    }
}
