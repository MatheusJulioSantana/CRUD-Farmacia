package com.farmatia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.farmatia.model.Categoria;

public interface CategoriaRespository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByCategoriaContainingIgnoreCase(@Param("categoria")String categoria);
}
