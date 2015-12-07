package br.univali.javadbmongo.modelo;

import java.util.ArrayList;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class Pessoa {

    private String nome;
    private int idade;
    private ArrayList<String> telefone;
    private Endereço endereco;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = new ArrayList<>();
    }

    public void addTelefone(String tel) {
        telefone.add(tel);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<String> getTelefone() {
        return telefone;
    }

    public void setTelefone(ArrayList<String> telefone) {
        this.telefone = telefone;
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }
}
