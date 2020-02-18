package intro_to_array_lists;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	ArrayList<String> names = new ArrayList<String>();
	JFrame frame = new JFrame();
	JButton addNames = new JButton();
	JButton viewNames = new JButton();
	JPanel panel = new JPanel();
	
	void gui() {
	frame.setSize(new Dimension(600,600));
	addNames.setSize(new Dimension(60,60));
	
	viewNames.setSize(new Dimension(60,60));
	addNames.setText("Add a name");
	viewNames.setText("View names");	
	viewNames.addActionListener(this);
	addNames.addActionListener(this);
	panel.add(addNames);
	panel.add(viewNames);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addNames) {
			String addNamesInput = JOptionPane.showInputDialog("Enter a name you want added");
			names.add(addNamesInput);
		}
		
		if (e.getSource() == viewNames) {
			//JOptionPane.showMessageDialog(null,"Guest #1 " + names<1> + " Guest #2 " + names<2> + " Guest #3 " + names<4> + " Guest #5 " + names<5>"");
			for(int i = 0; i < names.size(); i++){
				String s = names.get(i);
				System.out.println("Guest #" + i + " " + s);
		}
	
	
	}
}
}
