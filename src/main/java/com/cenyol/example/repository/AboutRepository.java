package com.cenyol.example.repository;

import com.cenyol.example.model.TblAboutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by root on 17-6-16.
 */
public interface AboutRepository extends JpaRepository<TblAboutEntity ,Integer> {

}
