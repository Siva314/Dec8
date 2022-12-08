package method;

import java.util.ArrayList;
import java.util.List;

public class SumCombination {

	public List<List<Integer>> findCombination(int[] array,int sum){
		List<List<Integer>> result=new ArrayList<>();
		List<Integer> inner=new ArrayList<>();;
		int length=array.length,i=0;
		
		while(i<length-1) {
			int first=array[i];
			if(first<=sum) {
				if(first==sum) {
					inner.add(first);
				}
				else {
					for(int j=i+1;j<length;j++) {
						int second=array[j];
						int temp=first+second;
						if(temp==sum) {
							inner.add(first);
							inner.add(second);
						}
						else {
							if(j+1!=length) {
								for(int k=j+1;k<length;k++) {
									int third=array[k];
									if(temp+third==sum) {
										inner.add(first);
										inner.add(second);
										inner.add(third);
									}
									if(!inner.isEmpty()) {
										result.add(inner);
										inner=new ArrayList<>();
									}
								}
							}
							
						}
						if(!inner.isEmpty()) {
							result.add(inner);
							inner=new ArrayList<>();
						}
					}
				}
				if(!inner.isEmpty()) {
					result.add(inner);
					inner=new ArrayList<>();
				}
				i++;
			}
			else {
				i++;
			}
		}

//		for(int i=0;i<length-1;i++) {
//			inner=new ArrayList<>();
//			int first=array[i];
//			if(first<=sum) {
//				
//				if(first==sum) {
//					inner.add(first);
//				}
//				
//				else {
//					for(int j=i+1;j<length;j++) {
//						int second=array[j];
//						if(second<sum) {
//							if(first+second==sum){
//								inner.add(first);
//								inner.add(second);
//							}
//						}
//					}
//				}
//				if(!inner.isEmpty()) {
//					result.add(inner);
//				}
//			}
//		}
		return result;
	}
	
}
