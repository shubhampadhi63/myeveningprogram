class student{
      long regd;
     String name;
     int roll;
     int age;
    student(long re,String n,int r,int a){
         name=n;
         regd=re;
         roll=r;
         age=a;
       
    }
    void display(){
       
        System.out.println("roll no is"+" "+roll+" "+"age is"+" "+age+" "+"name is"+" "+name+" "+"regd no is"+" "+regd);
    }

}
public class program1 {
    public static void main(String[] args) {
        student sc=new student(2401297271l,"SHUBHAM",1,18);
        sc.display();
    }
}
