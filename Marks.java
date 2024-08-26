import java.util.Scanner;
class Marks{
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your marks");
	int marks=scan.nextInt();
	
	if(marks>=0&&marks<40){
	System.out.println("Fail");
	}

	else if(marks>=40&&marks<60){
	System.out.println("Pass");
	}

	else if(marks>=60&&marks<70){
	System.out.println("C-grade");
	}

	else if(marks>=70&&marks<80){
	System.out.println("B-grade");	
	}

	else if(marks>80&&marks<90){
	System.out.println("A-grade");
	}

	else if(marks>=90&&marks<=100){
	System.out.println("A+ grade");
	}

	else{
	System.out.println("Not valid");
	}

	}
}