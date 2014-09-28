import java.util.Scanner;


public class Pin {
	
	int firstPin = 0;
	int secondPin = 0;
	
	void recordPin(int frame, int maxShot, Pin pins, Scanner scan, BowlingGame game) {
		for (int shot = 1; shot < maxShot + 1; shot++) {
			shot = generatePin(shot, frame, maxShot, pins, scan, game);
		}
	}
	
	private int generatePin(int shot, int frame, int maxShot, Pin pins, Scanner scan, BowlingGame game) {
		boolean isEnd = false;
		System.out.print(frame + "프레임  " + shot + "번째 넘어뜨린 볼링핀수?");
		if (shot == 1) {
			firstPin = scan.nextInt();
			shot = pins.checkCorrectPin(firstPin, secondPin, shot, maxShot);
			System.out.println(shot);
			game.throwsBall(firstPin);
		} else {
			secondPin = scan.nextInt();
			shot = pins.checkCorrectPin(firstPin, secondPin, shot, maxShot);
			game.throwsBall(secondPin);
			isEnd = checkTenFrame(maxShot, firstPin, secondPin);
		} 
		
		if(isEnd) {
			return 3;
		}
		
		secondPin = 0;
		return shot;
	}
	
	private boolean checkTenFrame(int maxShot, int firstPin, int secondPin) {
		if (maxShot == 3 && (firstPin+secondPin < 10)) {
			return true;
		}
		return false;
	}
	
	private int checkCorrectPin(int firstPin, int secondPin, int shot, int maxShot) {
		if (firstPin == 10) {
			return changeShotWhenStirke(maxShot, shot);
		}
		
		if (shot == 1) {
			return changeShot(checkFirstPin(firstPin), shot);
		}
		
		return changeShot(checkSecondPin(firstPin, secondPin), shot);
	}
	
	private int changeShotWhenStirke(int maxShot, int shot) {
		if (maxShot == 3) {
			return shot;
		}
		return shot += 2;
	}

	private int changeShot(boolean value, int shot) {
		if (!value) {
			return 0;
		}
		return shot;
	}
	
	private boolean checkFirstPin(int firstPin) {
		if (isIncorrectPin(firstPin)) {
			System.out.println("볼링핀수를 잘못 입력하였습니다!(1~10사이의 숫자를 입력해주세요)");
			return false;
		}
		return true;
	}
	
	private boolean checkSecondPin(int firstPin, int secondPin) {
		if (incorrectSpare(firstPin, secondPin)) {
			int extraPin = 10 - firstPin;
			System.out.println("볼링핀수를 잘못 입력하였습니다!(0~" + extraPin + "사이의 숫자를 입력해주세요)");
			return false;
		}
		return true;
	}
	
	private boolean isIncorrectPin(int pin) {
		return pin > 10;
	}
	
	private boolean incorrectSpare(int firstPin, int secondPin) {
		return firstPin + secondPin > 10;
	}
	
}
