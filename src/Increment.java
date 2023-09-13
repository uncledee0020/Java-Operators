public class Increment {
    public static void main(String[] args) {
        // ++i, i++, i= i+1
        int i = 3;
        System.out.println(i);
        int x = ++i; // i=4, x=4
        System.out.println(x);
        System.out.println(i);
        int b=i++; //b=4, i=5
        System.out.println(b);
        System.out.println(i);
    }
}
