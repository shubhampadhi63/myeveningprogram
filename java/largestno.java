class w{
    w(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("a is larger"+a);
        }
        else if(b>c&&b>a){
            System.out.println("b is greater"+b);
        }
        else{
            System.out.println("c is greater"+c);
        }
        }
    }
public class largestno {
    public static void main(String[] args) {
        w sc=new w(1,6,9);
    }
}
