package _17_Switch_Statement;

public class SwitchLambda {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan = nilai>(75) ?"Selamat anda lulus" : "SIla coba lagi";
        System.out.println(ucapan);
    }
}
