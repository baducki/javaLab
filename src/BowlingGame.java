import java.util.List;

class BowlingGame {
	private int rolls[] = new int[21];
	private int currentRoll = 0;
	private int totalFrame = 10;
	
	public void throwsBall(int pin) {
		rolls[currentRoll] = pin;
		currentRoll++;
	}	
	
	int getScore() {
		List<Frame> frames = createFrames();
		return calculateScore(frames);
	}
	
	int getScore(int maxFrame) {
		List<Frame> frames = createFrames(maxFrame);
		return calculateScore(frames);
	}
	
	private int calculateScore(List<Frame> frames) {
		int score = 0;
		for(Frame frame : frames) {
			score += frame.score(rolls);
		}
		return score;
	}
	
	private List<Frame> createFrames() {
		FrameFactory framefactory = new FrameFactory();
		return framefactory.makeFrames(rolls);
	}
	
	private List<Frame> createFrames(int maxFrame) {
		FrameFactory framefactory = new FrameFactory();
		return framefactory.makeFrames(rolls, maxFrame);
	}

	String scoreBoard() {
		StringBuffer sb = new StringBuffer();
		List<Frame> frames = createFrames();
		
		for(Frame frame : frames) {
			sb.append(frame.generateFrameInfo(rolls));
			if(!frame.isTenFrame()) {
				sb.append("  | ");
			}
		}
		return sb.toString();
	}
	
	void totalScoreBoard() {
		for(int frame = 1; frame < totalFrame + 1; frame++) {
			int totalScore = getScore(frame);
			System.out.print(getFrameScore(frame, totalScore));
		}
	}
	
	private String getFrameScore(int frame, int totalScore) {
		Outline scoreBoard = new Outline();
		if (frame == totalFrame) {
			return "" + totalScore;
		}
		return totalScore + scoreBoard.getOutline(totalScore);
	}
}
