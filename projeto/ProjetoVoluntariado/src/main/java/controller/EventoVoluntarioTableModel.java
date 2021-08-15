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
public class EventoVoluntarioTableModel extends AbstractTableModel{
    
    private final static int NOME_INDEX = 0;
    private final static int DATA_INDEX = 1;
    private final static int DURACAO_INDEX = 2;
    private final static int VOLUNTARIO_INDEX = 3;
    
    private final ArrayList<Evento> eventos = new ArrayList<>();
    private final String[] colunas = {"Nome", "Data", "Duração",
        "Voluntários"}; 
            
    public EventoVoluntarioTableModel(){
        Evento e1 = new Evento("Conscientização do Plástico", "22/05/2021",
                "2hr", "Marta", "200", "Conscientizar e arrecadar fundos",
                "200", "Ação");
        e1.addVoluntario("Thomas");
        e1.addVoluntario("Klebia");
        Evento e2 = new Evento("Divulgação da causa", "24/05/2021", "2hr",
                "Laercio", "100", "Aumentar o reconhecimento da ONG",
                "500", "Canmpanha");
        e2.addVoluntario("José");
        e2.addVoluntario("Márcio");
        e2.addVoluntario("Klebia");
        Evento e3 = new Evento("Bingo Beneficente", "05/05/2021", "3hr",
                "Laercio", "125", "Arrecadar fundos", "1000", "Campanha");
        e3.addVoluntario("Thiago");

        Evento e4 = new Evento("Apoio as pessoas sem teto", "30/05/2021", "5hr",
                "Clara", "500", "Auxiliar pessoas sem teto através de comida",
                "0", "Ação");
        e4.addVoluntario("Lucia");
                
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
            case VOLUNTARIO_INDEX:
                return eventos.get(linha).getVoluntarios();
        }
        
        return null;
    }
    
    public void addVoluntario(int index, String v){
        this.eventos.get(index).addVoluntario(v);
        fireTableDataChanged();
    }
    
    public ArrayList<Evento> getAll(){
        return eventos;
        
    }
    
}
