/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Voluntario;

/**
 *
 * @author Altayr, Klivio Rafael, Francisco Leite
 */
public class VoluntarioTableModel extends AbstractTableModel{
    
    private final static int NOME_INDEX = 0;
    private final static int CPF_INDEX = 1;
    private final static int DISPONIBILIDADE_INDEX = 2;
    
    private final ArrayList<Voluntario> voluntarios = new ArrayList<>();
    private final String[] colunas = {"Nome", "CPF", "Disponibilidade"}; 

    public VoluntarioTableModel() {
        Voluntario v1 = new Voluntario("Italo", "123.456.789-10", "Feriados");
        Voluntario v2 = new Voluntario("Mateus", "369.852.147-00", "Feriados");
        Voluntario v3 = new Voluntario("Carla", "159.753.458-81", "Finais de Semana");
        Voluntario v4 = new Voluntario("Maria", "259.367.148-25", "Feriados");
        Voluntario v5 = new Voluntario("Pedro", "156.984.654-89", "Total");
        
        voluntarios.add(v1);
        voluntarios.add(v2);
        voluntarios.add(v3);
        voluntarios.add(v4);
        voluntarios.add(v5);
        
    }
    
    

    @Override
    public String getColumnName(int coluna){
        return colunas[coluna];
    }
    
    @Override
    public int getRowCount() {
        return voluntarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case NOME_INDEX:
                return voluntarios.get(linha).getNome();
            case CPF_INDEX:
                return voluntarios.get(linha).getCpf();
            case DISPONIBILIDADE_INDEX:
                return voluntarios.get(linha).getDisponibilidade();
        }

        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch(coluna){
            case NOME_INDEX:
                voluntarios.get(linha).setNome((String) valor);
                break;
            case CPF_INDEX:
                voluntarios.get(linha).setCpf((String) valor);
                break;
            case DISPONIBILIDADE_INDEX:
                voluntarios.get(linha).setDisponibilidade((String) valor);
                break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
        
    }
    
    public void addRow(Voluntario v){
        this.voluntarios.add(v);
        fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.voluntarios.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
    
    public ArrayList<Voluntario> getAll(){
        return voluntarios;
    }
}
