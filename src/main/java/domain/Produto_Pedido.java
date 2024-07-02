/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

/**
 *
 * @author vinicius
 */
@Entity
public class Produto_Pedido {
    private Integer qtd;
    
    @EmbeddedId
    private Produto_PedidoPK chComposta;

    public Produto_Pedido(Integer qtd, Pedido pedido, Produto produto) {
        this.qtd = qtd;
        this.chComposta = new Produto_PedidoPK(pedido, produto);
    }

    public Produto_Pedido() {
    }

    public Integer getQtd() {
        return qtd;

    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Produto_PedidoPK getChComposta() {
        return chComposta;
    }

    public void setChComposta(Produto_PedidoPK chComposta) {
        this.chComposta = chComposta;
    }
    
    public void setPedido(Pedido ped){
        chComposta.setPedido(ped);
    }
    
}
