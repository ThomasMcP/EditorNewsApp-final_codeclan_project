package com.codeclan.newsApp.newsApp.repositories.JournalistRepository;

import com.codeclan.newsApp.newsApp.models.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JournalistRepository extends JpaRepository<Journalist, Long>, JournalistRepositoryCustom {
<<<<<<< HEAD

    List<Journalist> findJournalistByName(String name);

    List<Journalist> findJournalistById(Long journalistId);

}
=======
    List<Journalist> findJournalistsByName(String name);

    List<Journalist> findJournalistById(Long journalist_id);
}

>>>>>>> fa75ad8af2b90b0827a17f80e850007bad49f997
