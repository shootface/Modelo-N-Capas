/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaEntidad;

import org.json.simple.JSONValue;
import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;

/**
 *
 * @author gumo0
 */
public class Usuario {
    private int id;
    private String username;
    private String password;

    //Constructor
    public Usuario(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void writeJSONString(Writer out) throws IOException {
        LinkedHashMap obj = new LinkedHashMap();
        obj.put("id", String.valueOf(id));
        obj.put("username", username);
        obj.put("password", password);
        JSONValue.writeJSONString(obj, out);
    }
}
