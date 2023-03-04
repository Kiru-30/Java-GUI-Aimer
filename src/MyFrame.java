
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame extends JFrame {

	MyFrame() {
		
		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("UNIT CONVERTER");
		mainFrame.setSize(1080, 720);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);

		mainFrame.setLocationRelativeTo(null);

		// Load the logo image and set it as the icon of the JFrame
		ImageIcon logoImage = new ImageIcon("My project.png");
		mainFrame.setIconImage(logoImage.getImage());

		// Create a new ImageIcon object with the same size as the JFrame
		ImageIcon backgroundImage = new ImageIcon("background.png");
		ImageIcon resizedBackgroundImage = new ImageIcon(backgroundImage.getImage().getScaledInstance(mainFrame.getWidth(), mainFrame.getHeight(), java.awt.Image.SCALE_SMOOTH));
		JLabel backgroundLabel = new JLabel(resizedBackgroundImage);
		backgroundLabel.setSize(mainFrame.getWidth(), mainFrame.getHeight());
		mainFrame.setContentPane(backgroundLabel);


		//Label for SELECT UNIT TO CONVERTER     
		JLabel unitTextLabel = new JLabel("SELECT ");
		unitTextLabel.setFont(new Font("Arial", Font.BOLD, 22));
		unitTextLabel.setBounds(565, 220, 200, 50);
		unitTextLabel.setSize(300, 30);
		unitTextLabel.setForeground(Color.white);
		unitTextLabel.setOpaque(false);
		mainFrame.add(unitTextLabel);

		//Label for SELECT UNIT TO CONVERT       
		JLabel selectUnitLabel = new JLabel("SELECT UNIT ");
		selectUnitLabel.setFont(new Font("Arial", Font.BOLD, 22));
		selectUnitLabel.setBounds(560, 340, 200, 50);
		selectUnitLabel.setSize(350, 30);
		selectUnitLabel.setForeground(Color.white);
		selectUnitLabel.setOpaque(false);
		mainFrame.add(selectUnitLabel);


		//COMBO BOX FOR length, weight, temperature and time
		JComboBox<String> unitComboBox = new JComboBox<String>();
		unitComboBox.addItem("LENGTH");
		unitComboBox.addItem("WEIGHT");
		unitComboBox.addItem("TEMPERATURE");
		unitComboBox.addItem("TIME");

		unitComboBox.setBounds(220,420, 200, 40);
		unitComboBox.setFont(new Font("Arial", Font.BOLD, 18));
		unitComboBox.setFocusable(false);
		unitComboBox.setForeground(Color.black);
		unitComboBox.setBackground(new Color(0x89CFF0));
		unitComboBox.setBorder(BorderFactory.createEmptyBorder());
		mainFrame.add(unitComboBox);

		//COMBO BOXES FOR FOUR UNITS
		JComboBox<String> unitsBox1 = new JComboBox<String>(); 
		unitsBox1.setBounds(600,180, 200, 40);
		unitsBox1.setFont(new Font("Arial", Font.BOLD, 18));
		unitsBox1.setFocusable(false);
		unitsBox1.setForeground(Color.black);
		unitsBox1.setBackground(new Color(0x89CFF0));
		unitsBox1.setBorder(BorderFactory.createEmptyBorder());
		mainFrame.add(unitsBox1);

		JComboBox<String> unitsBox2 = new JComboBox<String>(); 
		unitsBox2.setBounds(160,180,200,40);
		unitsBox2.setFont(new Font("Arial", Font.BOLD, 18));
		unitsBox2.setFocusable(false);
		unitsBox2.setForeground(Color.black);
		unitsBox2.setBackground(new Color(0x89CFF0));
		unitsBox2.setBorder(BorderFactory.createEmptyBorder());
		mainFrame.add(unitsBox2);

		 //CONVERT BUTTON 
        JButton Button = new JButton("Convert");
        Button.setFont(new Font("Arial", Font.BOLD, 18));
        Button.setForeground(Color.black);
        Button.setFocusable(false);
        Button.setBounds(470, 620, 150, 120);
        Button.setSize(200, 50);
        mainFrame.add(Button);
        mainFrame.setVisible(true);
		

        unitComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String selected = (String)unitComboBox.getSelectedItem();
            	  if (selected.equals("Weight")) {
                      // Remove the existing elements from UnitsBoxes
            		  unitsBox1.removeAllItems();

                      // Add new elements for weight
            		  unitsBox1.addItem("Gram");
            		  unitsBox1.addItem("Milligram(s)");
            		  unitsBox1.addItem("Kilogram");
            		  unitsBox1.addItem("Pound(s)");
            		  unitsBox1.addItem("Ounce(s)");

                      // Remove the existing elements from UnitsBoxes2
                      unitsBox2.removeAllItems();

                      // Add new elements for weight conversion
                      unitsBox2.addItem("Gram");
                      unitsBox2.addItem("Milligram(s)");
                      unitsBox2.addItem("Kilogram");
                      unitsBox2.addItem("Pound(s)");
                      unitsBox2.addItem("Ounce(s)");
                  } else if (selected.equals("TEMPERATURE")) {
                      // Add new elements for temperature
                	  unitsBox1.removeAllItems();
                	  unitsBox1.addItem("Celsius");
                	  unitsBox1.addItem("Fahrenheit");
                	  unitsBox1.addItem("Kelvin");

                      // Remove the existing elements from UnitsBoxes2
                      unitsBox2.removeAllItems();

                      // Add new elements for temperature conversion
                      unitsBox2.addItem("Celsius");
                      unitsBox2.addItem("Fahrenheit");
                      unitsBox2.addItem("Kelvin");
                  } else if (selected.equals("TIME")) {
                      // Add new elements for time
                	  unitsBox1.removeAllItems();
                	  unitsBox1.addItem("MilliSecond(s)");
                      unitsBox1.addItem("Second(s)");
                      unitsBox1.addItem("Minute(s)");
                      unitsBox1.addItem("Hour(s)");
                      unitsBox1.addItem("Day(s)");
                      unitsBox1.addItem("Week(s)");
                      unitsBox1.addItem("Month(s)");
                      unitsBox1.addItem("Year(s)");

                      // Remove the existing elements from UnitsBoxes2
                      unitsBox2.removeAllItems();

                      // Add new elements for time conversion
                      unitsBox2.addItem("MilliSecond(s)");
                      unitsBox2.addItem("Second(s)");
                      unitsBox2.addItem("Minute(s)");
                      unitsBox2.addItem("Hour(s)");
                      unitsBox2.addItem("Day(s)");
                      unitsBox2.addItem("Week(s)");
                      unitsBox2.addItem("Month(s)");
                      unitsBox2.addItem("Year(s)");
                  } else {
                      // Add the original elements for length
                	  unitsBox1.removeAllItems();
                	  unitsBox1.addItem("Millimeter");
                	  unitsBox1.addItem("Meter");
                	  unitsBox1.addItem("Kilometer");
                	  unitsBox1.addItem("Mile(s)");
                	  unitsBox1.addItem("Yard");
                	  unitsBox1.addItem("Foot");
                	  unitsBox1.addItem("Inch(s)");

                      // Remove the existing elements from UnitsBoxes2
                      unitsBox2.removeAllItems();

                      // Add new elements for length conversion
                      unitsBox2.addItem("Millimeter");
                      unitsBox2.addItem("Meter");
                      unitsBox2.addItem("Kilometer");
                      unitsBox2.addItem("Mile(s)");
                      unitsBox2.addItem("Yard");
                      unitsBox2.addItem("Foot");
                      unitsBox2.addItem("Inch(s)");
                  }
              }
              
	  });
	}
}


