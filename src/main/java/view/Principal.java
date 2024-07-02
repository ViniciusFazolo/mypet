/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ViewControlador;
import domain.Cliente;
import javax.swing.JFrame;

/**
 *
 * @author vinicius
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form teste
     */
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        cadastrarCliente = new javax.swing.JMenuItem();
        listarCliente = new javax.swing.JMenuItem();
        realizarVenda = new javax.swing.JMenuItem();
        menuProduto = new javax.swing.JMenu();
        cadastrarProduto = new javax.swing.JMenuItem();
        listarProduto = new javax.swing.JMenuItem();
        menuAnimal = new javax.swing.JMenu();
        cadastrarAnimal = new javax.swing.JMenuItem();
        listarAnimal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyPet - Página Inicial");

        painelPrincipal.setBackground(new java.awt.Color(50, 175, 181));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_size_invert.jpg"))); // NOI18N

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(310, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        menuCliente.setMnemonic('c');
        menuCliente.setText("Cliente");
        menuCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cadastrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        cadastrarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrarcliente.png"))); // NOI18N
        cadastrarCliente.setText("Cadastrar Cliente");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(cadastrarCliente);

        listarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar.png"))); // NOI18N
        listarCliente.setText("Listar Clientes");
        listarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(listarCliente);

        realizarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK));
        realizarVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        realizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/venda.png"))); // NOI18N
        realizarVenda.setText("Realizar Venda");
        realizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarVendaActionPerformed(evt);
            }
        });
        menuCliente.add(realizarVenda);

        menu.add(menuCliente);

        menuProduto.setMnemonic('p');
        menuProduto.setText("Produto");
        menuProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cadastrarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        cadastrarProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto.png"))); // NOI18N
        cadastrarProduto.setText("Cadastrar Produto");
        cadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(cadastrarProduto);

        listarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listarProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar.png"))); // NOI18N
        listarProduto.setText("Listar Produtos");
        listarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(listarProduto);

        menu.add(menuProduto);

        menuAnimal.setMnemonic('a');
        menuAnimal.setText("Animal");
        menuAnimal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cadastrarAnimal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        cadastrarAnimal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastrarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cachorro.png"))); // NOI18N
        cadastrarAnimal.setText("Cadastrar Animal");
        cadastrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAnimalActionPerformed(evt);
            }
        });
        menuAnimal.add(cadastrarAnimal);

        listarAnimal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listarAnimal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar.png"))); // NOI18N
        listarAnimal.setText("Listar Animais");
        listarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarAnimalActionPerformed(evt);
            }
        });
        menuAnimal.add(listarAnimal);

        menu.add(menuAnimal);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        ViewControlador.getMyInstance().abrirCadCliente();
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void cadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutoActionPerformed
        ViewControlador.getMyInstance().abrirCadProduto();
    }//GEN-LAST:event_cadastrarProdutoActionPerformed

    private void cadastrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAnimalActionPerformed
        ViewControlador.getMyInstance().abrirCadAnimal();
    }//GEN-LAST:event_cadastrarAnimalActionPerformed

    private void realizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarVendaActionPerformed
        ViewControlador.getMyInstance().realizarVenda();
    }//GEN-LAST:event_realizarVendaActionPerformed

    private void listarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarAnimalActionPerformed
        ViewControlador.getMyInstance().abrirListaAnimal();
    }//GEN-LAST:event_listarAnimalActionPerformed

    private void listarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProdutoActionPerformed
        ViewControlador.getMyInstance().abrirListaProduto();
    }//GEN-LAST:event_listarProdutoActionPerformed

    private void listarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarClienteActionPerformed
        ViewControlador.getMyInstance().abrirListaPessoa();
    }//GEN-LAST:event_listarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarAnimal;
    private javax.swing.JMenuItem cadastrarCliente;
    private javax.swing.JMenuItem cadastrarProduto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem listarAnimal;
    private javax.swing.JMenuItem listarCliente;
    private javax.swing.JMenuItem listarProduto;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAnimal;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JMenuItem realizarVenda;
    // End of variables declaration//GEN-END:variables
}
