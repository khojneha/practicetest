import java.util.HashMap;
import java.util.Map;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LnT_FindVowelInString {

	public LnT_FindVowelInString() {
	}
	
	public static void main(String[] args) {
		System.out.println("countCharectersInString "+countCharectersInString("HelloWorld"));
		System.out.println("countVowelInString1 "+countVowelInString1("whIskey tango fox"));

	}
	
	public static long countVowelInString(String str){
		IntPredicate vowel = new IntPredicate() {			
			@Override
			public boolean test(int t) {
				return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u'
	                    || t == 'A' || t == 'E' || t == 'I' || t == 'O'
	                    || t == 'U';
			}
		};
	    long vowelCount = str.chars().filter(vowel).count();
	    return vowelCount;
	}
	
	
	
	public static Map<Character, Integer> countCharectersInString(String str){
		Map<Character, Integer> freqs = new HashMap<>();
		for (char c : str.toCharArray()) {
			freqs.merge(c, 1, Integer::sum);
		}		
		return freqs;
	}
	
	public static Map<Character, Integer> countVowelInString1(String str){
		
		Map<Character, Integer> freqs = new HashMap<>();
		for (char c : str.toCharArray()) {
			if(testVowel(c)) {
			freqs.merge(c, 1, Integer::sum);
			}
		}		
		return freqs;
	}
	
	public static boolean testVowel(int t) {
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u'
                || t == 'A' || t == 'E' || t == 'I' || t == 'O'
                || t == 'U';
	}
}
