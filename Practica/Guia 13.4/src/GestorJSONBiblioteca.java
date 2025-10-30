import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class GestorJSONBiblioteca {
    private String nomJSON = "biblioteca.json";

    public GestorJSONBiblioteca() {
    }

    public JSONObject serializar (Biblioteca biblioteca){
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject();
            jsonObject.put("nombreBiblioteca",biblioteca.getNombreBiblioteca());
            JSONArray jsonArray = new JSONArray();
            for (Libro libro : biblioteca.getLibros()){
                JSONObject jsonLibro = libro.toJSON();
                jsonArray.put(jsonLibro);
            }
            jsonObject.put("Libros",jsonArray);
        }catch (JSONException e){
            e.printStackTrace();
        }
        return jsonObject;
    }

    public void bibliotecaArchivo(Biblioteca biblioteca){
        OperacionLecturaEscritura.grabar(nomJSON,serializar(biblioteca));
    }

    public Biblioteca deserializar (JSONObject jsonObject){
        Biblioteca biblioteca = new Biblioteca();
        try {
            biblioteca.setNombreBiblioteca(jsonObject.getString("nombreBiblioteca"));
            JSONArray jsonArray = jsonObject.getJSONArray("libros");
            for (int i = 0; i < jsonArray.length() ; i++) {
                JSONObject jsonLibro = jsonArray.getJSONObject(i);
                Libro libro = new Libro(jsonLibro);
                biblioteca.agregarLibro(libro);
            }
        }catch (JSONException e){
            e.printStackTrace();
        }
        return biblioteca;
    }

    public Biblioteca archivoBiblioteca(){
        JSONTokener jsonTokener = OperacionLecturaEscritura.leer(nomJSON);
        Biblioteca bibliotecaLeida = null;
        try {
            bibliotecaLeida = deserializar(new JSONObject(jsonTokener));
        }catch (JSONException e){
            e.printStackTrace();
        }
        return bibliotecaLeida;
    }

    public void agregarLibroArchivo (Libro libro){
        JSONTokener jsonTokener = OperacionLecturaEscritura.leer(nomJSON);
        try {
            JSONObject jsonBiblioteca = new JSONObject(jsonTokener);

            /// leemos el JSONArray de libros dentro del JSONObject de biblioteca
            JSONArray jsonArray = jsonBiblioteca.getJSONArray("libros");

            /// transformamos el libro que queremos agregar a un JSONObject, para poder agregarlo al JSONArray
            JSONObject jsonLibro = libro.toJSON();

            /// agregamos el JSONObject de libro al JSONArray
            jsonArray.put(jsonLibro);

            /// guardamos el JSON de nuevo
            OperacionLecturaEscritura.grabar(nomJSON, jsonBiblioteca);

        } catch (JSONException e){
            e.printStackTrace();
        }
    }

    public void borrarLibroArchivo (String ISBN){
        JSONTokener jsonTokener = OperacionLecturaEscritura.leer(nomJSON);
        try {
            JSONObject jsonBiblioteca = new JSONObject(jsonTokener);
            JSONArray jsonArray = jsonBiblioteca.getJSONArray("libros");

            for (int i = 0; i < jsonArray.length() ; i++) {
                JSONObject jsonLibro = jsonArray.getJSONObject(i);
                if (jsonLibro.getString("ISBN").equals(ISBN)){
                    jsonArray.remove(i);
                    break;
                }
            }
            OperacionLecturaEscritura.grabar(nomJSON,jsonBiblioteca);
        }catch (JSONException e){
            e.printStackTrace();
        }
    }


}
