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
public class Doacao {
    
    private String doador;
    private String dataDoacao;
    private String material;
    private float quantia;
    private String tipoEntrega;
    private boolean recorrente;

    public Doacao(String doador, String dataDoacao, String material, float quantia, String tipoEntrega, boolean recorrente) {
        this.doador = doador;
        this.dataDoacao = dataDoacao;
        this.material = material;
        this.quantia = quantia;
        this.tipoEntrega = tipoEntrega;
        this.recorrente = recorrente;
    }

    public String getDoador() {
        return doador;
    }

    public void setDoador(String doador) {
        this.doador = doador;
    }

    public String getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(String dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getQuantia() {
        return quantia + "";
    }

    public void setQuantia(float quantia) {
        this.quantia = quantia;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public boolean isRecorrente() {
        return recorrente;
    }

    public void setRecorrente(boolean recorrente) {
        this.recorrente = recorrente;
    }

    @Override
    public String toString() {
        return "Doacao{" + "doador=" + doador + ", dataDoacao=" + dataDoacao + 
                ", material=" + material + ", quantia=" + quantia + 
                ", tipoEntrega=" + tipoEntrega + ", recorrente=" + recorrente + '}';
    }
    
    
}
