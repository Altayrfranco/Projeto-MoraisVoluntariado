/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Empresa;

/**
 *
 * @author Altayr, Klivio Rafael, Francisco Leite
 */
public class EmpresaTableModel extends AbstractTableModel{
    
    private final static int NOME_INDEX = 0;
    private final static int CNPJ_INDEX = 1;
    
    private final ArrayList<Empresa> empresas = new ArrayList<>();
    private final String[] colunas = {"Nome", "CNPJ"}; 
    
    public EmpresaTableModel(){
        Empresa v1 = new Empresa("Contax", "85.968.606/0001-78");
        Empresa v2 = new Empresa("AeC", "18.329.827/0001-09");
        Empresa v3 = new Empresa("G Quality", "94.214.181/0001-00");
        Empresa v4 = new Empresa("Andriola Express", "06.587.133/0001-92");
        Empresa v5 = new Empresa("Revis Up", "08.614.260/0001-69");
        
        empresas.add(v1);
        empresas.add(v2);
        empresas.add(v3);
        empresas.add(v4);
        empresas.add(v5);
    }
    
    @Override
    public String getColumnName(int coluna){
        return colunas[coluna];
    }
    
    @Override
    public int getRowCount() {
        return empresas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case NOME_INDEX:
                return empresas.get(linha).getNome();
            case CNPJ_INDEX:
                return empresas.get(linha).getCnpj();
        }

        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch(coluna){
            case NOME_INDEX:
                empresas.get(linha).setNome((String) valor);
                break;
            case CNPJ_INDEX:
                empresas.get(linha).setCnpj((String) valor);
                break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
        
    }
    
    public void addRow(Empresa e){
        this.empresas.add(e);
        fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.empresas.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
    
    public ArrayList<Empresa> getAll(){
        return empresas;
    }
}
