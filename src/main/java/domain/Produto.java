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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import java.util.List;

/**
 *
 * @author vinicius
 */
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 100)
    private String nome;
    
    @Column(precision = 2)
    private Double preco;
    
    private Integer estoqueInicial;
    private Integer estoqueMaximo;
    
    @Column(length = 100)
    private String descricao;
    
    private Boolean ehServico;
    
    @OneToMany(mappedBy = "chComposta.produto", fetch = FetchType.LAZY)
    private List<Produto_Pedido> itensPedido;
    
}
