package decathlon;

import common.*;

public class Deca100M {

	private int score;
	String finalScore="";
	private double A = 25.4347;
	private double B = 18;
	private double C = 1.81;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on time. All running events.
	public String calculateResult(double runningTime) {

		while (active) {

			try {
				// Acceptable values.
				if (runningTime == 0) {
					runningTime = inputResult.returnResult();
					System.out.println("Your score is 0");
					break;
				} else if (runningTime < 5) {
					System.out.println("Value too low");
					runningTime = inputResult.enterResult();
					//return "Value too low";
				} else if (runningTime > 17.8) {
					System.out.println("Value too high");
					runningTime = inputResult.enterResult();
					//return "Value too high";
				} else

				{

					score = calc.calculateTrack(A, B, C, runningTime);
					finalScore=Double.toString(score);
					active = false;
				}
			} catch (Exception e) {

				System.out.println("Please enter numbers");
			}
		}
		System.out.println("The result is " + finalScore);

		return "The result is " + finalScore;

	}

}
