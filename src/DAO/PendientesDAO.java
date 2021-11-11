/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import objetosNegocio.Tarea;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author david
 */
public class PendientesDAO extends BaseDAO<Tarea>{

    @Override
    protected MongoCollection<Tarea> getCollection() {
        MongoDatabase baseDatos = this.getDatabase();
        MongoCollection<Tarea> coleccion = baseDatos.getCollection("pendientes", Tarea.class);

        return coleccion;
    }

    @Override
    public void agregar(Tarea tarea) {
        MongoCollection<Tarea> coleccion = this.getCollection();
        coleccion.insertOne(tarea);
    }

    @Override
    public void eliminar(Tarea tarea) {
        MongoCollection coleccion = this.getCollection();
        coleccion.deleteOne(new Document("_id", tarea.getId()));
    }

    @Override
    public ArrayList<Tarea> consultar() {
        MongoCollection coleccion = this.getCollection();

        FindIterable<Tarea> tareas = coleccion.find();
        ArrayList<Tarea> listaTareas = new ArrayList<>();

        for (Tarea listatareas : tareas) {
            listaTareas.add(listatareas);
        }
        return listaTareas;
    }

    @Override
    public void actualizar(Tarea tarea) {
        MongoCollection coleccion = this.getCollection();
        Document searchDoc = new Document("_id",tarea.getId());
        Document updateDoc = new Document();
        
        updateDoc.append("nombre", tarea.getNombre());
        updateDoc.append("descripcion", tarea.getDescripcion());
        
        Document setDoc = new Document();
        setDoc.append("$set", updateDoc);
        
        coleccion.updateOne(searchDoc, setDoc);
    }
    
    public ObjectId consultarId(Tarea t){
        ObjectId id= null;
         MongoCollection coleccion = this.getCollection();
         FindIterable<Tarea> tareas = coleccion.find();
         for (Tarea tarea : tareas) {
              id= tarea.getId();
         }
         return id;
    }

    
}
