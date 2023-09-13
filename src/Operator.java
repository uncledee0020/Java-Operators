public class Operator {
    public static void main(String[] args) {
        // +-*/%
        int a=5+7; //a=12
        int b=a+2; //b=14
        int c=a+b; //c=26
        int d=8-4; //d==4
        int e=12-d; //e==8
        int f= e-d; //f==4
        int g=3;
        int h=2;
        int m=4%2; //m==0
        int n=15%4;//n=3
        float i= (float)g/h;
        System.out.println("A is equal to " +a);
        System.out.println("B is equal to " +b);
        System.out.println("C is equal to " +c);
        System.out.println("D  is equal to " +d);
        System.out.println("E  is equal to " +e);
        System.out.println(" F is equal to " +f);
        System.out.println(" I is equal to " +i);
        System.out.println(" M is equal to " +m);
        System.out.println(" N is equal to " +n);
        int x=5; //x==5
        System.out.println(x);
        x+=3; //x=x+3, x=8
        System.out.println(x);
        x-=1; //x=x+3, x=7
        System.out.println(x);
        x*=2; // x=x+3, x=14
        System.out.println(x);
        x/=2; //x=x/2, x=7
        System.out.println(x);
        x%=4; //x=x%4, x=3
        System.out.println(x);

    }
}