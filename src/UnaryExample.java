public class UnaryExample {
    public static void main(String [] args){
        int x=10;
        System.out.println("r=: " + x++); //r=10, the value of x=10 is stored in r and then x is incremented to 11
        System.out.println("r=: " + x); //r=11

        int y=10;
        System.out.println("z=: " + y); // z=10
        System.out.println("z=: " + ++y); //z=11
        System.out.println("k=: " + --y); // k=10
    }
}
