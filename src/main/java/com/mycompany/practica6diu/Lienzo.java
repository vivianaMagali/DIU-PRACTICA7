
package com.mycompany.practica6diu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import org.opencv.core.Mat;

public class Lienzo extends JPanel {
    private BufferedImage image;
    Mat imageMat;
  
    public Lienzo(){
       
    }
    
    public BufferedImage getBufferedImage(){
        return image;
    }
    
    public void setBufferedImage(BufferedImage image){
        this.image=image;
        this.setPreferredSize(new Dimension(this.image.getWidth(),this.image.getHeight()));
    }
   
    
    public void setMat(Mat mat){
        imageMat=mat;
    }
    
    
    public Mat getMat(){
        return imageMat;
    }
    
    
    @Override
    public void paintComponent (Graphics g){      
        super.paintComponent(g);
        g.drawImage(image, 0, 0,null);
    }
    
}
