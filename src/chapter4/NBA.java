package chapter4;

import java.util.Objects;
import java.util.Scanner;

public class NBA {
	public static void main (String[] args) {
	Scanner keyboard = new Scanner(System.in);
	

		
		System.out.print("Whats the team?");
		String userteam = keyboard.nextLine();
		
		String s2 = userteam.substring (0,3);
		
		 team.CLIPPERS.getLocation();

		if (s2.contentEquals("buc")) {
			System.out.print(team.BUCKS.name);
		}
		else if (s2.contentEquals("cli")) {
			System.out.print(team.CLIPPERS.name);
		}
		else if (s2.contentEquals("spu")) {
			System.out.print(team.SPURS.name);
		}
		else if(s2.contentEquals("bul")) {
			System.out.print(team.BULLS.name);
		}

		

		}
		
		
		
		
	}
	

	


