public class perfect {
    public static void main(String[] args) {
        int n=28;
        int on=n;
        int sum=0;
        for(int i=1;i<=on/2;i++){
            if(on%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("perfect no");
        }
        else{
            System.out.println("not perfect no");
        }
    }
}
