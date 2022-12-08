package method;

import java.util.List;
import java.util.ArrayList;

public class CommonElement {

	public List<Integer> findCommonElement(int[] firstArr,int[] secondArr,int[] thirdArr) {
		List<Integer> elementList=new ArrayList<>();
		List<Integer> commonElement=new ArrayList<>();
		List<Integer> resultList= new ArrayList<>();
		
		int firstLength=firstArr.length;
		for(int i=0;i<firstLength;i++) {
			elementList.add(firstArr[i]);
		}
		int secondLength=secondArr.length;
		for(int i=0;i<secondLength;i++) {
			int temp=secondArr[i];
			if(elementList.contains(temp)) {
				commonElement.add(temp);
			}
		}
		int thirdLength=thirdArr.length;
		for(int i=0;i<thirdLength;i++) {
			int temp=thirdArr[i];
			if(elementList.contains(temp) && commonElement.contains(temp)) {
				resultList.add(temp);
			}
		}
		return resultList;
	}
	
}
