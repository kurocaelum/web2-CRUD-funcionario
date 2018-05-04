/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.ufrn.web2.DAO;

import java.util.ArrayList;
import br.imd.ufrn.web2.aula10.Funcionario;

/**
 *
 * @author kuro_
 */
public class FuncionarioDAO {
    private ArrayList<Funcionario> funcionarios;

    public FuncionarioDAO() {
        funcionarios = new ArrayList<Funcionario>();
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void adicionar(Funcionario f){
        getFuncionarios().add(f);
    }
    
    public ArrayList<Funcionario> listar(){
        return getFuncionarios();
    }
    
    public void remover(String nome){
        int i = 0;
        for(Funcionario f: getFuncionarios()){
            if(f.getNome().equals(nome)){
                getFuncionarios().remove(i);
            }
            i++;
        }
    }
    
    public Funcionario consultar(String nome){
        for (Funcionario f : funcionarios) {
            if(f.getNome().equals(nome))
                return f;
        }
        
        return null;
    }
    
    // TODO
    public void alterar(){
        
    }
}
