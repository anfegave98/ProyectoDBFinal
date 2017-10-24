/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Auxiliar;
import Model.Supervisor;
import Util.DbUtil;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Labin
 */
public class AuxiliarDAO {
    
    
    private Connection connection;

    public AuxiliarDAO() throws SQLException {
        connection = DbUtil.getConnection();
    }
    
     public boolean addAuxiliar(Auxiliar auxiliar) throws SQLException {
        boolean result = false;
        Supervisor supervisor = auxiliar.get
        Connection connection = DbUtil.getConnection();
        String query = "insert into tabla (tabla.nombre_tabla,tabla.id_esquema) values (?, ? );";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, auxiliar.getNombre_tabla());
            preparedStmt.setInt(2, auxiliar.getId_esquema());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


}
