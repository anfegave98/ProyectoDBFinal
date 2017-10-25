/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Supervisor;
import Util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Labin
 */
public class SupervisorDAO {
    private Connection connection;

    public SupervisorDAO() throws SQLException {
        connection = DbUtil.getConnection();
    }
    
      public boolean addSupervisor(Supervisor supervisor) throws SQLException {
        boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "insert into supervisor (supervisor.id_supervisor,supervisor.nombre_supervidor,supervisor.apellido_supervisor,fecha_Entrada) values (?,?,?,? );";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, supervisor.getId());
            preparedStmt.setString(2, supervisor.getNombre());
            preparedStmt.setString(3, supervisor.getApellido());
            preparedStmt.setString(4, supervisor.getFechaEntrada());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
      
       public boolean deleteSupervidor(int a) throws SQLException {
        boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "delete from supervisor where id_supervisor = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, a);
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
       
        public List<Supervisor> getAllSupervisor() throws SQLException {
        List<Supervisor> supervisor = null;
        boolean result = false;
        String query = "SELECT * FROM supervisor";
        Connection connection = DbUtil.getConnection();
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int id = 0;
            String nombre = null;
            String apellido = null;
            String fecha_Entrada = null;

            while (rs.next()) {
                if (supervisor == null) {
                    supervisor = new ArrayList<Supervisor>();
                }
                Supervisor registro = new Supervisor(id,nombre,apellido, fecha_Entrada);
                id = rs.getInt("id_supervisor");
                registro.setId(id);

                nombre = rs.getString("nombre_supervisor");
                registro.setNombre(nombre);
                
                apellido = rs.getString("apellido_supervisor");
                registro.setApellido(nombre);

                fecha_Entrada = rs.getString("fecha_Entrada");
                registro.setFechaEntrada(fecha_Entrada);

                supervisor.add(registro);

            }
            if (supervisor != null) {
                for (int i = 0; i < supervisor.size(); i++) {
                    System.out.println(supervisor.get(i).getId() + " " + supervisor.get(i).getNombre() + " " + supervisor.get(i).getApellido() + " " + supervisor.get(i).getFechaEntrada());
                }
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Supervisores");
            e.printStackTrace();
        }

        return supervisor;

    }
        
        public Supervisor getSupervisorId(int a) throws SQLException {
        Supervisor supervisor = null;
        boolean result = false;
        String query = "select * from supervisor where id_supervisor = ?";
        Connection connection = DbUtil.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int id = 0;
            String nombre = null;
            String apellido = null;
            String fecha_Entrada = null;

            while (rs.next()) {
             
                id = rs.getInt("id_supervisor");
                supervisor.setId(id);

                nombre = rs.getString("nombre_supervisor");
                supervisor.setNombre(nombre);
                
                apellido = rs.getString("apellido_supervisor");
                supervisor.setApellido(nombre);

                fecha_Entrada = rs.getString("fecha_entrada");
                supervisor.setNombre(nombre);
            }
           
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener el supervisor");
            e.printStackTrace();
        }

        return supervisor;

    }

       
    
    
}
