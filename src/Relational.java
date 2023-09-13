public class Relational {
    public static void main(String[] args){
        // ==, !=, >, >=, <, <=
        int a=3;
        int b=4;
        int c=7;
        int d=3;

        System.out.println(a==d); //true
        System.out.println(a==c); //false

        System.out.println(a!=d); //false
        System.out.println(b!=c); //true

        System.out.println(a>d); //false
        System.out.println(b>d); //true
        System.out.println(b>c); //false

        System.out.println(a>=d); //true
        System.out.println(a>=b); //false
        System.out.println(c>=b); //true

        System.out.println(a<d); //false
        System.out.println(a<b); //true
        System.out.println(c<d); //false

        System.out.println(a<=d); //true
        System.out.println(c<=d); //false
        System.out.println(b<=d); //false

    }
}
