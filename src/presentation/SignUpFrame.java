package presentation;

import business.*;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author perei
 */
public class SignUpFrame extends javax.swing.JFrame {
    private Manager mng;
    /**
     * Creates new form SignUpFrame
     */
    public SignUpFrame() {
        initComponents();
    }

    SignUpFrame(Manager mng) {
        this.mng=mng;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        signupButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VShelf");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        signupButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signupButton.setText("Sign Up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 34;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 178, 66, 0);
        getContentPane().add(signupButton, gridBagConstraints);

        jLabel1.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(233, 147, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        usernameField.setToolTipText("Username");
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 190;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 147, 0, 144);
        getContentPane().add(usernameField, gridBagConstraints);

        jLabel2.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 147, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        passwordField.setToolTipText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 190;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 147, 0, 144);
        getContentPane().add(passwordField, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        String username = "";
        String password = "";
        
        try{
            username = usernameField.getText();
            password = new String(passwordField.getPassword()).trim();
        }catch (Exception e){
            e.printStackTrace();
        }
        
         if (username.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Not enough data.","EMPTY FIELD(S)", JOptionPane.WARNING_MESSAGE);
        }
        
         else {
             User u = new User (username,password,0,new HashMap<>());
             this.mng.addUser(u);
             JOptionPane.showMessageDialog(new JFrame(), "Welcome to vShelf, "+username+"!", "SIGN UP SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
             this.dispose();
             //new UserFrame(this.mng, u).setVisible(true);
         }
    }//GEN-LAST:event_signupButtonActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
