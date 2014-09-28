import java.util.ArrayList;
import java.util.List;

public class FrameFactory {
	final int FRAME = 10;
	
	public List<Frame> makeFrames(int[] rolls) {
		return makeFrames(rolls, FRAME); 
	}
	
	public List<Frame> makeFrames(int[] rolls, int maxFrame) {
		List<Frame> frames = new ArrayList<Frame>();
		
		int frameIndex = 0;
		for (int frameNumber = 1; frameNumber < (maxFrame+1); frameNumber++) {
			Frame frame = makeFrame(rolls, frameIndex, frameNumber);
			frames.add(frame);
			frameIndex = frame.nextFrameIndex();
		}
		
		return frames;
	}
	
	private Frame makeFrame(int[] rolls, int frameIndex, int frameNumber) {
		Frame frame;

		if(isStrike(rolls, frameIndex)) {
			frame = new Strike(frameNumber, frameIndex);
		} else if (isSpare(rolls, frameIndex)) {
			frame = new Spare(frameNumber, frameIndex);
		} else {
			frame = new Miss(frameNumber, frameIndex);
		}
		
		return frame;
	}
	
	boolean isStrike(int[] rolls, int frameIndex) {
		return rolls[frameIndex] == 10;
	}
	
	boolean isSpare(int[] rolls, int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
	}
	
	boolean isIncorrectPin(int[] rolls, int frameIndex) {
		return (rolls[frameIndex] + rolls[frameIndex + 1]) > 11;
	}
}
