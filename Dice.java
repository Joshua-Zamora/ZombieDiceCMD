import java.util.Random;

public class Dice {
	private int numFaces;
	private String[] face; 
	
	public Dice() {}
	
	public Dice(int numFaces) {
		this.numFaces = numFaces;
	}
	
	public Dice(int numFaces, String[] face) {
		this.numFaces = numFaces;
		this.face = face;
	}
	
	
	public void setFaces(String[] face) {
		this.face = face;
	}
	
	public void setNumFaces(int numFaces) {
		this.numFaces = numFaces;
	}
	
	public String[] getFace() {
		return face;
	}
	
	public int getNumFaces() {
		return numFaces;
	}
	
	public void roll() {
		Random randGen = new Random();
		int numHolder = randGen.nextInt(numFaces) + 1;
		System.out.println(numHolder);
	}
	
	public String roll(String[] face) {
		Random randGen = new Random();
		int numHolder = randGen.nextInt(numFaces) + 1;
		return face[numHolder - 1];
	}
}
