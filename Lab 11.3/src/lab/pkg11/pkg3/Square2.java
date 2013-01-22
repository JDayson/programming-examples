/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg11.pkg3;

/**
 *
 * @author Administrator
 */
public class Square2 extends GeometricObject{
        private double width;
        private double height;
        
        public Square2(double width, double height){
            this.width = width;
            this.height = height;
        }
        
        public double getWidth(){
            return width;
        }
        
        public void setWidth(double width){
            this.width = width;
        }
        
        public double getHieght(){
            return height;
        }
        
        public void setHieght(double height){
            this.height = height;
        }
        
        @Override
        public double getArea(){
            return width * height;
        }
        
        @Override
        public double getPerimeter(){
            return 2 * (width + height);
        }
    }
