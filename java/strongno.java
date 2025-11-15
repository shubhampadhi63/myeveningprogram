import java.util.*;
public class strongno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        int u=n;
        int sum=0;
        while(u!=0){
            int r=u%10;
            int fact=1;
            for(int i=1;i<=r;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            u=u/10;
        }
        if(n==sum){
            System.out.println("strong no");
        }
        else{
            System.out.println("not a strong no");
        }
    }
}