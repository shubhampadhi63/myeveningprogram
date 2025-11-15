public class allautomorphic {
    public static void main(String[] args) {
        for(int i=0;i<=1000;i++){
            int n=i;
            int square=n*n;
            int digit=0;
            int temp=n;
            while(temp>0){
                digit++;
                temp=temp/10;
            }
            int mod=(int)Math.pow(10,digit);
            if(square%mod==n){
                System.out.println(i);
            }
        }
    }
}
