package controller;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import domain.Produto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1547816
 */
public class ProdutoAbstractTableModel extends AbstractTableModel {

    private List<Produto> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
        

    // Títulos das colunas
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Descrição", "Preço"};        
        return nomesColunas[column];        
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Produto item = listaItens.get(rowIndex);
            
            switch (columnIndex) {
                case 0: return item.getDescricao();
                case 1: return item.getPreco();
                default: return null;
            }
        } catch (Exception ex) {
            Logger.getLogger(ProdutoAbstractTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void adicionar (Produto item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
        
    }
    
    public void remover (int indice) {        
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }

    public Produto getProduto(int linha) {
        return listaItens.get(linha);
    }
    
    public void setLista(List<Produto> novaLista) {
        
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
