package _15_Expression_Statement_Block;

public class Block {
    public static void main(String[] args) {

        System.out.println("HELLO WORLD 1");
        System.out.println("HELLO WORLD 2");
        System.out.println("HELLO WORLD 3");


        {
            var name = "name";
            System.out.println(name);
            System.out.println("Hello World 4");
            System.out.println("Hello World 4");
            System.out.println("Hello World 4");
        }

        //System.out.println(name); // error because outside of scope

    }
}
