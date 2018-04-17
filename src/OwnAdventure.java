import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	int biome = JOptionPane.showOptionDialog(null, "Where would you like to go?", "Story", 0, JOptionPane.INFORMATION_MESSAGE, null,
	new String[] {"Forest", "Desert", "Mountain" }, null);
}
}
