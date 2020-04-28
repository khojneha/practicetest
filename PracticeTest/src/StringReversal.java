import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class StringReversal {

	public static void main(String[] args) {
		String s = "Hello There";
		System.out.println("Reversal Simple way - "+simpleWay(s));
		System.out.println("Reversal - "+anotherWay(s));
	}
	
	
	public static String simpleWay(String s){
		StringBuilder sb = new StringBuilder(s);		
		return sb.reverse().toString();		
	}
	
	public static String anotherWay(String s){

		List<Character> list = new ArrayList<Character>();
		for (char l:s.toCharArray()) {
			list.add(l);
		}		
		Collections.reverse(list);		 
	    return list.stream()
				 .map(x -> x.toString())
				 .collect(Collectors.joining());
}
}
