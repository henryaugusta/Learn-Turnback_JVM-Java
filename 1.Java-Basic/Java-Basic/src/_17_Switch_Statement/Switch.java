package _17_Switch_Statement;

public class Switch {
    public static void main(String[] args) {
        //HANYA UNTUK ==

        var nilai = "C";
        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus Dengan Sangat Memuaskan");
                break;
            case "B":
                System.out.println("Anda Lulus Dengan Memuaskan");
                break;
            case "C":
                System.out.println("Anda Lulus Dengan Baik");
                break;
            case "D":
                System.out.println("Anda Lulus Dengan Nilai Cukup");
                break;
            case "E":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

    }
}
