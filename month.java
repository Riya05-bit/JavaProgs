import java.util.Scanner;
class Month{
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter month");
	int month=scan.nextInt();

	switch(month){
	case 1:
		System.out.println("Jan");
		break;

	case 2:
		System.out.println("Feb");
		break;

	case 3:
		System.out.println("Mar");
		break;

	case 4:	
		System.out.println("Apr");
		break;

	case 5:
		System.out.println("May");
		break;

	case 6:
		System.out.println("june");
		break;

	case 7:
		System.out.println("july");
		break;

	case 8:
		System.out.println("Aug");
		break;

	case 9:
		System.out.println("sep");
		break;

	case 10:
		System.out.println("oct");
		break;

	case 11:
		System.out.println("Nov");
		break;
	
	case 12:
		 System.out.println("dec");
		break;
	
	default:
		System.out.println("Not valid");
		break;
	}
}
}