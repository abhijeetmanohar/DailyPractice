//Find the first non-repeating character in a string
// String : GeekforGeeks -> f
import java.util.Scanner;
public class GS_1{

	public static char repeatingChar(String str){
		//1. Convert string to charArray
		//2. For each character, check with the elements in charArray
		int count = 0;
		String string = str;
		string = string.toLowerCase();
		char[] charArray = string.toCharArray();
		// O(n^2) is bad
		for(int i = 0; i < charArray.length; i++){
			for(int j=0; j < charArray.length; j++){
				if(charArray[i] == charArray[j]){
					count++;
				}
			}
			if(count == 1){
				return charArray[i];
			}
			count = 0;
		}
		return '0';
	}
	public static void main(String args[]){
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(repeatingChar(str));
	}
}