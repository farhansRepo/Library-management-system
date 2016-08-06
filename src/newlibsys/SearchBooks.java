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
public class SearchBooks extends javax.swing.JPanel {

    /**
     * Creates new form SearchBooks
     */
    public SearchBooks() {
        initComponents();
         ButtonGroup group =new ButtonGroup();
          
        group.add(book);
        group.add(project);
        book.setSelected(true);
        search.addActionListener(new SearchBookAction());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sBooks_lbl = new javax.swing.JLabel();
        bookName = new javax.swing.JTextField();
        name_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchBook_tb = new javax.swing.JTable();
        search = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        project = new javax.swing.JRadioButton();
        book = new javax.swing.JRadioButton();

        sBooks_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sBooks_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sBooks_lbl.setText("Search Books");

        bookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameActionPerformed(evt);
            }
        });

        name_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        name_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_lbl.setText("Book/Author Name");

        searchBook_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(searchBook_tb);

        search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        search.setText("Search");

        clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear.setText("Clear");

        project.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        project.setText("Project");

        book.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        book.setText("Book");
        book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(sBooks_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(project, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(name_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sBooks_lbl)
                        .addComponent(book))
                    .addComponent(project))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_lbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameActionPerformed
        // TODO add your handling code here:
        new SearchBookAction().actionPerformed(evt);
    }//GEN-LAST:event_bookNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JRadioButton book;
    javax.swing.JTextField bookName;
    javax.swing.JButton clear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name_lbl;
    javax.swing.JRadioButton project;
    private javax.swing.JLabel sBooks_lbl;
    private javax.swing.JButton search;
    javax.swing.JTable searchBook_tb;
    // End of variables declaration//GEN-END:variables
}
