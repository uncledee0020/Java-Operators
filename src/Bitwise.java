public class Bitwise {
    public static void
    main(String[] args){
        // &, |, ~, ^, <<, >>, >>>
        int x=4; //00000000000000000000000000000100
        int y=1; //00000000000000000000000000000001

        System.out.println(x&y); // 00000000000000000000000000000000   Prints 0
        System.out.println(x|y); // 00000000000000000000000000000101   Prints 5
        System.out.println(~x); // 11111111111111111111111111111011   Prints -5 (the 1 bit at the beginning signifies a negative. You then flip all the bits, get the value and then  add 1; for this case, you get a 5)
        System.out.println(x^y); // 00000000000000000000000000000101   Prints 5
        System.out.println(x<<y); // 00000000000000000000000000001000   Prints 8
        System.out.println(x>>y); // 00000000000000000000000000000010   Prints 2
        System.out.println(x>>>y); // 00000000000000000000000000000010   Prints 2
    }
}
