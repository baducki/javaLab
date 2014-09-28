
class Miss extends AbstractFrame {
	
	private int frameIndex;
	
	Miss(int frameNumber, int frameIndex) {
		super(frameNumber);
		this.frameIndex = frameIndex;
	}
	
	public int score(int[] rolls) {
		return rolls[frameIndex] + rolls[frameIndex + 1];
	}
	
	public int nextFrameIndex() {
		return frameIndex + 2;
	}
	
	@Override
	public String generateFrameInfo(int[] rolls) {
		return rolls[frameIndex] + "" + rolls[frameIndex + 1];
	}
}
