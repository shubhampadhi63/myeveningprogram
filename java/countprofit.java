public class countprofit {
    public static void main(String[] args) {
        int price[]={5,3,1,6,9,7,8};
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++){
           if(buyprice<price[i]){
             int profit=price[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
           }
           else{
            buyprice=price[i];
           }
        }
        System.out.println(maxprofit);
    }
}
