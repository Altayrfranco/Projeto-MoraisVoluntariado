/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Evento;

/**
 *
 * @author Altayr, Klivio Rafael, Francisco Leite
 */
public class EventoTableModel extends AbstractTableModel{
    
    private final static int NOME_INDEX = 0;
    private final static int DATA_INDEX = 1;
    private final static int DURACAO_INDEX = 2;
    private final static int RESPONSAVEL_INDEX = 3;
    private final static int CUSTO_INDEX = 4;
    private final static int OBJETIVO_INDEX = 5;
    private final static int META_INDEX = 6;
    private final static int TIPO_INDEX = 7;
    
    private final ArrayList<Evento> eventos = new ArrayList<>();
    private final String[] colunas = {"Nome", "Data", "Duração",
        "Responsável", "Custo", "Objetivo", "Meta", "Tipo"}; 
            
    public EventoTableModel(){
        Evento e1 = new Evento("Conscientização do Plástico", "22/05/2021",
                "2hr", "Marta", "200", "Conscientizar e arrecadar fundos",
                "200", "Ação");
        Evento e2 = new Evento("Divulgação da causa", "24/05/2021", "2hr",
                "Laercio", "100", "Aumentar o reconhecimento da ONG",
                "500", "Canmpanha");
        Evento e3 = new Evento("Bingo Beneficente", "05/05/2021", "3hr",
                "Laercio", "125", "Arrecadar fundos", "1000", "Campanha");
        Evento e4 = new Evento("Apoio as pessoas sem teto", "30/05/2021", "5hr",
                "Clara", "500", "Auxiliar pessoas sem teto através de comida",
                "0", "Ação");
                
        eventos.add(e3);
        eventos.add(e1);
        eventos.add(e2);
        eventos.add(e4);
        
               
    }
    
    @Override
    public String getColumnName(int coluna){
        return colunas[coluna];
    }
    
    @Override
    public int getRowCount() {
        return eventos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case NOME_INDEX:
                return eventos.get(linha).getNome();
            case DATA_INDEX:
                return eventos.get(linha).getData();
            case DURACAO_INDEX:
                return eventos.get(linha).getDuracao();
            case RESPONSAVEL_INDEX:
                return eventos.get(linha).getResponsavel();
            case CUSTO_INDEX:
                return eventos.get(linha).getCusto();
            case OBJETIVO_INDEX:
                return eventos.get(linha).getObjetivo();
            case META_INDEX:
                return eventos.get(linha).getMeta();
            case TIPO_INDEX:
                return eventos.get(linha).getTipo();
        }
        
        return null;
    }
    
    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch(coluna){
            case NOME_INDEX:
                eventos.get(linha).setNome((String) valor);
                break;
            case DATA_INDEX:
                eventos.get(linha).setData((String) valor);
                break;
            case DURACAO_INDEX:
                eventos.get(linha).setDuracao((String) valor);
                break;
            case RESPONSAVEL_INDEX:
                eventos.get(linha).setResponsavel((String) valor);
                break;
            case CUSTO_INDEX:
                eventos.get(linha).setCusto((String) valor);
                break;
            case OBJETIVO_INDEX:
                eventos.get(linha).setObjetivo((String) valor);
                break;
            case META_INDEX:
                eventos.get(linha).setMeta((String) valor);
                break;
            case TIPO_INDEX:
                eventos.get(linha).setTipo((String) valor);
                break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
        
    }
    
    public void addRow(Evento e){
        this.eventos.add(e);
        fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.eventos.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
    
    
    public ArrayList<Evento> getAll(){
        return eventos;
        
    }
    
}
