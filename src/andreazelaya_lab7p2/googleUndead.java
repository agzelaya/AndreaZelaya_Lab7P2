package andreazelaya_lab7p2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author andgz
 */
public class googleUndead extends javax.swing.JFrame {

    /**
     * Creates new form googleUndead
     */
    public googleUndead() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarArchivo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jt_size = new javax.swing.JTextField();
        jt_nombreArchivo = new javax.swing.JTextField();
        jb_agregarArchivo = new javax.swing.JButton();
        jc_extension = new javax.swing.JComboBox<>();
        agregarCarpeta = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jt_nombreCarpeta = new javax.swing.JTextField();
        jb_agregarCarpeta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Extension");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tamaño");

        jb_agregarArchivo.setText("Agregar");
        jb_agregarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarArchivoActionPerformed(evt);
            }
        });

        jc_extension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".txt", ".mp4", ".png", ".pdf", ".gif", ".docx" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_agregarArchivo)
                    .addComponent(jt_nombreArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jt_size, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jc_extension, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jt_nombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jc_extension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jb_agregarArchivo)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout agregarArchivoLayout = new javax.swing.GroupLayout(agregarArchivo.getContentPane());
        agregarArchivo.getContentPane().setLayout(agregarArchivoLayout);
        agregarArchivoLayout.setHorizontalGroup(
            agregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        agregarArchivoLayout.setVerticalGroup(
            agregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre");

        jb_agregarCarpeta.setText("Agregar");
        jb_agregarCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarCarpetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_agregarCarpeta)
                    .addComponent(jt_nombreCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jt_nombreCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jb_agregarCarpeta)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout agregarCarpetaLayout = new javax.swing.GroupLayout(agregarCarpeta.getContentPane());
        agregarCarpeta.getContentPane().setLayout(agregarCarpetaLayout);
        agregarCarpetaLayout.setHorizontalGroup(
            agregarCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        agregarCarpetaLayout.setVerticalGroup(
            agregarCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jScrollPane1.setViewportView(jTree1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mi Unidad", "Destacados", "Papelera" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setToolTipText("");
        jScrollPane2.setViewportView(jList1);

        jButton1.setText("Agregar Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar Carpeta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jButton1)
                .addGap(79, 79, 79)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregarArchivo.setModal(true);
        agregarArchivo.pack();
        agregarArchivo.setLocationRelativeTo(this);
        agregarArchivo.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb_agregarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarArchivoActionPerformed
        String nombre = jt_nombreArchivo.getText();
        String extension = String.valueOf(jc_extension.getSelectedItem());
        String link = "dive.google.com/" + linkArchivo();
        double size = Integer.parseInt(jt_size.getText());
        boolean done = false;
        do {

            boolean repeats = false;

            for (Archivo a : listArchivos) {
                if (a.getLink().equals(link)) {
                    repeats = true;
                }
            }

            if (!repeats) {
                Archivo a = new Archivo(nombre, link, extension, size);
                listArchivos.add(a);
                System.out.println(listArchivos);
                done = true;
            }
        } while (!done);

        jt_nombreArchivo.setText("");
        jt_size.setText("");
    }//GEN-LAST:event_jb_agregarArchivoActionPerformed

    private void jb_agregarCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarCarpetaActionPerformed
        String nombre = jt_nombreCarpeta.getText();
        String link = "dive.google.com/" + linkCarpeta();
        
        boolean done = false;
        do {

            boolean repeats = false;

            for (Carpeta c : listCarpetas) {
                if (c.getLink().equals(link)) {
                    repeats = true;
                }
            }

            if (!repeats) {
                Carpeta c = new Carpeta(nombre, link);
                listCarpetas.add(c);
                done = true;
            }
        } while (!done);
        
        jt_nombreCarpeta.setText("");
    }//GEN-LAST:event_jb_agregarCarpetaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        agregarCarpeta.setModal(true);
        agregarCarpeta.pack();
        agregarCarpeta.setLocationRelativeTo(this);
        agregarCarpeta.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(googleUndead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(googleUndead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(googleUndead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(googleUndead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new googleUndead().setVisible(true);

            }
        });
    }

    public String linkArchivo() {
        String link = "";

        for (int i = 0; i < 10; i++) {
            int numOchar = 1 + random.nextInt(2);
            if (numOchar == 1) {
                link += 1 + random.nextInt(9);
            } else {
                int ascii = 65 + random.nextInt(26);
                char letra = ((char) ascii);

                int mayOmin = 1 + random.nextInt(2);
                if (mayOmin == 1) {
                    String letra2 = String.valueOf(letra).toLowerCase();
                    link += letra2;
                } else {
                    link += letra;
                }
            }
        }

        return link;
    }

    public String linkCarpeta() {
        String link = "";

        for (int i = 0; i < 5; i++) {
            int numOchar = 1 + random.nextInt(2);
            if (numOchar == 1) {
                link += 1 + random.nextInt(9);
            } else {
                int ascii = 65 + random.nextInt(26);
                char letra = ((char) ascii);

                int mayOmin = 1 + random.nextInt(2);
                if (mayOmin == 1) {
                    String letra2 = String.valueOf(letra).toLowerCase();
                    link += letra2;
                } else {
                    link += letra;
                }
            }
        }

        return link;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog agregarArchivo;
    private javax.swing.JDialog agregarCarpeta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton jb_agregarArchivo;
    private javax.swing.JButton jb_agregarCarpeta;
    private javax.swing.JComboBox<String> jc_extension;
    private javax.swing.JTextField jt_nombreArchivo;
    private javax.swing.JTextField jt_nombreCarpeta;
    private javax.swing.JTextField jt_size;
    // End of variables declaration//GEN-END:variables

    ArrayList<Archivo> listArchivos = new ArrayList();
    ArrayList<Carpeta> listCarpetas = new ArrayList();
    Random random = new Random();
}