/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg11.pkg2;

/**
 *
 * @author Administrator
 */
public class Lab112 {

    /**
     * @param args the command line arguments
     */
class Rectangle {
    double Length = 1.0;
    double Width = 1.0;
    
    Rectangle(double newLength,double newWidth){
        Length = newLength;
        Width = newWidth;
    }
    
    void setLength (double newLength){
        Length = newLength;
    }
    void setWidth (double newWidth){
        Width = newWidth;
    }
    double getLength () {
        return Length;
    }
    double getWidth () {
        return Width;
    }
    double getArea () {
        double area = Length * Width;
        return area;
    }
    double gerPar () {
        double parimeter = (Length*2)+(Width*2);
        return parimeter;
    }  
}
class Max {
    public static Object max (Object o1, Object o2) {
        if (((Comparable)o1).compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }
}

class ComparableRectangle extends Rectangle
        implements Comparable {
    
    ComparableRectangle(double width, double height) {
        super(width,height);
    }
    
        @Override
    public int compareTo(Object o) {
        if(getArea() > ((ComparableRectangle)o).getArea())
            return 1;
        else if (getArea() < ((ComparableRectangle)o).getArea())
            return -1;
        else
            return 0;
    }    
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComparableRectangle Rectangle1 = new ComparableRectangle(4,5);
        ComparableRectangle Rectangle2 = new ComparableRectangle(3,6);
        System.out.println(Max.max(Rectangle1.getArea(), Rectangle2.getArea()));
    }

}
