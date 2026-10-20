/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Dao.Temporal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import Modelo.Entity.Servicio;
/**
 *
 * @author LAB DESARROLLO 05
 */
public class ServicioRepositoryMemoria implements ServicioRepository {
    
     private final List<Servicio> servicios = new ArrayList<>();

    @Override
    public List<Servicio> listarTodos() {
        return new ArrayList<>(servicios);
    }

    @Override
    public Servicio buscarPorId(int id) {
        for (Servicio servicio : servicios) {
            if (servicio.getId() == id) {
                return servicio;
            }
        }
        return null;
    }

    @Override
    public List<Servicio> buscarPorNombre(String nombre) {
        String texto = nombre == null
                ? ""
                : nombre.trim().toLowerCase();

        return servicios.stream()
                .filter(s -> s.getNombre()
                        .toLowerCase().contains(texto))
                .collect(Collectors.toList());
    }

    @Override
    public List<Servicio> buscarPorCategoria(int categoriaId) {
        return servicios.stream()
                .filter(s -> s.getCategoria() != null)
                .filter(s -> s.getCategoria().getId() == categoriaId)
                .collect(Collectors.toList());
    }

    @Override
    public void agregar(Servicio servicio) {
        if (servicio == null) {
            throw new IllegalArgumentException(
                    "El servicio no puede ser nulo.");
        }

        if (buscarPorId(servicio.getId()) != null) {
            throw new IllegalArgumentException(
                    "Ya existe un servicio con ese ID.");
        }

        servicios.add(servicio);
    }

    @Override
    public boolean actualizar(Servicio servicio) {
        for (int i = 0; i < servicios.size(); i++) {
            if (servicios.get(i).getId() == servicio.getId()) {
                servicios.set(i, servicio);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        return servicios.removeIf(s -> s.getId() == id);
    }
}
