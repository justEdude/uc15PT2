
package com.mycompany.uc15pt2.UI.vendas;

import com.mycompany.uc15pt2.UI.displayData.data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class vendas extends data{

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
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;

private String cliente;
private String valor;
private int CPF;
private LocalDate DataAtual;
private LocalTime Hora;

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
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

 public vendas(LocalDate DataAtual, LocalTime Hora){
      this.DataAtual = DataAtual;
      this.Hora = Hora;
    }
 public vendas(){};

}
