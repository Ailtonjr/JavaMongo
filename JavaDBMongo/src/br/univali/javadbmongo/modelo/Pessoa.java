package br.univali.javadbmongo.modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import java.util.ArrayList;
import org.bson.types.ObjectId;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class Pessoa {

    private ObjectId id;
    private String nome;
    private int idade;
    private ArrayList<String> telefones;
    private Endereco endereco;
    private static DBCollection colecao;

    public Pessoa(String nome, int idade, Endereco end) {
        this.nome = nome;
        this.idade = idade;
        this.telefones = new ArrayList<>();
        this.colecao = new Conexao().getColecao("pessoas");
        this.endereco = end;
    }

    public Pessoa() {
        this.colecao = new Conexao().getColecao("pessoas");
    }

    public void insereBanco() {
        BasicDBObject p1 = new BasicDBObject();

        p1.append("nome", this.nome);
        p1.append("idade", this.idade);
        if (telefones.size() > 0) {
            p1.append("telefones", telefones);
        }

        if (endereco != null) {
            BasicDBObject end = new BasicDBObject();
            end.append("logradouro", endereco.getLogradouro());
            end.append("numero", endereco.getNumero());
            end.append("complemento", endereco.getComplemento());
            p1.append("endereco", end);
        }
        colecao.save(p1);
        this.id = (ObjectId) p1.get("_id");
        System.out.println("Id " + this.id.toString());
    }

    public void updateBanco() {
        BasicDBObject where = new BasicDBObject("_id", id);

        BasicDBObject set = new BasicDBObject();

        set.append("nome", this.nome);
        set.append("idade", this.idade);
        if (telefones.size() > 0) {
            set.append("telefones", telefones);
        }

        if (endereco != null) {
            BasicDBObject end = new BasicDBObject();
            end.append("logradouro", endereco.getLogradouro());
            end.append("numero", endereco.getNumero());
            end.append("complemento", endereco.getComplemento());
            set.append("endereco", end);
        }
        colecao.update(where, set);
    }

    public static Pessoa getById(String id) {
        Pessoa pessoa = new Pessoa();
        BasicDBObject where = new BasicDBObject("_id", new ObjectId(id));

        DBCursor cursor = colecao.find(where);
        while (cursor.hasNext()) {
            BasicDBObject documento = (BasicDBObject) cursor.next();
            pessoa.setNome(documento.getString("nome"));
            pessoa.setIdade(documento.getInt("idade"));

            BasicDBObject endereco = (BasicDBObject) documento.get("endereco");
            if (endereco != null) {
                pessoa.setEndereco(new Endereco(endereco.getString("logradouro"), endereco.getInt("numero"), endereco.getString("complemento")));
            }

            ArrayList<String> telefones = (ArrayList<String>) documento.get("telefones");
            if (telefones != null) {
                pessoa.telefones = telefones;
            }
        }
        return pessoa;
    }

    public void addTelefone(String tel) {
        telefones.add(tel);
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
        return telefones;
    }

    public void setTelefone(ArrayList<String> telefone) {
        this.telefones = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
