package com.example.API.repositories;

import com.example.API.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean // para que no se instancie
public interface BaseRepository  <E extends Base, Id extends Serializable> extends JpaRepository<E, Id> { // para limitar el tipo de atributo que le pasamos a la clase
}
