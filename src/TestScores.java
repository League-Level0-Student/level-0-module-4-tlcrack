import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String test = JOptionPane.showInputDialog("How did you do on the test?(number please)");
	double score = Double.parseDouble(test);
if(score>89) {
	JOptionPane.showMessageDialog(null, "Great! That's amazing!");
}
if(score>49&&score<90) {
	JOptionPane.showMessageDialog(null, "Well, I guess that's okay.");
}
if(score<50) {
	JOptionPane.showMessageDialog(null, "Study harder next time, slacker.");
}


}
}
