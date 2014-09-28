
class Strike extends AbstractFrame {
	
	private int frameIndex;
	
	Strike(int frameNumber, int frameIndex) {
		super(frameNumber);
		this.frameIndex = frameIndex;
	}
	
	public int score(int[] rolls) {
		return 10 + strikeBonus(rolls, frameIndex);
	}
	
	public int nextFrameIndex() {
		return frameIndex + 1;
	}
	
	private int strikeBonus(int[] rolls, int frameIndex) {
		return rolls[frameIndex + 1] + rolls[frameIndex + 2];
	}
	
	private String generateTenFrameInfo(int[] rolls, String sign) {
		FrameFactory frame = new FrameFactory();
		if (frame.isStrike(rolls, frameIndex + 1)) {
			return generateBonusFrameInfo(rolls, sign+sign, frameIndex);
		}
		
		if (frame.isSpare(rolls, frameIndex + 1)) {
			return sign + rolls[frameIndex + 1] + "/";
		}
		
		return sign + rolls[frameIndex + 1] + rolls[frameIndex + 2];
	}
	
	@Override
	public String generateFrameInfo(int[] rolls) {
		String sign = "X";
		if(isTenFrame()) {
			return generateTenFrameInfo(rolls, sign);
		} else {
			return sign + "-";
		}
	}
}
