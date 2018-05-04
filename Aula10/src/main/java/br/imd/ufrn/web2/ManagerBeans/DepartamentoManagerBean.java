/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.ufrn.web2.ManagerBeans;

import br.imd.ufrn.web2.aula10.Chefe;
import br.imd.ufrn.web2.aula10.Funcionario;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author kuro_
 */
@ManagedBean (name = "departamento")
@ApplicationScoped
public class DepartamentoManagerBean {
    private String nome;
    private ArrayList<Funcionario> funcionarios;
    private Chefe chefe;

    public DepartamentoManagerBean() {
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Chefe getChefe() {
        return chefe;
    }

    public void setChefe(Chefe chefe) {
        this.chefe = chefe;
    }
    
}
