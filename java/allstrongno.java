public class allstrongno {
    public static void main(String[] args) {
        int n=100000;
        
         
        for(int j=0;j<=n;j++){
            int u=j;
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
             if(j==sum){
            System.out.println(j);
        }
        }
       
    }
}
