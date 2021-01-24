package caloriesCalculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.io.IOException;
import java.text.ParseException;

public class caloriesCalculator {
	public static void main(String[] args) {
	
		JFrame frame = new JFrame("Calories calculator");
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
		JLabel CaloriesPerDayLabel = new JLabel("Calories per day");
		leftPanel.add(CaloriesPerDayLabel);

		JTextArea planArea = new JTextArea();
		planArea.setBounds(100, 20, 165, 25);
		
		planArea.setEditable(false);
		planArea.setText("Answer this questions");
		leftPanel.add(planArea);
		

		leftPanel.add(new JLabel(new ImageIcon("weight-loss(1).jpg")));
		

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
		question3Area.setText("How active are you?(1-4, 1 is not active, 4 is really active)");
		rightPanel.add(question3Area);
		String[] s = { "","1", "2", "3", "4" };
		JComboBox<Object> infoText_3 = new JComboBox<Object>(s);
		rightPanel.add(infoText_3);
		
		JTextArea question4Area = new JTextArea();
		question4Area.setBounds(100, 20, 165, 25);
		question4Area.setEditable(false);
		question4Area.setText("How tall are you?");
		rightPanel.add(question4Area);
		
		JTextField infoText_4 = new JTextField();
		rightPanel.add(infoText_4);
		
		
		JLabel caloriesLabel = new JLabel("calories");
		rightPanel.add(caloriesLabel);
		
		JTextField infoText_5 = new JTextField();
		rightPanel.add(infoText_5);

		
		JButton showButton = new JButton("Show me my results");
		showButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
			int age = Integer.parseInt(infoText_1.getText());
			int weight = Integer.parseInt(infoText_2.getText());
			int active = Integer.parseInt((String)infoText_3.getSelectedItem());
			int height = Integer.parseInt(infoText_4.getText());
			
			
			//String petName = (String)cb.getSelectedItem();
				 clientsData data = new clientsData();
				 data.validateData(age, weight, active, height);
					infoText_5.setText(Integer.toString(data.calculateCalories()));	
			 
		            
		                
				}catch (Exception e1) {
					infoText_5.setText("Something went wrong. Enter numerical values.");
			    }	
				
			}


		});
		rightPanel.add(showButton);

		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				infoText_1.setText(null);
				infoText_2.setText(null);
				infoText_3.setSelectedIndex(0);;
				infoText_4.setText(null);
				infoText_5.setText(null);
			}


		});
		rightPanel.add(clearButton);

		

		frame.pack();
		// Setting the frame visibility to true
		frame.setVisible(true);
        
	}
}
