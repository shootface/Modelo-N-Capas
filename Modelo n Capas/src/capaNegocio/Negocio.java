/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaNegocio;

import capaEntidad.Usuario;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Negocio {
    private static String  ENCRYPT_KEY="clave-secreta";
    
    public JSONArray arregloUsuario(){
        //Datos_Usuarios du = new Datos_Usuarios();
        //return this.codificar(du.arregloUsuarios());
        return null;
    }
    
    public JSONArray codificar(JSONArray usuarios) throws UnsupportedEncodingException{
        for (int i=0; i < usuarios.size(); i++){
                JSONObject user = (JSONObject) usuarios.get(i);
                String id = user.get("id").toString();
                String username = user.get("username").toString();
                String password = this.encriptar(user.get("password").toString());

                System.out.println(id+"\t"+username+"\t"+password);
                usuarios.remove(i);
                usuarios.add(user);
            }
        return usuarios;
    }
     private static String encriptar(String s) throws UnsupportedEncodingException{
        return Base64.getEncoder().encodeToString(s.getBytes("utf-8"));
    }
    
    private static String desencriptar(String s) throws UnsupportedEncodingException{
        byte[] decode = Base64.getDecoder().decode(s.getBytes());
        return new String(decode, "utf-8");
    }
}
