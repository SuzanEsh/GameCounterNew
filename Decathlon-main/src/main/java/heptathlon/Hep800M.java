package heptathlon;

import common.*;

public class Hep800M {

	private int score;
	private double A = 0.11193;
	private double B = 254;
	private double C = 1.88;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on time. All running events.
	public void calculateResult(double runningTime) {

		while (active) {

			try {
				// Acceptable values.
				if (runningTime == 0) {
					runningTime = inputResult.returnResult();
					System.out.println("Your score is 0");
					break;
				} else if(runningTime < 2) {
					System.out.println("Value too low");
				} else if (runningTime > 250.79) {
					// competitor gets 1 point in 250.79 sec
					System.out.println("Value too high");
					runningTime = inputResult.enterResult();
				} else {
					score = calc.calculateTrack(A, B, C, runningTime);
					active = false;
				}
			} catch (Exception e) {

				System.out.println("Please enter numbers");
			}
		}
		System.out.println("The result is " + score);

	}

}
