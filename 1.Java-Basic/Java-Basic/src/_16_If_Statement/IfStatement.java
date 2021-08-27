package _16_If_Statement;

public class IfStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;

        if (nilai > 75 && absen > +75) {
            System.out.println("Kamu Lulus");
        } else if (absen<50) {
            System.out.println("Kamu Tidak Lulus Karena Absen Jelek");
        } else if(nilai<50) {
            System.out.println("Kamu Tidak Lulus, Karena Nilai tidak memenuhi syarat");
        }


    }
}
