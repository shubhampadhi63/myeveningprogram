public class searcindex {
    public static void main(String[] args) {
        int i;
        int arr[]={1,2,3,4,5};
        int key=4;
        int f=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==key){
                f=1;
            }
        }
        if(f==1){
            System.out.println("at index"+i);
        }else{
            System.out.println("not exit");
        }
    }
}
