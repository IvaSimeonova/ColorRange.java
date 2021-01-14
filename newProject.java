package InventoryProject;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class newProject {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Diat plan");
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// main containers and Layouts
		JPanel mainPanel = new JPanel();
		frame.add(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

		JPanel leftPanel = new JPanel();
		mainPanel.add(leftPanel);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

		JPanel rightPanel = new JPanel();
		mainPanel.add(rightPanel);
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

		// left side
		JLabel DiatPlanLabel = new JLabel("Diat plan");
		leftPanel.add(DiatPlanLabel);

		JTextArea planArea = new JTextArea();
		planArea.setBounds(100, 20, 165, 25);
		planArea.setEditable(false);
		planArea.setText("Answer this questions");
		leftPanel.add(planArea);

		// right side
		SimpleDateFormat ft = new SimpleDateFormat("dd. M yyyy");
		JLabel currentDateLabel = new JLabel(ft.format(new Date()));
		rightPanel.add(currentDateLabel);
		
		JTextArea questionArea = new JTextArea();
		questionArea.setBounds(100, 20, 165, 25);
		questionArea.setEditable(false);
		questionArea.setText("How old are you?");
		rightPanel.add(questionArea);

		JTextField infoText_1 = new JTextField();
		rightPanel.add(infoText_1);
		
		JTextArea question2Area = new JTextArea();
		question2Area.setBounds(100, 20, 165, 25);
		question2Area.setEditable(false);
		question2Area.setText("What's your weight?");
		rightPanel.add(question2Area);
		
		JTextField infoText_2 = new JTextField();
		rightPanel.add(infoText_2);
		
		JTextArea question3Area = new JTextArea();
		question3Area.setBounds(100, 20, 165, 25);
		question3Area.setEditable(false);
		question3Area.setText("How active are you?");
		rightPanel.add(question3Area);
		
		JTextField infoText_3 = new JTextField();
		rightPanel.add(infoText_3);
		
		JTextArea question4Area = new JTextArea();
		question4Area.setBounds(100, 20, 165, 25);
		question4Area.setEditable(false);
		question4Area.setText("How much weight do you want to lose?");
		rightPanel.add(question4Area);
		
		JTextField infoText_4 = new JTextField();
		rightPanel.add(infoText_4);

		JButton showButton = new JButton("Show me my menu");
		rightPanel.add(showButton);

		JLabel menuLabel = new JLabel("menu");
		rightPanel.add(menuLabel);

		frame.pack();
		// Setting the frame visibility to true
		frame.setVisible(true);

	}
}