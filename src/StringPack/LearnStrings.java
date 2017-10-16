package StringPack;

import javax.swing.JOptionPane;

public class LearnStrings {

	private String word = "";
	
	public LearnStrings(String s) {
		
		setString(s);
	} // end of constructor
	
	
	public void setString(String s) {
		
		word = s;
		JOptionPane.showMessageDialog(null, "String entered is: " + word);
		
	}
	public char getFirstLetter() {
		return word.charAt(0);
	}
	 public int getLength() {
		 return word.length();
	 }
	public char getLastLetter() {
		
		return word.charAt(word.length()-1);
		
	}
	public String getMiddle() {
		
		return word.substring(1, word.length()-1);
	}
	
}//end of class
