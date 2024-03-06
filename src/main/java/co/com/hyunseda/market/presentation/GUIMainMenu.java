
package co.com.hyunseda.market.presentation;

import co.com.hyunseda.market.service.CategoryService;
import co.com.hyunseda.market.service.ProductService;

/**
 *
 * @author JUAN DAVID
 */
public class GUIMainMenu extends javax.swing.JFrame {

    private ProductService productService;
    private CategoryService categoryService;
    
    /**
     * Creates new form GUIMainMenu
     */
    public GUIMainMenu(ProductService productService,CategoryService categoryService) {
        initComponents();
        this.productService = productService;
        this.categoryService = categoryService;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainMenu = new javax.swing.JPanel();
        lblMainMenu = new javax.swing.JLabel();
        btnProducto = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        pnlCerrarMenu = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMainMenu.setLayout(new java.awt.GridLayout(4, 0));

        lblMainMenu.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblMainMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainMenu.setText("MENU PRINCIPAL");
        pnlMainMenu.add(lblMainMenu);

        btnProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProducto.setText("Producto");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        pnlMainMenu.add(btnProducto);

        btnCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCategoria.setText("Categoria");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        pnlMainMenu.add(btnCategoria);

        btnSalir.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlCerrarMenu.add(btnSalir);

        pnlMainMenu.add(pnlCerrarMenu);

        getContentPane().add(pnlMainMenu, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        GUIProductsMenu productsForm = new GUIProductsMenu(productService,categoryService);
        productsForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        GUIUserMen userForm = new GUIUserMen(productService, categoryService);
        userForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        GUICategory categoryForm = new GUICategory(categoryService);
        categoryForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JPanel pnlCerrarMenu;
    private javax.swing.JPanel pnlMainMenu;
    // End of variables declaration//GEN-END:variables
}
