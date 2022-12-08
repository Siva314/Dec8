package method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMonoNumber {

	public int checkNumberIsMono(int number) {
		char[] array=String.valueOf(number).toCharArray();
		List<Integer> tempList=new ArrayList<>();
		int length=array.length;
		for(int i=0;i<length;i++) {
			tempList.add(Integer.parseInt(String.valueOf(array[i])));
		}
		
		int listSize=tempList.size();
		
		for(int j=0;j<listSize)
		
	}
	
}
