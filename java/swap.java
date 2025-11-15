import java.util.Scanner;
class a {
     int a,b;
      a(int a,int b){
      a=a+b;
      b=a-b;
      a=a-b;
       System.out.println("swapped values are: "+a+" "+b);
   }
}
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int c=sc.nextInt();
        int d=sc.nextInt();
        a obj=new a(c,d);
        
        
    }
}
