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
    private String nombreUsuario;  //Declaracion del nombre de usuario
    private String password;    //Declaracion de la contraseña del usuario
    
    public Usuario(int id, String nombreUsuario, String password) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
}
