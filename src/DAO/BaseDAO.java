/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author david
 */
public abstract class BaseDAO<T> {
     private  final String SERVER= "localhost";
    private  final int PORT= 27017;
    private  final String DB= "Pomodoro";
    
     protected MongoDatabase getDatabase(){
         try {
            CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
            CodecRegistry codecRegistry = 
                    fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                    pojoCodecRegistry);
            ConnectionString cadenaConexion = new ConnectionString("mongodb://"+SERVER+"/"+PORT);
            MongoClientSettings clientSettings = MongoClientSettings.builder()
                    .applyConnectionString(cadenaConexion)
                    .codecRegistry(codecRegistry)
                    .build();
            MongoClient clienteMongo = MongoClients.create(clientSettings);
            MongoDatabase baseDatos = clienteMongo.getDatabase(DB);
            return  baseDatos;
        } catch (Exception ex) {
            System.err.println(ex);
            throw ex;
        }
    }
     
     protected abstract MongoCollection<T> getCollection();
     public abstract void agregar(T etidad);
     public abstract void eliminar(T etidad);
     public abstract ArrayList<T> consultar();
}
