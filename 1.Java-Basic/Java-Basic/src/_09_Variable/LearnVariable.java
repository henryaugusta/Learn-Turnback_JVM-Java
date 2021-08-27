package _09_Variable;

public class LearnVariable {
    public static void main(String[] args) {
        //Variable : tempat menyimpan;
        // Java -> statically type : 1 variabel hanya 1 tipe data;
        // rules : no whitespace, all number is forbidden,

        // Pembuatan Variable
        String name;
        name = "Henry Augusta Harsono";

        int age;
        age = 20;

        String address;
        address = "Cisarua";


        // ## VAR
        var firstnameVar = "Henry";
        //value should be initialized at init.

        // ## FINAL
        /*
        Secara default bisa diubah-ubah, tpi ada variable yang ga bisa diubah lagi
        maka kita bisa pake final, sering disebut juga constant.
         */
        final String religion = "ISLAM";
        System.out.println(name + " " + age + " " + address + " " + religion );



    }
}
