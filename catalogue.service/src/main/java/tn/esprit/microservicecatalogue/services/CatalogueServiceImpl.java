package tn.esprit.microservicecatalogue.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.microservicecatalogue.entities.CatalogueEntity;
import tn.esprit.microservicecatalogue.repositories.CatalogueRepository;

import java.util.List;

/**
 * Implementation of the ICatalogueService interface that provides CRUD operations for catalogue entities.
 */
@Service
public class CatalogueServiceImpl implements ICatalogueService {
    /**
     * The CatalogueRepository object used for accessing catalogue data in the database.
     * This object is automatically initialized and injected into the CatalogueController
     * by Spring's dependency injection framework using the @Autowired annotation.
     */
    @Autowired
    private CatalogueRepository catalogueRepository;

    /**
     * Retrieves a list of all catalogues in the database.
     *
     * @return A list of catalogue entities.
     */
    @Override
    public List<CatalogueEntity> getAllcatalogues() {
        return catalogueRepository.findAll();
    }

    /**
     * Retrieves a catalogue entity from the database based on its ID.
     *
     * @param id The ID of the catalogue to retrieve.
     * @return The catalogue entity with the specified ID, or null if no such catalogue exists.
     */
    @Override
    public CatalogueEntity getcatalogueById(Long id) {
        return catalogueRepository.findById(id).orElse(null);
    }


    /**
     * Creates a new catalogue entity in the database.
     *
     * @param catalogueEntity The catalogue entity to create.
     * @return The created catalogue entity, with a hashed password.
     */
    @Override
    public CatalogueEntity createcatalogue(CatalogueEntity catalogueEntity) {
        catalogueEntity.setCode(catalogueEntity.getCode());
        catalogueEntity.setDescription(catalogueEntity.getDescription());
        catalogueEntity.setName(catalogueEntity.getName());
        return catalogueRepository.save(catalogueEntity);
    }

    /**
     * Updates an existing catalogue entity in the database.
     *
     * @param id         The ID of the catalogue to update.
     * @param catalogueEntity The updated catalogue entity.
     * @return The updated catalogue entity, with a hashed password.
     */
    @Override
    public CatalogueEntity updatecatalogue(Long id, CatalogueEntity catalogueEntity) {
        CatalogueEntity existingCatalogueEntity = catalogueRepository.findById(id).orElse(null);
        if (existingCatalogueEntity != null) {
            existingCatalogueEntity.setCode(catalogueEntity.getCode());
            existingCatalogueEntity.setDescription(catalogueEntity.getDescription());
            existingCatalogueEntity.setName(catalogueEntity.getName());
            return catalogueRepository.save(existingCatalogueEntity);
        }
        return null;
    }

    /**
     * Deletes a catalogue entity from the database based on its ID.
     *
     * @param id The ID of the catalogue to delete.
     */
    @Override
    public void deletecatalogue(Long id) {
        catalogueRepository.deleteById(id);
    }

}
