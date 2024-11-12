package com.senac.projetoIntegrador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="doacao")
public class Doacao {
    @Id
    private int id;
    private String causaNome;
    private int valor;
    
    public Doacao() {
        
    }
    
    public Doacao(int id, String causaNome, int valor) {
        this.id = id;
        this.causaNome = causaNome;
        this.valor = valor;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCausaNome() {
        return causaNome;
    }

    public void setCausaNome(String causaNome) {
        this.causaNome = causaNome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
