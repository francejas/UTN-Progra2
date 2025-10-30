import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;

public class GestorJSONPersona {
    private String nomJSON = "persona.json";

    public GestorJSONPersona() {
    }

    public JSONObject serializar (Persona p){
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject();
            jsonObject.put("nombre", p.getNombre());
            jsonObject.put("edad", p.getEdad());
            jsonObject.put("sexo", p.getSexo());
            jsonObject.put("dni", p.getDni());
        } catch (JSONException e){
            e.printStackTrace();
        }
        return jsonObject;
    }

    public void personaArchivo (Persona p ){
        OperacionLecturaEscritura.grabar(nomJSON,serializar(p));
    }

    public Persona deserializar (JSONObject jsonObject){
        Persona persona = new Persona();
        try {
            persona.setNombre(jsonObject.getString("nombre"));
            persona.setDni(jsonObject.getString("dni"));
            persona.setEdad(jsonObject.getInt("edad"));
            persona.setSexo(jsonObject.getString("sexo"));
        }catch (JSONException e){
            e.printStackTrace();
        }
        return persona;
    }

    public Persona archivoPersona (){
        Persona personaLeida = null;
        JSONTokener jsonTokener = OperacionLecturaEscritura.leer(nomJSON);
        try {
            personaLeida = deserializar(new JSONObject(jsonTokener));
        }catch (JSONException e){
            e.printStackTrace();
        }
        return personaLeida;
    }



}
