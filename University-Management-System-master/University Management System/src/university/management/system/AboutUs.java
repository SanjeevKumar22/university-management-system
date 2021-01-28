package university.management.system;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us - Bangalore institue of Technology");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/logo.jpg"));
            Image i2 = i1.getImage().getScaledInstance(400, 185,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 40, 250, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Bangalore Institute 0f");
            l3.setForeground(new Color(0,102,0));
            l3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
            l3.setBounds(70, 40, 600, 60);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Technology");
            l4.setForeground(new Color(0,102,0));
            l4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
            l4.setBounds(140, 90, 600, 50);
            contentPane.add(l4);

            JLabel l5 = new JLabel("University Management System");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Times New Roman", Font.BOLD, 35));
            l5.setBounds(70, 150, 600, 40);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : Sanjeev Kumar & Siddeshwar");
            l6.setFont(new Font("Times New Roman", Font.BOLD, 25));
            l6.setBounds(70, 198, 600, 34);
            contentPane.add(l6);

            JLabel l7 = new JLabel("USN - 1BI18CS134 & 1BI18CS152");
            l7.setFont(new Font("Times New Roman", Font.BOLD, 25));
            l7.setBounds(70, 240, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Class:3rd YEAR");
            l8.setFont(new Font("Times New Roman", Font.BOLD, 25));
            l8.setBounds(70, 280, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Education - B.E (Computer Science)");
            l9.setFont(new Font("Times New Roman", Font.BOLD , 25));
            l9.setBounds(70, 325, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("DBMS Mini Project");
            l10.setForeground(new Color(30, 144, 255));
            l10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
            l10.setBounds(180, 380, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}


