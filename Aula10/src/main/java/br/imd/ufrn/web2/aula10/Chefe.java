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

public class Chefe extends Funcionario {

    private Departamento dpto;
    
    public Chefe() {
    }

    public Chefe(String nome, double salario, Departamento lotacao) {
        super(nome, salario,lotacao);
    }

    public Departamento getDpto() {
        return dpto;
    }

    public void setDpto(Departamento dpto) {
        this.dpto = dpto;
    }
    
}
