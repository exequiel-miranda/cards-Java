package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.ClaseConexion;

public class DoctorDAO {
    public ArrayList<String> getDoctorNames() {
        ArrayList<String> doctorNames = new ArrayList<>();
        Connection con = new ClaseConexion().getConexion();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nombre_doctor FROM tbDoctores");
            while (rs.next()) {
                doctorNames.add(rs.getString("nombre_doctor"));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorNames;
    }
}
