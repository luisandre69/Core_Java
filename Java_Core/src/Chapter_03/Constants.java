/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_03;

/**
 *
 * @author Luis Abreu
 */
public class Constants {
    //calling the final(const) variable outside the main class to be avaiable to any class
    public static final double CM_PER_INCH = 2.54;
    
    public static void Constants2(){
        
        //calling the final variable inside will only be avaiable inside the class
        //final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + 
        paperWidth* CM_PER_INCH + " by " +
        paperHeight * CM_PER_INCH);
}
    public static void main(String[] args){
        
        //calling class Constants2
        Constants2();
    }
            
}
