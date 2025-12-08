package com.johnwilliam.ExpressoUnix.Repositories.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import com.johnwilliam.ExpressoUnix.Models.EmpresaModels;

public interface EmpresaJPA extends JpaRepository<EmpresaModels, Long> {}
