/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

/**
 *
 * @author vinicius
 */
@Entity
public class Produto_Pedido {
    private Integer qtd;
    
    @EmbeddedId
//    @Transient
    private Produto_PedidoPK chComposta;
}
