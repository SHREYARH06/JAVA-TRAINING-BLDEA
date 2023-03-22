package TrainingCodes;
import java.util.Scanner;
public class Classexp2 {

	public static void main(String[] args) {
		System.out.println("Enter the number of students:");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of the students number"+(i+1));
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("the marks of students number"+(i+1)+" is: "+arr[i]);
		}

	}

}
