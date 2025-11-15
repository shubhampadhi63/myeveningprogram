public class allneon {
    public static void main(String[] args) {
        for(int i=0;i<=1000;i++){
            int n=i;
            int sum=0;
             int square=n*n;
        while(square>0){
            sum=sum+(square%10);
            square=square/10;
        }
        if(sum==n){
            System.out.println(i);
        }
        }
    }
}
