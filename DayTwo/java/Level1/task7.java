import java.util.Scanner;
public class task7{
    public static void main(String[] args){
    
Scanner input = new Scanner(System.in);

System.out.println("Enter radius");
double radius = input.nextInt();

double pie = 3.142;

double circumference = pie * radius * radius;


System.out.println("Circumference of circle is:" + circumference);
  }
}
