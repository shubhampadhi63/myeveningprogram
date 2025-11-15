import java.util.Scanner;
class a{
    int n;
   
    static void b(int n){
        int f=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                f=1;
               break;
            }
        }
        if(f==0){
            System.out.println("prime no");
        }
        if(f==1){
            System.out.println("not prime no");
        }
    }
}
public class prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no");
        int c=sc.nextInt();
        a.b(c);
    }
}
