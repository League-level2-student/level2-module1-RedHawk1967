package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class stuff implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField box1 = new JTextField();
JTextField box2 = new JTextField();
JLabel label = new JLabel();
JButton button = new JButton();
void making() {
	button.addActionListener(this);
	panel.add(box1);
	panel.add(box2);
	panel.add(label);
	panel.add(button);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();


}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
String num1 = box1.getText();
String num2 = box2.getText();
int num22.quals(num2);

label = 

}



}
