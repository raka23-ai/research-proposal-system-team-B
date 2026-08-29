import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		

		JLabel passLabel = new JLabel("Password");
		passLabel.setFont(labelFont);
		passLabel.setForeground(textColor);
		passLabel.setBounds(540, 260, 100, 30);
		add(passLabel);

		JPasswordField passField = new JPasswordField();
		passField.setBounds(540, 290, 250, 35);
		passField.setBorder(
			BorderFactory.createEmptyBorder(5, 5, 5, 5)
		);
		add(passField);

		JCheckBox showPassBox = new JCheckBox("Show Password");
		showPassBox.setBounds(660, 260, 130, 30);
		showPassBox.setBackground(
			new Color(196, 216, 235)
		);
		showPassBox.setForeground(textColor);
		add(showPassBox);

		// Show / hide password
		showPassBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (showPassBox.isSelected()) {
					passField.setEchoChar((char) 0);
				} else {
					passField.setEchoChar('•');
				}
			}
		});
		

		JButton btnFaculty = new JButton("Sign In as Faculty");
		btnFaculty.setBounds(540, 360, 140, 30);
		add(btnFaculty);

		JButton btnAdmin = new JButton("Sign In as Admin");
		btnAdmin.setBounds(690, 360, 140, 30);
		add(btnAdmin);

		JButton btnStudent = new JButton("Sign In as Student");
		btnStudent.setBounds(590, 400, 150, 30);
		add(btnStudent);

		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setBounds(615, 440, 100, 30);
		add(btnSignUp);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
}