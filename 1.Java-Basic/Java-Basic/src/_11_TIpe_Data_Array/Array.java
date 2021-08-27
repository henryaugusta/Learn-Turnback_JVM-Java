package _11_TIpe_Data_Array;

public class Array {
    public static void main(String[] args) {
        /*
        Array : Kumpulan data dengan tipe sama
        - jumlah data di array tidak bisa berubah setelah pertama kali dibuat
         */


        // Inisiasi 1
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Henry";
        arrayString[1] = "Augusta";
        arrayString[2] = "Harsono";


        System.out.println("Array Pertama");
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print(arrayString[i] + " ");
        }
        System.out.println();

        // Inisiasi dengan isi
        String[] listName = {"Razky", "Febriansyah"};
        listName[1] = "Agus";

        System.out.println("List Nama Length " + listName.length);
        System.out.println(String.valueOf(listName));


        // ## OPERASI DI ARRAY
        /*

        array[index] : ambil data array
        array.length : panjang array

         */

        String[][] members = {
                {"Eko", "Kurniawan", "Khannedy"},
                {"Henry", "Augusta", "Harsono"},
        };

        System.out.println("Print first member");
        System.out.println(members[0][0]);
        System.out.println(members[1][0]);

        System.out.println("====for members====");

        int counter = 0;
        for (String[] member : members) {
            System.out.println("Member ke-" + (counter + 1));
            for (int i = 0; i < members.length; i++) {
                System.out.print(members[counter][i] + " ");
            }
            counter++;
            System.out.println();
        }


    }
}
