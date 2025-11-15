public class maxsumsubarray {
    public static void main(String[] args) {
        int maxsubarray=0;
        int sum=0;
        int arr[]={-1,-2,-3,-5,-6,-4,-5};
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            maxsubarray=Math.max(sum,maxsubarray);
        }
        System.out.println(maxsubarray);
    }
}
