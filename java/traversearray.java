class x{
  void y(int arr[]){
    System.out.println("the array is");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
 }
}
public class traversearray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        x o=new x();
        o.y(arr);
    }
}
