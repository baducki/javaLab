class StringCalculator {
	
	public static void main(String[] args) {
		String str = "13\n3,,\n7\n\n14";
		StringCalculator cal = new StringCalculator(); 
		System.out.println(cal.add(cal.stringToInteger(cal.stringSplit(str))));
	}
	
	String[] stringSplit (String text) {
		String[] str = text.split("\n|,");
		return str;
	}
	
	int[] stringToInteger (String[] str) {
		int[] intStr = new int[str.length];
		
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("")) {
				intStr[i] = 0;
				continue;
			}
			intStr[i] = Integer.parseInt(str[i]);
		}
		return intStr;
	}

	int add(int[] intStr) {
		int result = 0;
		
		for (int i = 0; i < intStr.length; i++)
			result += intStr[i];
		
		return result;
	}
}