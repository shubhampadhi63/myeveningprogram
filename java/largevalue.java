class x{
    x(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
            
        System.out.println(largest);
    }
}
public class largevalue {
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    x o =new x(arr);
   } 
}
