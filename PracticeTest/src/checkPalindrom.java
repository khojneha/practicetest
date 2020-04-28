import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class checkPalindrom {

	public static void main(String[] args) {
		String originalString = "bananab";
		List<Character> list = new ArrayList<>();
		for (char l:originalString.toCharArray()) {
			list.add(l);
		}		
		Collections.reverse(list);
		String palindrom = list.stream().map(x -> x.toString()).collect(Collectors.joining());
		System.out.println(originalString.equalsIgnoreCase(palindrom));
		
		//practice
		for(char s : originalString.toCharArray()){
			list.add(s);
		}
		
		Collections.reverse(list);
		String pal  = list.stream().map(x -> x.toString()).collect(Collectors.joining());
	}

}
