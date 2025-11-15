//import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        
        int rev=0;
        int square=num*num;
        int finalno=0;
        int digit=0;
        int orginalnum=num;
        
        while(orginalnum!=0){
          orginalnum=orginalnum/10;
          digit++;
        }
        
        for(int i=1;i<=digit;i++){
            int r=square%10;
            rev=rev*10+r;
            square=square/10;
        }
        while(rev!=0){
            int r2=rev%10;
            finalno=finalno*10+r2;
            rev=rev/10;
            
        }
        if (finalno==num){
            System.out.println("automorphic no");
        }
        else{
            System.out.println("not automorphic no");
        }
    }
} */
int n=25;
int u=n;
int m=n*n;
int digit=0;
while(u!=0){
    digit++;
    u=u/10;
}
int temp=(int)Math.pow(10,digit);
if(m%temp==n){
    System.out.println("automorphic no");
}
    }}