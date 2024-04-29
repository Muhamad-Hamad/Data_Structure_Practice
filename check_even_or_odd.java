import java.util.Scanner;

public class  check_even_or_odd{

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("enter your number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
      
    int nun=sc.nextInt();
 System.out.print(num+"is a ");
       if(num%2==0){
        System.out.println("even number");
       }else{
        System.out.println("odd number");
       }
   }
}