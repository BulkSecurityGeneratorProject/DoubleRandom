package com.yyh.service;

import com.yyh.domain.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * Service Interface for managing Company.
 */
public interface CompanyService {

    /**
     * Create a company list
     *
     * @param filepath the file to convert
     * @return the company list
     */
    List<Company> createCompanyList(String filepath);

    /**
     * Save a company.
     *
     * @param company the entity to save
     * @return the persisted entity
     */
    Company save(Company company);

    /**
     *  Get all the companies.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<Company> findAll(Pageable pageable);

    /**
     *  Get the "id" company.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    Company findOne(Long id);

    /**
     *  Delete the "id" company.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
