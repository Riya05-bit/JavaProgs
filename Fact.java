import java.util.Scanner;
class Fact{
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int number=scan.nextInt();
	int fact=1;
	if(number==0){
		System.out.println("The factorial of 0 is 1 ");
	}
	else if(number!=0){
		int i=1;
		while(i<=number){
			fact=fact*i;
			i++;
		}
			
	}
	System.out.println("The factorial is "+fact);
	}
}