/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Services;
import java.util.List;
import Modelo.Entity.Servicio;
import Modelo.Dao.Temporal.ServicioRepository;
/**
 *
 * @author LAB DESARROLLO 05
 */
public class ServicioS {
    
    private final ServicioRepository repositorio;

    public ServicioS(ServicioRepository repositorio) {
        this.repositorio = repositorio;
    }

    public List<Servicio> listarServicios() {
        return repositorio.listarTodos().stream()
                .filter(Servicio::isActivo)
                .collect(java.util.stream.Collectors.toList());
    }

    public Servicio buscarPorId(int id) {
        return repositorio.buscarPorId(id);
    }

    public List<Servicio> buscar(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return listarServicios();
        }

        return repositorio.buscarPorNombre(texto).stream()
                .filter(Servicio::isActivo)
                .collect(java.util.stream.Collectors.toList());
    }

    public List<Servicio> buscarPorCategoria(int categoriaId) {
        return repositorio.buscarPorCategoria(categoriaId).stream()
                .filter(Servicio::isActivo)
                .collect(java.util.stream.Collectors.toList());
    }

    public void registrarServicio(Servicio servicio) {
        validarServicio(servicio);
        repositorio.agregar(servicio);
    }

    public boolean actualizarServicio(Servicio servicio) {
        validarServicio(servicio);
        return repositorio.actualizar(servicio);
    }

    public boolean eliminarServicio(int id) {
        return repositorio.eliminar(id);
    }

    private void validarServicio(Servicio servicio) {
        if (servicio == null) {
            throw new IllegalArgumentException(
                    "El servicio es obligatorio.");
        }

        if (servicio.getNombre() == null
                || servicio.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre es obligatorio.");
        }

        if (servicio.getCategoria() == null) {
            throw new IllegalArgumentException(
                    "Debes seleccionar una categoría.");
        }

        if (servicio.getOrganizacion() == null) {
            throw new IllegalArgumentException(
                    "Debes indicar la organización.");
        }
    }
}
