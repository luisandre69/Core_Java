/**
 * @author luis Abreu
 * @website = http://www.luisabreu.co.uk
 * 
 * greeting message
 * returns 2 lines
 * 1 - =====================
 * 2 - Welcome to Core Java!
 * = -> its the length of the greeting message
 */
package Chapter_02;


public class Welcome_Core_Java {
    public static void main(String[] args){
        String greeting = "Welcome to Core Java!";
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();
        System.out.println(greeting);
    }
}
