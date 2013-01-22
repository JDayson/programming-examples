/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg11.pkg3;

/**
 *
 * @author Administrator
 */
  public class Square extends GeometricObject implements Colorable{
        private double width;
        private double height;
        
        public Square(double width, double height){
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
        
        @Override
        public String howToColor(){
            return "Sqaure: Paint it";
        }
        
    }