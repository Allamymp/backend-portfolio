package com.Porfolio.Market.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_collaborators")
public class Collaborators implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String address;
    private Sector sector;
    @OneToMany
    @JoinColumn(name = "contract_id")
    private Contracts contract;
    private Double salary;
    private LocalDate lastVacation;
    public Collaborators() {
    }

    public Collaborators(Long id, String name, String phone, String address, Sector sector, Contracts contract,
                         Double salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.sector = sector;
        this.contract = contract;
        this.lastVacation = contract.getSignDate();
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

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Contracts getContract() {
        return contract;
    }

    public void setContract(Contracts contract) {
        this.contract = contract;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
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
