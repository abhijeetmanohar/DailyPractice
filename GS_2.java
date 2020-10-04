//First non-repeating character using HashMap
import java.util.HashMap;
public class GS_2{

	public static void main(String[] args) {
		String string = "aAbBc";
		int count = 0;
		char[] charArray = string.toLowerCase().toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for(char ch : charArray){
			if(map.containsKey(ch)){
				count = map.get(ch);
				count++;
				map.put(ch, count);
			}else{
				map.put(ch, 1);
			}
		}
		//created a hashmap mapping for each character. 
		for(char ch : charArray){
			if(map.get(ch) == 1){
				System.out.println(ch);
				break;
			}
		}

	}
}