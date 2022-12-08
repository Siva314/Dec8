package runner;

import java.util.Scanner;

import method.ReverseString;

public class RunnerForReverseString {

	public static void main(String[] args) {
		ReverseString reverse=new ReverseString();
		Scanner inputReader=new Scanner(System.in);
		System.out.println("Enter the String");
		String input=inputReader.nextLine();
		String result=reverse.reverseString(input);
		System.out.println(result);
	}
	
}
