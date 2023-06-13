/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.tresenraya.dao;

/**
 *
 * @author josep
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import pe.com.syscenterlife.autocomp.ModeloDataAutocomplet;
import pe.edu.upeu.app.tresenraya.conexion.ConnS;
import pe.edu.upeu.app.tresenraya.modelo.ComboBoxOption;
import pe.edu.upeu.app.tresenraya.modelo.TresEnRayaTO;
import pe.edu.upeu.app.tresenraya.util.ErrorLogger;

public class TresEnRayaDao {
    
        ConnS instance = ConnS.getInstance();
    Connection connection = instance.getConnection();
    PreparedStatement ps;
    ResultSet rs;

    ErrorLogger log = new ErrorLogger(TresEnRayaDao.class.getName());

        public int create(TresEnRayaTO d) {
        int rsId = 0;
        String[] returns = {"id_resultado"};
        String sql = "INSERT INTO facultad(nombre_jugador1,nombre_jugador2) values(?) ";
        int i = 0;
        try {
            ps = connection.prepareStatement(sql, returns);         
            
            ps.setString(++i, d.getNombreJugador1());
            ps.setString(++i, d.getNombreJugador2());
            
            rsId = ps.executeUpdate();// 0 no o 1 si commit
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    rsId = rs.getInt(1);
                }
                rs.close();
            }
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "create", ex);
        }
        return rsId;
    }
        
}
