package runner;

import java.util.Scanner;

import method.FindMonoNumber;

public class RunnerForMonoDigit {

	public static void main(String[] args) {
		
		FindMonoNumber mono=new FindMonoNumber();

		Scanner inputReader=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int inputNumber=inputReader.nextInt();
		int result=mono.checkNumberIsMono(inputNumber);
		if(result==0) {
			System.out.println("Cannot create a mono digit number");
		}
		else {
			System.out.println(result);
		}
		
		
	}

}
