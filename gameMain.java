import java.util.Scanner;


public class gameMain {

	public static void main(String[] args) {
		
		final int MAXFRAME = 10;
		Scanner scan = new Scanner(System.in);
	
		BowlingGame game = new BowlingGame();
		FrameBoard frameBoard = new FrameBoard();
		
		System.out.println("볼링 점수를 기록하세요!\n");
		
		for (int frame = 1; frame < MAXFRAME + 1; frame++) {
			Pin pins = new Pin();
			int maxShot = 2;
			
			if (frame == 10) {
				maxShot = 3;
			}
			
			pins.recordPin(frame, maxShot, pins, scan, game);
		}
		scan.close();
		
		frameBoard.getFrameBoard();
		System.out.println(game.scoreBoard());
		game.totalScoreBoard();
	}
}
