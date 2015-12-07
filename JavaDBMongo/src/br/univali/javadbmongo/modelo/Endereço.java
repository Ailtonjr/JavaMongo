package br.univali.javadbmongo.modelo;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class Endereço {

    private String Logradouro;
    private int numero;
    private String complemento;

    public Endereço(String Logradouro, int numero, String complemento) {
        this.Logradouro = Logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }
    
    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
