/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Altayr, Klivio Rafael, Francisco Leite
 */
public class Evento {
    
    private String nome;
    private String data;
    private String duracao;
    private String responsavel;
    private String custo;
    private String objetivo;
    private String meta;
    private String tipo;
    private ArrayList<String> voluntarios = new ArrayList<>();
    
    public Evento(String nome, String data, String duracao, String responsavel, String custo, String objetivo, String meta, String tipo) {
        this.nome = nome;
        this.data = data;
        this.duracao = duracao;
        this.responsavel = responsavel;
        this.custo = custo;
        this.objetivo = objetivo;
        this.meta = meta;
        this.tipo = tipo;
    }
    
    public void addVoluntario(String nome){
        this.voluntarios.add(nome);
    }

    public ArrayList<String> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<String> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String Objetivo) {
        this.objetivo = Objetivo;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Evento{" + "nome=" + nome + ", data=" + data + ", duracao=" + duracao + ", responsavel=" + responsavel + ", custo=" + custo + ", Objetivo=" + objetivo + ", meta=" + meta + ", tipo=" + tipo + '}';
    }
    
    
    
}
