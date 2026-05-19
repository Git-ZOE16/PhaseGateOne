import java.util.Scanner;
public class task10{
    public static void main(String[] args){
    
Scanner input = new Scanner(System.in);

System.out.println("Enter First number");
int number1 = input.nextInt();

System.out.println("Enter Second number");
int number2 = input.nextInt();

System.out.println("Enter Third number");
int number3 = input.nextInt();

int average = number1 + number2 + number3 / 3;

System.out.println("average of numbers:" + average);

  }
}
