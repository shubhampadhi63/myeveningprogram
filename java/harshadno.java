public class harshadno {
    public static void main(String[] args) {
        int n=18;
        int u=n;
        int sum=0;
        while(u!=0){
            int r=u%10;
            sum=sum+r;
            u=u/10;
        }
        if(n%sum==0){
            System.out.println("harshad no");
        }
        else{
            System.out.println("not harshad no");
        }
    }
}
