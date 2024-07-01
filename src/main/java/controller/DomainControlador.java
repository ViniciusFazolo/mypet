/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoHibernate;
import dao.GenericDAO;
import java.sql.SQLException;
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

}
