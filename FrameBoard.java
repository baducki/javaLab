
public class FrameBoard {
	final int FRAME = 10;
	
	void getFrameBoard () {
		for (int frame = 1; frame < FRAME+1; frame++) {
			System.out.print(generateFrameBoard(frame));
		}
		System.out.println("");
	}
	
	private String generateFrameBoard(int frame) {
		if (isFirstFrame(frame)) {
			return "" + frame + "   |";
		}
		
		if (isTenFrame(frame)) {
			return " " + frame;
		}
		
		return " " + frame + "   |";
	}
	
	private boolean isFirstFrame(int frame) {
		return frame == 1;
	}
	
	private boolean isTenFrame(int frame) {
		return frame == 10;
	}
}
