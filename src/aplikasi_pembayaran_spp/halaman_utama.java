/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_pembayaran_spp;
import javax.swing.JOptionPane;

/**
 *
 * @author Sri
 */
public class halaman_utama extends javax.swing.JFrame {
private String level;
public void setLevel(String a){
        level=a;
         if(level.equals("admin")){ 
             
        }else if(level.equals("petugas")){
            mn_master.hide();
        }else if(level.equals("siswa")){
            mn_byr.hide();
            mn_master.hide();
        }else{
            JOptionPane.showMessageDialog(null, "Level tidak ditemukan!");
        }
    }
    /**
     * Creates new form halaman_utama
     */
    public halaman_utama() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_login = new javax.swing.JMenu();
        mn_logout = new javax.swing.JMenuItem();
        mn_master = new javax.swing.JMenu();
        mn_siswa = new javax.swing.JMenuItem();
        mn_kelas = new javax.swing.JMenuItem();
        mn_petugas = new javax.swing.JMenuItem();
        mn_spp = new javax.swing.JMenuItem();
        mn_tran = new javax.swing.JMenu();
        mn_byr = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_pembayaran_spp/spp.jpg"))); // NOI18N

        mn_login.setText("Login");
        mn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_loginActionPerformed(evt);
            }
        });

        mn_logout.setText("Logout");
        mn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_logoutActionPerformed(evt);
            }
        });
        mn_login.add(mn_logout);

        jMenuBar1.add(mn_login);

        mn_master.setText("Master Data");

        mn_siswa.setText("Data Siswa");
        mn_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_siswaActionPerformed(evt);
            }
        });
        mn_master.add(mn_siswa);

        mn_kelas.setText("Data Kelas");
        mn_kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_kelasActionPerformed(evt);
            }
        });
        mn_master.add(mn_kelas);

        mn_petugas.setText("Data Petugas");
        mn_petugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_petugasActionPerformed(evt);
            }
        });
        mn_master.add(mn_petugas);

        mn_spp.setText("Data SPP");
        mn_spp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_sppActionPerformed(evt);
            }
        });
        mn_master.add(mn_spp);

        jMenuBar1.add(mn_master);

        mn_tran.setText("Transaksi");

        mn_byr.setText("Pembayaran");
        mn_tran.add(mn_byr);

        jMenuItem7.setText("History Pembayaran");
        mn_tran.add(jMenuItem7);

        jMenuBar1.add(mn_tran);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(816, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mn_kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_kelasActionPerformed
        // TODO add your handling code here:
        frm_kelas kls=new frm_kelas();
            kls.show();
    }//GEN-LAST:event_mn_kelasActionPerformed

    private void mn_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_siswaActionPerformed
        // TODO add your handling code here:
        frm_siswa sis=new frm_siswa();
                sis.show();
    }//GEN-LAST:event_mn_siswaActionPerformed

    private void mn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_loginActionPerformed
        // TODO add your handling code here:
        login log=new login();
        log.show();
    }//GEN-LAST:event_mn_loginActionPerformed

    private void mn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        login log=new login();
        log.show();
    }//GEN-LAST:event_mn_logoutActionPerformed

    private void mn_petugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_petugasActionPerformed
        // TODO add your handling code here:
        frm_petugas pet=new frm_petugas();
        pet.show();
        
    }//GEN-LAST:event_mn_petugasActionPerformed

    private void mn_sppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_sppActionPerformed
        // TODO add your handling code here:
        frm_spp s=new frm_spp();
        s.show();
    }//GEN-LAST:event_mn_sppActionPerformed

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
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halaman_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem mn_byr;
    private javax.swing.JMenuItem mn_kelas;
    private javax.swing.JMenu mn_login;
    private javax.swing.JMenuItem mn_logout;
    private javax.swing.JMenu mn_master;
    private javax.swing.JMenuItem mn_petugas;
    private javax.swing.JMenuItem mn_siswa;
    private javax.swing.JMenuItem mn_spp;
    private javax.swing.JMenu mn_tran;
    // End of variables declaration//GEN-END:variables
}