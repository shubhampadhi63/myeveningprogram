class a{
    static void b(int range){
    for(int i=1;i<=range;i++){
            int n=i;
            int u=n;
            int sum=0;
            int digit=0;
           int reverse=0;
            while(u!=0){
                int r=u%10;
                 reverse=reverse*10+r;
                u=u/10;
            }
            u=reverse;
            while(u!=0){
                int r=u%10;
                digit++;
                sum=sum+(int)Math.pow(r,digit);
                u=u/10;
            }
            if(n==sum){
                System.out.println(n);
            }
        }
    }
}

public class alldisariumno {
    public static void main(String[] args) {
       a.b(1000);
    }
}
