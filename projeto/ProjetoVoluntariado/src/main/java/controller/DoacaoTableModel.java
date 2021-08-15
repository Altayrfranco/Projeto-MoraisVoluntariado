/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Doacao;

/**
 *
 * @author Altayr, Klivio Rafael, Francisco Leite
 */
public class DoacaoTableModel extends AbstractTableModel{
    
    private final static int DOADOR_INDEX = 0;
    private final static int TIPO_DOACAO_INDEX = 1;
    private final static int QUANTIA_INDEX = 2;
    private final static int DATA_INDEX = 3;
    private final static int METODO_INDEX = 4;
    private final static int RECORRENTE_INDEX = 5;
    
    private final ArrayList<Doacao> doacoes = new ArrayList<>();
    private final String[] colunas = {"Doador", "Tipo", "Quantia",
        "Data", "Método de Entrega", "Recorrente"}; 
    
    public DoacaoTableModel(){
        Doacao d1 = new Doacao("Carlos", "21/03/2020", "Dinheiro", 100, "Local", true);
            Doacao d2 = new Doacao("Marta", "08/05/2020", "Roupa", 20, "Local", false);
            Doacao d3 = new Doacao("Fernanda", "10/05/2020", "Dinheiro", 500, "Local", false);
            Doacao d4 = new Doacao("Icaro", "11/05/2020", "Cadeira", 10, "Coleta", false);
            Doacao d5 = new Doacao("José", "14/05/2020", "Dinheiro", 250, "Local", true);

            doacoes.add(d1);
            doacoes.add(d2);
            doacoes.add(d3);
            doacoes.add(d4);
            doacoes.add(d5);
    }

    @Override
    public String getColumnName(int coluna){
        return colunas[coluna];
    }
    
    @Override
    public int getRowCount() {
        return doacoes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case DOADOR_INDEX:
                return doacoes.get(linha).getDoador();
            case TIPO_DOACAO_INDEX:
                return doacoes.get(linha).getMaterial();
            case QUANTIA_INDEX:
                return doacoes.get(linha).getQuantia();
            case DATA_INDEX:
                return doacoes.get(linha).getDataDoacao();
            case METODO_INDEX:
                return doacoes.get(linha).getTipoEntrega();
            case RECORRENTE_INDEX:
                if (doacoes.get(linha).isRecorrente()){
                    return "Sim";
                }else {
                    return "Não";
                }
        }

        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch(coluna){
            case DOADOR_INDEX:
                doacoes.get(linha).setDoador((String) valor);
                break;
            case TIPO_DOACAO_INDEX:
                doacoes.get(linha).setMaterial((String) valor);
                break;
            case QUANTIA_INDEX:
                doacoes.get(linha).setQuantia((Float) valor);
                break;
            case DATA_INDEX:
                doacoes.get(linha).setDataDoacao((String) valor);
                break;
            case METODO_INDEX:
                doacoes.get(linha).setTipoEntrega((String) valor);
                break;
            case RECORRENTE_INDEX:
                doacoes.get(linha).setRecorrente((boolean) valor);
                
        }
        
        this.fireTableRowsUpdated(linha, linha);
        
    }
    
    public void addRow(Doacao d){
        this.doacoes.add(d);
        fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.doacoes.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
    
    public ArrayList<Doacao> getAll(){
        return doacoes;
    }
    
}
