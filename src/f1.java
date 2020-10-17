
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class f1 extends javax.swing.JFrame {
    
    public f1() {
        initComponents();//Generated code
       animation();//Starts the animation when program is running.
    }

    @SuppressWarnings("unchecked")
    int z=0;//An interger variable that holds the place of the animation to restart at 5 when reaches 0.
    Icon a=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameLogo10.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon b=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameLogo20.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon c=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameLogo30.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon d=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameLogo40.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Timer T=new Timer(400, new ActionListener()//Creates a timer, which restarts the animation.
    {public void actionPerformed(ActionEvent e)//Method.
    {
        z++;//Adds to the interger variable.
        switch (z)//Switch
        {
            case 1://In the case of one.
            {
                jLabel2.setIcon(a);//Sets jLabel2 to Icon a.
                break;//Breaks the process.
            }
            case 2://In the case of two.
            {
                jLabel2.setIcon(b);//Sets jLabel2 to Icon b.
                break;//Breaks the process.
            }
            case 3://In the case of three.
            {
                jLabel2.setIcon(c);//Sets jLabel2 to Icon c.
                break;//Breaks the process.
            }
            case 4://In the case of four.
            {
                jLabel2.setIcon(d);//Sets jLabel2 to Icon d.
                break;//Breaks the process.
            }
            
        }
        if (z==4)//If z(the interger value) reaches 4.
        {
            z=0;//Restart the process as if z is equal to 0.
        }
    }
        
    });
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameExitButton0.png"))); // NOI18N
        jButton2.setText("jButton2");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameButtonPressed0.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameExitButtonHover0.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(710, 10, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameLogo10.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 10, 610, 370);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameStartButton.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameStartButtonPresed.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameStartButtonHover.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameStartButtonPresed.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 390, 195, 43);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameBackground0.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new f2().setVisible(true);//Sets the second jFrame (f2) to visibile.   
        this.setVisible(false);//Sets this current jFrame(f1) to unvisible.
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);//Closes the program
    }//GEN-LAST:event_jButton2ActionPerformed
 private void animation(){//Method
        T.start();//Runs the program as soon as the program starts.
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {//Generated code
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(f1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {//Generated code
            public void run() {//Generated code
                new f1().setVisible(true);//Generated code
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
