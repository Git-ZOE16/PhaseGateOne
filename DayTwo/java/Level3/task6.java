import java.util.Scanner;

public class task6{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter number ");

int number = input.nextInt();

int sum1 = 0; 

for(int count = 1; count <= number; count++){

sum1 += count;

System.out.println("sum = " + sum1);
}

}
}

