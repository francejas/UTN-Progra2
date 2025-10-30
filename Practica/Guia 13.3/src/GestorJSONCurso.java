import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class GestorJSONCurso {
    private String nomJSON = "curso.json";
    private GestorJSONPersona gestorJSONPersona;


    public GestorJSONCurso (){
        gestorJSONPersona = new GestorJSONPersona();
    }

    public JSONObject serializar (Curso curso){
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject();
            jsonObject.put("nombreCurso",curso.getNombreCurso());
            jsonObject.put("codigo",curso.getCodigo());

            JSONArray jsonArray = new JSONArray();

            for (Persona persona : curso.getAlumnosInscriptos()){
                jsonArray.put(gestorJSONPersona.serializar(persona));
            }
            jsonObject.put("alumnosInscriptos", jsonArray);

        }catch (JSONException e){
            e.printStackTrace();
        }
        return jsonObject;
    }

    public void cursoArchivo(Curso curso){
        OperacionLecturaEscritura.grabar(nomJSON,serializar(curso));
    }

    public Curso deserializar(JSONObject jsonObject){
        Curso curso = new Curso();
        try {
            curso.setNombreCurso(jsonObject.getString("nombreCurso"));
            curso.setCodigo(jsonObject.getInt("codigo"));

            JSONArray jsonArray = jsonObject.getJSONArray("alumnosInscriptos");
            for (int i = 0; i < jsonArray.length() ; i++) {
                Persona persona = gestorJSONPersona.deserializar(jsonArray.getJSONObject(i));
                curso.agregarAlumno(persona);
            }
        }catch (JSONException e){
            e.printStackTrace();
        }
       return curso;
    }

    public Curso archivoCurso(){
        JSONTokener jsonTokener = OperacionLecturaEscritura.leer(nomJSON);
        Curso cursoLeido = null;
        try {
            cursoLeido = deserializar(new JSONObject(jsonTokener));
        }catch (JSONException e){
            e.printStackTrace();
        }
        return cursoLeido;
    }









}
