import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountLettersInString {
	public static void main(String[] args) {
		String s = "hi there is this is this hi here";
		
		List<String> list = Stream.of(s)
							.map(x -> x.split(" "))
							.flatMap(Arrays::stream)
							.collect(Collectors.toList());
		Map<String, Integer> map =  new HashMap<>();
		
		for(String key : list) {
			map.merge(key, 1, Integer::sum);

		}
		
		System.out.println(map);

	}
}
