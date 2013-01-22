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
public class VehicleTypePanel extends JPanel{
    JRadioButton sedanButton = new JRadioButton("Sedan");
    JRadioButton convertButton = new JRadioButton("Convertible");
    JRadioButton vanButton = new JRadioButton("Van");
    JRadioButton suvButton = new JRadioButton("SUV");
    JLabel typeLbl = new JLabel("Choose the Vehicle type: ");
    VehicleOptionPanel vop;
    
    ButtonGroup group = new ButtonGroup();
    
    String typeChoice = "Sedan";
    VehiclePanelProgram vehPanProg;
    
    public VehicleTypePanel(VehiclePanelProgram vpp){
        vehPanProg = vpp;
        group.add(sedanButton);
        group.add(convertButton);
        group.add(vanButton);
        group.add(suvButton);
        
        setLayout(new GridLayout(5, 1));
        
        add(typeLbl);
        add(sedanButton);
        add(convertButton);
        add(vanButton);
        add(suvButton);
        
        sedanButton.setSelected(true);
        
        sedanButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                vehPanProg.enableSunroof();
            }
        });
        
        convertButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                vehPanProg.disableSunroof();
            }
        });
        
        vanButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                vehPanProg.enableSunroof();
            }
        });
        
        suvButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                vehPanProg.enableSunroof();
            }
        });
    }
    
    public String getTypeChoice(){
        return typeChoice;
    }
    
    public void disCon(){
        convertButton.setEnabled(false);
    }
    
    public void enCon(){
        convertButton.setEnabled(true);
    }
}
