package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class project implements ActionListener
{
	JButton b1,b2;
	JFrame j;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextField t1,t2,t3,t4;
	JRadioButton r1,r2,r3,r4;
	JComboBox c1,c2,c3,c4,c5;
	
	project()
	{
	j = new JFrame("RAILWAY TICKET BOOKING");
	j.setSize(700, 500);
	j.setLayout(null);
	
	l1 = new JLabel("NAME");
	l1.setBounds(40, 40, 100, 50);
	j.add(l1);
	
	t1 = new JTextField();
	t1.setBounds(120, 55, 150, 30);
	j.add(t1);
	
	l2 = new JLabel("MOBILE");
	l2.setBounds(40,80, 100, 50);
	j.add(l2);
	
	t2 = new JTextField();
	t2.setBounds(120, 89, 150, 30);
	j.add(t2);
	
	l3 = new JLabel("AGE");
	l3.setBounds(40,120,100,50);
	j.add(l3);
	
	t3 = new JTextField();
	t3.setBounds(120, 130, 150, 30);
	j.add(t3);
	
	l4 = new JLabel("GENDER");
	l4.setBounds(40, 160, 100, 50);
	j.add(l4);
	
	r1 = new JRadioButton("MALE");
	r1.setBounds(100, 160, 70, 50);
	r1.addActionListener(this);
	j.add(r1);
	
	r2 = new JRadioButton("FEMALE");
	r2.setBounds(180, 160, 100, 50);
	r1.addActionListener(this);
	j.add(r2);
	
	l5 = new JLabel("FROM");
	l5.setBounds(40, 200, 100, 50);
	j.add(l5);
	
	c1 = new JComboBox<>();
	c1.setBounds(100, 210, 150, 30);
	c1.addItem("VIJAYAWADA");
	c1.addItem("AMARAVATHI");
	c1.addItem("GUNTUR");
	c1.addItem("TADAPALLI");
	c1.addItem("MANGALAGIRI");
	c1.addActionListener(this);
	j.add(c1);
	
	l6 = new JLabel("to");
	l6.setBounds(270, 210 , 50, 50);
	j.add(l6);
	
	c2 = new JComboBox<>();
	c2.setBounds(300, 210, 150, 30);
	c2.addItem("Narsapur");
	c2.addItem("Bhimavaram");
	c2.addItem("Gudivada");
	c2.addItem("TADAPALLI");
	c2.addItem("Hyderabad");
	c2.addActionListener(this);
	j.add(c2);
	
	l6 = new JLabel("COATH TYPE");
	l6.setBounds(40, 255, 100, 70);
	j.add(l6);
	
	r3 = new JRadioButton("AC");
	r3.setBounds(180, 270, 100, 50);
	r3.addActionListener(this);
	j.add(r3);
	
	r4 = new JRadioButton("NON");
	r4.setBounds(280, 270, 100, 50);
	r4.addActionListener(this);
	j.add(r4);
	
	l7 = new JLabel("Date of Journey");
	l7.setBounds(40, 280, 100, 100);
	j.add(l7);
	
	c3 = new JComboBox<>();
	c3.setBounds(170, 320, 90, 30);
	c3.addItem(1);
	c3.addItem(2);
	c3.addItem(3);
	c3.addItem(4);
	c3.addItem(5);
	c3.addItem(6);
	c3.addItem(7);
	c3.addItem(8);
	c3.addItem(9);
	c3.addItem(10);
	c3.addItem(11);
	c3.addItem(12);
	c3.addItem(13);
	c3.addItem(14);
	c3.addItem(15);
	c3.addItem(16);
	c3.addItem(17);
	c3.addItem(18);
	c3.addItem(19);
	c3.addItem(20);c3.addItem(21);
	c3.addItem(22);
	c3.addItem(23);
	c3.addItem(24);
	c3.addItem(25);
	c3.addItem(26);
	c3.addItem(27);
	c3.addItem(28);
	c3.addItem(29);
	c3.addItem(30);
	c3.addItem(31);
	c3.addActionListener(this);
	j.add(c3);
	
	c4 = new JComboBox<>();
	c4.setBounds(260, 320, 90, 30);
	c4.addItem("Jan");
	c4.addItem("Feb");
	c4.addItem("March");
	c4.addItem("April");
	c4.addItem("May");
	c4.addItem("June");
	c4.addItem("July");
	c4.addItem("Augest");
	c4.addItem("Sept");
	c4.addItem("Oct");
	c4.addItem("Nov");
	c4.addItem("Dec");
	c4.addActionListener(this);
	j.add(c4);
	
 	c5 = new JComboBox<>();
 	c5.setBounds(350, 320, 90, 30);
 	c5.addItem("2023");
 	c5.addItem("2024");
 	c5.addItem("2025");
 	c5.addItem("2026");
 	c5.addItem("2027");
 	c5.addActionListener(this);
 	j.add(c5);
 	
 	b1 = new JButton("REGERSTER");
 	b1.setBounds(520, 400, 150, 50);
 	b1.addActionListener(this);
 	j.add(b1);
 	
	j.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	    if(e.getSource()==b1)
	    {
	    	String gen = "";
	    	String type = "";
	    	if(r1.isSelected())
	    	{
	    		r2.setEnabled(false);
	    		gen = r1.getActionCommand();
	    	}
	    	else
	    	{
	    		r1.setEnabled(false);
	    		gen = r2.getActionCommand();
	    	}
	    	if(r3.isSelected())
	    	{
	    		r4.setEnabled(false);
	    		type = r3.getActionCommand();
	    	}
	    	else
	    	{
	    		r3.setEnabled(false);
	    		type = r4.getActionCommand();
	    	}
	    	JOptionPane.showMessageDialog(b1,"******INDIAN RAILWAYS*******"+"\n"+t1.getText()+
	    			"\n"+t2.getText()+"\n"+t3.getText()+"\n"+"Gender:"+gen+"\n"+"From:"+
	    			c1.getItemAt(c1.getSelectedIndex())+"\t"+"To:"+c2.getItemAt(c2.getSelectedIndex())
	    			+"Coach: "+type+"\n"+"Date:"+c3.getItemAt(c3.getSelectedIndex())+"\t"+"Month:"+
	    			c4.getItemAt(c4.getSelectedIndex())+"\t"+"Year:"+c5.getItemAt(c5.getSelectedIndex()));
	    }
	}
	
	public static void main(String args[])
	{
		project p = new project();
		
	}

}
