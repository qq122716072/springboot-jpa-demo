package com.bjnangle.webservice.dao;

import com.bjnangle.webservice.model.AhslInpatientcancel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 取消住院登记
 */
@Repository
public interface AhslInpatientcancelRepository extends CrudRepository<AhslInpatientcancel, String> {


}
