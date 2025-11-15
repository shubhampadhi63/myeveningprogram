import java.util.Scanner;
public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int digit=0;
        int orginalnum=num;
        
        while(orginalnum!=0){
          orginalnum=orginalnum/10;
          digit++;
        }
        orginalnum=num;
        while(orginalnum!=0){
            int r=orginalnum%10;
            sum=sum+(int)Math.pow(r,digit);
            orginalnum=orginalnum/10;
        }
        
        if (sum==num){
            System.out.println("amstrong no");
        }
        else{
            System.out.println("not amstrong no");
        }
    }
}
