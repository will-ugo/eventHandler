import javax.swing.JFrame;

public class eventHandlerMain {
	public static void main (String args []) {
		eventHandler textObject = new eventHandler();
		textObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textObject.setSize(350,150);
		textObject.setVisible(true);
	}
}



