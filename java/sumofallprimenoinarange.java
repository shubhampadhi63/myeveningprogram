public class sumofallprimenoinarange {
    public static void main(String[] args) {
        int n=30;
        int sum=0;
        int i,j;
        for( i=2;i<n;i++){
             int f=0;
            for( j=2;j<i;j++){
                if(i%j==0){
                    f=1;
                    break;
                }
            }
            if(f==0){
               System.out.println(i);
               sum=sum+i;
            }
              
        }
         System.out.println("sum of all prime no is"+" "+sum);
    }
}
