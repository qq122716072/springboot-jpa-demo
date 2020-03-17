package com.bjnangle.webservice.dao;

import com.bjnangle.webservice.model.AhslInpatient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 住院登记
 */
@Repository
public interface AhslInpatientRepository extends CrudRepository<AhslInpatient, String> {


}
