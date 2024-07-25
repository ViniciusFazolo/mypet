package controller;


import domain.Animal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import domain.Cliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1547816
 */
public class AnimalAbstractTableModel extends AbstractTableModel {

    private List<Animal> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
        

    // Títulos das colunas
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Nome", "Registro", "Dono"};        
        return nomesColunas[column];        
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Animal item = listaItens.get(rowIndex);
            
            switch (columnIndex) {
                case 0: return item.getNome();
                case 1: return item.getRegistro();
                case 2: return item.getDono().getNome();
                default: return null;
            }
        } catch (Exception ex) {
            Logger.getLogger(AnimalAbstractTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void adicionar (Animal item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
        
    }
    
    public void remover (int indice) {        
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }

    public Animal getAnimal(int linha) {
        return listaItens.get(linha);
    }
    
    public void setLista(List<Animal> novaLista) {
        
        if ( novaLista.isEmpty()) {
            if ( !listaItens.isEmpty() ) {
                listaItens.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            listaItens = novaLista;
            fireTableRowsInserted( 0, listaItens.size() - 1);
        }
                
    }
        
}
