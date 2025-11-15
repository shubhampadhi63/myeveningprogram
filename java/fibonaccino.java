class a{
    void b(int n,int a,int b){
        System.out.print(a+" "+b);
        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
public class fibonaccino {
    public static void main(String[] args) {
        a sc=new a();
        sc.b(10,0,1);
        }
    }

