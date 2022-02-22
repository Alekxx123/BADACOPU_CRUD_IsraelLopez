package conexionjavamongodsm502;
import com.mongodb.*;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.*;
/*
* Author: Israel Alejandro López Tovar
* Date: 15/02/2022
* Desc: CRUD MONGO Y JAVA
* CRUD = CREATE-READ-UPDATE-DELETE
*/
public class Conexion {
    DB BaseDatos;
    DBCollection coleccion;
    BasicDBObject document = new BasicDBObject();
    
    
    public Conexion(){
        try{
        Mongo mongo = new Mongo("localhost",27017);
        BaseDatos = mongo.getDB("Actividad502");
        coleccion = BaseDatos.getCollection("Actividad502");
            System.out.println("Conexion Exitosa :)");
            
        }catch(UnknownHostException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public boolean insertar(String accion){
     document.put("accion", accion);
     coleccion.insert(document);
     return true;
    }
    
    public void mostrar(){
        DBCursor cursor = coleccion.find();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
    
    public boolean Actualizar(String accionVieja,String accionNueva){
        BasicDBObject documentoNuevo = new BasicDBObject();
        documentoNuevo.put("accion", documentoNuevo);
        coleccion.findAndModify(document, documentoNuevo);
        return true;
    }
    
    public boolean Eliminar(String accion){
        document.put("accion", accion);
        coleccion.remove(document);
        return true;
    }
}