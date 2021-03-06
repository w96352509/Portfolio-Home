package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table
public class Classify {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String name;
    
    @Column
    private Boolean tx; // transaction
    
    @OneToMany(cascade=CascadeType.PERSIST, mappedBy="classify")
    @OrderBy("id ASC")
    @JsonIgnoreProperties("classify") //防止遞回忽略單方欄位
    private Set<TStock> tStocks;

    public Classify() {
    }

    public Classify(String name, Boolean tx) {
        this.name = name;
        this.tx = tx;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TStock> gettStocks() {
        return tStocks;
    }

    public void settStocks(Set<TStock> tStocks) {
        this.tStocks = tStocks;
    }

    public Boolean getTx() {
        return tx;
    }

    public void setTx(Boolean tx) {
        this.tx = tx;
    }

    

    @Override
    public String toString() {
        return "Classify{" + "id=" + id + ", name=" + name + ", tx=" + tx + '}';
    }
    
    
}
