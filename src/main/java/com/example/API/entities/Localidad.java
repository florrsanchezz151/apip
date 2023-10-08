package com.example.API.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Localidad")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Localidad extends Base{
    @Column(name = "denominacion")
    private String denominacion;
}
