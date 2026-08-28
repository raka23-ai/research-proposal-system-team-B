import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
	

    public LoginPage() {
		setTitle("Sign In");
		setSize(850, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);

		getContentPane().setBackground(new Color(196, 216, 235));

		Font labelFont = new Font("SansSerif", Font.PLAIN, 16);
		Color textColor = new Color(100, 100, 100);
		//image
		try {
			ImageIcon icon = new ImageIcon("illustration.png");

			Image img = icon.getImage().getScaledInstance(
				480,
				350,
				Image.SCALE_SMOOTH
			);

			JLabel imageLabel = new JLabel(new ImageIcon(img));
			imageLabel.setBounds(30, 120, 480, 350);

			add(imageLabel);

		} catch (Exception e) {
			System.out.println(
				"Image not found. Add illustration.png to the project."
			);
		}
	// Username Label
	JLabel userLabel = new JLabel("Username");
	userLabel.setFont(labelFont);
	userLabel.setForeground(textColor);
	userLabel.setBounds(540, 100, 100, 30);
	add(userLabel);

	// Username Field
	JTextField userField = new JTextField();
	userField.setBounds(540, 130, 250, 35);
	userField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	add(userField);

	// UserID Label
	JLabel idLabel = new JLabel("UserID");
	idLabel.setFont(labelFont);
	idLabel.setForeground(textColor);
	idLabel.setBounds(540, 180, 100, 30);
	add(idLabel);

	// UserID Field
	JTextField idField = new JTextField();
	idField.setBounds(540, 210, 250, 35);
	idField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	add(idField);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
}