/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.gui.program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Administrator
 */
public class VehicleOptionPanel extends JPanel implements ItemListener {
    JCheckBox sunRoofCB = new JCheckBox("Sun-Roof");
    JCheckBox cdPlayerCB = new JCheckBox("CD Player");
    JCheckBox allWheelCB = new JCheckBox("All-Wheel Drive");
    JCheckBox tintCB = new JCheckBox("Tinted Windows");
    JCheckBox carPhoneCB = new JCheckBox("Car Phone");
    JLabel optionLbl = new JLabel("Choose the options: ");
    VehicleTypePanel vtp;
    
    String optionChoice = "CD Player";
    VehiclePanelProgram vehPanProg;
    
    public VehicleOptionPanel(VehiclePanelProgram vpp){
        vehPanProg = vpp;
        setLayout(new GridLayout(6, 1));
        add(optionLbl);
        add(cdPlayerCB);
        add(sunRoofCB);
        add(allWheelCB);
        add(tintCB);
        add(carPhoneCB);
        
        cdPlayerCB.setSelected(true);
        
        sunRoofCB.addItemListener(this);
        cdPlayerCB.addItemListener(this);
        allWheelCB.addItemListener(this);
        tintCB.addItemListener(this);
        carPhoneCB.addItemListener(this);
        
    }
    
    public void itemStateChanged(ItemEvent ie){
        optionChoice = "";
        if(cdPlayerCB.isSelected())
            optionChoice += cdPlayerCB.getText();
        if(sunRoofCB.isSelected()){
            optionChoice += ", " + sunRoofCB.getText();
            vehPanProg.disableConvertible();
        }else{
            vehPanProg.enableConvertible();
        }
        if(allWheelCB.isSelected())
            optionChoice += ", " + allWheelCB.getText();
        if(tintCB.isSelected())
            optionChoice += ", " + tintCB.getText();
        if(carPhoneCB.isSelected())
            optionChoice += ", " + carPhoneCB.getText();
    }
    
    public String getOptionChoice(){
        return optionChoice;
    }
    
    public void disSunroof(){
        sunRoofCB.setEnabled(false);
    }
    
    public void enSunroof(){
        sunRoofCB.setEnabled(true);
    }
}
