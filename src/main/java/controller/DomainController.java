/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoHibernate;
import java.sql.SQLException;

/**
 *
 * @author vinicius
 */
public class DomainController {

    public DomainController() throws ClassNotFoundException, SQLException {
        ConexaoHibernate.getSessionFactory().openSession();
    }
    
}
