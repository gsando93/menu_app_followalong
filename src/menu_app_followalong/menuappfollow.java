package menu_app_followalong;

import java.util.*;

public class menuappfollow {
	
	static Scanner s = new Scanner(System.in);
    static int addingIndex = 0;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] team = new String[5];
int decision = 0;

while (decision != -1) {
	showMenu();
	decision = s.nextInt();
	if (decision < -1 || decision > 5) {
		System.out.println("Please pick a valid option.");
	} else if (decision == 1) {
		showTeam(team);
	} else if (decision == 2) {
		showTeamMember(team);
	} else if (decision == 3) {
		addTeamMember(team);
	} else if (decision == 4) {
		deleteTeamMember(team);
	} else {
		deleteAllMembers(team);
	}
	}

}

	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit.");
		System.out.println("1) Show team");
		System.out.println("2) Show team member");
		System.out.println("3) Add a team member");
		System.out.println("4) Delete team member");
		System.out.println("5) Delete all team members");
	}

public static void showTeamMember(String[] team) {
	System.out.print("Which team member would you like to see?");
	int teamNumber = s.nextInt();
	if (teamNumber >= 0 && teamNumber < 5) {
	System.out.println(teamNumber + ": " + team[teamNumber]);
	} else {
	    System.out.println("Invalid entry.");	
	    }
}
	
public static void addTeamMember(String[] team) {
	System.out.print("Enter new member name: ");
	String newMember = s.next();
team[addingIndex++] = newMember;
	
}

public static void showTeam(String[] team) {
	System.out.println("Team:");
	for (int i = 0; i < team.length; i++) {
		System.out.println(i + ": " + team[i]);
	}
}
}
