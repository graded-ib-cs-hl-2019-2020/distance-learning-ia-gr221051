/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author novac
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        plusDiceBtn = new javax.swing.JButton();
        diceLabel = new javax.swing.JLabel();
        sideLabel = new javax.swing.JLabel();
        minusDiceBtn = new javax.swing.JButton();
        plusSideBtn = new javax.swing.JButton();
        minusSideBtn = new javax.swing.JButton();
        resultBtn = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        diceCount = new javax.swing.JLabel();
        sideCount = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        answerBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plusDiceBtn.setText("+");
        plusDiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusDiceBtnActionPerformed(evt);
            }
        });

        diceLabel.setText("# of Dice:");

        sideLabel.setText("# of Sides:");

        minusDiceBtn.setText("-");
        minusDiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusDiceBtnActionPerformed(evt);
            }
        });

        plusSideBtn.setText("+");
        plusSideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusSideBtnActionPerformed(evt);
            }
        });

        minusSideBtn.setText("-");
        minusSideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusSideBtnActionPerformed(evt);
            }
        });

        resultBtn.setText("Roll!");
        resultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultBtnActionPerformed(evt);
            }
        });

        resultLabel.setText("Result:");

        diceCount.setText("0");

        sideCount.setText("0");

        answerBox.setColumns(20);
        answerBox.setRows(5);
        jScrollPane2.setViewportView(answerBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(resultLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(diceCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minusDiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(diceLabel)
                        .addGap(18, 18, 18)
                        .addComponent(plusDiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sideLabel)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sideCount)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minusSideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusSideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plusDiceBtn)
                            .addComponent(plusSideBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minusDiceBtn)
                            .addComponent(minusSideBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sideLabel)
                            .addComponent(diceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diceCount)
                            .addComponent(sideCount))))
                .addGap(66, 66, 66)
                .addComponent(resultBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultLabel)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plusDiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusDiceBtnActionPerformed
        Main.moreDice();
    }//GEN-LAST:event_plusDiceBtnActionPerformed

    private void minusDiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusDiceBtnActionPerformed
        Main.lessDice();
    }//GEN-LAST:event_minusDiceBtnActionPerformed

    private void plusSideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusSideBtnActionPerformed
        Main.moreSides();
    }//GEN-LAST:event_plusSideBtnActionPerformed

    private void minusSideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusSideBtnActionPerformed
        Main.lessSides();
    }//GEN-LAST:event_minusSideBtnActionPerformed

    private void resultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultBtnActionPerformed
        Main.displayResult();
    }//GEN-LAST:event_resultBtnActionPerformed

    void setDiceCount(String string) {
        diceCount.setText(string);
    }

    void setSideCount(String string) {
        sideCount.setText(string);
    }
    void setResultBox(String string) {
        answerBox.setText(string);
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answerBox;
    private javax.swing.JLabel diceCount;
    private javax.swing.JLabel diceLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton minusDiceBtn;
    private javax.swing.JButton minusSideBtn;
    private javax.swing.JButton plusDiceBtn;
    private javax.swing.JButton plusSideBtn;
    private javax.swing.JButton resultBtn;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel sideCount;
    private javax.swing.JLabel sideLabel;
    // End of variables declaration//GEN-END:variables


}
