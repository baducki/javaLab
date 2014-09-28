
interface Frame {
	int score(int[] rolls);
	
	int nextFrameIndex();
	
	String generateFrameInfo(int[] rolls);
	
	String generateBonusFrameInfo(int[] rolls, String sign, int frameIndex);
	
	boolean isTenFrame();
}
