import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public final class OperacionLectoEscritura {
    public OperacionLectoEscritura() {
    }

    public static void grabar (String nombreArchivo, JSONObject jsonObject){
        try {
            FileWriter file = new FileWriter(nombreArchivo);
            file.write(jsonObject.toString(4));
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void grabar (String nombreArchivo , JSONArray jsonArray){
        try {
            FileWriter file = new FileWriter(nombreArchivo);
            file.write(jsonArray.toString(4));
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static JSONTokener leer (String nombreArchivo){
        JSONTokener tokener = null;
        try {
            tokener = new JSONTokener(new FileReader(nombreArchivo));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return tokener;
    }


}
