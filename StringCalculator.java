public class StringCalculator {


    public int Add(String numbers) throws Exception {
		if(numbers.length()==0) return 0;
		
		String[] operators = new String[] {"\\+","\\*","x","\\^","X"};
		for(String operator:operators) {
			numbers = numbers.replaceAll("["+operator+"+]", ";");
		}
        String delimiter = ",";
		if(numbers.startsWith("//")) {
			if(numbers.contains("[") && numbers.contains("]")) {
				while(numbers.contains("[") && numbers.contains("]")) {
					int startIndex = numbers.indexOf("[");
					int endIndex = numbers.indexOf("]");
					delimiter = numbers.substring(startIndex+1, endIndex);
					numbers = numbers.substring(endIndex+1).replaceAll("["+delimiter+"+]", ";");
					delimiter = ";";
				}
			}else {
				delimiter = ""+numbers.charAt(2);
				numbers = numbers.substring(3);
			}
		}

        if(numbers.endsWith("\n")) {
			throw new Exception("Invalid Input");
		}

        numbers = numbers.replace("\n", delimiter);
		String[] numbersArray = numbers.split(delimiter);
		String negatives = "";

        int totalSum = 0;
		for(String num: numbersArray) {
			num = num.trim();
			if(num.length()>0){
				int n = Integer.parseInt(num);
				if(n<0) {
					negatives += ", "+num;
				}
				if(n<=1000) totalSum += n;
			}
		}


        return 0;

    }
    public static void main(String[] args) {
        
    }
}
