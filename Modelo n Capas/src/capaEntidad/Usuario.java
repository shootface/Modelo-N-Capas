/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaEntidad;

import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;

/**
 *
 * @author wilme
 */
public class Usuario implements JSONStreamAware{
    private int id; //Declaración del id del usuario

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String nombreUsuario;  //Declaracion del nombre de usuario
    private String password;    //Declaracion de la contraseña del usuario
    
    public Usuario(int id, String nombreUsuario, String password) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
     @Override
    public void writeJSONString(Writer out) throws IOException {
        LinkedHashMap obj = new LinkedHashMap();
        obj.put("id", String.valueOf(id));
        obj.put("nombreUsuario", nombreUsuario);
        obj.put("password", password);
        JSONValue.writeJSONString(obj, out);
    }
}
