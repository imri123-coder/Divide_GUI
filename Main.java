
import java.util.Random;
import javax.swing.JOptionPane;
import java.awt.Font;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		
		int correct_counter = 0;

		int total_counter = 0;
		//boolean answer_is_correct = true;
		boolean counter_expired = false;
		
		javax.swing.UIManager.put("OptionPane.messageFont", new Font("Segoe UI", Font.PLAIN, 25));
		int input = Integer.parseInt(JOptionPane.showInputDialog("כמה שאלות תרצה לענות?"));

		while (!counter_expired) {

		  			// g variables x and y
			int x = random.nextInt(13)+1 ;
			int y = random.nextInt(13)+1 ;

			int multi = x * y;
			
			
			javax.swing.UIManager.put("OptionPane.messageFont", new Font("Segoe UI", Font.PLAIN, 25));
			int print = Integer.parseInt(JOptionPane.showInputDialog(multi + " / " + y + "="));
            
			total_counter += 1;

			// timer.schedule(task, 3000);

			if (print == x) {
				JOptionPane.showMessageDialog(null, " כל הבכוד! תשובה נכונה");
				correct_counter += 1;
			} else {

				JOptionPane.showMessageDialog(null, "טעות! התשובה הנכונה היא  " + multi);
			}
			if (total_counter == input ) {
				counter_expired = true;
			}

		}
		JOptionPane.showMessageDialog(null, "כל הכבוד! יש לך " + correct_counter + " תשובות נכונות מתוך "
				+ total_counter + "  תשובות");

	}

}