public class task5{
public static void main(String[] args){

Scanner input = new Scanner(System.in){

System.out.print("Enter number ");
int number = input.nextInt();

int factorial = 1;

for(int count = number;  count >= 1; count--){
factorial *= count;
}

System.out.println(count);

}
}
}

