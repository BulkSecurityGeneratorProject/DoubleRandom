package com.yyh.dr.repository;

import com.yyh.dr.domain.DoubleRandom;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the DoubleRandom entity.
 */
@SuppressWarnings("unused")
public interface DoubleRandomRepository extends JpaRepository<DoubleRandom,Long> {

}