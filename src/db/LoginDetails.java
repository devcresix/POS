/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author iresh
 */
@Entity
@Table(name = "loginDetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoginDetails.findAll", query = "SELECT l FROM LoginDetails l"),
    @NamedQuery(name = "LoginDetails.findByUserId", query = "SELECT l FROM LoginDetails l WHERE l.userId = :userId"),
    @NamedQuery(name = "LoginDetails.findByUsername", query = "SELECT l FROM LoginDetails l WHERE l.username = :username"),
    @NamedQuery(name = "LoginDetails.findByPassword", query = "SELECT l FROM LoginDetails l WHERE l.password = :password")})
public class LoginDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public LoginDetails() {
    }

    public LoginDetails(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoginDetails)) {
            return false;
        }
        LoginDetails other = (LoginDetails) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.LoginDetails[ userId=" + userId + " ]";
    }
    
}
