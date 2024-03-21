/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package controller;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import view.CadastrarCliente;
import view.CadastrarProduto;
import view.Principal;

public class ViewController {
    
    private Principal principal = null;
    private CadastrarCliente cadCli = null;
    private CadastrarProduto cadprod = null;
    
//    Singleton
    private static ViewController myInstance = new ViewController();
    
    private ViewController(){
        
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

    public static void main(String[] args) {
        getMyInstance().abrirJanelaPrincipal();
    }
}
