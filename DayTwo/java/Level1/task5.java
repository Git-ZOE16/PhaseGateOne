import java.util.Scanner;
public class task5{
    public static void main(String[] args){
    
Scanner input = new Scanner(System.in);

System.out.println("Enter Temperature in Celcius");
double temperature = input.nextInt();

double fahrenheit = temperature * 1.8 + 32;

System.out.println("Temperature in fahrenheit is:" + fahrenheit);
  }
}
