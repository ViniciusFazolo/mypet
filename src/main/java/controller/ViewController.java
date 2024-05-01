/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package controller;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import view.CadastrarAnimal;
import view.CadastrarCliente;
import view.CadastrarProduto;
import view.ListaAnimal;
import view.ListaPessoa;
import view.ListaProduto;
import view.Principal;
import view.RealizaPedido;

public class ViewController {
    
    private Principal principal = null;
    private CadastrarCliente cadCli = null;
    private CadastrarProduto cadprod = null;
    private CadastrarAnimal cadAnimal = null;
    private ListaPessoa listPessoa = null;
    private ListaAnimal listAnimal = null;
    private ListaProduto listProduto = null;
    private RealizaPedido realizaVenda = null;
    
//    Singleton
    private static ViewController myInstance = new ViewController();
    private DomainController gerdom;
    
    private ViewController(){
        try {
            gerdom = new DomainController();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(principal, "Erro de classe. " + ex.getMessage() );
            System.exit(0);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(principal, "Erro de SQL. " + ex.getMessage() );
            System.exit(0);
        }
    }
    
    public static ViewController getMyInstance(){
        return myInstance;
    }
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent,true);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() );
            } 
        }        
        dlg.setVisible(true); 
        return dlg;
    }
    
    public void abrirJanelaPrincipal() {
        if ( principal == null ) {
            principal = new Principal();
        }
        principal.setVisible(true);
    }
    
    public void abrirCadCliente() {
        cadCli = (CadastrarCliente) abrirJanela(principal, cadCli, CadastrarCliente.class  );
    }
    
    public void abrirCadProduto() {
        cadprod = (CadastrarProduto) abrirJanela(principal, cadprod, CadastrarProduto.class);
    }
    
    public void abrirCadAnimal() {
        cadAnimal = (CadastrarAnimal) abrirJanela(principal, cadAnimal, CadastrarAnimal.class);
    }
    
    public void abrirListaPessoa() {
        listPessoa = (ListaPessoa) abrirJanela(principal, listPessoa, ListaPessoa.class);
    }
    
    public void abrirListaAnimal() {
        listAnimal = (ListaAnimal) abrirJanela(principal, listAnimal, ListaAnimal.class);
    }
    
    public void abrirListaProduto() {
        listProduto = (ListaProduto) abrirJanela(principal, listProduto, ListaProduto.class);
    }
    
    public void realizarVenda() {
        realizaVenda = (RealizaPedido) abrirJanela(principal, realizaVenda, RealizaPedido.class);
    }

    public static void main(String[] args) {
        getMyInstance().abrirJanelaPrincipal();
    }
}
