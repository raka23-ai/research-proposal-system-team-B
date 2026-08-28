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

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
}