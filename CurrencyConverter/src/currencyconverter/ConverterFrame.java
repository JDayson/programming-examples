/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;

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
public class ConverterFrame extends JFrame {
	private JTextField jtfInputDollars = new JTextField(10);
	private JTextField jtfCanadianExchangeRate = new JTextField(10);
	private JTextField jtfGermanExchangeRate = new JTextField(10);
	private JTextField jtfBritishExchangeRate = new JTextField(10);
	private JTextField jtfFormattedCanExchRate = new JTextField(10);
	private JTextField jtfFormattedGrmnExchRate = new JTextField(10); 
	private JTextField jtfFormattedBritExchRate = new JTextField(10);
	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 200;
        private JButton jbtConvert = new JButton("Convert");

        private Locale locale = Locale.getDefault();
        
        public ConverterFrame()
	{
		//Set title
		setTitle("Currency Converter");
		
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
            p1.add(new JLabel("US Dollars: "));
            p1.add(jtfInputDollars);
            p1.add(jbtConvert);
            p1.setBorder(new TitledBorder("Enter Dollar Amount"));
            
            JPanel p2 = new JPanel();
            p2.setLayout(new GridLayout(4, 3));
            p2.add(new JLabel("  "));
            p2.add(new JLabel("Exchange Rate"));
            p2.add(new JLabel("Converted Amount"));
            p2.add(new JLabel("Canadian Dollars: "));
            p2.add(jtfCanadianExchangeRate);
            p2.add(jtfFormattedCanExchRate);
            p2.add(new JLabel("German Marks: "));
            p2.add(jtfGermanExchangeRate);
            p2.add(jtfFormattedGrmnExchRate);
            p2.add(new JLabel("British Pounds: "));
            p2.add(jtfBritishExchangeRate);
            p2.add(jtfFormattedBritExchRate);
            p2.setBorder(new TitledBorder("Display Exchange"));
	    jtfFormattedCanExchRate.setEditable(false);
	    jtfFormattedGrmnExchRate.setEditable(false); 
	    jtfFormattedBritExchRate.setEditable(false);
            
            add(p1, BorderLayout.NORTH); // adds the panel to the frame
            add(p2, BorderLayout.CENTER); // adds the panel to the frame
            jbtConvert.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    convertMoney();
                }
            });
        }
            
            private void convertMoney(){
                double moneyInput = 
                        new Double(jtfInputDollars.getText()).doubleValue();
                double CanadianPercent =
                        new Double(jtfCanadianExchangeRate.getText()).doubleValue();
                double GermanPercent =
                        new Double(jtfGermanExchangeRate.getText()).doubleValue();
                double BritishPercent =
                        new Double(jtfBritishExchangeRate.getText()).doubleValue();
                NumberFormat canadianMoney = 
                        NumberFormat.getCurrencyInstance(locale.CANADA);
                NumberFormat germanMoney = 
                        NumberFormat.getCurrencyInstance(locale.GERMAN);
                NumberFormat britishMoney = 
                        NumberFormat.getCurrencyInstance(locale.UK);
                jtfFormattedCanExchRate.setText(canadianMoney.format(
                        moneyInput * CanadianPercent));
                jtfFormattedGrmnExchRate.setText(germanMoney.format(
                        moneyInput * GermanPercent));
                jtfFormattedBritExchRate.setText(britishMoney.format(
                        moneyInput * BritishPercent));
            }
	}