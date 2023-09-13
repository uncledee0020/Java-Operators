public class Conditional {
    public static void main(String[] args){
        // Conditional operators &&, ||, !
        int x=9;
        System.out.println(x>5 && x<11); // returns true
        System.out.println(x>5 && x<8); // returns false

        System.out.println(x>5 || x<8); // returns true
        System.out.println(x>5 || x<11); // returns true
        System.out.println(x>10 || x<8); // returns false

        System.out.println(!(x>5 && x<11)); // returns false
        System.out.println(!(x>5 && x<8)); // returns true
    }
}
