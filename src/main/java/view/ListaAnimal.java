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
public class ListaAnimal extends ListarDefault{
    
    public ListaAnimal(Frame parent, boolean modal) {
        super(parent, modal);
        
        setTitle("MyPet - Listar Animais");
        
        tableListagem.getColumnModel().getColumn(0).setHeaderValue("Nome");
        tableListagem.getColumnModel().getColumn(1).setHeaderValue("Registro");
        tableListagem.getColumnModel().getColumn(2).setHeaderValue("Dono");
        tableListagem.getColumnModel().getColumn(3).setHeaderValue("Raça");
    }
    
}
