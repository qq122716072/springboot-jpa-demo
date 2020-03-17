package com.bjnangle.webservice.dao;

import com.bjnangle.webservice.model.AhslAddorders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 接收医嘱信息
 */
@Repository
public interface AhslAddordersRepository extends CrudRepository<AhslAddorders, String> {


}
