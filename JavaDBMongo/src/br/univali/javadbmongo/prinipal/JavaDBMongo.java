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
 * @author Ailton Cardoso Jr
 */
public class JavaDBMongo {

    public static void main(String[] args) {
// Codigo para Iserir uma pessoa
        
        Endereco end = new Endereco("Av atlantica", 2302, "Ap 1001");
        Pessoa pessoa = new Pessoa("Ailton", 5, end);
        pessoa.addTelefone("(47) 9943-1717");
        pessoa.addTelefone("(47) 9651-9651");
        pessoa.insereBanco();

// Codigo para Alterar uma pessoa 
        
//        pessoa.setNome("Joao");
//        pessoa.updateBanco();
        
// Codigo para Buscar uma pessoa pelo ID e exibir seus atributos 
        
//        Pessoa pessoa = Pessoa.getById("566875dc974fd6e6e0b278db");
//        System.out.println("Nome: " + pessoa.getNome());
//        System.out.println("Idade: " + pessoa.getIdade());
//        System.out.println("Logradouro: " + pessoa.getEndereco().getLogradouro());
//        System.out.println("Complemento: " + pessoa.getEndereco().getComplemento());
//        System.out.println("Numero: " + pessoa.getEndereco().getNumero());
//        pessoa.getTelefone().stream().forEach((telefone) -> {
//            System.out.println("Telefone " + telefone);
//        });

        
// Codigo para Remover uma pessoa pelo ID
        
//        Pessoa.removeById("566875cc974fd091c392d5a7");
        
        
    }
}
