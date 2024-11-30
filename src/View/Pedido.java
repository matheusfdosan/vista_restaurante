/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Pichau
 */
@Entity
@Table(name = "pedido", catalog = "vista_restaurante", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByIdPedido", query = "SELECT p FROM Pedido p WHERE p.idPedido = :idPedido"),
    @NamedQuery(name = "Pedido.findByMesa", query = "SELECT p FROM Pedido p WHERE p.mesa = :mesa"),
    @NamedQuery(name = "Pedido.findByNumerosPedidos", query = "SELECT p FROM Pedido p WHERE p.numerosPedidos = :numerosPedidos"),
    @NamedQuery(name = "Pedido.findByObservacao", query = "SELECT p FROM Pedido p WHERE p.observacao = :observacao"),
    @NamedQuery(name = "Pedido.findByDataHora", query = "SELECT p FROM Pedido p WHERE p.dataHora = :dataHora"),
    @NamedQuery(name = "Pedido.findByGarcom", query = "SELECT p FROM Pedido p WHERE p.garcom = :garcom"),
    @NamedQuery(name = "Pedido.findByStatus", query = "SELECT p FROM Pedido p WHERE p.status = :status"),
    @NamedQuery(name = "Pedido.findByPrecoPrat", query = "SELECT p FROM Pedido p WHERE p.precoPrat = :precoPrat")})
public class Pedido implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pedido")
    private Integer idPedido;
    @Basic(optional = false)
    @Column(name = "mesa")
    private int mesa;
    @Basic(optional = false)
    @Column(name = "numeros_pedidos")
    private String numerosPedidos;
    @Column(name = "observacao")
    private String observacao;
    @Basic(optional = false)
    @Column(name = "data_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;
    @Basic(optional = false)
    @Column(name = "garcom")
    private String garcom;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "preco_prat")
    private String precoPrat;

    public Pedido() {
    }

    public Pedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(Integer idPedido, int mesa, String numerosPedidos, Date dataHora, String garcom, String status, String precoPrat) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.numerosPedidos = numerosPedidos;
        this.dataHora = dataHora;
        this.garcom = garcom;
        this.status = status;
        this.precoPrat = precoPrat;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        Integer oldIdPedido = this.idPedido;
        this.idPedido = idPedido;
        changeSupport.firePropertyChange("idPedido", oldIdPedido, idPedido);
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        int oldMesa = this.mesa;
        this.mesa = mesa;
        changeSupport.firePropertyChange("mesa", oldMesa, mesa);
    }

    public String getNumerosPedidos() {
        return numerosPedidos;
    }

    public void setNumerosPedidos(String numerosPedidos) {
        String oldNumerosPedidos = this.numerosPedidos;
        this.numerosPedidos = numerosPedidos;
        changeSupport.firePropertyChange("numerosPedidos", oldNumerosPedidos, numerosPedidos);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        changeSupport.firePropertyChange("observacao", oldObservacao, observacao);
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        Date oldDataHora = this.dataHora;
        this.dataHora = dataHora;
        changeSupport.firePropertyChange("dataHora", oldDataHora, dataHora);
    }

    public String getGarcom() {
        return garcom;
    }

    public void setGarcom(String garcom) {
        String oldGarcom = this.garcom;
        this.garcom = garcom;
        changeSupport.firePropertyChange("garcom", oldGarcom, garcom);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getPrecoPrat() {
        return precoPrat;
    }

    public void setPrecoPrat(String precoPrat) {
        String oldPrecoPrat = this.precoPrat;
        this.precoPrat = precoPrat;
        changeSupport.firePropertyChange("precoPrat", oldPrecoPrat, precoPrat);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedido != null ? idPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.idPedido == null && other.idPedido != null) || (this.idPedido != null && !this.idPedido.equals(other.idPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Pedido[ idPedido=" + idPedido + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
