package com.Porfolio.Market.entities;

import com.Porfolio.Market.entities.enums.Sector;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_collaborators")
public class Collaborators implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String address;
    private int sector;
    @OneToMany
    @JsonIgnore
    private Set<Contracts> contract = new HashSet<>();
    private BigDecimal salary;
    private LocalDate lastVacation;

    public Collaborators() {
    }

    public Collaborators(Long id, String name, String phone, String address, int sector, Contracts contract,
                         BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.sector = sector;
        this.contract.add(contract);
        // this.lastVacation = contract.getSignDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public Set<Contracts> getItems() {
        return contract;
    }


    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getLastVacation() {
        return lastVacation;
    }

    public void setLastVacation(LocalDate lastVacation) {
        this.lastVacation = lastVacation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Collaborators that)) return false;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
