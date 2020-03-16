package intro_to_array_lists;

import java.awt.Dimension;
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
JLabel ans = new JLabel();
JButton button = new JButton();

void making() {
	
	ans.setSize(new Dimension(100,100));
	box1.setSize(new Dimension(100,100));
	box2.setSize(new Dimension(100,100));
	button.setSize(new Dimension(100,100));
	button.addActionListener(this);
	panel.add(box1);
	panel.add(box2);
	panel.add(ans);
	panel.add(button);

	frame.add(panel);
	
		
	frame.setVisible(true);
	frame.pack();


}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
String percentnum = box1.getText();
String num = box2.getText();


float percentnumint = Integer.parseInt(percentnum);
float numint = Integer.parseInt(num);
float answer = percentnumint * numint / 100;
String sans = String.valueOf(answer);
ans.setText(sans);

}



}
