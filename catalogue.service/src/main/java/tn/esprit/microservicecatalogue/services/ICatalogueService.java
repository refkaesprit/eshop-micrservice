package tn.esprit.microservicecatalogue.services;

import tn.esprit.microservicecatalogue.entities.CatalogueEntity;

import java.util.List;

/**
 * Interface for the catalogue Service, which provides operations for managing catalogue data.
 */
public interface ICatalogueService {
    /**
     * Retrieve a list of all catalogues in the system.
     *
     * @return A List of CatalogueEntity objects representing all catalogues in the system.
     */
    List<CatalogueEntity> getAllcatalogues();

    /**
     * Retrieve a catalogue with the specified ID.
     *
     * @param id The ID of the catalogue to retrieve.
     * @return A CatalogueEntity object representing the catalogue with the specified ID, or null if not found.
     */
    CatalogueEntity getcatalogueById(Long id);

    /**
     * Create a new catalogue with the specified data.
     *
     * @param catalogueEntity A CatalogueEntity object containing the data for the new catalogue.
     * @return A CatalogueEntity object representing the newly created catalogue.
     */
    CatalogueEntity createcatalogue(CatalogueEntity catalogueEntity);

    /**
     * Update an existing catalogue with the specified data.
     *
     * @param id         The ID of the catalogue to update.
     * @param catalogueEntity A CatalogueEntity object containing the updated data for the catalogue.
     * @return A CatalogueEntity object representing the updated catalogue, or null if the catalogue was not found.
     */
    CatalogueEntity updatecatalogue(Long id, CatalogueEntity catalogueEntity);

    /**
     * Delete a catalogue with the specified ID.
     *
     * @param id The ID of the catalogue to delete.
     */
    void deletecatalogue(Long id);


}
