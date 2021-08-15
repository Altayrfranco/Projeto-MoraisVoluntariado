/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Altayr, Klivio Rafael, Francisco Leite
 */
public class Voluntario {
    
    private String nome;
    private String cpf;
    private String disponibilidade;

    public Voluntario(String nome, String cpf, String disponibilidade){
        this.nome = nome;
        this.cpf = cpf;
        this.disponibilidade = disponibilidade;
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

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Voluntario{" + "nome=" + nome + ", cpf=" + cpf + ", disponibilidade=" + disponibilidade + '}';
    }
    
    
}
