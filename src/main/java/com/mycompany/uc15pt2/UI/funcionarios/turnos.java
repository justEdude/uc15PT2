
package com.mycompany.uc15pt2.UI.funcionarios;

import com.mycompany.uc15pt2.UI.displayData.data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class turnos extends data{
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;
private String nome;
private String periodo;
private LocalDate DataAtual;
private LocalTime Hora;
private LocalTime HoraFim;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
 public turnos(LocalDate DataAtual, LocalTime Hora, LocalTime HoraFim){
      this.DataAtual = DataAtual;
      this.Hora = Hora;
      this.HoraFim = HoraFim;
    }
 public turnos(){};

    /**
     * @return the DataAtual
     */
 @Override
    public LocalDate getDataAtual() {
        return DataAtual;
    }

    /**
     * @param DataAtual the DataAtual to set
     */
    @Override
    public void setDataAtual(LocalDate DataAtual) {
        this.DataAtual = DataAtual;
    }

    /**
     * @return the Hora
     */
    @Override
    public LocalTime getHora() {
        return Hora;
    }

    /**
     * @param Hora the Hora to set
     */
    @Override
    public void setHora(LocalTime Hora) {
        this.Hora = Hora;
    }

    /**
     * @return the HoraFim
     */
@Override
    public LocalTime getHoraFim() {
        return HoraFim;
    }

    /**
     * @param HoraFim the HoraFim to set
     */
@Override
    public void setHoraFim(LocalTime HoraFim) {
        this.HoraFim = HoraFim;
    }

}
