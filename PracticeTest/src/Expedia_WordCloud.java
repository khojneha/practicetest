import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Expedia_WordCloud {

	public static void main(String[] args){
		File file = new File("url.txt"); 
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		List<String> listOfLines = new ArrayList();	  
		while (sc.hasNextLine()) 
			listOfLines.add(sc.nextLine().replaceAll("[^a-zA-Z0-9]", " ")); 
		

	    
	    List<String> listOfwords =    listOfLines.stream()
					    		.map(w -> w.split(" "))
								.flatMap(Arrays::stream)
								.map(s-> s.toLowerCase())
								.collect(Collectors.toList());
	             

	    Map<String, Integer> wordCloud =getWordCloud(listOfwords);
	    System.out.println(wordCloud);
	}


	private static Map<String, Integer> getWordCloud(List<String> wordArray){
	    Map<String, Integer> wordCloud = new HashMap<>();
	        for (String key : wordArray) {
	            wordCloud .merge(key, 1, Integer::sum);
			}
	    return wordCloud ;
	}
}
