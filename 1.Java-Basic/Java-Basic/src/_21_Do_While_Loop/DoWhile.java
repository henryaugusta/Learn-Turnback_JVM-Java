package _21_Do_While_Loop;

public class DoWhile {
    public static void main(String[] args) {
        //Perulangan minimal 1 kali

        var counter = 1;
        do {
            System.out.println("Kamu Keren "+counter);
            ++counter;
        }while (counter<=100);
    }
}
