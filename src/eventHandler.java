import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class eventHandler extends JFrame {
	private JLabel text;
	private JTextField field;
	private JPasswordField password;
	
	public eventHandler() {
		super("JTextField Demo");
		setLayout(new FlowLayout());
		
		text = new JLabel("Enter Username and Password");
		text.setToolTipText("Login Details");
		add(text);
		
		field = new JTextField("Username", 15 );
		add(field);
		
		password = new JPasswordField("Password", 15);
		add(password);
		
		
		newClass eventHandler = new newClass();
		field.addActionListener(eventHandler);
		password.addActionListener(eventHandler);
	}
	
	private class newClass implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String displayMessage = "";
			if (event.getSource() == field) 
				displayMessage = String.format("Your Username is %s", event.getActionCommand());
			else if (event.getSource() == password)
				displayMessage = String.format("Your Username is %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, displayMessage);
		}
	}
}


