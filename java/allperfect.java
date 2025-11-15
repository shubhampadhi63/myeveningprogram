public class allperfect {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
           // int n=i;
            int on=i;
            int sum=0;
            for(int j=1;j<=on/2;j++){
                if(on%j==0){
                    sum=sum+j;
                }
            }
            if(sum==on){
                System.out.println(i);
            }
        }
    }
}
