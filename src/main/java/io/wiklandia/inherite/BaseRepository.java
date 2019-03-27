package io.wiklandia.inherite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface BaseRepository extends JpaRepository<Base, Long> {
}
