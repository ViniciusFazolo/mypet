/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

/**
 *
 * @author vinicius
 */
@Embeddable
public class Produto_PedidoPK {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPedido", nullable = false)
//    @Transient
    private Pedido pedido;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idProduto", nullable = false)
//    @Transient
    private Produto produto;
}
