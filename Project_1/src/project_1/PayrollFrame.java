/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.text.NumberFormat;
/**
 *
 * @author Administrator
 */
public class PayrollFrame extends JFrame {
    private JTextField jtfEmployeeName = new JTextField(10);
    private JTextField jtfEmployeeId = new JTextField(10);
    private JTextField jtfEmployeeHours = new JTextField(10);
    private JTextField jtfEmployeePayRate = new JTextField(10);
    private JTextField jtfEmployeeSalary = new JTextField(10);
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 200;
    private JButton jbtCalculate = new JButton("Calculate");

    private Locale locale = Locale.getDefault();
        
    public PayrollFrame()
    {
        //Set title
        setTitle("Payroll");
		
	//set the size
	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
	//Specify the close thingy...
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	//Build the panel and add it to the frame
	BuildInputPanel();
		
	//setVisible
	setVisible(true);
    }
    private void BuildInputPanel()
    {
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel("Employee Name: "));
        p1.add(jtfEmployeeName);
        p1.add(new JLabel("Employee ID: "));
        p1.add(jtfEmployeeId);
        p1.setBorder(new TitledBorder("Enter Employee name and ID"));
            
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 2));
        p2.add(new JLabel("Employee hours: "));
        p2.add(jtfEmployeeHours);
        p2.add(new JLabel("Employee pay rate: "));
        p2.add(jtfEmployeePayRate);
        p2.add(new JLabel("  "));
        p2.add(jbtCalculate);
        p2.add(new JLabel("Employee salary: "));
        p2.add(jtfEmployeeSalary);
        p2.setBorder(new TitledBorder("Employee Pay Stats"));
	jtfEmployeeSalary.setEditable(false);
            
        add(p1, BorderLayout.NORTH); // adds the panel to the frame
        add(p2, BorderLayout.CENTER); // adds the panel to the frame
        jbtCalculate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatePayroll();
            }
        });
        jtfEmployeeName.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String name = jtfEmployeeName.getText();
                try{
                    checkName(name);
                }
                catch (InvalidNameException ex){
                    System.out.println("Invalid name: " + name);
                }
            }
        });
        jtfEmployeeId.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int empId =
                    new Integer(jtfEmployeeId.getText()).intValue();
                try{
                    checkId(empId);
                }
                catch (InvalidIdException ex){
                    System.out.println("Invalid ID number: " + empId);
                }
            }
        });
        jtfEmployeeHours.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double hours =
                    new Double(jtfEmployeeHours.getText()).doubleValue();
                try{
                    checkHours(hours);
                }
                catch (InvalidHoursException ex){
                    System.out.println("Invalid number of hours: " + hours);
                }
            }
        });
        jtfEmployeePayRate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double payRate =
                    new Double(jtfEmployeePayRate.getText()).doubleValue();
                try{
                    checkRate(payRate);
                }
                catch (InvalidRateException ex){
                    System.out.println("Invalid hourly pay rate: " + payRate);
                }
            }
        });
    }
            
    private void calculatePayroll(){
        double salary = 
            new Double(jtfEmployeePayRate.getText()).doubleValue();
        double hours =
            new Double(jtfEmployeeHours.getText()).doubleValue();
        NumberFormat currencyFormat = 
            NumberFormat.getCurrencyInstance(locale.US);
        jtfEmployeeSalary.setText(currencyFormat.format(
            salary * hours));
    }

    public void checkHours(double hoursWorked)
            throws InvalidHoursException {
        if (hoursWorked <= 84 && hoursWorked > 0)
            hoursWorked = hoursWorked;
        else
            throw new InvalidHoursException(hoursWorked);
    }

    public void checkName(String empName)
            throws InvalidNameException {
        if (empName.trim().length() > 0)
            empName = empName;
        else
            throw new InvalidNameException(empName);
    }

    public void checkId(int empId)
            throws InvalidIdException {
        if (empId > 0)
            empId = empId;
        else
            throw new InvalidIdException(empId);
    }

    public void checkRate(double payRate)
            throws InvalidRateException {
        if (payRate <= 25 && payRate >= 0)
            payRate = payRate;
        else
            throw new InvalidRateException(payRate);
    }
    
}