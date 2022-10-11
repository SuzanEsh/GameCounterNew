package common;

import java.util.Scanner;

public class InputName {
	String compName = "";

	
	//Add competitor
	public String addCompetitor1() {

		boolean active = true;
		String compName1="";
		Scanner sc = new Scanner(System.in);
		
		while (active) {
			System.out.println("Please enter the competitor's name:");
			compName1 = sc.nextLine();
			if (!compName.matches(".*[a-öA-ö]")) {
				System.out.println("Only use letters when putting in competitors name.");
				compName1 = "Only use letters when putting in competitors name.";
				break;

			} else {
				active = false;

			}

		} 
		return compName1;
	}


	public String addCompetitor() {

		boolean active = true;
		String compName = "";
		Scanner sc = new Scanner(System.in);

		while (active) {
			System.out.println("Please enter the competitor's name:");
			compName = sc.nextLine();
			if (!compName.matches(".*[a-öA-ö]")) {
				System.out.println("Only use letters when putting in competitors name.");

			} else {
				active = false;
			}

		}
		return compName;
	}
}




