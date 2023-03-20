package TrainingCodes;
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age of person:");
		int age = sc.nextInt();

		if(age<18)
		{
			System.out.println("your are a minor!!");

		}

		else if (age>65) {
			System.out.println("you are a senior citizen!!");

		}
		else
		{
			System.out.println("congratulations!!you have a eligiblity");	
		}

	}

}
