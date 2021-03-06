/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newlibsys;

import javax.swing.ButtonGroup;

/**
 *
 * @author Balaji
 */
public class ProjectReturn extends javax.swing.JPanel {

    /**
     * Creates new form BookIssue
     */
 
    public ProjectReturn() {
        
        initComponents();
        
        ButtonGroup group =new ButtonGroup();
        project.setSelected(true);
        group.add(book);
        group.add(project);
        return_bt.addActionListener(new ReturnProjectAction());
        addMouseListener(new ReturnProjectAction());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mmbrID_lbl = new javax.swing.JLabel();
        projID = new javax.swing.JTextField();
        return_bt = new javax.swing.JButton();
        back = new javax.swing.JButton();
        bookReturn_lbl = new javax.swing.JLabel();
        book = new javax.swing.JRadioButton();
        project = new javax.swing.JRadioButton();
        message = new javax.swing.JLabel();

        mmbrID_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mmbrID_lbl.setText("Project ID");

        return_bt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        return_bt.setText("Return");
        return_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_btActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setText("Back");

        bookReturn_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bookReturn_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookReturn_lbl.setText("Project Return");

        book.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        book.setText("Books");

        project.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        project.setText("Projects");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(bookReturn_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(mmbrID_lbl)
                        .addGap(27, 27, 27)
                        .addComponent(projID, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(project))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(return_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(bookReturn_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book)
                    .addComponent(project))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mmbrID_lbl)
                    .addComponent(projID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(return_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void return_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_btActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_return_btActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton back;
    javax.swing.JRadioButton book;
    private javax.swing.JLabel bookReturn_lbl;
    static javax.swing.JLabel message;
    private javax.swing.JLabel mmbrID_lbl;
    javax.swing.JTextField projID;
    javax.swing.JRadioButton project;
    private javax.swing.JButton return_bt;
    // End of variables declaration//GEN-END:variables
}
