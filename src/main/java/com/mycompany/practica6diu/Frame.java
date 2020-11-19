
package com.mycompany.practica6diu;

import java.awt.Dimension;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.List;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

public class Frame extends javax.swing.JFrame {
    JFileChooser fc = new JFileChooser();
    String ruta;
    FileNameExtensionFilter filter = null;
    BufferedImage image;
    String nombre;
    List<String> log;
    EstadisticasImagen stadisticImage;
    JScrollBar barraV;
    JScrollBar barraH;
  
        
    class MiListener implements AdjustmentListener{

        
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
           
            //if(image != null){
                //stadisticImage.calculaEstadisticas(umbral2.getMat(), panelDeslizable.getViewport().getViewPosition(), panelDeslizable.getViewport().getExtentSize());
                setValuesStadistic();
            //}
        }   
        
    }

    public Frame() {
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        initComponents();
        stadisticImage = new EstadisticasImagen();
        barraV = panelDeslizable.getVerticalScrollBar();
        barraH = panelDeslizable.getHorizontalScrollBar();
        barraV.addAdjustmentListener(new MiListener());
        barraH.addAdjustmentListener(new MiListener());
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDeslizable = new javax.swing.JScrollPane();
        umbral2 = new com.mycompany.practica6diu.Lienzo();
        ConfigurationPanel = new javax.swing.JPanel();
        minRed = new javax.swing.JTextField();
        minLabel = new javax.swing.JLabel();
        maxLabel = new javax.swing.JLabel();
        averageLabel = new javax.swing.JLabel();
        averageRed = new javax.swing.JTextField();
        maxRed = new javax.swing.JTextField();
        redLabel = new javax.swing.JLabel();
        blueLabel = new javax.swing.JLabel();
        greenLabel = new javax.swing.JLabel();
        minBlue = new javax.swing.JTextField();
        maxBlue = new javax.swing.JTextField();
        averageBlue = new javax.swing.JTextField();
        minGreen = new javax.swing.JTextField();
        maxGreen = new javax.swing.JTextField();
        averageGreen = new javax.swing.JTextField();
        nameDevelopment = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        FileMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openFile = new javax.swing.JMenuItem();
        closeFile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        panelDeslizable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDeslizable.setToolTipText("Add an image");

        umbral2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout umbral2Layout = new javax.swing.GroupLayout(umbral2);
        umbral2.setLayout(umbral2Layout);
        umbral2Layout.setHorizontalGroup(
            umbral2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );
        umbral2Layout.setVerticalGroup(
            umbral2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        panelDeslizable.setViewportView(umbral2);

        ConfigurationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image Stadistics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 2, 14))); // NOI18N
        ConfigurationPanel.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N

        minRed.setEditable(false);
        minRed.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        minRed.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        minRed.setDragEnabled(false);
        minRed.setRequestFocusEnabled(false);

        minLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        minLabel.setText("Minimum");

        maxLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        maxLabel.setText("Maximum");

        averageLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        averageLabel.setText("Average");

        averageRed.setEditable(false);
        averageRed.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        averageRed.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        maxRed.setEditable(false);
        maxRed.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        maxRed.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        redLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        redLabel.setText("Red");

        blueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        blueLabel.setText("Blue");

        greenLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        greenLabel.setText("Green");

        minBlue.setEditable(false);
        minBlue.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        minBlue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        maxBlue.setEditable(false);
        maxBlue.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        maxBlue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        maxBlue.setFocusTraversalKeysEnabled(false);

        averageBlue.setEditable(false);
        averageBlue.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        averageBlue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        minGreen.setEditable(false);
        minGreen.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        minGreen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        maxGreen.setEditable(false);
        maxGreen.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        maxGreen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        averageGreen.setEditable(false);
        averageGreen.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        averageGreen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nameDevelopment.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        nameDevelopment.setText("Created by Viviana Benítez ");

        javax.swing.GroupLayout ConfigurationPanelLayout = new javax.swing.GroupLayout(ConfigurationPanel);
        ConfigurationPanel.setLayout(ConfigurationPanelLayout);
        ConfigurationPanelLayout.setHorizontalGroup(
            ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueLabel)
                    .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(greenLabel)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ConfigurationPanelLayout.createSequentialGroup()
                            .addComponent(redLabel)
                            .addGap(14, 14, 14))))
                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                        .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ConfigurationPanelLayout.createSequentialGroup()
                                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(minRed, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maxLabel)
                                    .addComponent(maxRed, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ConfigurationPanelLayout.createSequentialGroup()
                                        .addComponent(minBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(maxBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ConfigurationPanelLayout.createSequentialGroup()
                                        .addComponent(minGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(maxGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(averageRed, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(averageBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(averageGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(averageLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfigurationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfigurationPanelLayout.createSequentialGroup()
                        .addComponent(nameDevelopment)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfigurationPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        ConfigurationPanelLayout.setVerticalGroup(
            ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minLabel)
                    .addComponent(maxLabel)
                    .addComponent(averageLabel))
                .addGap(42, 42, 42)
                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redLabel)
                    .addComponent(minRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(averageRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blueLabel)
                    .addComponent(minBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(averageBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greenLabel)
                    .addComponent(minGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(averageGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152)
                .addComponent(nameDevelopment))
        );

        FileMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FileMenu.setAlignmentY(1.0F);
        FileMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FileMenu.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        FileMenu.setPreferredSize(new java.awt.Dimension(42, 33));

        jMenu1.setBorder(null);
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        closeFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        closeFile.setText("Close");
        closeFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFileActionPerformed(evt);
            }
        });
        jMenu1.add(closeFile);

        FileMenu.add(jMenu1);

        setJMenuBar(FileMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeslizable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConfigurationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDeslizable)
                    .addComponent(ConfigurationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        filter = new FileNameExtensionFilter("imagenes",".jpg", ".png");
        fc.addChoosableFileFilter(filter);
        int res = fc.showOpenDialog(null);
        try{
            if( res == JFileChooser.APPROVE_OPTION ){
                File file = fc.getSelectedFile();
                Mat mat = Imgcodecs.imread(file.getPath()); 
                image = (BufferedImage) HighGui.toBufferedImage(mat);
                umbral2.setMat(mat);
                umbral2.setBufferedImage(image);
                panelDeslizable.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                panelDeslizable.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                repaint();
                setValuesStadistic();
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,"The selected file is not a valid format. You should see a picture. Allowed extensions: jpg o png");
        }
        
        if( res == JFileChooser.CANCEL_OPTION ){
            System.out.println(" se dio a cancelar");
        }
    }//GEN-LAST:event_openFileActionPerformed

    private void closeFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFileActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure exit Program?","EXIT",JOptionPane.YES_NO_OPTION);
        if(confirmed == JOptionPane.YES_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_closeFileActionPerformed

    
    private void setValuesStadistic(){
        
        if(image == null){
            minRed.setText("");
            minBlue.setText("");
            minGreen.setText("");
            maxGreen.setText("");
            maxRed.setText("");
            maxBlue.setText("");
            averageGreen.setText("");
            averageRed.setText("");
            averageBlue.setText("");
            
        }else{
            stadisticImage.calculaEstadisticas(umbral2.getMat(), panelDeslizable.getViewport().getViewPosition(), panelDeslizable.getViewport().getExtentSize());
            
            minRed.setText(String.valueOf(stadisticImage.getMinimo()[0]));
            minBlue.setText(String.valueOf(stadisticImage.getMinimo()[2]));
            minGreen.setText(String.valueOf(stadisticImage.getMinimo()[1]));
            maxRed.setText(String.valueOf(stadisticImage.getMaximo()[0]));
            maxBlue.setText(String.valueOf(stadisticImage.getMaximo()[2]));
            maxGreen.setText(String.valueOf(stadisticImage.getMaximo()[1]));
            averageRed.setText(String.valueOf(stadisticImage.getPromedio()[0]));
            averageBlue.setText(String.valueOf(stadisticImage.getPromedio()[2]));
            averageGreen.setText(String.valueOf(stadisticImage.getPromedio()[1]));
        }
        
    }
    
   
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConfigurationPanel;
    private javax.swing.JMenuBar FileMenu;
    private javax.swing.JTextField averageBlue;
    private javax.swing.JTextField averageGreen;
    private javax.swing.JLabel averageLabel;
    private javax.swing.JTextField averageRed;
    private javax.swing.JLabel blueLabel;
    private javax.swing.JMenuItem closeFile;
    private javax.swing.JLabel greenLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField maxBlue;
    private javax.swing.JTextField maxGreen;
    private javax.swing.JLabel maxLabel;
    private javax.swing.JTextField maxRed;
    private javax.swing.JTextField minBlue;
    private javax.swing.JTextField minGreen;
    private javax.swing.JLabel minLabel;
    private javax.swing.JTextField minRed;
    private javax.swing.JLabel nameDevelopment;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JScrollPane panelDeslizable;
    private javax.swing.JLabel redLabel;
    private com.mycompany.practica6diu.Lienzo umbral2;
    // End of variables declaration//GEN-END:variables
}
