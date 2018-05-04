/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.ufrn.web2.aula10;

import java.util.ArrayList;

/**
 *
 * @author rotyx
 */

public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios;
    private Chefe chefe;

   public Departamento() {
       this.funcionarios = new ArrayList<Funcionario>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Chefe getChefe() {
        return chefe;
    }

    public void setChefe(Chefe chefe) {
        this.chefe = chefe;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void cadastrarFuncionario(Funcionario f){
        getFuncionarios().add(f);
    }
    
    public void removerFuncionario(String nome){
        int i = 0;
        for(Funcionario f: getFuncionarios()){
            if(f.getNome().equals(nome)){
                getFuncionarios().remove(i);
            }
            i++;
        }
    }
}
