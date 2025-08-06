import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // Objeto que almacena la conexión a la base de datos
    private static Connection connection = null;

    // Método para obtener la conexión
    public static Connection getConnection() {
        try {
            // Si la conexión no existe o está cerrada, la creamos
            if (connection == null || connection.isClosed()) {
                // Cargar el driver de MySQL (es opcional en versiones recientes, pero buena práctica)
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

                // Definir la URL de la base de datos
                // 'localhost' es la dirección de tu servidor local
                // '3306' es el puerto por defecto de MySQL
                // 'db_peliculas' es el nombre de la base de datos que creaste
                // '?serverTimezone=UTC' es para evitar problemas de zona horaria
                String url = "jdbc:mysql://localhost:3306/db_peliculas?serverTimezone=UTC";

                // Definir el usuario y la contraseña de tu base de datos
                // Si usaste XAMPP, el usuario es 'root' y la contraseña está vacía
                String user = "root";
                String password = "";

                // Establecer la conexión
                connection = DriverManager.getConnection(url, user, password);

                System.out.println("Conexión a la base de datos exitosa.");
            }
        } catch (SQLException e) {
            // Manejar cualquier error de conexión
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }

    // Método para cerrar la conexión (es buena práctica)
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión a la base de datos cerrada.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}