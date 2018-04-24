import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	int biome = JOptionPane.showOptionDialog(null, "Where would you like to go?", "Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
	new String[] {"Forest", "Desert", "Mountain" }, null);
if(biome==0) {
	JOptionPane.showMessageDialog(null, "You couldn't find your way out and died.");
}
if(biome==1) {
	JOptionPane.showMessageDialog(null, "You died of heat stroke.");
}
if(biome==2) {
	JOptionPane.showMessageDialog(null, "You fell off a cliff and kicked the bucket.");
}
}
}
