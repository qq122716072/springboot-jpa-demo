package com.bjnangle.webservice.dao;

import com.bjnangle.webservice.model.AhslAdmtransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 接收转科信息
 */
@Repository
public interface AhslAdmtransactionRepository extends CrudRepository<AhslAdmtransaction, String> {


}
