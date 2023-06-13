/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.app.tresenraya.dao;

/**
 *
 * @author josep
 */
import java.util.List;
import pe.com.syscenterlife.autocomp.ModeloDataAutocomplet;
import pe.edu.upeu.app.tresenraya.modelo.TresEnRayaTO;
import pe.edu.upeu.app.tresenraya.modelo.ComboBoxOption;

public interface TresEnRayaDaoI {

    public int create(TresEnRayaTO d);
    public int update(TresEnRayaTO d);
    public int delete(int id) throws Exception;
    public List<TresEnRayaTO> listCmb(String filter);
    public List<TresEnRayaTO> listarTodo();
    public List<ModeloDataAutocomplet> listAutoComplet(String filter);
    public List<ComboBoxOption> listaEstado();
    public List<ComboBoxOption> listarGanador();

}
