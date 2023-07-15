package tn.esprit.microservicecatalogue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.microservicecatalogue.entities.CatalogueEntity;

/**
 * This interface represents the repository for managing CatalogueEntity objects.
 * It extends the JpaRepository interface which provides basic CRUD operations
 * for the CatalogueEntity class and allows us to easily perform database operations.
 *
 */
@Repository
public interface CatalogueRepository extends JpaRepository<CatalogueEntity, Long> {
}
