/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoHibernate;
import dao.GenericDAO;
import domain.Cliente;
import domain.Pedido;
import domain.Produto_Pedido;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vinicius
 */
public class DomainControlador {
    private GenericDAO genDao;


    public DomainControlador() throws ClassNotFoundException, SQLException {
        ConexaoHibernate.getSessionFactory().openSession();
        genDao = new GenericDAO();

    }
    
    public void inserir(Object obj){
       genDao.inserir(obj);
    }
    
    public List listar(Class classe){
        return genDao.listar(classe);
    }

     public int inserirPedido(Cliente cli, List<Produto_Pedido> listaItens) {
        Pedido ped = new Pedido(0.0, new Date(), cli, listaItens);
        ped.calcularValorTotal();
        genDao.inserir(ped);
        
        for(Produto_Pedido item : listaItens){
            genDao.inserir(item);
        }
        
        return ped.getId();             
     }
     
     public void excluir(Object obj){
        genDao.excluir(obj);
     }
}
