
package com.mycompany.uc15pt2.UI.fornecedores;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//criar o resto da tabela sql e criar uma classe para datas para as classes turnos e vendas
@Entity
@Table(name="fornecedores")
public  class fornecedores {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String nome;
private String Fornecimento;
private String Localizacao;

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
     * @return the fornecimento
     */
    public String getFornecimento() {
        return Fornecimento;
    }

    /**
     * @param fornecimento the fornecimento to set
     */
    public void setFornecimento(String fornecimento) {
        this.Fornecimento = fornecimento;
    }

    /**
     * @return the Localizacao
     */
    public String getLocalizacao() {
        return Localizacao;
    }

    /**
     * @param Localizacao the Localizacao to set
     */
    public void setLocalizacao(String Localizacao) {
        this.Localizacao = Localizacao;
    }
}
