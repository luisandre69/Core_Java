package Chapter_02;

import java.awt.*;
import java.io.*;
import javax.swing.*;



/**
 * @author luis Abreu
 * @website = http://www.luisabreu.co.uk
 * create frame to visualise images (300 - Width / 400 - Height)
 * to open the image its require press file and open
 * after is required to select the location of the desired picture
 * is also possible to exit by pressing file exit
 */
public class Image_Viewer{
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new ImageViewerFrame();
            frame.setTitle("Image Viewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/*
*A Frame with a label to show an image
*/
class ImageViewerFrame extends JFrame{
    private JLabel label;
    private JFileChooser chooser;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;
    
    public ImageViewerFrame(){
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        
        //use a label to display the images
        label = new JLabel();
        add(label);
        
        //set up the file chooser
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        
        //set up the menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        
        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);
        
        openItem.addActionListener(event -> {
            //show file chooser dialog
            int result = chooser.showOpenDialog(null);
            
            //if file selected, set it as icon of the label
            if (result == JFileChooser.APPROVE_OPTION){
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));     
            }
        });
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(event -> System.exit(0));
    }
}