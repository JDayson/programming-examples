/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab101;

/**
 *
 * @author Administrator
 */
public class GeometricObject {
    private String color = "";
    private boolean filled;
    private java.util.Date dateCreated;
    
    
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    @Override
    public String toString(){
        return "Created on: " + dateCreated + "\nColor: " + "\nFilled: " + filled;
    }
}
