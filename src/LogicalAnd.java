public class LogicalAnd {
    public static void main(String[] args){
        boolean x= true, y=false;
        System.out.println("x is "+ x + " and y is " +y);
        System.out.println("y && x is "+ (y && x));
        System.out.println("x && y is "+ (x && y));
        System.out.println("x && x is "+ (x && x));
        System.out.println("y && y is "+ (y && y));
    }
}
