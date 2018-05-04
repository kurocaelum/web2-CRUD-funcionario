/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.ufrn.web2.DAO;

import br.imd.ufrn.web2.aula10.Chefe;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author kuro_
 */
@ApplicationScoped
public class ChefeDAO {
    private ArrayList<Chefe> chefes;

    public ChefeDAO() {
    }
    
    public void adicionar(Chefe f){
        chefes.add(f);
    }
    
    public Chefe procurar(String nome){
        for (Chefe f : chefes) {
            if(f.getNome().equals(nome))
                return f;
        }
        
        return null;
    }
    
    public void remover(String nome){
        Chefe f = this.procurar(nome);
        if(f != null)
            chefes.remove(f);
    }
}
