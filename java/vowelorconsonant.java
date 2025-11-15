import java.util.*;
class a{
    
    static void b(char a){
        if( a=='a'|| a=='e'|| a=='i'|| a=='o'|| a=='u'|| a=='A'||a=='E' || a=='I'|| a=='O'|| a=='U' ){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
public class vowelorconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a charecter which you want to check");
        char s=sc.next().charAt(0);
        a.b(s);
    }
}
