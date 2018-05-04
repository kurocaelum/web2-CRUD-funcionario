/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.ufrn.web2.ManagerBeans;

/**
 *
 * @author rotyx
 */

import br.imd.ufrn.web2.DAO.FuncionarioDAO;
import br.imd.ufrn.web2.aula10.Departamento;
import br.imd.ufrn.web2.aula10.Funcionario;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

// TODO Cadastrar em departamento (getDepartamento pelo nome)
// TODO DAOs como singletons
@ManagedBean (name = "funcionario")
@ApplicationScoped
public class FuncionarioManagerBean {
    private String nome;
    private double salario;
    private Departamento lotacao;
    private FuncionarioDAO bancoFuncionarios = new FuncionarioDAO();

    public FuncionarioManagerBean() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getLotacao() {
        return lotacao;
    }

    public void setLotacao(Departamento lotacao) {
        this.lotacao = lotacao;
    }

    public FuncionarioDAO getBancoFuncionarios() {
        return bancoFuncionarios;
    }

    public void setBancoFuncionarios(FuncionarioDAO bancoFuncionarios) {
        this.bancoFuncionarios = bancoFuncionarios;
    }
    
    public void cadastrar(){
        if(getNome()!=null && getLotacao()!=null && getSalario()!=0.0){
            Funcionario f = new Funcionario(getNome(), getSalario(), getLotacao());
        }
    }
}
