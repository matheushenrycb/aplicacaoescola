/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaoescola.view;

import aplicacaoescola.Interface.Portugues;


/**
 *
 * @author laboratorio
 */
public class AplicacaoEscola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ProfessorView prof= new ProfessorView(new Portugues());
       prof.getMateriaaplicada().nomeMateria();
       
       
    }
    
}
