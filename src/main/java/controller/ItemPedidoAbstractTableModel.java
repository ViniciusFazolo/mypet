package controller;


import domain.Produto_Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1547816
 */
public class ItemPedidoAbstractTableModel extends AbstractTableModel {

    private List<Produto_Pedido> listaItens = new ArrayList();

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
        String nomesColunas[] = {"Produto/Serviço", "Preço", "Qtde"};
        
        return nomesColunas[column];
        
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto_Pedido item = listaItens.get(rowIndex);

        switch (columnIndex) {
            case 0: return item.getChComposta().getProduto();
            case 1: return item.getChComposta().getProduto().getPreco();
            case 2: return item.getQtd();
            default: return null;
        }

    }
    
    public Produto_Pedido getItem (int rowIndex) {
        return listaItens.get(rowIndex);        
    }
    
    public void adicionar (Produto_Pedido item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
        
    }
    
    public void remover (int indice) {
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }
    
    public void setLista(List<Produto_Pedido> novaLista) {
        if ( novaLista == null) {
            listaItens.clear();
            fireTableRowsDeleted( 0, 0 );
        } else {
            listaItens = novaLista;
            fireTableRowsUpdated(0, listaItens.size() - 1);
        }
        
    }
    
    public List<Produto_Pedido> getLista() {
        return listaItens;
    }
        
}
