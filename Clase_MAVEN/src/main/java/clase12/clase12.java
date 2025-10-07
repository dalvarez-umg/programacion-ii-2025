package clase12;

import java.sql.*;

public class clase12 {
    public static void main(String[] args) {
        // URL de conexión
        String url = "jdbc:mariadb://localhost:3306/demo_db";
        String user = "root";   // tu usuario de MariaDB
        String pass = "118678";   // tu contraseña de MariaDB

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Conexión establecida!");

            // Insertar un estudiante
            String insert = "INSERT INTO estudiante(nombre, edad) VALUES (?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insert)) {
                ps.setString(1, "Ana");
                ps.setInt(2, 20);
                ps.executeUpdate();
            }

            // Consultar estudiantes
            String query = "SELECT * FROM estudiante";
            try (Statement st = conn.createStatement();
                 ResultSet rs = st.executeQuery(query)) {
                while (rs.next()) {
                    System.out.println(
                            rs.getInt("id") + " - " +
                                    rs.getString("nombre") + " - " +
                                    rs.getInt("edad")
                    );
                }
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
