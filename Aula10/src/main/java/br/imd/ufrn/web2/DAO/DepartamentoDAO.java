/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.ufrn.web2.DAO;

import br.imd.ufrn.web2.aula10.Departamento;
import java.util.ArrayList;

/**
 *
 * @author kuro_
 */
public class DepartamentoDAO {
    private ArrayList<Departamento> departamentos;

    public DepartamentoDAO() {
        this.departamentos = new ArrayList<Departamento>();
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    
    public ArrayList<Departamento> listar(){
        return getDepartamentos();
    }
    
    public void adicionar(Departamento d){
        getDepartamentos().add(d);
    }
    
    public Departamento procurar(String nome){
        for (Departamento f : getDepartamentos()) {
            if(f.getNome().equals(nome))
                return f;
        }
        
        return null;
    }
    
    public void remover(String nome){
        int i = 0;
        for(Departamento d: getDepartamentos()){
            if(d.getNome().equals(nome)){
                getDepartamentos().remove(i);
            }
            i++;
        }
    }
    
    // TODO
    public void alterar(){
        
    }
}
