import java.util.Scanner;
public class task9{
    public static void main(String[] args){
    
Scanner input = new Scanner(System.in);

System.out.println("Enter First number");
double price = input.nextInt();

double tax = price * 0.10;
double totalPrice = price + tax;

System.out.println("Total amount with 10% tax is: + totalPrice ");
  }
}
