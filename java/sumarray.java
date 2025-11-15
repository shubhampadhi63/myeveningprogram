class x{
    x(int arr[]){
        int sum=0;
        for(int i=arr.length-1;i>=0;i--){
            sum=sum+arr[i];
        }
            
        System.out.println(sum);
    }
}
public class sumarray {
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    x o =new x(arr);
   } 
}
