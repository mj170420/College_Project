import javax.swing.JOptionPane ;

import java.sql.*;
import javax.swing.ImageIcon;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * f1.java
 *
 * Created on Oct 10, 2013, 7:12:28 PM
 */

/**
 *
 * @author Admin
 */
public class Ano_check extends javax.swing.JFrame {

    /** Creates new form f1 */
    public Ano_check() {
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        obtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ntf = new javax.swing.JTextField();
        atf = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        ycb = new javax.swing.JCheckBox();
        gcb = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2ND SECURITY CHEAK FOR SERVER");
        setFocusTraversalPolicyProvider(true);
        setIconImage(new ImageIcon("F:\\Project Pics\\dwdts.JPG").getImage());

        jLabel1.setFont(new java.awt.Font("AngsanaUPC", 3, 36)); // NOI18N
        jLabel1.setText("Please Enter Your Unique Armour Number");

        jButton1.setMnemonic('p');
        jButton1.setText("Proceed");
        jButton1.setToolTipText("<html>press it");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        obtn.setText("Open Data Manuplation Counter");
        obtn.setEnabled(false);
        obtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obtnMouseClicked(evt);
            }
        });
        obtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtnActionPerformed(evt);
            }
        });
        obtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                obtnFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Is your Post is above LFT Major");

        jLabel3.setFont(new java.awt.Font("AngsanaUPC", 3, 36)); // NOI18N
        jLabel3.setText("2ND SECURITY CHECK FOR SERVER-- PROCEED");

        jLabel4.setFont(new java.awt.Font("AngsanaUPC", 3, 36)); // NOI18N
        jLabel4.setText("Please Enter Your Name");

        buttonGroup1.add(ycb);
        ycb.setText("NO");

        buttonGroup1.add(gcb);
        gcb.setText("YES");
        gcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gcbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(gcb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(ycb)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ycb)
                    .addComponent(gcb))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ntf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(359, 359, 359))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(atf, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(402, 402, 402))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(obtn)
                        .addGap(360, 360, 360))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGap(338, 338, 338))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ntf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(obtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String str1;
str1=atf.getText();
try
{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dwdts","root","kvalwar");
    Statement stmt=con.createStatement() ;
    String query="select * from anochk where name='"+ntf.getText()+"';" ;
    ResultSet rs=stmt.executeQuery(query) ;
    while(rs.next())
 {
String acode, bno ;
acode=rs.getString("Acode");
bno=rs.getString("bno");

if(str1.compareTo(acode)==0)
{
   JOptionPane.showMessageDialog(null,"Number matched so Access Granted");
    if(gcb.isSelected()==true)
  {
   String n1=JOptionPane.showInputDialog("PLEASE ENTER YOUR BATCH NUMBER");
   if(n1.compareTo(bno)==0)
   {
    JOptionPane.showMessageDialog(null,"Welcome Sir");
    obtn.setEnabled(true);
      }
          else
      {
          JOptionPane.showMessageDialog(null,"Sorry");
          obtn.setEnabled(false);
          }
   
   }
    else
    {
       if(ycb.isSelected()==true)
       {
           JOptionPane.showMessageDialog(null,"YOU ARE NOT PERMITTED TO MANIPULATE THE DATA");
       }
       else
       {
           JOptionPane.showMessageDialog(null,"PLESE SPECIFY YOUR POST BELOW");
       }
    }
}
else
{
    JOptionPane.showMessageDialog(null,"Access Denied for incorrect Armour Number");
obtn.setEnabled(false);
}
}
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,"Error In connectivity");
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void obtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtnActionPerformed
    this.setVisible(false) ;
                  new Manuplation_counter().setVisible(true);
}//GEN-LAST:event_obtnActionPerformed

    private void obtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtnFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_obtnFocusLost

    private void obtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_obtnMouseClicked

    private void gcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gcbActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_gcbActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ano_check().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField atf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox gcb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ntf;
    private javax.swing.JButton obtn;
    private javax.swing.JCheckBox ycb;
    // End of variables declaration//GEN-END:variables

}
