import java.util.Scanner;

public class check_greater_number {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("enter your number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       int nun=sc.nextInt();
 if(num==nun){
                System.out.println("equal");
            }else if(num>nun){
                System.out.println("num is greater");
            }else 
            System.out.println("nun is greater");
      }
}