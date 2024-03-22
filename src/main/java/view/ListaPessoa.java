/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Frame;
/**
 *
 * @author vinicius
 */
public class ListaPessoa extends ListarDefault{
    
    public ListaPessoa(Frame parent, boolean modal) {
        super(parent, modal);
        
        setTitle("MyPet - Listar Pessoas");
        
        tableListagem.getColumnModel().getColumn(0).setHeaderValue("Nome");
        tableListagem.getColumnModel().getColumn(1).setHeaderValue("CPF");
        tableListagem.getColumnModel().getColumn(2).setHeaderValue("Celular");
        tableListagem.getColumnModel().getColumn(3).setHeaderValue("Email");
    }
    
}
