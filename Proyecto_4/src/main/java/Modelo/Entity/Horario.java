/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Entity;
import java.time.DayOfWeek;
import java.time.LocalTime;
/**
 *
 * @author LAB DESARROLLO 05
 */
public class Horario {
    
    private int id;
    private DayOfWeek diaSemana;
    private LocalTime horaApertura;
    private LocalTime horaCierre;
    private boolean cerrado;

    public Horario(int id, DayOfWeek diaSemana,LocalTime horaApertura,LocalTime horaCierre,boolean cerrado) {
        this.id = id;
        this.diaSemana = diaSemana;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.cerrado = cerrado;
    }

    public int getId() {
        return id;
    }

    public DayOfWeek getDiaSemana() {
        return diaSemana;
    }

    public LocalTime getHoraApertura() {
        return horaApertura;
    }

    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public String getHorarioTexto() {
        if (cerrado) {
            return diaSemana + ": Cerrado";
        }

        return diaSemana + ": " + horaApertura
                + " - " + horaCierre;
    }
}
