package com.bjnangle.webservice.dao;

import com.bjnangle.webservice.model.AhslPatient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 病人基本信息
 */
@Repository
public interface AhslPatientRepository extends CrudRepository<AhslPatient, String> {

    //根据id查询一个
    AhslPatientRepository findByNggid(String nggid);

}
