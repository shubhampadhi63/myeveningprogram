class a{
    static void b(int a,int b){
           
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    System.out.println(a);

    }
}
public class swaptwono {
   public static void main(String[] args) {
    a.b(10,100);
   } 
}
