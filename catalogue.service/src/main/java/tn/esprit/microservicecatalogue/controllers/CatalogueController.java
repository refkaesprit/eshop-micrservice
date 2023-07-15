package tn.esprit.microservicecatalogue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.microservicecatalogue.entities.CatalogueEntity;
import tn.esprit.microservicecatalogue.services.CatalogueServiceImpl;
import tn.esprit.microservicecatalogue.services.ICatalogueService;

import java.util.List;

/**
 * This class represents the REST controller for managing catalogue resources.
 *
 */
@RestController
@RequestMapping("/catalogues")
public class CatalogueController {
    /**
     * The service implementation for catalogue management.
     */
    @Autowired
    private CatalogueServiceImpl catalogueService;

    /**
     * Returns a list of all catalogues.
     *
     * @return A list of all catalogues.
     */
    @GetMapping("/list")
    public List<CatalogueEntity> getAllcatalogues() {
        return catalogueService.getAllcatalogues();
    }

    /**
     * Returns the catalogue with the specified ID.
     *
     * @param id The ID of the catalogue to return.
     * @return The catalogue with the specified ID, or null if no such catalogue exists.
     */
    @GetMapping("/list/{id}")
    public CatalogueEntity getcatalogueById(@PathVariable Long id) {
        return catalogueService.getcatalogueById(id);
    }

    /**
     * Creates a new catalogue.
     *
     * @param catalogueEntity The catalogue to create.
     * @return The newly created catalogue.
     */
    @PostMapping("/list/create")
    public CatalogueEntity createcatalogue(@RequestBody CatalogueEntity catalogueEntity) {
        return catalogueService.createcatalogue(catalogueEntity);
    }

    /**
     * Updates the catalogue with the specified ID.
     *
     * @param id         The ID of the catalogue to update.
     * @param catalogueEntity The new catalogue data.
     * @return The updated catalogue, or null if no such catalogue exists.
     */
    @PutMapping("/list/update/{id}")
    public CatalogueEntity updatecatalogue(@PathVariable Long id, @RequestBody CatalogueEntity catalogueEntity) {
        return catalogueService.updatecatalogue(id, catalogueEntity);
    }

    /**
     * Deletes the catalogue with the specified ID.
     *
     * @param id The ID of the catalogue to delete.
     */
    @DeleteMapping("/list/delete/{id}")
    public void deletecatalogue(@PathVariable Long id) {
        catalogueService.deletecatalogue(id);
    }

}
