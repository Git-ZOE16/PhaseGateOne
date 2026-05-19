import java.util.Scanner;

public class task7{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number ");

int number = input.nextInt();

int sum1 = 0; 

for(int count = 1; count <= 5; count++){

sum1 += count;

System.out.println("sum = " + sum1);
}

}
}

