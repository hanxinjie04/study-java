package Day18;

import javax.swing.*;

/**
 * @ClassName SwingLoginExample
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/11/8
 **/

public class SwingLoginExample {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Login Example");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel){
        panel.setLayout(null);
        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("20");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10,80,80,25);
        panel.add(loginButton);

    }
}
