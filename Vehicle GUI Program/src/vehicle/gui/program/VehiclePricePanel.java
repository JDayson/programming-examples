/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.gui.program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.text.DecimalFormat;
/**
 *
 * @author Administrator
 */
public class VehiclePricePanel extends JPanel {
    JSlider priceSldr = new JSlider(SwingConstants.HORIZONTAL, 0, 50000, 20000);
    
    String priceChoice = "20000.00";
    double price;
    JLabel priceLabel = new JLabel("$"+priceChoice);
    DecimalFormat df = new DecimalFormat("0.00");
    
    public VehiclePricePanel(){
        setLayout(new FlowLayout());
        priceSldr.setMajorTickSpacing(100);
        priceSldr.setPaintTicks(true);
        priceSldr.setBorder(BorderFactory.createTitledBorder(
                "What is the Automobile price: "));
        priceSldr.setPreferredSize(new Dimension(500, 54));
        add(priceSldr);
        add(priceLabel);
        
        priceSldr.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent ce){
                try{
                    price = priceSldr.getValue();
                    priceChoice = df.format(price).toString();
                    priceLabel.setText("$"+priceChoice);
                }
                catch(NumberFormatException nfe){
                    nfe.printStackTrace();
                }
            }
        });
    }
    
    public String getPriceChoice(){
        return priceChoice;
    }
}
