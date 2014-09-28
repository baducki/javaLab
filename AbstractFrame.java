
public abstract class AbstractFrame implements Frame {
	
	private int frameNumber;
	
	public AbstractFrame(int frameNumber) {
		this.frameNumber = frameNumber;
	}
	
	@Override
	public boolean isTenFrame() {
		return frameNumber == 10;
	}
	
	public boolean isTenFrame(int frameNumber) {
		return frameNumber == 10;
	}
	
	@Override
	public String generateBonusFrameInfo(int[] rolls, String sign, int frameIndex) {
		if(rolls[frameIndex + 2] == 10) {
			return sign + "X";
		}
		return sign + rolls[frameIndex + 2];
	}
}
