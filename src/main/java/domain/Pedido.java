/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vinicius
 */
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(precision = 2)
    private Double valorTotal;
    
    @Temporal(TemporalType.DATE)
    private Date dataPedido;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    
    @OneToMany(mappedBy = "chComposta.pedido", fetch = FetchType.LAZY)
    private List<Produto_Pedido> itensPedido;

    public Pedido() {
    }

    public Pedido(Double valorTotal, Date dataPedido, Cliente cliente, List<Produto_Pedido> itensPedido) {
        this.valorTotal = valorTotal;
        this.dataPedido = dataPedido;
        this.cliente = cliente;
        this.itensPedido = itensPedido;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto_Pedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<Produto_Pedido> itensPedido) {
        this.itensPedido = itensPedido;
    }
    
    public double calcularValorTotal(){
        valorTotal = 0.0;
        
        for(Produto_Pedido item : itensPedido ) {
            double preco = item.getChComposta().getProduto().getPreco();
            int qtde = item.getQtd();
            valorTotal = valorTotal + qtde * preco;
            
            item.setPedido(this);
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", valorTotal=" + valorTotal + ", dataPedido=" + dataPedido + ", cliente=" + cliente + ", itensPedido=" + itensPedido + '}';
    }
    
    
    
}
