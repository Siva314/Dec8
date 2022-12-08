package runner;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import method.CommonElement;

public class RunnerForCommonElementInArray {

	
	public static int[] getArray() {
		Scanner inputReader=new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=inputReader.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=inputReader.nextInt();
		}
		return array;
	}

	public static void main(String[] args) {
		
		int[] firstArray=getArray();
		int[] secondArray=getArray();
		int[] thirdArray=getArray();
		CommonElement common=new CommonElement();
		List<Integer> result=common.findCommonElement(firstArray, secondArray, thirdArray);
		if(result.isEmpty()) {
			System.out.println("No common Element found");
		}
		else {
			System.out.println("Common Elements ");
			Iterator<Integer> iterator=result.iterator();
			while(iterator.hasNext()) {
				System.out.print(iterator.next()+" ");
			}
		}
	}
	
}
