package practicePrograms;

import java.util.HashMap;
import java.util.Map;

public class mostRepeatingCharacter {

	public static void main(String[] args) {

		String name = "Shiva Shankaran"; 
		int mostRepeatingChar = 0;
		int count = 0;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for(int i=0; i<name.length(); i++)
		{
			char ch = name.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}

	}

}
