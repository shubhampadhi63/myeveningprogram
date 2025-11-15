public class allharshadno {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int n=i;
            int u=n;
            int sum=0;
            while(u!=0){
                int r=u%10;
                sum=sum+r;
                u=u/10;
            }
            if(n%sum==0){
                System.out.println(n);
            }
            
        }
    }
}
