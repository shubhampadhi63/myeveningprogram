public class swapfirstcoltolastcol {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int lastcol=arr[0].length-1;
        
        
        for(int j=0;j<arr[0].length;j++){
            int temp=arr[j][lastcol];
            arr[j][lastcol]=arr[j][0];
            arr[j][0]=temp;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


