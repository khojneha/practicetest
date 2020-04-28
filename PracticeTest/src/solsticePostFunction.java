import java.util.ArrayList;
import java.util.List;

public class solsticePostFunction {

	public static void main(String[] args) {
		System.out.println("postFunction = "+ postFunction("532+-"));
	}
	
	public static int postFunction(String s){
		List<Integer> operandList = new ArrayList<>();
		List<String> operatorList = new ArrayList<>();
		
		for(char c:s.toCharArray()){
			if(Character.isDigit(c)){
				operandList.add(Character.getNumericValue(c));
			} else {
				operatorList.add(String.valueOf(c));
			}
		}
		
		int j =0;
		int result = operandList.get(operandList.size()-1);
		for (int i = operandList.size()-2; i >= 0; i--){
			if(j<=operatorList.size()-1) {
				result = applyPostFunction(result, operandList.get(i), operatorList.get(j));
			}
			j++;
		}
		return result;
	}
	
	public static int applyPostFunction(int a, int b, String op){
		
		switch(op){
		case "+":
			return a+b;
		case "-":
			return a-b;
		case "*":
			return a*b;
		case "/":
			return a/b;
		default :
		  return 0;
		}
		
	}

}
