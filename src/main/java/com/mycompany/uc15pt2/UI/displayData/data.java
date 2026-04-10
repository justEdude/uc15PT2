/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uc15pt2.UI.displayData;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author danto
 */
public abstract class data {
private LocalDate DataAtual;
private LocalTime Hora;
private LocalTime HoraFim;

    /**
     * @return the Data
     */
    public LocalDate getDataAtual() {
        return DataAtual;
    }

    /**
     * @param DataAtual the DataAtual to set
     */
    public void setDataAtual(LocalDate DataAtual) {
        this.DataAtual = DataAtual;
    }

    /**
     * @return the Hora
     */
    public LocalTime getHora() {
        return Hora;
    }

    /**
     * @param Hora the Hora to set
     */
    public void setHora(LocalTime Hora) {
        this.Hora = Hora;
    }

    /**
     * @return the HoraFim
     */
    public LocalTime getHoraFim() {
        return HoraFim;
    }

    /**
     * @param HoraFim the HoraFim to set
     */
    public void setHoraFim(LocalTime HoraFim) {
        this.HoraFim = HoraFim;
    }

}
