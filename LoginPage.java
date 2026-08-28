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


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
}