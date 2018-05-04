/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.ufrn.web2.aula10;

/**
 *
 * @author rotyx
 */

//implements java.io.Serializable
public class Funcionario {
    private String nome;
    private double salario;
    private Departamento lotacao;

    public Funcionario() {
        this.nome = null;
        this.salario = 0;
    }

    public Funcionario(String nome, double salario, Departamento lotacao) {
        this.nome = nome;
        this.salario = salario;
        this.lotacao = lotacao;
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
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
}
