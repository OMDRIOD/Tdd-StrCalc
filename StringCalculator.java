public class StringCalculator {


    public int Add(String numbers) throws Exception {
		if(numbers.length()==0) return 0;
		
		// Sanitize the input String
		String[] operators = new String[] {"\\+","\\*","x","\\^","X"};
		for(String operator:operators) {
			numbers = numbers.replaceAll("["+operator+"+]", ";");
		}
        return 0;
    }
    public static void main(String[] args) {
        
    }
}
