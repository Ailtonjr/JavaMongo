package br.univali.javadbmongo.modelo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class Conexao {
    private MongoClient con;
    private DB banco;
    private DBCollection colecao;

    public Conexao() {
        try {
            this.con = new MongoClient();
            this.banco = con.getDB("db_mongo");  //cria ou acessa uma instancia de db Mongo
        } catch (UnknownHostException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DBCollection getColecao(String nomeColecao) {
        colecao = banco.getCollection(nomeColecao);
        return  colecao;
    }
}
