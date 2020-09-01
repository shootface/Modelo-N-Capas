package com.fa11en.json.dataaccesslayer;

import com.fa11en.json.entitylayer.User;
import org.json.simple.JSONArray;

public class Datos_Usuarios {

    public JSONArray arrayUsuarios(){
        JSONArray arr = new JSONArray();
            arr.add(new User(10, "Diego Fernando Güiza", "1234"));
            arr.add(new User(11, "Juan Camilo Guaba", "JCGD"));
            arr.add(new User(12, "Wilmer Ricardo Pachon", "WRPD"));
        return arr;
    }

}