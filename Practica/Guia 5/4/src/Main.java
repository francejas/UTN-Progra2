public class Main {
    public static void main(String[] args) {

        //1
        Estudiantes e1 = new Estudiantes("12345678", "Ana", "Gomez", "ana@gmail.com", "Calle 123",
                2021, 15000, "Ingeniería");
        Estudiantes e2 = new Estudiantes("23456789", "Luis", "Martinez", "luis@gmail.com", "Av. Siempre Viva 742",
                2020, 18000, "Medicina");
        Estudiantes e3 = new Estudiantes("34567890", "Sofía", "Lopez", "sofia@gmail.com", "Calle Falsa 456",
                2019, 14000, "Derecho");
        Estudiantes e4 = new Estudiantes("45678901", "Juan", "Perez", "juan@gmail.com", "San Martín 555",
                2022, 16000, "Arquitectura");

        //2
        Staff s1 = new Staff("56789012", "Carlos", "Fernandez", "carlos@uni.edu", "Rivadavia 1200",
                250000, "Mañana");
        Staff s2 = new Staff("67890123", "María", "Suarez", "maria@uni.edu", "Belgrano 800",
                220000, "Noche");
        Staff s3 = new Staff("78901234", "Pedro", "Gonzalez", "pedro@uni.edu", "Mitre 333",
                270000, "Mañana");
        Staff s4 = new Staff("89012345", "Laura", "Ramirez", "laura@uni.edu", "Sarmiento 999",
                230000, "Noche");

        //3

        Persona [] personas = {e1, e2, e3, e4, s1, s2, s3, s4};

        //4
        System.out.println("----- Listado de Personas (Estudiantes y Staff) -----");
        for(Persona p : personas){
            System.out.println(p);
        }

        //5
        int cantidadEstudiantes = 0;
        int cantidadStaff = 0;
        for (Persona p : personas) {
            if (p instanceof Estudiantes) {
                cantidadEstudiantes++;
            } else if (p instanceof Staff) {
                cantidadStaff++;
            }
        }

        System.out.println("Cantidad de estudiantes: " + cantidadEstudiantes);
        System.out.println("Cantidad de staff: " + cantidadStaff);




    }
}