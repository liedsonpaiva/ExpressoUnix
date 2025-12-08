package com.johnwilliam.ExpressoUnix.Repositories.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import com.johnwilliam.ExpressoUnix.Models.EnderecoModels;

public interface EnderecoJPA extends JpaRepository<EnderecoModels, Long> {}