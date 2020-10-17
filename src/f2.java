import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class f2 extends javax.swing.JFrame {

    public f2() {
        initComponents();//Generated code
        animation();//Starts the animation when program is running.
        jTextField2.setVisible(false);//When program runs jTextField is unvisbile.
        jButton1.setVisible(false);//When program runs jButton1 is unvisible.
        jButton4.setVisible(false);//When program runs jButton4 is unvisible.
    }

    @SuppressWarnings("unchecked")
    int z=0;//An interger variable that holds the place of the animation to restart at 5 when reaches 0.
    Icon a=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameWizard1.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon b=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameWizard2.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon c=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameWizard3.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon d=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameWizard4.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon f=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameWizard5.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Timer T=new Timer(300, new ActionListener()//Creates a timer, which restarts the animation.
    {public void actionPerformed(ActionEvent e)//Method.
    {
        z++;//Adds to the interger variable.
        switch (z)//Switch
        {
            case 1://In the case of one.
            {
                jLabel1.setIcon(a);//Sets jLabel2 to Icon a.
                break;//Breaks the process.
            }
            case 2://In the case of two.
            {
                jLabel1.setIcon(b);//Sets jLabel2 to Icon b.
                break;//Breaks the process.
            }
            case 3://In the case of three.
            {
                jLabel1.setIcon(c);//Sets jLabel2 to Icon c.
                break;//Breaks the process.
            }
            case 4://In the case of four.
            {
                jLabel1.setIcon(d);//Sets jLabel2 to Icon d.
                break;//Breaks the process.
            }
            case 5://In the case of five.
            {
                jLabel1.setIcon(f);//Sets jLabel1 to icon f.
                break;//Breaks the process
            }
            
        }
        if (z==5)
        {
            z=0;
        }
    }
        
    });
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameImInButton.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameImInButtonPressed.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameImInButtonHover.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameImInButtonPressed.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 160, 370, 70);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameImOutButton.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameImOutButton.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameImOutButtonHover.png"))); // NOI18N
        jButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameImOutButtonPressed.png"))); // NOI18N
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameImOutButtonPressed.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(230, 230, 350, 60);

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
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 500);

        jButton3.setFont(new java.awt.Font("ArcadeClassic", 0, 36)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameNextButton.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameNextButtonPressed.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameNextButtonHover.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(290, 440, 210, 40);

        jTextField2.setFont(new java.awt.Font("VCR OSD Mono", 0, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(250, 170, 310, 50);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 500);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        jTextField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(30, 340, 740, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/boarder.gif"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(639, 310, 690, 10);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/boarder.gif"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-10, 260, 820, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameWizard1.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, -20, 570, 350);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameBackground2.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 500);

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);//Ends program.
    }//GEN-LAST:event_jButton2ActionPerformed
Icon ridof=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameTransparent.png");//Finds the location of the file, then places it into a variable which can display on scrren.       
Icon enter=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameEnterName.png");//Finds the location of the file, then places it into a variable which can display on scrren.
Icon inout=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameInOut.png");//Finds the location of the file, then places it into a variable which can display on scrren.
int counter = 0;//Creates a counter so you can have multiple uses for one button.
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
        
        switch(counter){//Creates a switch.
            case 0://In the first case (Click one).
                jTextField1.setText("Gondolf: Hello there!.. Uhm what is your name?");//Prints out the text to the jTextField.
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
            case 1://Second click.
                jLabel3.setIcon(enter);//Displays ask for name prompt.
                jTextField1.setText(" ");//Prints out the text to the jTextField.
                jTextField2.setVisible(true);//Prompts the user to ask for their name.
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
            case 2://Third click.
                jTextField1.setText("Gondolf: Nice to meet you Master "+(jTextField2.getText())"."); //Prints out the text to the jTextField.
                jLabel3.setIcon(ridof);//Gets rid of the "What is you name pop up.
                jTextField2.setVisible(false);
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
            case 3://Fourth click.
                jTextField1.setText("Gondolf: I am Legendary Gondolf, Inventor of the Equations.");//Prints out the text to the jTextField.
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
            case 4://Fifth click.
                jTextField1.setText("Gondolf: I am looking for someone to share an adventure with. ");//Prints out the text to the jTextField.
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
            case 5://Sixith click
                jTextField1.setText((jTextField2.getText())+": Wait, who are you and how did I get here?");//Prints out the text to the jTextField.
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
            case 6://Seventh click.
                jTextField1.setText("Gondolf: I am a wizard.");//Prints out the text to the jTextField.
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
            case 7://Eigth click.
                jTextField1.setText("Gondolf: Master "+(jTextField2.getText())+" you are here becuase it is your destiny.");//Prints out the text to the jTextField.
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
            case 8://Ninth click.
                jTextField1.setText((jTextField2.getText())+": My destiny is to slove equations?");//Prints out the text to the jTextField.
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
            case 9://Tenth click.
                jTextField1.setText((jTextField2.getText())+": I'll pass.");//Prints out the text to the jTextField.
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
            case 10://Eventlh click.
                jTextField1.setText("Gondolf: You cannot deny your destiny.");//Prints out the text to the jTextField.
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
            case 11://Twenth click.
                jTextField1.setText("Gondolf: Help me defeat the evil dark lord Equatorous.");//Prints out the text to the jTextField.
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
            case 12://Thirtenth click.
                jTextField1.setText(" ");//Prints out the text to the jTextField.
                jLabel3.setIcon(inout);//Ask the user to make a choice
                jButton1.setVisible(true);//Sets button visble for user to make a choice.
                jButton4.setVisible(true);//Sets button visble for user to make a choice.
                jButton3.setVisible(false);//Sets button not visible.
                counter ++;//Adds to the counter and moves on the to next button use.
            break;//Ends process.
        }
     
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new f1().setVisible(true);//Sets jFrame1 f1 visible. 
        this.setVisible(false);//Sets current frame not visible.
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new f3().setVisible(true);//sets jFrame3 visible.   
        this.setVisible(false);//Sets current frame not visibile.
    }//GEN-LAST:event_jButton1ActionPerformed
 
    
    private void animation(){//Method
        T.start();//Starts animation
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
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {//Generated code
            public void run() {//Generated code
                new f2().setVisible(true);//Generated code
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
