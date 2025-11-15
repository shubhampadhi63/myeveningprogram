class w{
    w(int a,int b){
       
        int max;
        int lcm;

        if(a>b){
            max=a;
        }else{
            max=b;
        }
        while(true){
           if(max%a==0 && max%b==0){
            lcm=max;
            break;
           } 
           max=max+1;
        }
        System.out.println(lcm);
    }
}
public class findlcm {
    public static void main(String[] args) {
        w sc=new w(4,5);
    }
}
