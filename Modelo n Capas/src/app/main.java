/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import capaNegocio.Negocio;
import java.io.IOException;
import java.io.StringWriter;
import org.json.simple.JSONArray;

/**
 *
 * @author gumo0
 */
public class main {
    public static void main(String[] args) {
        Negocio neg_user = new Negocio();
        JSONArray array = new JSONArray();
        array = neg_user.arregloUsuario();
        StringWriter out = new StringWriter();
        try {
            array.writeJSONString(out);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(out);
    }
}
