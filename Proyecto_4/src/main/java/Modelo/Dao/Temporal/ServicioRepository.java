/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Dao.Temporal;
import java.util.List;
import Modelo.Entity.Servicio;
/**
 *
 * @author LAB DESARROLLO 05
 */
public interface ServicioRepository {

    List<Servicio> listarTodos();

    Servicio buscarPorId(int id);

    List<Servicio> buscarPorNombre(String nombre);

    List<Servicio> buscarPorCategoria(int categoriaId);

    void agregar(Servicio servicio);

    boolean actualizar(Servicio servicio);

    boolean eliminar(int id);
}
