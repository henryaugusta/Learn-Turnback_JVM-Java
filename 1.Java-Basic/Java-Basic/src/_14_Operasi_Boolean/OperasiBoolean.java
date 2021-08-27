package _14_Operasi_Boolean;

public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNIlai = absen >+ 75;

        boolean isLulus = lulusAbsen && lulusNIlai;
        System.out.println(isLulus);
        System.out.println("Sogok 50 ribu biar lulus");
        System.out.println(!isLulus);

    }
}
