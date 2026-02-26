import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int year=sc.nextInt();

        if(m<1||m>12){
            System.out.println("Invalid month");
        }
        else if(m==2){
            if((year%400==0)||(year%4==0 && year%100!=0)){
                System.out.println(29);
            }
            else{
                System.out.println(28);
            }
        }
        else if(m==4||m==6||m==9||m==11){
            System.out.println(30);
        }
        else
        {
            System.out.println(31);
        }
    }
    
}
