class a{
    int sum=0;
    a(int n){
        int square=n*n;
        while(square>0){
            sum=sum+(square%10);
            square=square/10;
        }
        if(sum==n){
            System.out.println("neon no");
        }
        else{
            System.out.println("not neon no");
        }
    }
}

public class checkneon {
    public static void main(String[] args) {
        a s=new a(9);
    }
}
