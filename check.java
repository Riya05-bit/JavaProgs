import java.util.Scanner;
public class Check{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a=scan.nextInt();
		if(a%2==0){
			System.out.println("a is Even number");
		}
		else{
			System.out.println("a is Odd number");
		}
}
}