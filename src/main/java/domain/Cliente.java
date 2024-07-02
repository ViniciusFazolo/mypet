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
import java.util.List;

/**
 *
 * @author vinicius
 */

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 100, nullable = false)
    private String nome;
    
    @Column(length = 20, unique = true, nullable = false)
    private String cpf;
    
    @Column(length = 100, nullable = false)
    private String email;
    
    @Column(length = 15, nullable = false)
    private String celular;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dono")
    private List<Animal> animal;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Pedido> pedidos;

    public Cliente(Integer id, String nome, String cpf, String email, String celular) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
    }

    public Cliente(String nome, String cpf, String email, String celular) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
    }
    
    public Cliente() {
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    
}
