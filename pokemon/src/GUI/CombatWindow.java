package GUI;

import Exception.pokemonDieException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.SwingUtilities;
import model.bd.LoadAttack;
import model.bd.LoadPokemon;
import model.clases.Attack;
import model.clases.Pokemon;
import pokemon.main;

public class CombatWindow extends javax.swing.JFrame {
        SelectPokemonWindow spw = new SelectPokemonWindow();
        
    public CombatWindow() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        friendImg = new javax.swing.JLabel();
        friendId = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jlLog = new javax.swing.JLabel();
        jbAttack1 = new javax.swing.JButton();
        jbAttack3 = new javax.swing.JButton();
        jbAttack4 = new javax.swing.JButton();
        jbAttack2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jlFriendName = new javax.swing.JLabel();
        jpbFriendHealth = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        jlEnemyAttack1 = new javax.swing.JLabel();
        jlEnemyAttack2 = new javax.swing.JLabel();
        jlEnemyAttack3 = new javax.swing.JLabel();
        jlEnemyAttack4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        enemyImg = new javax.swing.JLabel();
        enemyId = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlEnemyName = new javax.swing.JLabel();
        jpbEnemyHealth = new javax.swing.JProgressBar();
        jlBackground = new javax.swing.JLabel();
        jbChangePokemon = new javax.swing.JButton();
        jbReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpBackground.setBackground(new java.awt.Color(51, 153, 0));
        jpBackground.setOpaque(false);
        jpBackground.setLayout(null);

        jPanel5.setOpaque(false);

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(friendImg, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(friendImg, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jlLog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlLog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLog.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jlLog, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        jbAttack1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jbAttack1.setText("ataque1");
        jbAttack1.setOpaque(false);
        jbAttack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAttack1ActionPerformed(evt);
            }
        });

        jbAttack3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jbAttack3.setText("ataque3");
        jbAttack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAttack3ActionPerformed(evt);
            }
        });

        jbAttack4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jbAttack4.setText("ataque4");
        jbAttack4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAttack4ActionPerformed(evt);
            }
        });

        jbAttack2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jbAttack2.setText("ataque2");
        jbAttack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAttack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAttack1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jbAttack3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAttack2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jbAttack4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbAttack1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jbAttack2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbAttack3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jbAttack4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setOpaque(false);

        jlFriendName.setBackground(new java.awt.Color(153, 255, 153));
        jlFriendName.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 12)); // NOI18N
        jlFriendName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFriendName.setText("NOMBRE");
        jlFriendName.setToolTipText("");
        jlFriendName.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpbFriendHealth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFriendName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlFriendName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpbFriendHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(friendId)
                        .addContainerGap(390, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(friendId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpBackground.add(jPanel5);
        jPanel5.setBounds(10, 166, 400, 250);

        jPanel4.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(enemyImg, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enemyImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jlEnemyName.setBackground(new java.awt.Color(255, 153, 153));
        jlEnemyName.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 12)); // NOI18N
        jlEnemyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEnemyName.setText("NOMBRE");
        jlEnemyName.setToolTipText("");
        jlEnemyName.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlEnemyName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpbEnemyHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jlEnemyName, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpbEnemyHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enemyId)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jlEnemyAttack1)
                                .addGap(156, 156, 156)
                                .addComponent(jlEnemyAttack2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlEnemyAttack3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlEnemyAttack4))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEnemyAttack1)
                            .addComponent(jlEnemyAttack2)
                            .addComponent(jlEnemyAttack3)
                            .addComponent(jlEnemyAttack4))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(enemyId)
                .addContainerGap())
        );

        jpBackground.add(jPanel4);
        jPanel4.setBounds(10, 11, 400, 149);

        jlBackground.setBackground(new java.awt.Color(51, 153, 255));
        jpBackground.add(jlBackground);
        jlBackground.setBounds(10, 10, 400, 300);

        jbChangePokemon.setText("Cambiar Pokémon");
        jbChangePokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbChangePokemonActionPerformed(evt);
            }
        });
        jpBackground.add(jbChangePokemon);
        jbChangePokemon.setBounds(20, 420, 170, 20);

        jbReset.setText("exit");
        jbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResetActionPerformed(evt);
            }
        });
        jpBackground.add(jbReset);
        jbReset.setBounds(300, 420, 94, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
               showPokemon();
               spw.setCombatWindow(this);
               spw.setVisible(true);
               friendId.setText("cxs");
               
               BufferedImage img = null;
                ImageIcon ii = new ImageIcon(this.getClass().getResource("../pokemonImage/background/background.png"));
                ImageIcon yy = new ImageIcon(ii.getImage().getScaledInstance(jlBackground.getWidth(), jlBackground.getHeight(), WIDTH));

                jlBackground.setIcon(yy);
               
               
    }//GEN-LAST:event_formWindowOpened

    private void jbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResetActionPerformed
        try {
            // TODO add your handling code here:
            LoadPokemon.reset();
            this.dispose();
            System.exit(0);
        } catch (SQLException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbResetActionPerformed

    private void jbChangePokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChangePokemonActionPerformed
        // TODO add your handling code here:
        try {
            LoadPokemon.updateState(jlFriendName.getText(), jpbFriendHealth.getValue());
        } catch (SQLException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        spw.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbChangePokemonActionPerformed

    private void jbAttack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAttack2ActionPerformed
        try {
            attackAction(jbAttack2.getText());
        } catch (SQLException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAttack2ActionPerformed

    private void jbAttack4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAttack4ActionPerformed
        try {
            attackAction(jbAttack4.getText());
        } catch (SQLException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAttack4ActionPerformed

    private void jbAttack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAttack3ActionPerformed
        try {
            attackAction(jbAttack3.getText());
        } catch (SQLException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAttack3ActionPerformed

    private void jbAttack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAttack1ActionPerformed
        try {
            attackAction(jbAttack1.getText());
        } catch (SQLException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAttack1ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CombatWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CombatWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CombatWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CombatWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CombatWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enemyId;
    private javax.swing.JLabel enemyImg;
    private javax.swing.JLabel friendId;
    private javax.swing.JLabel friendImg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton jbAttack1;
    private javax.swing.JButton jbAttack2;
    private javax.swing.JButton jbAttack3;
    private javax.swing.JButton jbAttack4;
    private javax.swing.JButton jbChangePokemon;
    private javax.swing.JButton jbReset;
    private javax.swing.JLabel jlBackground;
    private javax.swing.JLabel jlEnemyAttack1;
    private javax.swing.JLabel jlEnemyAttack2;
    private javax.swing.JLabel jlEnemyAttack3;
    private javax.swing.JLabel jlEnemyAttack4;
    private javax.swing.JLabel jlEnemyName;
    private javax.swing.JLabel jlFriendName;
    private javax.swing.JLabel jlLog;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JProgressBar jpbEnemyHealth;
    private javax.swing.JProgressBar jpbFriendHealth;
    // End of variables declaration//GEN-END:variables

    public void showPokemon(){
       try {
                Pokemon pokemon = main.loadEnemy();
                if (pokemon != null){
                jlEnemyName.setText(pokemon.getName());
                jpbEnemyHealth.setValue(pokemon.getLife());
                enemyId.setText(pokemon.getId());
                enemyId.setVisible(false);

                BufferedImage img = null;
                ImageIcon ii = new ImageIcon(this.getClass().getResource("../pokemonImage/front/stop/"+pokemon.getId()+".gif"));
                ImageIcon yy = new ImageIcon(ii.getImage().getScaledInstance(90, 90, WIDTH));
                
                enemyImg.setIcon(yy);

                jlEnemyAttack1.setVisible(false);jlEnemyAttack2.setVisible(false);jlEnemyAttack3.setVisible(false);jlEnemyAttack4.setVisible(false);
                Attack at = (Attack) pokemon.getAttacks().get(0);
                jlEnemyAttack1.setText(at.getName());
                at = (Attack) pokemon.getAttacks().get(1);
                jlEnemyAttack2.setText(at.getName());
                at = (Attack) pokemon.getAttacks().get(2);
                jlEnemyAttack3.setText(at.getName());
                at = (Attack) pokemon.getAttacks().get(3);
                jlEnemyAttack4.setText(at.getName());
            }else{
                    new VictoryWd().setVisible(true);
                    this.dispose();
                }
        } catch (SQLException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
  }  
    
    public void loadFriendPokemon(int selected) throws SQLException, ClassNotFoundException{
            jlLog.setText("<html>¿Qué usarás?</html>");
            Pokemon pokemon = main.loadFriend(selected);
            jlFriendName.setText(pokemon.getName());
            jpbFriendHealth.setValue(pokemon.getLife());
            friendId.setText(pokemon.getId());
            friendId.setVisible(false);
            BufferedImage img = null;
            ImageIcon ii = new ImageIcon(this.getClass().getResource("../pokemonImage/back/stop/"+pokemon.getId()+".gif"));
            ImageIcon yy = new ImageIcon(ii.getImage().getScaledInstance(100, 100, WIDTH));
            friendImg.setIcon(yy);

            Attack attack = (Attack) pokemon.getAttacks().get(0);
            jbAttack1.setText(attack.getName());
            attack = (Attack) pokemon.getAttacks().get(1);
            jbAttack2.setText(attack.getName());
            attack = (Attack) pokemon.getAttacks().get(2);
            jbAttack3.setText(attack.getName());
            attack = (Attack) pokemon.getAttacks().get(3);;
            jbAttack4.setText(attack.getName());
}
    
    public void attackAction(String attackName) throws SQLException, ClassNotFoundException{
            friendAttack(attackName);
    }
    
    public void friendAttack(String attackName) throws SQLException, ClassNotFoundException{
        ImageIcon ii = new ImageIcon(this.getClass().getResource("../pokemonImage/back/stop/"+friendId.getText()+".gif"));
        ImageIcon yy = new ImageIcon(ii.getImage().getScaledInstance(110, 110, WIDTH));
        friendImg.setIcon(yy);
        
        jpbEnemyHealth.setValue(jpbEnemyHealth.getValue() - LoadAttack.loadFriendAttack(attackName));
        jlLog.setText("<html>"+jlFriendName.getText()+ " usó "+attackName+"</html>");
        this.update(this.getGraphics());
        main.animationTime(0);
        
    }
    
    public void enemyAttack(){
        try{
            String attackName="";
            if (jpbEnemyHealth.getValue()==0) {
                        throw new pokemonDieException();
                    }else{
                        int randomNum = (int) (Math.random()*4+1);
                        switch(randomNum){
                            case 1: attackName=jlEnemyAttack1.getText();
                                       break; 
                            case 2: attackName=jlEnemyAttack2.getText();
                                       break; 
                            case 3: attackName=jlEnemyAttack3.getText();
                                       break; 
                            case 4: attackName=jlEnemyAttack4.getText();
                                       break; 
                        }
                    }

                ImageIcon uu = new ImageIcon(this.getClass().getResource("../pokemonImage/front/attack/"+enemyId.getText()+".gif"));
                ImageIcon ee = new ImageIcon(uu.getImage().getScaledInstance(100, 100, WIDTH));
                enemyImg.setIcon(ee);
                jpbFriendHealth.setValue(jpbFriendHealth.getValue() - LoadAttack.loadFriendAttack(attackName));
                jlLog.setText("<html>E. "+jlEnemyName.getText()+" usó "+attackName+"</html>");
                this.update(this.getGraphics());
                main.animationTime(1);
                checkLife();
        } catch (pokemonDieException e){
                showPokemon();
                jlLog.setText("<html>Tu contrincante ha elegido a "+jlEnemyName.getText()+"</html>");
        } catch (SQLException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CombatWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void checkLife() throws SQLException, ClassNotFoundException{
    if (jpbFriendHealth.getValue()==0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Tu Pokémon ha sido debilitado");
            LoadPokemon.updateState(jlFriendName.getText(), jpbFriendHealth.getValue());
            spw.setVisible(true);
    }
    
    if (jpbEnemyHealth.getValue()==0) {
            javax.swing.JOptionPane.showMessageDialog(this, "El enemigo ha sido debilitado");
        }
    }
    
    public void endAnimation(int seconds, int friendAnimate) {
        if(seconds == 0){
            if (friendAnimate == 0) {
                ImageIcon ii = new ImageIcon(this.getClass().getResource("../pokemonImage/back/stop/"+friendId.getText()+".gif"));
                ImageIcon yy = new ImageIcon(ii.getImage().getScaledInstance(100, 100, WIDTH));
                friendImg.setIcon(yy);
                enemyAttack();
            }else if(friendAnimate == 1){
                ImageIcon ii = new ImageIcon(this.getClass().getResource("../pokemonImage/front/stop/"+enemyId.getText()+".gif"));
                ImageIcon yy = new ImageIcon(ii.getImage().getScaledInstance(90, 90, WIDTH));
                enemyImg.setIcon(yy);
                jlLog.setText("<html>¿Qué usarás?</html>");
                }else{
                    main.animationTime(1);
                }
        }
    }
    
}
