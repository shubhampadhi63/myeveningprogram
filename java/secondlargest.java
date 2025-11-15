public class secondlargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i]!=largest){
                second_largest=arr[i];
            }
        }
        System.out.println("Second Largest is: "+second_largest);
    }
}
