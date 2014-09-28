
public class Outline {

	String getOutline(int totalScore) {
		if (isOneNumber(totalScore)) {
			return "   | "; 
		}
		
		if (isThreeNumber(totalScore)) {
			return " | ";
		}
		
		return "  | "; 
	}
	
	private boolean isOneNumber(int totalScore) {
		return totalScore < 10;
	}
	
	private boolean isThreeNumber(int totalScore) {
		return totalScore > 99;
	}
	
}
