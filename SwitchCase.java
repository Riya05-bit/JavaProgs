import java.util.Scanner;
class SwitchCase{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your day");
	int day=sc.nextInt();
	
	switch(day){
	case 1:
		System.out.println("It's sunday");
	break;
	case 2:
		System.out.println("It's Monday");
	break;
	case 3:
		System.out.println("It's Tuesday");
	break;
	case 4:
		System.out.println("It's wednesday");
	break;
	case 5:
		System.out.println("It's Thrusday");
	break;
	case 6:
		System.out.println("It's Friday");
	break;
	case 7:
		System.out.println("It's Saturday");
	break;
 	default:
		System.out.println("Invalid input");
	break;
}
}
}



