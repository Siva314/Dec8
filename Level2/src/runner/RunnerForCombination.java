package runner;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import method.SumCombination;

public class RunnerForCombination {

	public static void main(String[] args) {
		
		SumCombination obj=new SumCombination();

		Scanner inputReader=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int length=inputReader.nextInt();
		int[] array=new int[length];
		for(int i=0;i<length;i++) {
			array[i]=inputReader.nextInt();
		}
		System.out.println("Enter sum value");
		int sum=inputReader.nextInt();
		
		List<List<Integer>> result=obj.findCombination(array, sum);
		Iterator<List<Integer>> iterator=result.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
