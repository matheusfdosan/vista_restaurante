/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Pichau
 */
@Entity
@Table(name = "menu", catalog = "vista_restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
    @NamedQuery(name = "Menu.findByIdPrato", query = "SELECT m FROM Menu m WHERE m.idPrato = :idPrato"),
    @NamedQuery(name = "Menu.findByNomePrato", query = "SELECT m FROM Menu m WHERE m.nomePrato = :nomePrato"),
    @NamedQuery(name = "Menu.findByDescPrato", query = "SELECT m FROM Menu m WHERE m.descPrato = :descPrato"),
    @NamedQuery(name = "Menu.findByPreco", query = "SELECT m FROM Menu m WHERE m.preco = :preco"),
    @NamedQuery(name = "Menu.findByTipo", query = "SELECT m FROM Menu m WHERE m.tipo = :tipo")})
public class Menu implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_prato")
    private Integer idPrato;
    @Basic(optional = false)
    @Column(name = "nome_prato")
    private String nomePrato;
    @Basic(optional = false)
    @Column(name = "desc_prato")
    private String descPrato;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "preco")
    private BigDecimal preco;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;

    public Menu() {
    }

    public Menu(Integer idPrato) {
        this.idPrato = idPrato;
    }

    public Menu(Integer idPrato, String nomePrato, String descPrato, BigDecimal preco, String tipo) {
        this.idPrato = idPrato;
        this.nomePrato = nomePrato;
        this.descPrato = descPrato;
        this.preco = preco;
        this.tipo = tipo;
    }

    public Integer getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(Integer idPrato) {
        Integer oldIdPrato = this.idPrato;
        this.idPrato = idPrato;
        changeSupport.firePropertyChange("idPrato", oldIdPrato, idPrato);
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        String oldNomePrato = this.nomePrato;
        this.nomePrato = nomePrato;
        changeSupport.firePropertyChange("nomePrato", oldNomePrato, nomePrato);
    }

    public String getDescPrato() {
        return descPrato;
    }

    public void setDescPrato(String descPrato) {
        String oldDescPrato = this.descPrato;
        this.descPrato = descPrato;
        changeSupport.firePropertyChange("descPrato", oldDescPrato, descPrato);
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        BigDecimal oldPreco = this.preco;
        this.preco = preco;
        changeSupport.firePropertyChange("preco", oldPreco, preco);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrato != null ? idPrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.idPrato == null && other.idPrato != null) || (this.idPrato != null && !this.idPrato.equals(other.idPrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Menu[ idPrato=" + idPrato + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
