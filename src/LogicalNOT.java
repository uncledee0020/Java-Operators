public class LogicalNOT {
    public static void main(String[] args){
        boolean x=true, y=false;

        System.out.println("x is " +x+ " and y is"+y);
        System.out.println("!x is " +!x);
        System.out.println("!y is " +!y);
        System.out.println("!(x || y) is " +!(x||y));
        System.out.println("!(x && y) is " +!(x&&y));

    }
}
