package method;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseString {

	public String reverseString(String input) {
		int length=input.length();
		char[] strArray=new char[length];
		int i=0,end=length-1,j=0;
		while(i<length && end>=0) {
			char first=input.charAt(i);
			char second=input.charAt(end);
			if(checkIsChar(first) && checkIsChar(second)) {
				strArray[j]=second;
				end--;
				i++;
				j++;
			}
			else if(checkIsChar(first)) {
				end--;
			}
			else {
				strArray[j]=first;
				i++;
				j++;
			}
		}
		return String.valueOf(strArray);
	}
	
	public boolean checkIsChar(char character) {
		String str=String.valueOf(character);
		Pattern pattern=Pattern.compile("[a-zA-z0-9]");
		Matcher match=pattern.matcher(str);
		return match.find();
	}
	
}
