import java.util.HashMap;
import java.util.Map;

public class FindVowelInString{

	public static void main(String[] args) {
		String s = "abscdo";
		/*System.out.println(Stream.of(s).allMatch(a -> a.contains("a")||a.contains("o"))
		.count());*/
		Map<String, Integer> countMap =  new HashMap<>();
		int count =0;
		char[] array = s.toCharArray();
		for (char c : array) {
			if(c=='a' || c == 'o'|| c == 'e' )
				count++;
		}
        System.out.println(count);
  
      }

}
