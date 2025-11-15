
public class indexcount {
    public static void main(String[] args) {
        int arr[]={5,6,7,5,10,11,5,5,9,6,2};
        int key=5;
        int i;
        int count=0;
        for( i=0;i<arr.length;i++){
            if(arr[i]==key){
               
                count++;
            }
        }
        
        System.out.printf("my key value %d time appears.",count);
    }
}
