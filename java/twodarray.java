import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row size");
        int row=sc.nextInt();
        System.out.println("enter column size");
        int col=sc.nextInt();
        int total=row*col;
        int arr[][]=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.printf("enter %d element",total);
                arr[i][j]=sc.nextInt();
                total--;
            }
           
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
           System.out.println();
        }
    }
}
