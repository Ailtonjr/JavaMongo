/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.javadbmongo.prinipal;

import br.univali.javadbmongo.modelo.Endereco;
import br.univali.javadbmongo.modelo.Pessoa;

/**
 *
 * @author 5108250
 */
public class JavaDBMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endereco end = new Endereco("Av atlantica", 2302, "Ap 1001");
        Pessoa pessoa = new Pessoa("Bruna", 5, end);
        pessoa.addTelefone("(47) 9943-1717");
        pessoa.addTelefone("(47) 9651-9651");
        pessoa.insereBanco();
        
        pessoa.setNome("Priscila");
        pessoa.updateBanco();
    }
}
