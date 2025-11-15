public class reversearray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int s=0;
       int n=arr.length;
       int e=n-1;
      /*  int arr2[]=new int[n];
       int j=0;
       for(int i=n-1;i>=0;i--){
        arr2[j]=arr[i];
        j++;
       }
       for(int k=0;k<n;k++){
       System.out.print(arr2[k]+" ");
       }*/
      while(s<e){
       int temp=arr[(e)];
       arr[e]=arr[s];
       arr[s]=temp;
       s++;
       e--;
      }
       for(int k=0;k<n;k++){
       System.out.print(arr[k]+" ");
       }
    }
    
}
