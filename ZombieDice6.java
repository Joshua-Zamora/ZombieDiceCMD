import java.util.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Random;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class ZombieDice6 {
	
	public static Player a1 = new Player("EMPTY", 0, 0.0, 0, 0, 0, "", 0);
	public static Player a2 = new Player("EMPTY", 0, 0.0, 0, 0, 0, "", 0);
	public static Player a3 = new Player("EMPTY", 0, 0.0, 0, 0, 0, "", 0);
	public static Player a4 = new Player("EMPTY", 0, 0.0, 0, 0, 0, "", 0);
	public static Player a5 = new Player("EMPTY", 0, 0.0, 0, 0, 0, "", 0);
	public static Player a6 = new Player("EMPTY", 0, 0.0, 0, 0, 0, "", 0);
	public static Player a7 = new Player("EMPTY", 0, 0.0, 0, 0, 0, "", 0);
	public static Player a8 = new Player("EMPTY", 0, 0.0, 0, 0, 0, "", 0);
	public static Player defaultPlayer = new Player("EMPTY", 0, 0.0, 0, 0, 0, "", 0);
	
	public static final	String[] greenDie = {"GREEN-BRAIN", "GREEN-BRAIN", "GREEN-BRAIN", "GREEN-FEET", "GREEN-FEET", "GREEN-SHOTGUN"};
	public static final	String[] redDie = {"RED-BRAIN", "RED-FEET", "RED-FEET", "RED-SHOTGUN", "RED-SHOTGUN", "RED-SHOTGUN"};
	public static final	String[] yellowDie = {"YELLOW-BRAIN", "YELLOW-BRAIN", "YELLOW-FEET", "YELLOW-FEET", "YELLOW-SHOTGUN", "YELLOW-SHOTGUN"};
	public static final String[] schoolBus = {"YIELD", "RUN-OVER", "STOP", "DEAD-END", "BRAIN", "BRAIN-BRAIN-BRAIN", "BRAIN-BRAIN-SHOTGUN", "SHOTGUN-SHOTGUN", "SHOTGUN", "BRAIN-SHOTGUN", "BRAIN", "BRAIN-BRAIN"};
	
	public static final	Dice green = new Dice(6, greenDie);
	public static final	Dice red = new Dice(6, redDie);
	public static final	Dice yellow = new Dice(6, yellowDie);
	public static final	Dice school = new Dice(12, schoolBus);
	
	public static String printMenu() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		Scanner in = new Scanner(System.in);
			System.out.println();	
			System.out.printf("%149s\n", "      ___           ___           ___                                     ___                   _____                      ___           ___");     
			System.out.printf("%150s\n", "     /  /\\         /  /\\         /__/\\         _____        ___          /  /\\                 /  /::\\       ___          /  /\\         /  /\\");    
			System.out.printf("%151s\n", "    /  /::|       /  /::\\       |  |::\\       /  /::\\      /  /\\        /  /:/_               /  /:/\\:\\     /  /\\        /  /:/        /  /:/_");   
			System.out.printf("%152s\n", "   /  /:/:|      /  /:/\\:\\      |  |:|:\\     /  /:/\\:\\    /  /:/       /  /:/ /\\             /  /:/  \\:\\   /  /:/       /  /:/        /  /:/ /\\");  
			System.out.printf("%153s\n", "  /  /:/|:|__   /  /:/  \\:\\   __|__|:|\\:\\   /  /:/~/::\\  /__/::\\      /  /:/ /:/_           /__/:/ \\__\\:| /__/::\\      /  /:/  ___   /  /:/ /:/_"); 
			System.out.printf("%154s\n", " /__/:/ |:| /\\ /__/:/ \\__\\:\\ /__/::::| \\:\\ /__/:/ /:/\\:| \\__\\/\\:\\__  /__/:/ /:/ /\\          \\  \\:\\ /  /:/ \\__\\/\\:\\__  /__/:/  /  /\\ /__/:/ /:/ /\\");
			System.out.printf("%154s\n", " \\__\\/  |:|/:/ \\  \\:\\ /  /:/ \\  \\:\\~~\\__\\/ \\  \\:\\/:/~/:/    \\  \\:\\/\\ \\  \\:\\/:/ /:/           \\  \\:\\  /:/     \\  \\:\\/\\ \\  \\:\\ /  /:/ \\  \\:\\/:/ /:/");
			System.out.printf("%153s\n", "     |  |:/:/   \\  \\:\\  /:/   \\  \\:\\        \\  \\::/ /:/      \\__\\::/  \\  \\::/ /:/             \\  \\:\\/:/       \\__\\::/  \\  \\:\\  /:/   \\  \\::/ /:/"); 
			System.out.printf("%152s\n", "     |  |::/     \\  \\:\\/:/     \\  \\:\\        \\  \\:\\/:/       /__/:/    \\  \\:\\/:/               \\  \\::/        /__/:/    \\  \\:\\/:/     \\  \\:\\/:/");  
			System.out.printf("%151s\n", "     |  |:/       \\  \\::/       \\  \\:\\        \\  \\::/        \\__\\/      \\  \\::/                 \\__\\/         \\__\\/      \\  \\::/       \\  \\::/");   
			System.out.printf("%150s\n", "     |__|/         \\__\\/         \\__\\/         \\__\\/                     \\__\\/                                            \\__\\/         \\__\\/");                                                                                                  
			System.out.println();
			System.out.printf("%107s\n", "           _________                _________           ");
			System.out.printf("%107s\n", "         \\\\_________\\\\            //_________//         ");
			System.out.printf("%107s\n", "         \\\\_________\\\\            //_________//         ");
			System.out.printf("%107s\n", "         \\\\_________\\\\            //_________//         ");
			System.out.printf("%107s\n", "         \\\\_________\\\\            //_________//         ");
			System.out.printf("%107s\n", "         \\\\_________\\\\            //_________//         ");
			System.out.printf("%107s\n", "         \\\\_________\\\\            //_________//         ");
			System.out.printf("%107s\n", "         \\\\_________\\\\            //_________//         ");
			System.out.printf("%107s\n", "         \\\\_________\\\\            //_________//         ");
			System.out.printf("%107s\n", "          \\\\_________\\\\          //_________//          ");
			System.out.printf("%107s\n", "           \\\\_________\\\\________//_________//           ");
			System.out.printf("%107s\n", "            \\\\____________________________//            ");
			System.out.printf("%107s\n", "             \\\\__________________________//             ");
			System.out.printf("%107s\n", "              \\\\________________________//              ");
			System.out.printf("%107s\n", "               \\\\  Play ZombieDice(P)  //               ");
			System.out.printf("%107s\n", "                \\\\      Rules(R)      //                ");
			System.out.printf("%107s\n", "                //   My Account(MA)   \\\\                ");
			System.out.printf("%107s\n", "               //     Exit Game(E)     \\\\               ");
			System.out.printf("%107s\n", "              //__________//\\\\__________\\\\              ");
			System.out.printf("%107s\n", "             //__________//  \\\\__________\\\\             ");
			System.out.printf("%107s\n", "            //__________//    \\\\__________\\\\            ");
			System.out.printf("%107s\n", "           //__________//______\\\\__________\\\\           ");
			System.out.printf("%107s\n", "          //__________//________\\\\__________\\\\          ");
			System.out.printf("%107s\n", "         //__________//          \\\\__________\\\\         ");
			System.out.printf("%107s\n", "        //__________//            \\\\__________\\\\        ");
			System.out.printf("%107s\n", "       //__________//              \\\\__________\\\\       ");
			System.out.printf("%107s\n", "      //__________//                \\\\__________\\\\      ");
			System.out.printf("%107s\n", "     //__________//                  \\\\__________\\\\     ");
			System.out.printf("%107s\n", "    //__________//                    \\\\__________\\\\    ");
			System.out.printf("%86s", "Enter option: ");
			String choice = in.nextLine();
			choice = choice.replaceAll("\\s+","");
			return choice;
	}
	
	//Creating user file
	public static void createAccount() throws InterruptedException, IOException {
		Scanner in = new Scanner(System.in);
		if(new File("1.txt").isFile() && new File("2.txt").isFile() && new File("3.txt").isFile() && new File("4.txt").isFile() && new File("5.txt").isFile() && new File("6.txt").isFile() && new File("7.txt").isFile() && new File("8.txt").isFile()) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.printf("%50s\n", "\r\nAll accounts are taken!");
			Thread.sleep(2000);
			return;
		}
		
		String name = "";
		String password = "";
		System.out.println();
		String empty = "";
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\r\n\r\n\r\n\r\n");
		System.out.printf("%80s\n", "BACK (B)");
		System.out.println();
		System.out.printf("%80s\n", "Choose an account to create.");
		System.out.println();
		if(!new File("1.txt").isFile()) System.out.printf("%80s\n", "Account 1: EMPTY");
		if(!new File("2.txt").isFile()) System.out.printf("%80s\n", "Account 2: EMPTY");
		if(!new File("3.txt").isFile()) System.out.printf("%80s\n", "Account 3: EMPTY");
		if(!new File("4.txt").isFile()) System.out.printf("%80s\n", "Account 4: EMPTY");
		if(!new File("5.txt").isFile()) System.out.printf("%80s\n", "Account 5: EMPTY");
		if(!new File("6.txt").isFile()) System.out.printf("%80s\n", "Account 6: EMPTY");
		if(!new File("7.txt").isFile()) System.out.printf("%80s\n", "Account 7: EMPTY");
		if(!new File("8.txt").isFile()) System.out.printf("%80s\n", "Account 8: EMPTY");
		System.out.println();
		System.out.printf("%79s", "Enter by corresponding number: ");
		empty = in.nextLine();
		System.out.println();
		switch(empty) {
			case "8": 
				if(!(new File("8.txt").isFile())) {
					System.out.printf("%60s", "Enter desired Username: ");
					name = in.nextLine();
					name = name.replaceAll("\\s+","");
					System.out.printf("%60s", "Enter desired password: ");
					password = in.nextLine();
					password = password.replaceAll("\\s+","");
					a8 = new Player(name, 0, 0, 0, 0, 0, password, 8);
					a8.store();
				}
				else { System.out.printf("%50s\n", "Account is taken. Try again"); Thread.sleep(1500); createAccount(); }
				break;
			case "7": 
				if(!(new File("7.txt").isFile())) {
					System.out.printf("%60s", "Enter desired Username: ");
					name = name = in.nextLine();
					name.replaceAll("\\s+","");
					System.out.printf("%60s", "Enter desired password: ");
					password = in.nextLine();
					password = password.replaceAll("\\s+","");
					a7 = new Player(name, 0, 0, 0, 0, 0, password, 7);
					a7.store();
				}
				else { System.out.printf("%50s\n", "Account is taken. Try again"); Thread.sleep(1500); createAccount(); }
				break;
			case "6": 
				if(!(new File("6.txt").isFile())) {
					System.out.printf("%60s", "Enter desired Username: ");
					name = in.nextLine();
					name = name.replaceAll("\\s+","");
					System.out.printf("%60s", "Enter desired password: ");
					password = in.nextLine();
					password = password.replaceAll("\\s+","");
					a6 = new Player(name, 0, 0, 0, 0, 0, password, 6);
					a6.store();
				}
				else { System.out.printf("%50s\n", "Account is taken. Try again"); Thread.sleep(1500); createAccount(); }
				break;
			case "5": 
				if(!(new File("5.txt").isFile())) {
					System.out.printf("%60s", "Enter desired Username: ");
					name = in.nextLine();
					name = name.replaceAll("\\s+","");
					System.out.printf("%60s", "Enter desired password: ");
					password = in.nextLine();
					password = password.replaceAll("\\s+","");
					a5 = new Player(name, 0, 0, 0, 0, 0, password, 5);
					a5.store();
				}
				else { System.out.printf("%50s\n", "Account is taken. Try again"); Thread.sleep(1500); createAccount(); }
				break;
			case "4": 
				if(!(new File("4.txt").isFile())) {
					System.out.printf("%60s", "Enter desired Username: ");
					name = in.nextLine();
					name = name.replaceAll("\\s+","");
					System.out.printf("%60s", "Enter desired password: ");
					password = in.nextLine();
					password = password.replaceAll("\\s+","");
					a4 = new Player(name, 0, 0, 0, 0, 0, password, 4);
					a4.store();
				}
				else { System.out.printf("%50s\n", "Account is taken. Try again"); Thread.sleep(1500); createAccount(); }
				break;
			case "3": 
				if(!(new File("3.txt").isFile())) {
					System.out.printf("%60s", "Enter desired Username: ");
					name = in.nextLine();
					name = name.replaceAll("\\s+","");
					System.out.printf("%60s", "Enter desired password: ");
					password = in.nextLine();
					password = password.replaceAll("\\s+","");
					a3 = new Player(name, 0, 0, 0, 0, 0, password, 3);
					a3.store();
				}
				else { System.out.printf("%50s\n", "Account is taken. Try again"); Thread.sleep(1500); createAccount(); }
				break;
			case "2": 
				if(!(new File("2.txt").isFile())) {
					System.out.printf("%60s", "Enter desired Username: ");
					name = in.nextLine();
					name = name.replaceAll("\\s+","");
					System.out.printf("%60s", "Enter desired password: ");
					password = in.nextLine();
					password = password.replaceAll("\\s+","");
					a2 = new Player(name, 0, 0, 0, 0, 0, password, 2);
					a2.store();
				}
				else { System.out.printf("%50s\n", "Account is taken. Try again"); Thread.sleep(1500); createAccount(); }
				break;
			case "1": 
				if(!(new File("1.txt").isFile())) {
					System.out.printf("%60s", "Enter desired Username: ");
					name = in.nextLine();
					name = name.replaceAll("\\s+","");
					System.out.printf("%60s", "Enter desired password: ");
					password = in.nextLine();
					password = password.replaceAll("\\s+","");
					a1 = new Player(name, 0, 0, 0, 0, 0, password, 1);
					a1.store();
				}
				else { System.out.printf("%50s\n", "Account is taken. Try again"); Thread.sleep(1500); createAccount(); }
				break;
			default: return;
		}
		System.out.println();
		System.out.printf("%50s", "Account created!");
		Thread.sleep(1500);
		return;
	}
	
	//Accessing users info
	public static void myAccount() throws InterruptedException, IOException {
		Scanner in = new Scanner(System.in);
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\r\n\r\n\r\n\r\n");
		if(!new File("1.txt").isFile() && !new File("2.txt").isFile() && !new File("3.txt").isFile() && !new File("4.txt").isFile() && !new File("5.txt").isFile() && !new File("6.txt").isFile() && !new File("7.txt").isFile() && !new File("8.txt").isFile()) {
			System.out.printf("%115s", "No accounts have been made, would you like to create one? (Y or N): ");
			String create = in.nextLine();
			if(create.equalsIgnoreCase("Y")) createAccount();
			else return;
			return;
		}
		System.out.printf("%69s\n", "BACK (B)");
		System.out.println();
		File f1 = new File("1.txt");
		File f2 = new File("2.txt"); 
		File f3 = new File("3.txt");
		File f4 = new File("4.txt");
		File f5 = new File("5.txt");
		File f6 = new File("6.txt");
		File f7 = new File("7.txt");
		File f8 = new File("8.txt");
		System.out.println();
		System.out.printf("%72s\n", "Which account is yours? \r\n");
		if(new File("1.txt").isFile()) {
			Scanner s1 = new Scanner(f1); 
			System.out.printf("%69s\n", "Account 1  " + s1.nextLine());
		}
		else System.out.printf("%69s\n", "Account 1: EMPTY");
		if(new File("2.txt").isFile()) {
			Scanner s2 = new Scanner(f2); 
			System.out.printf("%69s\n", "Account 2  " + s2.nextLine());
		}
		else System.out.printf("%69s\n", "Account 2: EMPTY");
		if(new File("3.txt").isFile()) {
			Scanner s3 = new Scanner(f3); 
			System.out.printf("%69s\n", "Account 3  " + s3.nextLine());
		}
		else System.out.printf("%69s\n", "Account 3: EMPTY");
		if(new File("4.txt").isFile()) {
			Scanner s4 = new Scanner(f4); 
			System.out.printf("%69s\n", "Account 4  " + s4.nextLine());
		}
		else System.out.printf("%69s\n", "Account 4: EMPTY");
		if(new File("5.txt").isFile()) {
			Scanner s5 = new Scanner(f5); 
			System.out.printf("%69s\n", "Account 5  " + s5.nextLine());
		}
		else System.out.printf("%69s\n", "Account 5: EMPTY");
		if(new File("6.txt").isFile()) {
			Scanner s6 = new Scanner(f6); 
			System.out.printf("%69s\n", "Account 6  " + s6.nextLine());
		}
		else System.out.printf("%69s\n", "Account 6: EMPTY");
		if(new File("7.txt").isFile()) {
			Scanner s7 = new Scanner(f7); 
			System.out.printf("%69s\n", "Account 7  " + s7.nextLine());
		}
		else System.out.printf("%69s\n", "Account 7: EMPTY");
		if(new File("8.txt").isFile()) {
			Scanner s8 = new Scanner(f8); 
			System.out.printf("%69s\n", "Account 8  " + s8.nextLine());
		}
		else System.out.printf("%69s\n", "Account 8: EMPTY");
		System.out.println();
		try {
			System.out.printf("%68s", "Enter by corresponding number (1-8) or create an account (C): ");
			String aNum = in.nextLine();
			if(aNum.equalsIgnoreCase("C")) {
				createAccount();
				myAccount();
				return;
			}
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println();
			switch(aNum) {
				case "8": Scanner z8 = new Scanner(f8); 
						System.out.println("\r\n\r\n\r\n\r\n");
						while(z8.hasNextLine()) System.out.printf("%50s\n", z8.nextLine());
						System.out.println();
						System.out.printf("%69s", "BACK (B): ");
						String back = in.nextLine();
						myAccount();
						break;	
				
				case "7": Scanner z7 = new Scanner(f7); 
						System.out.println("\r\n\r\n\r\n\r\n");
						while(z7.hasNextLine()) System.out.printf("%50s\n", z7.nextLine()); 
						System.out.println();
						System.out.printf("%69s", "BACK (B): ");
						back = in.nextLine();
						myAccount();
						break;
				
				case "6": Scanner z6 = new Scanner(f6);
						System.out.println("\r\n\r\n\r\n\r\n");				
						while(z6.hasNextLine()) System.out.printf("%50s\n", z6.nextLine()); 
						System.out.println();
						System.out.printf("%69s", "BACK (B): ");
						back = in.nextLine();
						myAccount();
						break;
				
				case "5": Scanner z5 = new Scanner(f5); 
						System.out.println("\r\n\r\n\r\n\r\n");
						while(z5.hasNextLine()) System.out.printf("%50s\n", z5.nextLine()); 
						System.out.println();
						System.out.printf("%69s", "BACK (B): ");
						back = in.nextLine();
						myAccount();
						break;
				
				case "4": Scanner z4 = new Scanner(f4);
						System.out.println("\r\n\r\n\r\n\r\n");
						while(z4.hasNextLine()) System.out.printf("%50s\n", z4.nextLine());
						System.out.println();
						System.out.printf("%69s", "BACK (B): ");
						back = in.nextLine();
						myAccount();
						break;	
				
				case "3": Scanner z3 = new Scanner(f3);
						System.out.println("\r\n\r\n\r\n\r\n");
						while(z3.hasNextLine()) System.out.printf("%50s\n", z3.nextLine()); 
						System.out.println();
						System.out.printf("%69s", "BACK (B): ");
						back = in.nextLine();
						myAccount();
						break;
				
				case "2": Scanner z2 = new Scanner(f2);
						System.out.println("\r\n\r\n\r\n\r\n");
						while(z2.hasNextLine()) System.out.printf("%50s\n", z2.nextLine()); 
						System.out.println();
						System.out.printf("%69s", "BACK (B): ");
						back = in.nextLine();
						myAccount();
						break;
				
				case "1": Scanner z1 = new Scanner(f1);
						System.out.println("\r\n\r\n\r\n\r\n");
						while(z1.hasNextLine()) System.out.printf("%50s\n", z1.nextLine()); 
						System.out.println();
						System.out.printf("%69s", "BACK (B): ");
						back = in.nextLine();
						myAccount();
						break;
				
				default: return;
			}
		} catch(FileNotFoundException except) {
			System.out.println("\r\n\r\n\r\n\r\n");
			System.out.printf("%69s\n", "Account is empty! Try again.");
			Thread.sleep(1500);
			myAccount();
		}
	}
	
	public static int[] numPlayers() throws InterruptedException, IOException, InputMismatchException {
		Scanner in = new Scanner(System.in);
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n");
		System.out.printf("%88s\n", "BACK (B)");
		System.out.println();
		System.out.printf("%103s", "Welcome, how many people will be playing? (2-8):  ");
		try {
			int numPeople = in.nextInt();
			in.nextLine();
			
			if(numPeople < 2 || numPeople > 8) return new int[0];
			int[] numPlayers = new int[numPeople];
			int[] tracker = new int[numPeople];
			
			int j = 0;
			for(int i = 1; i <= 8; i++) {
				if(j == tracker.length) break; 
				if(new File(i + ".txt").isFile()) { 
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n");
					System.out.printf("%97s\n", "MAIN MENU (MM)");
					System.out.println();
					System.out.printf("%97s\n", "Will this account be used? (Y or N)");
					File f1 = new File(i + ".txt");
					Scanner s1 = new Scanner(f1); 
					System.out.println();
					System.out.printf("%98s", "Account " + i + " " + s1.nextLine() + " "); 
					String account = in.nextLine();
					account = account.replaceAll("\\s+","");
					if(account.equalsIgnoreCase("Y")) {
						tracker[j] = i;
						j++;
					}
					else if(account.equalsIgnoreCase("MM")) return new int[0];
					else continue;
				}
			}

			int k = 0;
			int h = 1;
			for(int i = 0; i < numPeople; i++) {
				while(h <= 8) {
					if(tracker[i] == h) {
						switch(h) {
							case 1: numPlayers[k] = 1; break;
							case 2: numPlayers[k] = 2; break;
							case 3: numPlayers[k] = 3; break;
							case 4: numPlayers[k] = 4; break;
							case 5: numPlayers[k] = 5; break;
							case 6: numPlayers[k] = 6; break;
							case 7: numPlayers[k] = 7; break;
							case 8: numPlayers[k] = 8; break;
							default: break;
						}
						k++;
					}
					else {
						h++;
						continue;
					}
					break;
				}	
			}

			return numPlayers;
			
		} catch(InputMismatchException except) {
			return new int[0];
		}
	}
	
	public static void schoolBusVersion() throws InterruptedException, IOException {
		Random randGen = new Random();
		Scanner in = new Scanner(System.in);
		boolean classic = false;
		int[] zombies = numPlayers();
		int[] brains = new int[zombies.length];
		
		if(zombies.length < 2) return;
		
		ArrayList<Dice> cup = refillCup();
		boolean lastRound = false;
		int maxBrains = 0;
		int origMax = 0;
		int counter = 0;
		
		while(true) {
			for(int i = 0; i < zombies.length; i++) {
				if(lastRound && origMax == i) continue;
				if(lastRound) ++counter;
				if(lastRound && counter == zombies.length && suddenDeathBool(brains, maxBrains))  {
					suddenDeathSchool(remainingZombies(zombies, maxBrains, brains), brains, lastRound, maxBrains);
					return;
				}
				else if(lastRound && counter == zombies.length) { 
					printWinner(brains, maxBrains, zombies);
					return;
				}
				cup = refillCup();
				int numShotguns = 0;
				int numBrains = 0;
				boolean hasRolledBus = false;
				boolean noMoreBus = false;
				boolean stop = false;
				boolean doubleDown = false;
				Dice die1 = cup.get(randGen.nextInt(cup.size()));
				cup.remove(die1);
				Dice die2 = cup.get(randGen.nextInt(cup.size()));
				cup.remove(die2);
				Dice die3 = cup.get(randGen.nextInt(cup.size()));
				cup.remove(die3);
				
				while(true) {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					overallScoreTracker(zombies, brains, numBrains, numShotguns, lastRound, classic);
					if(cup.size() < 4) cup = refillCup();
					int numFeet = 0;
					int greenFeet = 0;
					int yellowFeet = 0;
					int redFeet = 0;
					int greenShotguns = 0;
					int redShotguns = 0;
					int yellowShotguns = 0;
					System.out.println();
					System.out.printf("%50s\n", "PLAYER " + (i+1) + " ROLLING");
					Thread.sleep(2000);
					System.out.println();
					// Rolling die1
					if(Arrays.equals(die1.getFace(), greenDie)) {
						String greenHolder1 = die1.roll(greenDie);
						Thread.sleep(1000);
						System.out.printf("%50s\n", greenHolder1);
						switch(greenHolder1) {
							case "GREEN-SHOTGUN": ++numShotguns; ++greenShotguns; break;
							case "GREEN-BRAIN": ++numBrains; break;
							case "GREEN-FEET": ++greenFeet; ++numFeet; break;
							default: break;
						}
					}
					else if(Arrays.equals(die1.getFace(), yellowDie)) {
						String yellowHolder1 = die1.roll(yellowDie);
						Thread.sleep(1000);
						System.out.printf("%50s\n", yellowHolder1);
						switch(yellowHolder1) {
							case "YELLOW-SHOTGUN": ++numShotguns; ++yellowShotguns; break;
							case "YELLOW-BRAIN": ++numBrains; break;
							case "YELLOW-FEET": ++yellowFeet; ++numFeet; break;
							default: break;
						}
					}
					else {
						String redHolder1 = die1.roll(redDie);
						Thread.sleep(1000);
						System.out.printf("%50s\n", redHolder1);
						switch(redHolder1) {
							case "RED-SHOTGUN": ++numShotguns; ++redShotguns; break;
							case "RED-BRAIN": ++numBrains; break;
							case "RED-FEET": ++redFeet; ++numFeet; break;
							default: break;
						}
					}
					
					// Rolling die2
					if(Arrays.equals(die2.getFace(), greenDie)) {
						String greenHolder2 = die2.roll(greenDie);
						Thread.sleep(1250);
						System.out.printf("%50s\n", greenHolder2);
						switch(greenHolder2) {
							case "GREEN-SHOTGUN": ++numShotguns; ++greenShotguns; break;
							case "GREEN-BRAIN": ++numBrains; break;
							case "GREEN-FEET": ++greenFeet; ++numFeet; break;
							default: break;
						}
					}
					else if(Arrays.equals(die2.getFace(), yellowDie)) {
						String yellowHolder2 = die2.roll(yellowDie);
						Thread.sleep(1250);
						System.out.printf("%50s\n", yellowHolder2);
						switch(yellowHolder2) {
							case "YELLOW-SHOTGUN": ++numShotguns; ++yellowShotguns; break;
							case "YELLOW-BRAIN": ++numBrains; break;
							case "YELLOW-FEET": ++yellowFeet; ++numFeet; break;
							default: break;
						}
					}
					else {
						String redHolder3 = die2.roll(redDie);
						Thread.sleep(1250);
						System.out.printf("%50s\n", redHolder3);
						switch(redHolder3) {
							case "RED-SHOTGUN": ++numShotguns; ++redShotguns; break;
							case "RED-BRAIN": ++numBrains; break;
							case "RED-FEET": ++redFeet; ++numFeet; break;
							default: break;
						}
					}
					
					// Rolling die3
					if(Arrays.equals(die3.getFace(), schoolBus)) {
						hasRolledBus = true;
						String busHolder = die3.roll(schoolBus);
						Thread.sleep(1500);
						System.out.printf("%50s\n", "BUS-" +  busHolder);
						switch(busHolder) {
							case "YIELD": 
							if(redShotguns == 1 || yellowShotguns == 1 || greenShotguns == 1) { 
								if(redShotguns == 1) ++redFeet;
								else if(greenShotguns == 1) ++greenFeet;
								else ++yellowFeet;
								++numFeet;
								--numShotguns;
							}
							else if(redShotguns == 2 || yellowShotguns == 2 || greenShotguns == 2) { 
								if(redShotguns == 1) {
									if(greenShotguns == 1) {
										++redFeet;
										++greenFeet;
									}
									else {
										++redFeet;
										++yellowFeet;
									}
								}
								else if(greenShotguns == 1) {
									if(redShotguns == 1) {
										++redFeet;
										++greenFeet;
									}
									else {
										++greenFeet;
										++yellowFeet;
									}
								}
								else if(yellowShotguns == 1) {
									if(redShotguns == 1) {
										++redFeet;
										++yellowFeet;
									}
									else {
										++yellowFeet;
										++greenFeet;
									}
								}
								else if(redShotguns == 2) redFeet += 2;
								else if(greenShotguns == 2) greenFeet += 2;
								else yellowFeet += 2;
								numFeet += 2;
								numShotguns -= 2;
							}
							break;
							case "RUN-OVER": 
							if(numBrains > 0) --numBrains; 
							noMoreBus = true;
							break;
							case "STOP": stop = true; break;
							case "DEAD-END": 
							if(numFeet == 1) { 
								if(redFeet == 1) --redFeet;
								else if(greenFeet == 1) --greenFeet;
								else --yellowFeet;
								++numBrains;
								--numFeet;
							}
							else if(numFeet == 2) { 
								if(redFeet == 2) redFeet -= 2;
								else if(greenFeet == 2) greenFeet -= 2;
								else yellowFeet -= 2;
								numBrains += 2;
								numFeet -= 2;
							}
							break;
							case "BRAIN": ++numBrains; break;
							case "BRAIN-BRAIN-BRAIN": ++numBrains; ++numBrains; ++numBrains; break;
							case "BRAIN-BRAIN-SHOTGUN": ++numBrains; ++numBrains; ++numShotguns; break;
							case "SHOTGUN-SHOTGUN": ++numShotguns; ++numShotguns; break;
							case "SHOTGUN": ++numShotguns; break;
							case "BRAIN-SHOTGUN": ++numBrains; ++numShotguns; break;
							case "BRAIN-BRAIN": ++numBrains; ++numBrains; break;
							default: break;
						}
					}
					else if(Arrays.equals(die3.getFace(), greenDie)) {
						String greenHolder3 = die3.roll(greenDie);
						Thread.sleep(1500);
						System.out.printf("%50s\n", greenHolder3);
						switch(greenHolder3) {
							case "GREEN-SHOTGUN": ++numShotguns; break;
							case "GREEN-BRAIN": ++numBrains; break;
							case "GREEN-FEET": ++greenFeet; ++numFeet; break;
							default: break;
						}
					}
					else if(Arrays.equals(die3.getFace(), yellowDie)) {
						String yellowHolder3 = die3.roll(yellowDie);
						Thread.sleep(1500);
						System.out.printf("%50s\n", yellowHolder3);
						switch(yellowHolder3) {
							case "YELLOW-SHOTGUN": ++numShotguns; break;
							case "YELLOW-BRAIN": ++numBrains; break;
							case "YELLOW-FEET": ++yellowFeet; ++numFeet; break;
							default: break;
						}
					}
					else {
						String redHolder3 = die3.roll(redDie);
						Thread.sleep(1500);
						System.out.printf("%50s\n", redHolder3);
						switch(redHolder3) {
							case "RED-SHOTGUN": ++numShotguns; break;
							case "RED-BRAIN": ++numBrains; break;
							case "RED-FEET": ++redFeet; ++numFeet; break;
							default: break;
						}
					}	
					
					boolean special = false;
					
					if(stop) {
						if(numShotguns >= 3) {
							System.out.println();
							System.out.printf("%50s", "YOU'RE KICKED OFF!");
							Thread.sleep(4000);
							break;
						}
						System.out.println();
						System.out.printf("%50s", "GET OFF BUT KEEP YOUR BRAINS");
						Thread.sleep(4000);
						brains[i] += numBrains;
						for(int q = 0; q < zombies.length; q++) if(brains[q] > maxBrains) maxBrains = brains[q];
						break;
					}
					
					if(numShotguns > 2) {
						System.out.println();
						System.out.printf("%50s", "TOO MANY SHOTGUNS!!!");
						numBrains = 0;
						Thread.sleep(3500);
						break;
					}
					
					System.out.println();
					System.out.printf("%55s", "CONTINUE(C) OR STOP(ANY): ");
					String roll = in.nextLine();
					roll = roll.replaceAll("\\s+","");
					
					if(roll.equalsIgnoreCase("MM")) return;
					else if(!roll.equalsIgnoreCase("C")) {
						brains[i] += numBrains;
						for(int q = 0; q < zombies.length; q++) if(brains[q] > maxBrains) maxBrains = brains[q];
						break;
					}
					
					if(numFeet == 3) continue;
					
					if(!noMoreBus) {
						System.out.println();
						if(hasRolledBus && numFeet > 0) {
							if(numFeet == 2) System.out.printf("%55s", "CHASE THE RUNNERS(R) OR STAY(ANY): ");
							else System.out.printf("%55s", "CHASE THE RUNNER(R) OR STAY(ANY): ");
							String jump = in.nextLine();
							jump = jump.replaceAll("\\s+","");
							if(jump.equalsIgnoreCase("R")) doubleDown = true;
							else if(jump.equalsIgnoreCase("MM")) return;
						}
						
						if(!doubleDown) {
								System.out.printf("%55s", "ROLL SCHOOLBUS(S) OR PULL FROM CUP(ANY): ");
								String specialQuest = in.nextLine();
								specialQuest = specialQuest.replaceAll("\\s+","");
								
								if(specialQuest.equalsIgnoreCase("S")) special = true;
								else if(specialQuest.equalsIgnoreCase("MM")) return;
								else {
									noMoreBus = true;
									special = false;
								}
							
							if(special) {
								if(redFeet > 0) {
									switch(redFeet) {
										case 1: die1 = red;
											if(greenFeet == 1) die2 = green;
											else if(yellowFeet == 1) die2 = yellow;
											die3 = school;
											break;
										case 2: 
											die1 = red;
											die2 = red;
											die3 = school; 
											break;
										default: break;
									}
								}
								else if(greenFeet > 0) {
									switch(greenFeet) {
										case 1: die1 = green;
											if(redFeet == 1) die2 = red;
											else if(yellowFeet == 1) die2 = yellow;
											die3 = school;
											break;
										case 2: 
											die1 = green;
											die2 = green;
											die3 = school;
											break;
										default: break;
									}
								}
								else if(yellowFeet > 0) {
									switch(yellowFeet) {
										case 1: die1 = red;
											if(greenFeet == 1) die2 = green;
											else if(redFeet == 1) die2 = red;
											die3 = school;
										case 2: 
										die1 = yellow;
										die2 = yellow;
										die3 = school; 
										default: break;
									}
								}
								else {
									die1 = cup.get(randGen.nextInt(cup.size()));
									cup.remove(die1);
									die2 = cup.get(randGen.nextInt(cup.size()));
									cup.remove(die2);
									die3 = school;
								
								}
								continue;
							} 
						}
					}
					
					if(redFeet > 0) {
						switch(redFeet) {
							case 1: die1 = red;
								if(greenFeet == 1) die2 = green;
								else if(yellowFeet == 1) die2 = yellow;
								die3 = cup.get(randGen.nextInt(cup.size()));
								cup.remove(die3);
								break;
							case 2: 
								die1 = red;
								die2 = red;
								die3 = cup.get(randGen.nextInt(cup.size()));
								cup.remove(die3); 
								break;
							default: break;
						}
					}
					else if(greenFeet > 0) {
						switch(greenFeet) {
							case 1: die1 = green;
								if(redFeet == 1) die2 = red;
								else if(yellowFeet == 1) die2 = yellow;
								die3 = cup.get(randGen.nextInt(cup.size()));
								cup.remove(die3);
								break;
							case 2: 
								die1 = green;
								die2 = green;
								die3 = cup.get(randGen.nextInt(cup.size()));
								cup.remove(die3); 
								break;
							default: break;
						}
					}
					else if(yellowFeet > 0) {
						switch(yellowFeet) {
							case 1: die1 = red;
								if(greenFeet == 1) die2 = green;
								else if(redFeet == 1) die2 = red;
								die3 = cup.get(randGen.nextInt(cup.size()));
								cup.remove(die3);
							case 2: 
							die1 = yellow;
							die2 = yellow;
							die3 = cup.get(randGen.nextInt(cup.size()));
							cup.remove(die3); 
							default: break;
						}
					}
					else {
						die1 = cup.get(randGen.nextInt(cup.size()));
						cup.remove(die1);
						die2 = cup.get(randGen.nextInt(cup.size()));
						cup.remove(die2);
						die3 = cup.get(randGen.nextInt(cup.size()));
						cup.remove(die3);
					}
				} 
				
				if(maxBrains >= 13) { 
					lastRound = true; 
					origMax = i; 
				}
			}
		}
	}
	
	public static void suddenDeathSchool(int[] zombies, int[] brains, boolean lastRound, int maxBrains) throws InterruptedException, IOException {
		Random randGen = new Random();
		Scanner in = new Scanner(System.in);
		boolean classic = false;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		overallScoreTracker(zombies, brains, 0, 0, false, classic);
		System.out.println("\r\n\r\n");
		System.out.printf("%89s\n", " (           (     (              )   (                              )  ");
		System.out.printf("%89s\n", " )\\ )        )\\ )  )\\ )        ( /(   )\\ )         (       *   )  ( /(  ");
		System.out.printf("%89s\n", "(()/(    (  (()/( (()/(   (    )\\()) (()/(   (     )\\    ` )  /(  )\\()) ");
		System.out.printf("%89s\n", " /(_))   )\\  /(_)) /(_))  )\\  ((_)\\   /(_))  )\\ ((((_)(   ( )(_))((_)\\  ");
		System.out.printf("%89s\n", "(_))  _ ((_)(_))_ (_))_  ((_)  _((_) (_))_  ((_) )\\ _ )\\ (_(_())  _((_) ");
		System.out.printf("%89s\n", "/ __|| | | | |   \\ |   \\ | __|| \\| |  |   \\ | __|(_)_\\(_)|_   _| | || | ");
		System.out.printf("%89s\n", "\\__ \\| |_| | | |) || |) || _| | .` |  | |) || _|  / _ \\    | |   | __ | ");
		System.out.printf("%89s\n", "|___/ \\___/  |___/ |___/ |___||_|\\_|  |___/ |___|/_/ \\_\\   |_|   |_||_| ");
		Thread.sleep(6000);
		for(int i = 0; i < zombies.length; i++) {
			ArrayList<Dice> cup = refillCup();
			int numShotguns = 0;
			int numBrains = 0;
			boolean noMoreBus = false;
			boolean stop = false;
			boolean hasRolledBus = false;
			boolean doubleDown = false;
			Dice die1 = cup.get(randGen.nextInt(cup.size()));
			cup.remove(die1);
			Dice die2 = cup.get(randGen.nextInt(cup.size()));
			cup.remove(die2);
			Dice die3 = cup.get(randGen.nextInt(cup.size()));
			cup.remove(die3);
			while(true) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				overallScoreTracker(zombies, brains, numBrains, numShotguns, lastRound, classic);
				if(cup.size() < 4) cup = refillCup();
				int numFeet = 0;
				int greenFeet = 0;
				int yellowFeet = 0;
				int redFeet = 0;
				int greenShotguns = 0;
				int redShotguns = 0;
				int yellowShotguns = 0;
				System.out.println();
				System.out.printf("%50s\n", "PLAYER " + (i+1) + " ROLLING");
				Thread.sleep(2000);
				// Rolling die1
				if(Arrays.equals(die1.getFace(), greenDie)) {
					String greenHolder1 = die1.roll(greenDie);
					Thread.sleep(1000);
					System.out.printf("%50s\n", greenHolder1);
					switch(greenHolder1) {
						case "GREEN-SHOTGUN": ++numShotguns; ++greenShotguns; break;
						case "GREEN-BRAIN": ++numBrains; break;
						case "GREEN-FEET": ++greenFeet; ++numFeet; break;
						default: break;
					}
				}
				else if(Arrays.equals(die1.getFace(), yellowDie)) {
					String yellowHolder1 = die1.roll(yellowDie);
					Thread.sleep(1000);
					System.out.printf("%50s\n", yellowHolder1);
					switch(yellowHolder1) {
						case "YELLOW-SHOTGUN": ++numShotguns; ++yellowShotguns; break;
						case "YELLOW-BRAIN": ++numBrains; break;
						case "YELLOW-FEET": ++yellowFeet; ++numFeet; break;
						default: break;
					}
				}
				else {
					String redHolder1 = die1.roll(redDie);
					Thread.sleep(1000);
					System.out.printf("%50s\n", redHolder1);
					switch(redHolder1) {
						case "RED-SHOTGUN": ++numShotguns; ++redShotguns; break;
						case "RED-BRAIN": ++numBrains; break;
						case "RED-FEET": ++redFeet; ++numFeet; break;
						default: break;
					}
				}
				
				// Rolling die2
				if(Arrays.equals(die2.getFace(), greenDie)) {
					String greenHolder2 = die2.roll(greenDie);
					Thread.sleep(1250);
					System.out.printf("%50s\n", greenHolder2);
					switch(greenHolder2) {
						case "GREEN-SHOTGUN": ++numShotguns; ++greenShotguns; break;
						case "GREEN-BRAIN": ++numBrains; break;
						case "GREEN-FEET": ++greenFeet; ++numFeet; break;
						default: break;
					}
				}
				else if(Arrays.equals(die2.getFace(), yellowDie)) {
					String yellowHolder2 = die2.roll(yellowDie);
					Thread.sleep(1250);
					System.out.printf("%50s\n", yellowHolder2);
					switch(yellowHolder2) {
						case "YELLOW-SHOTGUN": ++numShotguns; ++yellowShotguns; break;
						case "YELLOW-BRAIN": ++numBrains; break;
						case "YELLOW-FEET": ++yellowFeet; ++numFeet; break;
						default: break;
					}
				}
				else {
					String redHolder3 = die2.roll(redDie);
					Thread.sleep(1250);
					System.out.printf("%50s\n", redHolder3);
					switch(redHolder3) {
						case "RED-SHOTGUN": ++numShotguns; ++redShotguns; break;
						case "RED-BRAIN": ++numBrains; break;
						case "RED-FEET": ++redFeet; ++numFeet; break;
						default: break;
					}
				}
				
				// Rolling die3
				if(Arrays.equals(die3.getFace(), schoolBus)) {
					hasRolledBus = true;
					String busHolder = die3.roll(schoolBus);
					Thread.sleep(1500);
					System.out.printf("%50s\n", "BUS-" + busHolder);
					switch(busHolder) {
						case "YIELD": 
						if(redShotguns == 1 || yellowShotguns == 1 || greenShotguns == 1) { 
							if(redShotguns == 1) ++redFeet;
							else if(greenShotguns == 1) ++greenFeet;
							else ++yellowFeet;
							++numFeet;
							--numShotguns;
						}
						else if(redShotguns == 2 || yellowShotguns == 2 || greenShotguns == 2) { 
							if(redShotguns == 1) {
								if(greenShotguns == 1) {
									++redFeet;
									++greenFeet;
								}
								else {
									++redFeet;
									++yellowFeet;
								}
							}
							else if(greenShotguns == 1) {
								if(redShotguns == 1) {
									++redFeet;
									++greenFeet;
								}
								else {
									++greenFeet;
									++yellowFeet;
								}
							}
							else if(yellowShotguns == 1) {
								if(redShotguns == 1) {
									++redFeet;
									++yellowFeet;
								}
								else {
									++yellowFeet;
									++greenFeet;
								}
							}
							else if(redShotguns == 2) redFeet += 2;
							else if(greenShotguns == 2) greenFeet += 2;
							else yellowFeet += 2;
							numFeet += 2;
							numShotguns -= 2;
						}
						break;
						case "RUN-OVER": 
						if(numBrains > 0) --numBrains; 
						noMoreBus = true;
						break;
						case "STOP": stop = true; break;
						case "DEAD-END": 
						if(numFeet == 1) { 
							if(redFeet == 1) --redFeet;
							else if(greenFeet == 1) --greenFeet;
							else --yellowFeet;
							++numBrains;
							--numFeet;
						}
						else if(numFeet == 2) { 
							if(redFeet == 2) redFeet -= 2;
							else if(greenFeet == 2) greenFeet -= 2;
							else yellowFeet -= 2;
							numBrains += 2;
							numFeet -= 2;
						}
						break;
						case "BRAIN": ++numBrains; break;
						case "BRAIN-BRAIN-BRAIN": ++numBrains; ++numBrains; ++numBrains; break;
						case "BRAIN-BRAIN-SHOTGUN": ++numBrains; ++numBrains; ++numShotguns; break;
						case "SHOTGUN-SHOTGUN": ++numShotguns; ++numShotguns; break;
						case "SHOTGUN": ++numShotguns; break;
						case "BRAIN-SHOTGUN": ++numBrains; ++numShotguns; break;
						case "BRAIN-BRAIN": ++numBrains; ++numBrains; break;
						default: break;
					}
				}
				else if(Arrays.equals(die3.getFace(), greenDie)) {
					String greenHolder3 = die3.roll(greenDie);
					Thread.sleep(1500);
					System.out.printf("%50s\n", greenHolder3);
					switch(greenHolder3) {
						case "GREEN-SHOTGUN": ++numShotguns; break;
						case "GREEN-BRAIN": ++numBrains; break;
						case "GREEN-FEET": ++greenFeet; ++numFeet; break;
						default: break;
					}
				}
				else if(Arrays.equals(die3.getFace(), yellowDie)) {
					String yellowHolder3 = die3.roll(yellowDie);
					Thread.sleep(1500);
					System.out.printf("%50s\n", yellowHolder3);
					switch(yellowHolder3) {
						case "YELLOW-SHOTGUN": ++numShotguns; break;
						case "YELLOW-BRAIN": ++numBrains; break;
						case "YELLOW-FEET": ++yellowFeet; ++numFeet; break;
						default: break;
					}
				}
				else {
					String redHolder3 = die3.roll(redDie);
					Thread.sleep(1500);
					System.out.printf("%50s\n", redHolder3);
					switch(redHolder3) {
						case "RED-SHOTGUN": ++numShotguns; break;
						case "RED-BRAIN": ++numBrains; break;
						case "RED-FEET": ++redFeet; ++numFeet; break;
						default: break;
					}
				}	
				
				boolean special = false;
				
				if(stop) {
					if(numShotguns >= 3) {
						System.out.println();
						System.out.printf("%50s", "GET KICKED OFF!");
						Thread.sleep(4000);
						break;
					}
					System.out.printf("%50s", "GET OFF BUT TAKE YOUR BRAINS.");
					Thread.sleep(4000);
					brains[i] += numBrains;
					for(int q = 0; q < zombies.length; q++) if(brains[q] > maxBrains) maxBrains = brains[q];
					break;
				}
				
				if(numShotguns > 2) {
					System.out.println();
					System.out.printf("%50s", "TOO MANY SHOTGUNS!!!");
					numBrains = 0;
					Thread.sleep(3250);
					break;
				}
				
				System.out.println();
				System.out.printf("%55s", "CONTINUE(C) OR STOP(ANY): ");
				String roll = in.nextLine();
				roll = roll.replaceAll("\\s+","");
				
				if(roll.equalsIgnoreCase("MM")) return;
				else if(!roll.equalsIgnoreCase("C")) {
					brains[i] += numBrains;
					for(int q = 0; q < zombies.length; q++) if(brains[q] > maxBrains) maxBrains = brains[q];
					break;
				}
								
				if(numFeet == 3) continue;
				
				if(!noMoreBus) {
					System.out.println();
					if(hasRolledBus && numFeet > 0) {
						if(numFeet == 2) System.out.printf("%55s", "CHASE THE RUNNERS(R) OR STAY(ANY): ");
						else System.out.printf("%55s", "CHASE THE RUNNER(R) OR STAY(ANY): ");
						String jump = in.nextLine();
						jump = jump.replaceAll("\\s+","");
						
						if(jump.equalsIgnoreCase("R")) doubleDown = true;
						else if(jump.equalsIgnoreCase("MM")) return;
					}
					
					if(!doubleDown) {
							System.out.printf("%55s", "ROLL SCHOOLBUS(S) OR PULL FROM CUP(ANY): ");
							String specialQuest = in.nextLine();
							specialQuest = specialQuest.replaceAll("\\s+","");
							
							if(specialQuest.equalsIgnoreCase("S")) special = true;
							else if(specialQuest.equalsIgnoreCase("MM")) return;
							else {
								noMoreBus = true;
								special = false;
							}
						
						if(special) {
							if(redFeet > 0) {
								switch(redFeet) {
									case 1: die1 = red;
										if(greenFeet == 1) die2 = green;
										else if(yellowFeet == 1) die2 = yellow;
										die3 = school;
										break;
									case 2: 
										die1 = red;
										die2 = red;
										die3 = school; 
										break;
									default: break;
								}
							}
							else if(greenFeet > 0) {
								switch(greenFeet) {
									case 1: die1 = green;
										if(redFeet == 1) die2 = red;
										else if(yellowFeet == 1) die2 = yellow;
										die3 = school;
										break;
									case 2: 
										die1 = green;
										die2 = green;
										die3 = school;
										break;
									default: break;
								}
							}
							else if(yellowFeet > 0) {
								switch(yellowFeet) {
									case 1: die1 = red;
										if(greenFeet == 1) die2 = green;
										else if(redFeet == 1) die2 = red;
										die3 = school;
									case 2: 
									die1 = yellow;
									die2 = yellow;
									die3 = school; 
									default: break;
								}
							}
							else {
								die1 = cup.get(randGen.nextInt(cup.size()));
								cup.remove(die1);
								die2 = cup.get(randGen.nextInt(cup.size()));
								cup.remove(die2);
								die3 = school;
							
							}
							continue;
						} 
					}
				}
				
				if(redFeet > 0) {
					switch(redFeet) {
						case 1: die1 = red;
							if(greenFeet == 1) die2 = green;
							else if(yellowFeet == 1) die2 = yellow;
							die3 = cup.get(randGen.nextInt(cup.size()));
							cup.remove(die3);
							break;
						case 2: 
							die1 = red;
							die2 = red;
							die3 = cup.get(randGen.nextInt(cup.size()));
							cup.remove(die3); 
							break;
						default: break;
					}
				}
				else if(greenFeet > 0) {
					switch(greenFeet) {
						case 1: die1 = green;
							if(redFeet == 1) die2 = red;
							else if(yellowFeet == 1) die2 = yellow;
							die3 = cup.get(randGen.nextInt(cup.size()));
							cup.remove(die3);
							break;
						case 2: 
							die1 = green;
							die2 = green;
							die3 = cup.get(randGen.nextInt(cup.size()));
							cup.remove(die3); 
							break;
						default: break;
					}
				}
				else if(yellowFeet > 0) {
					switch(yellowFeet) {
						case 1: die1 = red;
							if(greenFeet == 1) die2 = green;
							else if(redFeet == 1) die2 = red;
							die3 = cup.get(randGen.nextInt(cup.size()));
							cup.remove(die3);
						case 2: 
						die1 = yellow;
						die2 = yellow;
						die3 = cup.get(randGen.nextInt(cup.size()));
						cup.remove(die3); 
						default: break;
					}
				}
				else {
					die1 = cup.get(randGen.nextInt(cup.size()));
					cup.remove(die1);
					die2 = cup.get(randGen.nextInt(cup.size()));
					cup.remove(die2);
					die3 = cup.get(randGen.nextInt(cup.size()));
					cup.remove(die3);
				}
			} 
		}
		
		if(suddenDeathBool(brains, maxBrains))  {
			suddenDeathSchool(remainingZombies(zombies, maxBrains, brains), brains, lastRound, maxBrains);
			return;
		}
		else printWinner(brains, maxBrains, zombies);
	}
	
	public static int[] remainingZombies(int[] zombies, int maxBrains, int[] brains) {
		int numMax = 0;
		for(int o = 0; o < brains.length; o++) if(brains[o] == maxBrains) numMax++;
		
		int[] again = new int[numMax];
		int x = 0;
		for(int a = 0; a < again.length; a++) {
			if(brains[a] == maxBrains) {
				again[x] = zombies[a];
				++x;
			}
		}
		return again;
	}
	
	public static void classicVersion() throws InterruptedException, IOException {
		Random randGen = new Random();
		Scanner in = new Scanner(System.in);
		boolean classic = true;
		int[] zombies = numPlayers();
		int[] brains = new int[zombies.length];
		if(zombies.length < 2) return ;
		
		ArrayList<Dice> cup = refillCup();
		boolean lastRound = false;
		int maxBrains = 0;
		int origMax = 0;
		int counter = 0;
		
		while(true) {
			for(int i = 0; i < zombies.length; i++) {
				if(lastRound && origMax == i) continue;
				if(lastRound) ++counter;
				if(lastRound && counter == zombies.length && suddenDeathBool(brains, maxBrains))  {
					suddenDeathClassic(remainingZombies(zombies, maxBrains, brains), brains, lastRound, maxBrains);
					return;
				}
				else if(lastRound && counter == zombies.length) { 
					printWinner(brains, maxBrains, zombies);
					return;
				}
				cup = refillCup();
				int numShotguns = 0;
				int numBrains = 0;
				Dice die1 = cup.get(randGen.nextInt(cup.size()));
				cup.remove(die1);
				Dice die2 = cup.get(randGen.nextInt(cup.size()));
				cup.remove(die2);
				Dice die3 = cup.get(randGen.nextInt(cup.size()));
				cup.remove(die3);
				while(true) {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					overallScoreTracker(zombies, brains, numBrains, numShotguns, lastRound, classic);
					if(cup.size() < 4) cup = refillCup();
					int numFeet = 0;
					int greenFeet = 0;
					int yellowFeet = 0;
					int redFeet = 0;
					System.out.println();
					System.out.printf("%50s\n", "PLAYER " + (i+1) + " ROLLING");
					Thread.sleep(2000);
					System.out.println();
					// Rolling die1
					if(Arrays.equals(die1.getFace(), greenDie)) {
						String greenHolder1 = die1.roll(greenDie);
						Thread.sleep(1000);
						System.out.printf("%50s\n", greenHolder1);
						switch(greenHolder1) {
							case "GREEN-SHOTGUN": ++numShotguns; break;
							case "GREEN-BRAIN": ++numBrains; break;
							case "GREEN-FEET": ++greenFeet; ++numFeet; break;
							default: break;
						}
					}
					else if(Arrays.equals(die1.getFace(), yellowDie)) {
						String yellowHolder1 = die1.roll(yellowDie);
						Thread.sleep(1000);
						System.out.printf("%50s\n", yellowHolder1);
						switch(yellowHolder1) {
							case "YELLOW-SHOTGUN": ++numShotguns; break;
							case "YELLOW-BRAIN": ++numBrains; break;
							case "YELLOW-FEET": ++yellowFeet; ++numFeet; break;
							default: break;
						}
					}
					else {
						String redHolder1 = die1.roll(redDie);
						Thread.sleep(1000);
						System.out.printf("%50s\n", redHolder1);
						switch(redHolder1) {
							case "RED-SHOTGUN": ++numShotguns; break;
							case "RED-BRAIN": ++numBrains; break;
							case "RED-FEET": ++redFeet; ++numFeet; break;
							default: break;
						}
					}
					// Rolling die2
					if(Arrays.equals(die2.getFace(), greenDie)) {
						String greenHolder2 = die2.roll(greenDie);
						Thread.sleep(1250);
						System.out.printf("%50s\n", greenHolder2);
						switch(greenHolder2) {
							case "GREEN-SHOTGUN": ++numShotguns; break;
							case "GREEN-BRAIN": ++numBrains; break;
							case "GREEN-FEET": ++greenFeet; ++numFeet; break;
							default: break;
						}
					}
					else if(Arrays.equals(die2.getFace(), yellowDie)) {
						String yellowHolder2 = die2.roll(yellowDie);
						Thread.sleep(1250);
						System.out.printf("%50s\n", yellowHolder2);
						switch(yellowHolder2) {
							case "YELLOW-SHOTGUN": ++numShotguns; break;
							case "YELLOW-BRAIN": ++numBrains; break;
							case "YELLOW-FEET": ++yellowFeet; ++numFeet; break;
							default: break;
						}
					}
					else {
						String redHolder3 = die3.roll(redDie);
						Thread.sleep(1250);
						System.out.printf("%50s\n", redHolder3);
						switch(redHolder3) {
							case "RED-SHOTGUN": ++numShotguns; break;
							case "RED-BRAIN": ++numBrains; break;
							case "RED-FEET": ++redFeet; ++numFeet; break;
							default: break;
						}
					}
					// Rolling die3
					if(Arrays.equals(die3.getFace(), greenDie)) {
						String greenHolder3 = die3.roll(greenDie);
						Thread.sleep(1500);
						System.out.printf("%50s\n", greenHolder3);
						switch(greenHolder3) {
							case "GREEN-SHOTGUN": ++numShotguns; break;
							case "GREEN-BRAIN": ++numBrains; break;
							case "GREEN-FEET": ++greenFeet; ++numFeet; break;
							default: break;
						}
					}
					else if(Arrays.equals(die3.getFace(), yellowDie)) {
						String yellowHolder3 = die3.roll(yellowDie);
						Thread.sleep(1500);
						System.out.printf("%50s\n", yellowHolder3);
						switch(yellowHolder3) {
							case "YELLOW-SHOTGUN": ++numShotguns; break;
							case "YELLOW-BRAIN": ++numBrains; break;
							case "YELLOW-FEET": ++yellowFeet; ++numFeet; break;
							default: break;
						}
					}
					else {
						String redHolder3 = die3.roll(redDie);
						Thread.sleep(1500);
						System.out.printf("%50s\n", redHolder3);
						switch(redHolder3) {
							case "RED-SHOTGUN": ++numShotguns; break;
							case "RED-BRAIN": ++numBrains; break;
							case "RED-FEET": ++redFeet; ++numFeet; break;
							default: break;
						}
					}	
					
					if(numShotguns > 2) {
						System.out.println();
						System.out.printf("%50s", "TOO MANY SHOTGUNS!!!");
						numBrains = 0;
						Thread.sleep(3250);
						break;
					}
					
					System.out.println();
					System.out.printf("%55s", "CONTINUE(C) OR STOP(ANY): ");
					String roll = in.nextLine();
					roll = roll.replaceAll("\\s+","");
					
					if(roll.equalsIgnoreCase("MM")) return;
					else if(!roll.equalsIgnoreCase("C")) {
						brains[i] += numBrains;
						for(int q = 0; q < zombies.length; q++) if(brains[q] > maxBrains) maxBrains = brains[q];
						break;
					}
										
					if(numFeet == 3) continue;
					
					if(redFeet > 0) {
						switch(redFeet) {
							case 1: die1 = red;
								if(greenFeet == 1) die2 = green;
								else if(yellowFeet == 1) die2 = yellow;
								die3 = cup.get(randGen.nextInt(cup.size()));
								cup.remove(die3);
								break;
							case 2: 
								die1 = red;
								die2 = red;
								die3 = cup.get(randGen.nextInt(cup.size()));
								cup.remove(die3); 
								break;
							default: break;
						}
					}
					else if(greenFeet > 0) {
						switch(greenFeet) {
							case 1: die1 = green;
								if(redFeet == 1) die2 = red;
								else if(yellowFeet == 1) die2 = yellow;
								die3 = cup.get(randGen.nextInt(cup.size()));
								cup.remove(die3);
								break;
							case 2: 
								die1 = green;
								die2 = green;
								die3 = cup.get(randGen.nextInt(cup.size()));
								cup.remove(die3); 
								break;
							default: break;
						}
					}
					else if(yellowFeet > 0) {
						switch(yellowFeet) {
							case 1: die1 = red;
								if(greenFeet == 1) die2 = green;
								else if(redFeet == 1) die2 = red;
								die3 = cup.get(randGen.nextInt(cup.size()));
								cup.remove(die3);
							case 2: 
							die1 = yellow;
							die2 = yellow;
							die3 = cup.get(randGen.nextInt(cup.size()));
							cup.remove(die3); 
							default: break;
						}
					}
					else {
						die1 = cup.get(randGen.nextInt(cup.size()));
						cup.remove(die1);
						die2 = cup.get(randGen.nextInt(cup.size()));
						cup.remove(die2);
						die3 = cup.get(randGen.nextInt(cup.size()));
						cup.remove(die3);
					}
				} 
				
				if(maxBrains >= 13) { 
					lastRound = true; 
					origMax = i; 
				}
			}
		}
	}
	
	public static boolean suddenDeathBool(int[] brains, int maxBrains) {
		int numMax = 0;
		for(int o = 0; o < brains.length; o++) if(brains[o] == maxBrains) numMax++;
		if(numMax > 1) return true;
		else return false;
	}
	
	public static void suddenDeathClassic(int[] zombies, int[] brains, boolean lastRound, int maxBrains) throws InterruptedException, IOException {
		Random randGen = new Random();
		Scanner in = new Scanner(System.in);
		boolean classic = true;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		overallScoreTracker(zombies, brains, 0, 0, false, classic);
		System.out.println("\r\n\r\n\r\n");
		System.out.printf("%89s\n", " (           (     (              )   (                              )  ");
		System.out.printf("%89s\n", " )\\ )        )\\ )  )\\ )        ( /(   )\\ )         (       *   )  ( /(  ");
		System.out.printf("%89s\n", "(()/(    (  (()/( (()/(   (    )\\()) (()/(   (     )\\    ` )  /(  )\\()) ");
		System.out.printf("%89s\n", " /(_))   )\\  /(_)) /(_))  )\\  ((_)\\   /(_))  )\\ ((((_)(   ( )(_))((_)\\  ");
		System.out.printf("%89s\n", "(_))  _ ((_)(_))_ (_))_  ((_)  _((_) (_))_  ((_) )\\ _ )\\ (_(_())  _((_) ");
		System.out.printf("%89s\n", "/ __|| | | | |   \\ |   \\ | __|| \\| |  |   \\ | __|(_)_\\(_)|_   _| | || | ");
		System.out.printf("%89s\n", "\\__ \\| |_| | | |) || |) || _| | .` |  | |) || _|  / _ \\    | |   | __ | ");
		System.out.printf("%89s\n", "|___/ \\___/  |___/ |___/ |___||_|\\_|  |___/ |___|/_/ \\_\\   |_|   |_||_| ");
		Thread.sleep(6000);
		for(int i = 0; i < zombies.length; i++) {
			ArrayList<Dice> cup = refillCup();
			int numShotguns = 0;
			int numBrains = 0;
			Dice die1 = cup.get(randGen.nextInt(cup.size()));
			cup.remove(die1);
			Dice die2 = cup.get(randGen.nextInt(cup.size()));
			cup.remove(die2);
			Dice die3 = cup.get(randGen.nextInt(cup.size()));
			cup.remove(die3);
			while(true) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				overallScoreTracker(zombies, brains, numBrains, numShotguns, lastRound, classic);
				if(cup.size() < 4) cup = refillCup();
				int numFeet = 0;
				int greenFeet = 0;
				int yellowFeet = 0;
				int redFeet = 0;
				System.out.println();
				System.out.printf("%50s\n", "PLAYER " + (i+1) + " ROLLING");
				Thread.sleep(2000);
				System.out.println();
				// Rolling die1
				if(Arrays.equals(die1.getFace(), greenDie)) {
					String greenHolder1 = die1.roll(greenDie);
					Thread.sleep(1000);
					System.out.printf("%50s\n", greenHolder1);
					switch(greenHolder1) {
						case "GREEN-SHOTGUN": ++numShotguns; break;
						case "GREEN-BRAIN": ++numBrains; break;
						case "GREEN-FEET": ++greenFeet; ++numFeet; break;
						default: break;
					}
				}
				else if(Arrays.equals(die1.getFace(), yellowDie)) {
					String yellowHolder1 = die1.roll(yellowDie);
					Thread.sleep(1000);
					System.out.printf("%50s\n", yellowHolder1);
					switch(yellowHolder1) {
						case "YELLOW-SHOTGUN": ++numShotguns; break;
						case "YELLOW-BRAIN": ++numBrains; break;
						case "YELLOW-FEET": ++yellowFeet; ++numFeet; break;
						default: break;
					}
				}
				else {
					String redHolder1 = die1.roll(redDie);
					Thread.sleep(1000);
					System.out.printf("%50s\n", redHolder1);
					switch(redHolder1) {
						case "RED-SHOTGUN": ++numShotguns; break;
						case "RED-BRAIN": ++numBrains; break;
						case "RED-FEET": ++redFeet; ++numFeet; break;
						default: break;
					}
				}
				// Rolling die2
				if(Arrays.equals(die2.getFace(), greenDie)) {
					String greenHolder2 = die2.roll(greenDie);
					Thread.sleep(1250);
					System.out.printf("%50s\n", greenHolder2);
					switch(greenHolder2) {
						case "GREEN-SHOTGUN": ++numShotguns; break;
						case "GREEN-BRAIN": ++numBrains; break;
						case "GREEN-FEET": ++greenFeet; ++numFeet; break;
						default: break;
					}
				}
				else if(Arrays.equals(die2.getFace(), yellowDie)) {
					String yellowHolder2 = die2.roll(yellowDie);
					Thread.sleep(1250);
					System.out.printf("%50s\n", yellowHolder2);
					switch(yellowHolder2) {
						case "YELLOW-SHOTGUN": ++numShotguns; break;
						case "YELLOW-BRAIN": ++numBrains; break;
						case "YELLOW-FEET": ++yellowFeet; ++numFeet; break;
						default: break;
					}
				}
				else {
					String redHolder3 = die3.roll(redDie);
					Thread.sleep(1250);
					System.out.printf("%50s\n", redHolder3);
					switch(redHolder3) {
						case "RED-SHOTGUN": ++numShotguns; break;
						case "RED-BRAIN": ++numBrains; break;
						case "RED-FEET": ++redFeet; ++numFeet; break;
						default: break;
					}
				}
				// Rolling die3
				if(Arrays.equals(die3.getFace(), greenDie)) {
					String greenHolder3 = die3.roll(greenDie);
					Thread.sleep(1500);
					System.out.printf("%50s\n", greenHolder3);
					switch(greenHolder3) {
						case "GREEN-SHOTGUN": ++numShotguns; break;
						case "GREEN-BRAIN": ++numBrains; break;
						case "GREEN-FEET": ++greenFeet; ++numFeet; break;
						default: break;
					}
				}
				else if(Arrays.equals(die3.getFace(), yellowDie)) {
					String yellowHolder3 = die3.roll(yellowDie);
					Thread.sleep(1500);
					System.out.printf("%50s\n", yellowHolder3);
					switch(yellowHolder3) {
						case "YELLOW-SHOTGUN": ++numShotguns; break;
						case "YELLOW-BRAIN": ++numBrains; break;
						case "YELLOW-FEET": ++yellowFeet; ++numFeet; break;
						default: break;
					}
				}
				else {
					String redHolder3 = die3.roll(redDie);
					Thread.sleep(1500);
					System.out.printf("%50s\n", redHolder3);
					switch(redHolder3) {
						case "RED-SHOTGUN": ++numShotguns; break;
						case "RED-BRAIN": ++numBrains; break;
						case "RED-FEET": ++redFeet; ++numFeet; break;
						default: break;
					}
				}	
				
				if(numShotguns > 2) {
					System.out.println();
					System.out.printf("%50s\n", "TOO MANY SHOTGUNS!!!");
					Thread.sleep(3250);
					break;
				}
				
				System.out.println();
				System.out.printf("%55s", "CONTINUE(C) OR STOP(ANY): ");
				String roll = in.nextLine();
				roll = roll.replaceAll("\\s+","");
				
				if(roll.equalsIgnoreCase("MM")) return;
				else if(!roll.equalsIgnoreCase("C")) {
					brains[i] += numBrains;
					for(int q = 0; q < zombies.length; q++) if(brains[q] > maxBrains) maxBrains = brains[q];
					break;
				}
								
				if(numFeet == 3) continue;
				
				if(redFeet > 0) {
					switch(redFeet) {
						case 1: die1 = red;
							if(greenFeet == 1) die2 = green;
							else if(yellowFeet == 1) die2 = yellow;
							die3 = cup.get(randGen.nextInt(cup.size()));
							cup.remove(die3);
							break;
						case 2: 
							die1 = red;
							die2 = red;
							die3 = cup.get(randGen.nextInt(cup.size()));
							cup.remove(die3); 
							break;
						default: break;
					}
				}
				else if(greenFeet > 0) {
					switch(greenFeet) {
						case 1: die1 = green;
							if(redFeet == 1) die2 = red;
							else if(yellowFeet == 1) die2 = yellow;
							die3 = cup.get(randGen.nextInt(cup.size()));
							cup.remove(die3);
							break;
						case 2: 
							die1 = green;
							die2 = green;
							die3 = cup.get(randGen.nextInt(cup.size()));
							cup.remove(die3); 
							break;
						default: break;
					}
				}
				else if(yellowFeet > 0) {
					switch(yellowFeet) {
						case 1: die1 = red;
							if(greenFeet == 1) die2 = green;
							else if(redFeet == 1) die2 = red;
							die3 = cup.get(randGen.nextInt(cup.size()));
							cup.remove(die3);
						case 2: 
						die1 = yellow;
						die2 = yellow;
						die3 = cup.get(randGen.nextInt(cup.size()));
						cup.remove(die3); 
						default: break;
					}
				}
				else {
					die1 = cup.get(randGen.nextInt(cup.size()));
					cup.remove(die1);
					die2 = cup.get(randGen.nextInt(cup.size()));
					cup.remove(die2);
					die3 = cup.get(randGen.nextInt(cup.size()));
					cup.remove(die3);
				}
			} 
		}
		if(suddenDeathBool(brains, maxBrains))  {
			suddenDeathClassic(remainingZombies(zombies, maxBrains, brains), brains, lastRound, maxBrains);
			return;
		}
		else printWinner(brains, maxBrains, zombies);
	}
	
	public static void overallScoreTracker(int[] zombies, int[] brains, int numBrains, int numShotguns, boolean lastRound, boolean classic) throws InterruptedException, IOException {
		if(classic) {
			System.out.println("\r\n\r\n\r\n\r\n");
			System.out.println("MAIN MENU (MM)");
			System.out.printf("%49s\n", "  ___  __      __    ___  ___  ____  ___");
			System.out.printf("%50s\n", "  / __)(  )    /__\\  / __)/ __)(_  _)/ __)");
			System.out.printf("%49s\n", "  ( (__  )(__  /(__)\\ \\__ \\\\__ \\ _)(_( (__");
			System.out.printf("%50s\n", "  \\___)(____)(__)(__)(___/(___/(____)\\___)");
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("MAIN MENU (MM)");
			System.out.println("	            _             _             _       _    _            _            _             _         _                  _");        
			System.out.println("		   / /\\         /\\ \\           / /\\    / /\\ /\\ \\         /\\ \\         _\\ \\          / /\\      /\\_\\               / /\\");      
			System.out.println("		  / /  \\       /  \\ \\         / / /   / / //  \\ \\       /  \\ \\       /\\__ \\        / /  \\    / / /         _    / /  \\");     
			System.out.println("		 / / /\\ \\__   / /\\ \\ \\       / /_/   / / // /\\ \\ \\     / /\\ \\ \\     / /_ \\_\\      / / /\\ \\   \\ \\ \\__      /\\_\\ / / /\\ \\__");  
			System.out.println("		/ / /\\ \\___\\ / / /\\ \\ \\     / /\\ \\__/ / // / /\\ \\ \\   / / /\\ \\ \\   / / /\\/_/     / / /\\ \\ \\   \\ \\___\\    / / // / /\\ \\___\\"); 
			System.out.println("		\\ \\ \\ \\/___// / /  \\ \\_\\   / /\\ \\___\\/ // / /  \\ \\_\\ / / /  \\ \\_\\ / / /         / / /\\ \\_\\ \\   \\__  /   / / / \\ \\ \\ \\/___/"); 
			System.out.println("		 \\ \\ \\     / / /    \\/_/  / / /\\/___/ // / /   / / // / /   / / // / /         / / /\\ \\ \\___\\  / / /   / / /   \\ \\ \\");       
			System.out.println("	     _    \\ \\ \\   / / /          / / /   / / // / /   / / // / /   / / // / / ____    / / /  \\ \\ \\__/ / / /   / / /_    \\ \\ \\");      
			System.out.println("	    /_/\\__/ / /  / / /________  / / /   / / // / /___/ / // / /___/ / // /_/_/ ___/\\ / / /____\\_\\ \\  / / /___/ / //_/\\__/ / /");      
			System.out.println("   	    \\ \\/___/ /  / / /_________\\/ / /   / / // / /____\\/ // / /____\\/ //_______/\\__\\// / /__________\\/ / /____\\/ / \\ \\/___/ /");       
			System.out.println("	     \\_____\\/   \\/____________/\\/_/    \\/_/ \\/_________/ \\/_________/ \\_______\\/    \\/_____________/\\/_________/   \\_____\\/");        
			System.out.println();
		}
		int j = 1;
		System.out.println();
		System.out.printf("%74s\n", "OVERALL SCORE TRACKER");
		System.out.printf("%78s\n", "__________________");
		for(int i = 0; i < zombies.length; i++) {
			System.out.printf("%60s%s", "|", "PLAYER " + j);
			System.out.print("|Brains: " + brains[i]);
			if(zombies[i] != 0) {
				File f1 = new File(zombies[i] + ".txt");
				Scanner s1 = new Scanner(f1); 
				System.out.print(" " + s1.nextLine());
			} 
			else System.out.print(" Name: N/A");
			System.out.println();
			j++;
		}
		System.out.println();
		System.out.printf("%74s\n", "CURRENT SCORE TRACKER");
		System.out.printf("%78s\n", "__________________");
		System.out.printf("%60s%s\n", "|", "Brains: " + numBrains);
		System.out.printf("%60s%s\n", "|", "Shotguns: " + numShotguns);
		System.out.println();
		if(lastRound) {
			int maxBrains = 0;
			for(int q = 0; q < zombies.length; q++) if(brains[q] > maxBrains) maxBrains = brains[q];
			int playerWithMax = 0;
			for(int q = 0; q < zombies.length; q++) if(brains[q] == maxBrains) playerWithMax = q+1;
			System.out.printf("%45s\n", "LAST TURN TO BEAT PLAYER " + playerWithMax);
			System.out.println();
		}
	}
	
	public static void printWinner(int[] brains, int maxBrains, int[] zombies) throws InterruptedException, IOException {
		Scanner in = new Scanner(System.in);
		int playerWithMax = 0;
		int wins = 0;
		int losses = 0;
		String[] values = new String[14];
		for(int i = 0; i < zombies.length; i++) {
			if(!new File(zombies[i] + ".txt").isFile()) continue;
			File f1 = new File(zombies[i] + ".txt");
			Scanner z8 = new Scanner(f1); 
			int j = 0;
			while(z8.hasNext()) {
				values[j] = z8.next();
				++j;
			}
			
			String name = values[1]; 
			int lifeTimeScore = Integer.parseInt(values[3]) + brains[i];
			int numberOfPlays = Integer.parseInt(values[7]) + 1; 			
			double averageScore = (double)lifeTimeScore / (double)numberOfPlays; 
			if(brains[i] == maxBrains) {
				wins = Integer.parseInt(values[9]) + 1; 
				losses = Integer.parseInt(values[11]);
			}
			else {
			losses = Integer.parseInt(values[11]) + 1;
			wins = Integer.parseInt(values[9]);
			}			
			String password = values[13]; 
			
			switch(zombies[i]) {
				case 1: Player a1 = new Player(name, lifeTimeScore, averageScore, numberOfPlays, wins, losses, password, 1);
						a1.store();
						break;
				case 2:
						Player a2 = new Player(name, lifeTimeScore, averageScore, numberOfPlays, wins, losses, password, 2);
						a2.store();
						break;
				case 3: Player a3 = new Player(name, lifeTimeScore, averageScore, numberOfPlays, wins, losses, password, 3);
						a3.store();
						break;
				case 4: Player a4 = new Player(name, lifeTimeScore, averageScore, numberOfPlays, wins, losses, password, 4);
						a4.store();
						break;
				case 5: Player a5 = new Player(name, lifeTimeScore, averageScore, numberOfPlays, wins, losses, password, 5);
						a5.store();
						break;
				case 6: Player a6 = new Player(name, lifeTimeScore, averageScore, numberOfPlays, wins, losses, password, 6);
						a6.store();
						break;
				case 7: Player a7 = new Player(name, lifeTimeScore, averageScore, numberOfPlays, wins, losses, password, 7);
						a7.store();
						break;
				case 8: Player a8 = new Player(name, lifeTimeScore, averageScore, numberOfPlays, wins, losses, password, 8);
						a8.store();
						break;
				default: break;
			}
		}
		
		for(int j = 0; j < zombies.length; j++) if(brains[j] == maxBrains) playerWithMax = j+1;
		System.out.println();
		Winner thirteen = new Winner(playerWithMax);
		thirteen.printW();
		String escape = in.nextLine();
		escape = escape.replaceAll("\\s+","");
	}
	
	public static ArrayList<Dice> refillCup() {
		ArrayList<Dice> cup = new ArrayList<Dice>();
		
		cup.add(green);
		cup.add(green);
		cup.add(green);
		cup.add(green);
		cup.add(green);
		cup.add(green);
		cup.add(yellow);
		cup.add(yellow);
		cup.add(yellow);
		cup.add(yellow);
		cup.add(red);
		cup.add(red);
		cup.add(red);
		
		return cup;
	}
	
	public static void edition() throws InterruptedException, IOException {
		Scanner in = new Scanner(System.in);
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n");
		System.out.printf("%82s\n", "BACK(B)");
		System.out.println();
		System.out.printf("%115s", "Would you like to play the Classic Game (C) or the School Bus Edition (S)? ");
		String version = in.nextLine();
		version = version.replaceAll("\\s+","");
		if(version.equalsIgnoreCase("C")) classicVersion();
		else if(version.equalsIgnoreCase("S")) schoolBusVersion();
		else return;
	}
	
	public static void rules() throws InterruptedException, IOException {
		Scanner in = new Scanner(System.in);
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n");
		System.out.printf("%82s\n", "BACK(B)");
		System.out.println();
		System.out.printf("%102s", "Classic Version (C) or School Bus Edition (S)? ");
		String version = in.nextLine();
		version = version.replaceAll("\\s+","");
		if(version.equalsIgnoreCase("C")) {
			File f1 = new File("classicRules.txt"); 
			Scanner s1 = new Scanner(f1);
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.printf("%91s\n", " ____  __  __  __    ____  ___ ");
			System.out.printf("%91s\n", "(  _ \\(  )(  )(  )  ( ___)/ __)");
			System.out.printf("%91s\n", " )   / )(__)(  )(__  )__) \\__ \\");
			System.out.printf("%91s\n", "(_)\\_)(______)(____)(____)(___/");

			System.out.println();			
			while(s1.hasNextLine()) System.out.println(s1.nextLine());
			System.out.println();
			System.out.printf("%69s", "BACK (B): ");
			String back = in.nextLine();
			rules();
		}
		else if(version.equalsIgnoreCase("S")) {
			File f2 = new File("schoolBusRules.txt");
			Scanner s2 = new Scanner(f2); 
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.printf("%115s\n", "         _      _                  _             _           _       ");       
			System.out.printf("%115s\n", "        /\\ \\   /\\_\\               _\\ \\          /\\ \\        / /\\     "); 
			System.out.printf("%115s\n", "       /  \\ \\ / / /         _    /\\__ \\        /  \\ \\      / /  \\    "); 
			System.out.printf("%115s\n", "      / /\\ \\ \\\\ \\ \\__      /\\_\\ / /_ \\_\\      / /\\ \\ \\    / / /\\ \\__ "); 
			System.out.printf("%115s\n", "     / / /\\ \\_\\\\ \\___\\    / / // / /\\/_/     / / /\\ \\_\\  / / /\\ \\___\\"); 
			System.out.printf("%115s\n", "    / / /_/ / / \\__  /   / / // / /         / /_/_ \\/_/  \\ \\ \\ \\/___/"); 
			System.out.printf("%115s\n", "   / / /__\\/ /  / / /   / / // / /         / /____/\\      \\ \\ \\      ");
			System.out.printf("%115s\n", "  / / /_____/  / / /   / / // / / ____    / /\\____\\/  _    \\ \\ \\     ");
			System.out.printf("%115s\n", " / / /\\ \\ \\   / / /___/ / // /_/_/ ___/\\ / / /______ /_/\\__/ / /     ");
			System.out.printf("%115s\n", "/ / /  \\ \\ \\ / / /____\\/ //_______/\\__\\// / /_______\\\\ \\/___/ /      "); 
			System.out.printf("%115s\n", "\\/_/    \\_\\/ \\/_________/ \\_______\\/    \\/__________/ \\_____\\/       ");
                                                                      
			System.out.println();
			while(s2.hasNextLine()) System.out.println(s2.nextLine());
			System.out.println();
			System.out.printf("%69s", "BACK (B): ");
			String back = in.nextLine();
			rules();
		}
		else return;
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner in = new Scanner(System.in);
			while(1==1) {
				try {
					String choice = printMenu();
					
					if(choice.equalsIgnoreCase("R")) rules(); 
					else if(choice.equalsIgnoreCase("MA")) myAccount();
					else if(choice.equalsIgnoreCase("P")) edition(); 
					else if(choice.equalsIgnoreCase("E")) break;
					else continue;
					
				} catch(InputMismatchException except) { 
				continue; 
				}
			}
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
}