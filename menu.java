
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dilber Taştan
 */
public class menu extends javax.swing.JFrame {

    
   
    
    Color varsayılanrenk;
    Color tıklananrenk;
    
    public menu() {
        initComponents();
        startTimer();

    
    
    
    varsayılanrenk=new Color(153, 153, 153);
       tıklananrenk=new Color(255, 204, 204);
        
        
        sohbet.setBackground(varsayılanrenk);
         kelime.setBackground(varsayılanrenk);
          ayarlar.setBackground(varsayılanrenk);
    }
  private void  startTimer() {
       
        Timer timer = new Timer(30000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayWarningMessage();
            }
        });
        timer.start();

    }

    private void displayWarningMessage() {
        Object[] nesne={"evet","hayır"};
         //Object[] nesne' dizisi kullanıcıya diyalog kutusunda sunulan seçenekleri tanımlamak için kullanılır
  int secim= JOptionPane.showOptionDialog(null,"30 saniye doldu çıkmak istediğinize  emin misiniz?"
                , "emin misiniz ?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, nesne, null);
      
        
       
 
        if (secim ==JOptionPane.YES_OPTION) {
            System.exit(0);
            
        }else if (secim==JOptionPane.NO_OPTION) {
            
        }
               
                

        

    

}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        menuname = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        sohbet = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        kelime = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ayarlar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204,230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabel7.setText(" TALK TO ME");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 176, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        menuname.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        menuname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu (6) (1).png"))); // NOI18N
        menuname.setText("MENU 1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(menuname, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton6.setText("X");
        jButton6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 50, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 90));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        sohbet.setBackground(new java.awt.Color(153, 153, 153,210));
        sohbet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sohbetMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sohbetMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu (6) (1).png"))); // NOI18N
        jLabel3.setText("SOHBET");
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout sohbetLayout = new javax.swing.GroupLayout(sohbet);
        sohbet.setLayout(sohbetLayout);
        sohbetLayout.setHorizontalGroup(
            sohbetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sohbetLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        sohbetLayout.setVerticalGroup(
            sohbetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        kelime.setBackground(new java.awt.Color(153, 153, 153,210));
        kelime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kelimeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kelimeMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu (6) (1).png"))); // NOI18N
        jLabel4.setText("KELİME");

        javax.swing.GroupLayout kelimeLayout = new javax.swing.GroupLayout(kelime);
        kelime.setLayout(kelimeLayout);
        kelimeLayout.setHorizontalGroup(
            kelimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kelimeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kelimeLayout.setVerticalGroup(
            kelimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kelimeLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ayarlar.setBackground(new java.awt.Color(153, 153, 153,210));
        ayarlar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayarlarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ayarlarMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu (6) (1).png"))); // NOI18N
        jLabel5.setText("AYARLAR");

        javax.swing.GroupLayout ayarlarLayout = new javax.swing.GroupLayout(ayarlar);
        ayarlar.setLayout(ayarlarLayout);
        ayarlarLayout.setHorizontalGroup(
            ayarlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ayarlarLayout.setVerticalGroup(
            ayarlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kelime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sohbet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(sohbet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(kelime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(ayarlar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 510));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplan (1).jpg"))); // NOI18N
        jLabel10.setText("jLabel10");

        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 850, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1070, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sohbetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sohbetMousePressed
      sohbet.setBackground(tıklananrenk);
         kelime.setBackground(varsayılanrenk);
          ayarlar.setBackground(varsayılanrenk);
          
           menuname.setText(" SOHBET");
    }//GEN-LAST:event_sohbetMousePressed

    private void kelimeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kelimeMousePressed
        // TODO add your handling code here:
        sohbet.setBackground(varsayılanrenk);
         kelime.setBackground(tıklananrenk);
          ayarlar.setBackground(varsayılanrenk);
          
           menuname.setText("KELİME");
    }//GEN-LAST:event_kelimeMousePressed

    private void ayarlarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayarlarMousePressed
        sohbet.setBackground(varsayılanrenk);
         kelime.setBackground(varsayılanrenk);
          ayarlar.setBackground(tıklananrenk);
       
           menuname.setText("DİNLEME");
    }//GEN-LAST:event_ayarlarMousePressed

    private void sohbetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sohbetMouseClicked
        menu1 menu1= new menu1();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(menu1).setVisible(true);
    }//GEN-LAST:event_sohbetMouseClicked

    private void kelimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kelimeMouseClicked
        menu2 menu2= new menu2();
        jDesktopPane1.removeAll();
        //removeAll()`, tüm bileşenleri `jDesktopPane1` kaldırmak için kullanılan bir yöntemdir.
        //Tüm bileşenleri kaldırdıktan sonra, 'menu2'nin yeni bir örneği oluşturulur
        jDesktopPane1.add(menu2).setVisible(true);
    }//GEN-LAST:event_kelimeMouseClicked

    private void ayarlarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayarlarMouseClicked
     menu3 menu3= new menu3();
       jDesktopPane1.removeAll();
        jDesktopPane1.add(menu3).setVisible(true);
    }//GEN-LAST:event_ayarlarMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        Object[] nesne={"evet","hayır"};
        //Object[] nesne' dizisi kullanıcıya diyalog kutusunda sunulan seçenekleri tanımlamak için kullanılır
        int secim=JOptionPane.showOptionDialog(null,"çıkmak istediğinize  emin misiniz?"
                , "emin misiniz ?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, nesne, null);
        if (secim ==JOptionPane.YES_OPTION) {
            System.exit(0);
            
        }else if (secim==JOptionPane.NO_OPTION) {
            
        }
        
 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3AncestorAdded

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ayarlar;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel kelime;
    private javax.swing.JLabel menuname;
    private javax.swing.JPanel sohbet;
    // End of variables declaration//GEN-END:variables

    
    
}
