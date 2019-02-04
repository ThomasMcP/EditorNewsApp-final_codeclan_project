package com.codeclan.newsApp.newsApp.repositories.JournalistRepository;

import com.codeclan.newsApp.newsApp.models.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JournalistRepository extends JpaRepository<Journalist, Long>, JournalistRepositoryCustom {

    List<Journalist> findJournalistByName(String name);

    List<Journalist> findJournalistById(Long journalistId);

}

