/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

/**
 *
 * @author Dener
 */
public class GUIPuzzle extends javax.swing.JPanel {

    /**
     * Creates new form GUIPuzzle
     */
    public GUIPuzzle() {
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
        labelUm = new javax.swing.JLabel();
        labelDois = new javax.swing.JLabel();
        labelTres = new javax.swing.JLabel();
        labelQuatro = new javax.swing.JLabel();
        labelCinco = new javax.swing.JLabel();
        labelSeis = new javax.swing.JLabel();
        labelSete = new javax.swing.JLabel();
        labelOito = new javax.swing.JLabel();
        labelVazio = new javax.swing.JLabel();
        buttonRandom = new javax.swing.JButton();
        buttonBFS = new javax.swing.JButton();
        buttonAasterisco1 = new javax.swing.JButton();
        buttonAasterisco2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        labelUm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelUm.setForeground(new java.awt.Color(204, 0, 0));
        labelUm.setText("1");

        labelDois.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDois.setForeground(new java.awt.Color(204, 0, 0));
        labelDois.setText("2");

        labelTres.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTres.setForeground(new java.awt.Color(204, 0, 0));
        labelTres.setText("3");

        labelQuatro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelQuatro.setForeground(new java.awt.Color(204, 0, 0));
        labelQuatro.setText("4");

        labelCinco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCinco.setForeground(new java.awt.Color(204, 0, 0));
        labelCinco.setText("5");

        labelSeis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSeis.setForeground(new java.awt.Color(204, 0, 0));
        labelSeis.setText("6");

        labelSete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSete.setForeground(new java.awt.Color(204, 0, 0));
        labelSete.setText("7");

        labelOito.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelOito.setForeground(new java.awt.Color(204, 0, 0));
        labelOito.setText("8");

        labelVazio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelVazio.setForeground(new java.awt.Color(204, 0, 0));
        labelVazio.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSete)
                    .addComponent(labelQuatro)
                    .addComponent(labelUm))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDois)
                    .addComponent(labelCinco)
                    .addComponent(labelOito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelVazio)
                    .addComponent(labelSeis)
                    .addComponent(labelTres))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTres)
                    .addComponent(labelDois)
                    .addComponent(labelUm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuatro)
                    .addComponent(labelCinco)
                    .addComponent(labelSeis))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSete)
                    .addComponent(labelVazio)
                    .addComponent(labelOito))
                .addGap(43, 43, 43))
        );

        buttonRandom.setText("Random");

        buttonBFS.setText("BFS");

        buttonAasterisco1.setText("A* 1");

        buttonAasterisco2.setText("A* 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonRandom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonBFS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAasterisco1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAasterisco2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRandom)
                    .addComponent(buttonBFS)
                    .addComponent(buttonAasterisco1)
                    .addComponent(buttonAasterisco2))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAasterisco1;
    private javax.swing.JButton buttonAasterisco2;
    private javax.swing.JButton buttonBFS;
    private javax.swing.JButton buttonRandom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCinco;
    private javax.swing.JLabel labelDois;
    private javax.swing.JLabel labelOito;
    private javax.swing.JLabel labelQuatro;
    private javax.swing.JLabel labelSeis;
    private javax.swing.JLabel labelSete;
    private javax.swing.JLabel labelTres;
    private javax.swing.JLabel labelUm;
    private javax.swing.JLabel labelVazio;
    // End of variables declaration//GEN-END:variables
}
