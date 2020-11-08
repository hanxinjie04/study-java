package Frame;





import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName StudentFrame
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/11/8
 **/

public class StudentFrame {


    private JPanel mainPanel;
    private JButton button3;
    private JButton button4;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JButton button1;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JPanel leftPanel;
    private JTextField nameField;
    private JButton 检查Button;
    private JTextField weightFiled;
    private JLabel resultLable;

    public StudentFrame() {
        检查Button.addActionListener(e -> {
        //点击按钮需要做的逻辑
            System.out.println("click");
            String name = nameField.getText();
            String weight = weightFiled.getText();
            student student = new student(name,Integer.valueOf(weight));
            if (Integer.valueOf(weight)>100) {
                resultLable.setText(student.getName() + "体检未通过");
            } else {
                resultLable.setText(student.getName() + "体检通过");
            }
            nameField.setText("");
            weightFiled.setText("");
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentFrame");
        frame.setContentPane(new StudentFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        //frame.pack();
        frame.setVisible(true);
    }
}
