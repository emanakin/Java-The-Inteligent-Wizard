import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class f3 extends javax.swing.JFrame {

    public f3() {
        initComponents();//Generated code
        animation();//Runs animations when program first begins.
        jButton3.setVisible(false);//Sets button visble for user to make a choice.
        jButton4.setVisible(false);//Sets button visble for user to make a choice.
        jTextField1.setVisible(false);
                
    }

    @SuppressWarnings("unchecked")
    int z=0;//An interger variable that holds the place of the animation to restart at 4 when reaches 0.
    Icon a=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameEnemy1.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon b=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameEnemy2.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon c=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameEnemy3.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon d=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameEnemy4.png");//Finds the location of the file, then places it into a variable which can display on scrren.

    Timer T=new Timer(450, new ActionListener()//Timer for the animation.
    {public void actionPerformed(ActionEvent e)//Method
    {
        z++;//Adds to the interger variable.
        switch (z)//Switch
        {
            case 1://In the case of 1.
            {
                jLabel3.setIcon(a);//Sets jLabel3 to Icon a.
                break;
            }
            case 2://In the case of 2.
            {
                jLabel3.setIcon(b);//Sets jLabel3 to Icon b.
                break;
            }
            case 3://In the case of 3.
            {
                jLabel3.setIcon(c);//Sets jLabel3 to Icon c.
                break;
            }
            case 4://In the case of 4.
            {
                jLabel3.setIcon(d);//Sets jLabel3 to Icon d.
                break;
            }
            
        }
        if (z==4)//If z reaches 4.
        {
            z=0;//Starts procress back at 0
        }
    }
        
    });
int count=1;//An interger variable that holds the place of the animation to restart at 5 when reaches 0.
    Icon one=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\10.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon two=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\9.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon three=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\8.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon four=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\7.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon five=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\6.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon six=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\5.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon seven=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\4.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon eight=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\3.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon nine=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\2.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Icon ten=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\1.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    Timer S=new Timer(2000, new ActionListener()//Creates a timer, which restarts the animation.
    {public void actionPerformed(ActionEvent e)//Method.
    {
        count++;//Adds to the interger variable.
        switch (count)//Switch
        {
            case 1://In the case of one.
            {
                jLabel4.setIcon(one);//Sets jLabel2 to Icon one.
                break;//Breaks the process.
            }
            case 2://In the case of two.
            {
                jLabel4.setIcon(two);//Sets jLabel2 to Icon two.
                break;//Breaks the process.
            }
            case 3://In the case of three.
            {
                jLabel4.setIcon(three);//Sets jLabel2 to Icon three.
                break;//Breaks the process.
            }
            case 4://In the case of four.
            {
                jLabel4.setIcon(four);//Sets jLabel2 to Icon four.
                break;//Breaks the process.
            }
            case 5://In the case of five.
            {
                jLabel4.setIcon(five);//Sets jLabel1 to icon five.
                break;//Breaks the process
            }
            case 6://In the case of five.
            {
                jLabel4.setIcon(six);//Sets jLabel1 to icon six.
                break;//Breaks the process
            }
            case 7://In the case of five.
            {
                jLabel4.setIcon(seven);//Sets jLabel1 to icon seven.
                break;//Breaks the process
            }
            case 8://In the case of five.
            {
                jLabel4.setIcon(eight);//Sets jLabel1 to icon eight.
                break;//Breaks the process
            }
            case 9://In the case of five.
            {
                jLabel4.setIcon(nine);//Sets jLabel1 to icon nine.
                break;//Breaks the process
            }
            case 10://In the case of five.
            {
                jLabel4.setIcon(ten);//Sets jLabel1 to icon ten.
                break;//Breaks the process
            }
            case 11://In the case of five.
            {
             
                break;//Breaks the process
            }
            
        }
        if (count==11)//If process reaches 10
        {
           jLabel6.setIcon(gameover); //Displays image
           jButton3.setVisible(true);//Sets button visble for user to make a choice.
           jButton4.setVisible(true);//Sets button visble for user to make a choice.
           jTextField1.setVisible(true);
           jTextField1.setText("Your score: "+HP);
        }
    }
        
    });
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextField1.setBackground(new java.awt.Color(255, 204, 102));
        jTextField1.setFont(new java.awt.Font("Minecraft", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(310, 370, 220, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playagainbuttn.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playagainbuttnhover.png"))); // NOI18N
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playaginbttnpressed.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(290, 260, 260, 70);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exitbuttn.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exitbuttnhover.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exitbuttnpressed.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(290, 310, 260, 60);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 500);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 0, 0));
        jTextField4.setFont(new java.awt.Font("Minecraft", 1, 28)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0");
        jTextField4.setBorder(null);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(380, 130, 80, 40);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Minecraft", 0, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(20, 320, 760, 50);

        jButton5.setFont(new java.awt.Font("Minecraft", 1, 18)); // NOI18N
        jButton5.setText("Start");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(340, 440, 130, 40);

        jButton2.setFont(new java.awt.Font("Minecraft", 1, 18)); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(410, 380, 160, 50);

        jButton1.setFont(new java.awt.Font("Minecraft", 1, 18)); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(240, 380, 160, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/10.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(390, 160, 70, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 510);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameBack1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-50, 0, 460, 280);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameEnemy1.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(450, -10, 310, 290);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jFrameBackground1.jpg"))); // NOI18N
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
        public int HP=0;//Healthpoints
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        S.start();//Starts timer.
        jButton1.setText("12");//Option A.
        jButton2.setText("9");//Option B.
        jTextField2.setText("3 x 3 = ?");//Question.
        jTextField4.setText(""+HP);//Displays the users points

        jButton5.setVisible(false); //Sets the start button unvisible.      
    }//GEN-LAST:event_jButton5ActionPerformed

    Icon gameover=new ImageIcon("C:\\Users\\19053\\Pictures\\JFrames\\jFrameGameOver.png");//Finds the location of the file, then places it into a variable which can display on scrren.
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed
    int counter = 0;////Creates a counter so you can have multiple uses for one button.
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    switch(counter){//Switch
            case 0://Case 0
        jButton1.setText("20");//Option A.
        jButton2.setText("25");//Option B.
        subtract();//Calls to method to update score if right answer chosen.
        jTextField2.setText("10 + 10 = ?");//Question.
        
        
        counter ++;//Update the counter.
            break;//End of process.
             
            case 1://Case 1
        jButton1.setText("34");//Option A.
        jButton2.setText("9");//Option B.
        jTextField2.setText("40 - 6 = ?");//Question.
       add();//Calls to method to update score if wrong asnwer.
      
        counter ++;//Updates counter.
            break;//End of process.
            
              case 2://Case 2 
        jButton1.setText("105");//Option A.
        jButton2.setText("70");//Option B.
        jTextField2.setText("39 + 31 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.
       
        counter ++;//Updates counter.
            break;//End of process.
              
            case 3://Case 3
        jButton1.setText("45");//Option A.
        jButton2.setText("67");//Option B.
        jTextField2.setText("67 x 1 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.
        
        counter ++;//Updates counter.
            break;//End of process.
            
            case 4://Case 4
        jButton1.setText("78");//Option A.
        jButton2.setText("46");//Option B.
        jTextField2.setText("70 + 8 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.
      
        counter ++;//Updates counter.
            break;//End of process.
            
            case 5://Case 5
        jButton1.setText("87");//Option A.
        jButton2.setText("55");//Option B.
        jTextField2.setText("5 x 11 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.
     
        counter ++;//Updates counter.
            break;//End of process.
            
            case 6://Case 6
        jButton1.setText("89");//Option A.
        jButton2.setText("42");//Option B.
        jTextField2.setText("6x 7 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.
    
        counter ++;//Updates counter.
            break;//End of process.
            
            case 7://Case 7
        jButton1.setText("123");//Option A.
        jButton2.setText("56");//Option B.
        jTextField2.setText("124 - 1 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.
    
        counter ++;//Updates counter.
            break;//End of process.
            
            case 8://Case 8
        jButton1.setText("9");//Option A.
        jButton2.setText("109");//Option B.
        jTextField2.setText("90 / 9 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.
    
        counter ++;//Updates counter.
            break;//End of process.
            
            case 9://Case 9
        jButton1.setText("178");//Option A.
        jButton2.setText("78");//Option B.
        jTextField2.setText("100 + 78 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.
   
        counter ++;//Updates counter.
            break;//End of process.
            
            case 10://Case 10
        jButton1.setText("154");//Option A.
        jButton2.setText("39");//Option B.
        jTextField2.setText("100 + 54 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.
   
        counter ++;//Updates counter.
            break;//End of process.
               case 11://Case 11
        jButton1.setText("67");//Option A.
        jButton2.setText("9");//Option B.
        jTextField2.setText("60 + 7 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.
   
        counter ++;//Updates counter.
            break;//End of process.
               case 12://Case 12
        jButton1.setText("32");//Option A.
        jButton2.setText("30");//Option B.
        jTextField2.setText("10 x 3 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.
   
        counter ++;//Updates counter.
            break;//End of process.
            case 13://Case 13
        jButton1.setText("845");//Option A.
        jButton2.setText("356");//Option B.
        jTextField2.setText("800 + 45 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.
   
        counter ++;//Updates counter.
            break;//End of process.
            case 14://Case 14
        jButton1.setText("567");//Option A.
        jButton2.setText("245");//Option B.
        jTextField2.setText("250 - 5 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.
   
        counter ++;//Updates counter.
            break;//End of process.
            case 15://Case 15
        jButton1.setText("945");//Option A.
        jButton2.setText("234");//Option B.
        jTextField2.setText("5 x 189 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.
   
        counter ++;//Updates counter.
            break;//End of process.
            
            
            
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    switch(counter){//Switch
            case 0://Case 0
        jButton1.setText("67");//Option A.
        jButton2.setText("63");//Option B.
        jTextField2.setText("80 - 13 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.
  
        counter ++;//Updates counter.
            break;//End of process.
             
            case 1://Case 1
        jButton1.setText("34");//Option A.
        jButton2.setText("6");//Option B.
        jTextField2.setText("36 / 6 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.

        counter ++;//Updates counter.
            break;//End of process.
            
              case 2://Case 2
        jButton1.setText("72");//Option A.
        jButton2.setText("14");//Option B.
        jTextField2.setText("20 - 6 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.
   
        counter ++;//Updates counter.
            break;//End of process.
            
            case 3://Case 3
        jButton1.setText("12");//Option A.
        jButton2.setText("22");//Option B.
        jTextField2.setText("11 x 2 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.

        counter ++;//Updates counter.
            break;//End of process.
            
            case 4://Case 4
        jButton1.setText("10");//Option A.
        jButton2.setText("11");//Option B.
        jTextField2.setText("2 x 5 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.

        counter ++;//Updates counter.
            break;//End of process.
            
            case 5://Case 5
        jButton1.setText("13");//Option A.
        jButton2.setText("109");//Option B.
        jTextField2.setText("12 + 1 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.

        counter ++;//Updates counter.
            break;//End of process.
            
            case 6://Case 6
        jButton1.setText("109");//Option A.
        jButton2.setText("78");//Option B.
        jTextField2.setText("119 - 10 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.
 
        counter ++;//Updates counter.
            break;//End of process.
            
            case 7://Case 7
        jButton1.setText("102");//Option A.
        jButton2.setText("28");//Option B.
        jTextField2.setText("7 x 4 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.

        counter ++;//Updates counter.
            break;//End of process.
            
            case 8://Case 8
        jButton1.setText("80");//Option A.
        jButton2.setText("12");//Option B.
        jTextField2.setText("8 x 10 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.

        counter ++;//Updates counter.
            break;//End of process.
            
            case 9://Case 9
        jButton1.setText("51");//Option A.
        jButton2.setText("108");//Option B.
        jTextField2.setText("25 + 26 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.

        counter ++;//Updates counter.
            break;//End of process.
            
            case 10://Case 10
        jButton1.setText("190");//Option A.
        jButton2.setText("198");//Option B.
        jTextField2.setText("190 + 8 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.

        counter ++;//Updates counter.
            break;//End of process.
               case 11://Case 11
        jButton1.setText("17");//Option A.
        jButton2.setText("19");//Option B.
        jTextField2.setText("20 - 1 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.
   
        counter ++;//Updates counter.
            break;//End of process.
               case 12://Case 12
        jButton1.setText("196");//Option A.
        jButton2.setText("302");//Option B.
        jTextField2.setText("300 + 2 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.
   
        counter ++;//Updates counter.
            break;//End of process.
            case 13://Case 13
        jButton1.setText("47");//Option A.
        jButton2.setText("87");//Option B.
        jTextField2.setText("90 - 7 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.
   
        counter ++;
            break;//End of process.
            case 14://Case 14
        jButton1.setText("38");//Option A.
        jButton2.setText("0");//Option B.
        jTextField2.setText("0 x 0 = ?");//Question.
        subtract();//Calls to method to update score if right answer chosen.
   
        counter ++;//Updates counter.
            break;//End of process.
            case 15://Case 15
        jButton1.setText("109");//Option A.
        jButton2.setText("356");//Option B.
        jTextField2.setText("100 + 9 = ?");//Question.
        add();//Calls to method to update score if wrong asnwer.
   
        counter ++;//Updates counter.
            break;//End of process.
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    System.exit(0);//Closes the program
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    new f1().setVisible(true);//Sets the second jFrame (f2) to visibile.   
    this.setVisible(false);//Sets this current jFrame(f1) to unvisible.
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
 private void animation(){//Method
        T.start();//Starts the animation
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
            java.util.logging.Logger.getLogger(f3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {//Generated code
            public void run() {//Generated code
                new f3().setVisible(true);//Generated code
            }
        });
    }

    public void subtract()//Method
    {
        HP+=100;//Adds 100 per correct question.
        jTextField4.setText(""+HP);//Updates player score.
    }
    public void add()//Method
    {
        HP-=100;//Minus 100 per correct question.
        jTextField4.setText(""+HP);//Updates player score.
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
