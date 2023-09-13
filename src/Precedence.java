public class Precedence {
    public static void main(String[]args){
        /*Highest
        i++, i--
        ++i, --i, ~, !
        *, /, %
        +, -
        <<, >>, >>>
        >, <, >=, <=
        ==, !=
        &
        ^
        |
        &&
        ||
        =, +=, -=, *=, /=, %=
        lowest*/
        int x=5-7*8; // -51
        int y=(5-7)*8; //-16
        System.out.println(x);
        System.out.println(y);
    }
}
