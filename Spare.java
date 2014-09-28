
class Spare extends AbstractFrame {
	
	private int frameIndex;
	
	Spare(int frameNumber, int frameIndex) {
		super(frameNumber);
		this.frameIndex = frameIndex;
	}
	
	public int score(int[] rolls) {
		return 10 + spareBonus(rolls, frameIndex);
	}

	public int nextFrameIndex() {
		return frameIndex + 2;
	}
	
	private int spareBonus(int[] rolls, int frameIndex) {
		return rolls[frameIndex + 2];
	}
	
	@Override
	public String generateFrameInfo(int[] rolls) {
		String sign = rolls[frameIndex] + "/";
		if(isTenFrame()) {
			sign = generateBonusFrameInfo(rolls, sign, frameIndex);
		}
		return sign;
	}
}
