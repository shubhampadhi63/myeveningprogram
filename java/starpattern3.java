import java.util.*;
class a{
    static void b(int n){
        for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                System.out.print("*");
             }
              System.out.println(" ");
        }
           
            for(int i=1;i<=n;i++){
                 for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
            }
        
    }
}
public class starpattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        a.b(n);
    }
}
