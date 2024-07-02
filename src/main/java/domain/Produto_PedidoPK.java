/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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

    public Produto_PedidoPK() {
    }

    public Produto_PedidoPK(Pedido pedido, Produto produto) {
        this.pedido = pedido;
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
