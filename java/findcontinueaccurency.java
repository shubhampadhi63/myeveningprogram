public class findcontinueaccurency {
    public static void main(String[] args) {
        int arr[]={0,1,1,0,0,0};
        int count=1;
        int maxcount0=0;
        int maxcount1=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                if(arr[i]==0 && arr[i+1]==0){
                  count++;
                  maxcount0=Math.max(maxcount0,count);
                }else if(arr[i]==1 && arr[i+1]==1){
                  count++;
                  maxcount1=Math.max(maxcount1,count);
                }
            }
            else{
                count=1;
                maxcount0=Math.max(maxcount0,count);
                maxcount1=Math.max(maxcount1,count);
            }
        }
        System.out.println("Maximum continuous accuracy of 0 is: "+(maxcount0));
        System.out.println("Maximum continuous accuracy of 1 is: "+(maxcount1));
        
    }
}
