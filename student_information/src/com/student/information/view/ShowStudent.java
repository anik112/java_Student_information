/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.information.view;

/**
 *
 * @author anik
 */
public class ShowStudent extends javax.swing.JFrame {

    /**
     * Creates new form ShowStudent
     */
    public ShowStudent() {
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

        jPanel1 = new javax.swing.JPanel();
        lblShowImage = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblStudentId = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        lblGander = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblMobileNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblShowImage.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        lblShowImage.setForeground(new java.awt.Color(255, 0, 0));
        lblShowImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lblShowImage.setPreferredSize(new java.awt.Dimension(200, 200));

        lblFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblFirstName.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(0, 102, 102));
        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStudentId.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentId.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblStudentId.setForeground(new java.awt.Color(0, 102, 102));
        lblStudentId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDateOfBirth.setBackground(new java.awt.Color(255, 255, 255));
        lblDateOfBirth.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblDateOfBirth.setForeground(new java.awt.Color(0, 102, 102));
        lblDateOfBirth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblGander.setBackground(new java.awt.Color(255, 255, 255));
        lblGander.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblGander.setForeground(new java.awt.Color(0, 102, 102));
        lblGander.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 102, 102));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblMobileNumber.setBackground(new java.awt.Color(255, 255, 255));
        lblMobileNumber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblMobileNumber.setForeground(new java.awt.Color(0, 102, 102));
        lblMobileNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStudentId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDateOfBirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGander, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMobileNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lblShowImage, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblShowImage, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGander, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblDateOfBirth;
    public javax.swing.JLabel lblEmail;
    public javax.swing.JLabel lblFirstName;
    public javax.swing.JLabel lblGander;
    public javax.swing.JLabel lblMobileNumber;
    public javax.swing.JLabel lblShowImage;
    public javax.swing.JLabel lblStudentId;
    // End of variables declaration//GEN-END:variables
}
