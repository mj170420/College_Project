
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * payment.java
 *
 * Created on Jan 6, 2014, 8:52:10 PM
 */

/**
 *
 * @author Admin
 */
public class payment extends javax.swing.JFrame {

    /** Creates new form payment */
    public payment() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ddrb = new javax.swing.JRadioButton();
        crb = new javax.swing.JRadioButton();
        cdrb = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        ctf = new javax.swing.JTextField();
        dtf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chtf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PAY AND GET-PAYMENT COUNTER");
        setIconImage(new ImageIcon("F:\\Project Pics\\dwdts.JPG").getImage());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Mode of Payment"));

        buttonGroup1.add(ddrb);
        ddrb.setText("Demand Draft");

        buttonGroup1.add(crb);
        crb.setText("Cheaque");

        buttonGroup1.add(cdrb);
        cdrb.setText("Credit/Debit Card");
        cdrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdrbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cdrb)
                .addGap(18, 18, 18)
                .addComponent(ddrb)
                .addGap(29, 29, 29)
                .addComponent(crb)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdrb)
                    .addComponent(ddrb)
                    .addComponent(crb))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ctf.setEditable(false);
        ctf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctfActionPerformed(evt);
            }
        });
        ctf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                k1(evt);
            }
        });

        dtf.setEditable(false);
        dtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtfActionPerformed(evt);
            }
        });

        jLabel1.setText("ENTER YOUR CREDIT/DEBIT CARD NUMBER");

        jLabel2.setText("ENTER YOUR DEMAND DRAFT PIN");

        jLabel3.setText("ENTER YOUR MIC CHARACTER BELOW THE CHEAQUE");

        chtf.setEditable(false);
        chtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chtfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(117, 117, 117))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dtf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ctf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chtf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ctf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(chtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cdrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdrbActionPerformed

}//GEN-LAST:event_cdrbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(cdrb.isSelected()==true) {
             dtf.setEditable(false);
                chtf.setEditable(false);
           ctf.setEditable(true) ;
        }else
            if(ddrb.isSelected()==true) {
                ctf.setEditable(false);
                chtf.setEditable(false);
                dtf.setEditable(true);
            }else
                if(crb.isSelected()==true) {
                     ctf.setEditable(false);
                dtf.setEditable(false);
chtf.setEditable(true) ;
                }else {
JOptionPane.showMessageDialog(null,"SELECT A MODE OF PAYMENT");
                }
}//GEN-LAST:event_jButton1ActionPerformed

    private void k1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_k1

    }//GEN-LAST:event_k1

    private void ctfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctfActionPerformed
String str1;
str1=ctf.getText();
if(str1.equals(""))
{
     JOptionPane.showMessageDialog(null,"ENTER YOUR CARD NUMBER");
}
else{
    JOptionPane.showMessageDialog(null,"THANX");
       JOptionPane.showMessageDialog(null,"A PIN HAS BEEN SEND TO OUR MOBILE NUMBER"+"\n"+"USE IT TO VERIFY");
         String str2=JOptionPane.showInputDialog(null,"ENTER YOUR MOBILE PIN NUMBER");
          if(str2.equals("99"))
          {
                 JOptionPane.showMessageDialog(null,"THANK YOU SIR ");
                 this.setVisible(false);
                 new SALE_TABLE().setVisible(true);
          }
          else {
                JOptionPane.showMessageDialog(null,"SORRY SIR PIN DOES NOT MATCH");
                   JOptionPane.showMessageDialog(null,"TRY AGAIN");
}
}       
    }//GEN-LAST:event_ctfActionPerformed

    private void dtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtfActionPerformed
String str1;
str1=dtf.getText();
if(str1.equals(""))
{
     JOptionPane.showMessageDialog(null,"ENTER YOUR DD PIN");
}
else{
    JOptionPane.showMessageDialog(null,"THANX");
       JOptionPane.showMessageDialog(null,"A PIN HAS BEEN SEND TO OUR MOBILE NUMBER"+"\n"+"USE IT TO VERIFY");
         String str2=JOptionPane.showInputDialog(null,"ENTER YOUR MOBILE PIN NUMBER");
          if(str2.equals("99"))
          {
                 JOptionPane.showMessageDialog(null,"THANK YOU SIR ");
                 this.setVisible(false);
                 new SALE_TABLE().setVisible(true);
          }
          else {
                JOptionPane.showMessageDialog(null,"SORRY SIR PIN DOES NOT MATCH");
                   JOptionPane.showMessageDialog(null,"TRY AGAIN");
}
}
    }//GEN-LAST:event_dtfActionPerformed

    private void chtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chtfActionPerformed
String str1;
str1=chtf.getText();
if(str1.equals(""))
{
     JOptionPane.showMessageDialog(null,"ENTER YOUR MIC CHARACTER");
}
else{
    JOptionPane.showMessageDialog(null,"THANX");
       JOptionPane.showMessageDialog(null,"A PIN HAS BEEN SEND TO OUR MOBILE NUMBER"+"\n"+"USE IT TO VERIFY");
         String str2=JOptionPane.showInputDialog(null,"ENTER YOUR MOBILE PIN NUMBER");
          if(str2.equals("99"))
          {
                 JOptionPane.showMessageDialog(null,"THANK YOU SIR ");
                 this.setVisible(false);
                 new SALE_TABLE().setVisible(true);
          }
          else {
                JOptionPane.showMessageDialog(null,"SORRY SIR PIN DOES NOT MATCH");
                   JOptionPane.showMessageDialog(null,"TRY AGAIN");
}
}
    }//GEN-LAST:event_chtfActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cdrb;
    private javax.swing.JTextField chtf;
    private javax.swing.JRadioButton crb;
    private javax.swing.JTextField ctf;
    private javax.swing.JRadioButton ddrb;
    private javax.swing.JTextField dtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
