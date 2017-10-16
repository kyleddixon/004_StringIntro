package StringPack;

import javax.swing.JOptionPane;

public class StringIntro {

	public static void main(String[] args) {
		Boolean again = true;
		
		String msg = "";
		String varWord = "Boise";
		String cont = "";
		while (again == true) {
		
		msg = "Please enter a string for us to test...";
		varWord = JOptionPane.showInputDialog(msg);
		
		
		LearnStrings getIt = new LearnStrings(varWord);
		msg = "First char is: " + getIt.getFirstLetter();
		JOptionPane.showMessageDialog(null, msg);
		
		int lengthTest = getIt.getLength();
		msg = "Length = " + lengthTest;
		JOptionPane.showMessageDialog(null, msg);
		
		char lastLetter = getIt.getLastLetter();
		System.out.println("Last letter is " + lastLetter);
		msg = "Last letter is " + lastLetter;
		JOptionPane.showMessageDialog(null, msg);
		
		String bodyLtr = getIt.getMiddle();
		msg = "The other letters are... " + bodyLtr;
		JOptionPane.showMessageDialog(null, msg);
		
		msg = "Thanks for playing! would you like to play again? Y/N";
		cont = JOptionPane.showInputDialog(msg);

		if (cont.equals("y")) {
			msg = "Restarting";
			JOptionPane.showMessageDialog(null, msg);
			
		} else {
			
			again = false;
			
		}// end of else
		
		}// end of while
	}
	
	
	
}
