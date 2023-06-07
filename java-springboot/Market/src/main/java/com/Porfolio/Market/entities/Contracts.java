package com.Porfolio.Market.entities;

import com.Porfolio.Market.entities.enums.ContractStatus;
import com.Porfolio.Market.entities.enums.ContractType;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_contracts")
public class Contracts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ContractType conType;
    private ContractStatus conStatus;
    @ManyToOne
    @JoinColumn(name = "collaborator_id")
    private Collaborators collaborator;
    private String hiredName;
    private Double value;
    private LocalDate signDate;
    private String description;


    public Contracts() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ContractType getConType() {
        return conType;
    }

    public void setConType(ContractType conType) {
        this.conType = conType;
    }

    public ContractStatus getConStatus() {
        return conStatus;
    }

    public void setConStatus(ContractStatus conStatus) {
        this.conStatus = conStatus;
    }

    public String getHiredName() {
        return hiredName;
    }

    public void setHiredName(String hiredName) {
        this.hiredName = hiredName;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDate getSignDate() {
        return signDate;
    }

    public void setSignDate(LocalDate signDate) {
        this.signDate = signDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collaborators getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Collaborators collaborator) {
        this.collaborator = collaborator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contracts contracts)) return false;

        return getId().equals(contracts.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
