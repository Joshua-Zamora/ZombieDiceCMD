import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Player {
	
	private String name;
	private int lifeTimeScore;
	private double averageScore;
	private int numberOfPlays;
	private int wins;
	private int losses;
	private String password;
	private int accountNum;
	
	public Player() {} 	
	
	public Player(String name, int lifeTimeScore, double averageScore, int numberOfPlays, int wins, int losses, String password, int accountNum) {
		this.name = name;
		this.lifeTimeScore = lifeTimeScore;
		this.averageScore = averageScore;
		this.numberOfPlays = numberOfPlays;
		this.wins = wins;
		this.losses = losses;
		this.password = password;
		this.accountNum = accountNum;
	}
	
	public void name(String name) {
		this.name = name;
		
	}
	
	public void lifeTimeScore(int lifeTimeScore) {
		this.lifeTimeScore = lifeTimeScore;
	}
	
	public void averageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	
	public void numberOfPlays(int numberOfPlays) {
		this.numberOfPlays = numberOfPlays;
	}
	
	public void wins(int wins) {
		this.wins = wins;
	}
	
	public void losses(int losses) {
		this.losses = losses;
	}
	
	public void password(String password) {
		this.password = password;
	}
	
	public void accountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLifeTimeScore() {
		return lifeTimeScore;
	}
	
	public double getAverageScore() {
		return averageScore;
	}
	
	public int getNumberOfPlays() {
		return numberOfPlays;
	}
	
	public int getWins() {
		return wins;
	}
	
	public int getLosses() {
		return losses;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getAccountNum() {
		return accountNum;
	}
	
	public void store() throws IOException {
      FileOutputStream out = null; 
      PrintWriter outFS = null;
	  
		try {
		  // Trying to open file
		  out = new FileOutputStream(accountNum + ".txt");
		  outFS = new PrintWriter(out);

		  // File is open and valid if we got this far (otherwise exception thrown)
		  // Can now write to file
		  outFS.println("Name: " + name);
		  outFS.println("LifeTimeScore: " + lifeTimeScore);
		  outFS.println("AverageScore: " + averageScore);
		  outFS.println("NumberOfPlays: " + numberOfPlays);
		  outFS.println("Wins: " + wins);
		  outFS.println("Losses: " + losses);
		  outFS.println("Password: " + password);
		  outFS.flush();

		  // Done with file, so try to close it
		  out.close(); // close() may throw IOException if fails
		} catch(FileNotFoundException except) {
			System.out.println("File " + accountNum + ".txt not found.");
		}
   }
	
	
}