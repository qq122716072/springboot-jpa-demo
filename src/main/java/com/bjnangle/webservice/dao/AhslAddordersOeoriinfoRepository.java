package com.bjnangle.webservice.dao;

import com.bjnangle.webservice.model.AhslAddordersOeoriinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 医嘱状态变更
 */
@Repository
public interface AhslAddordersOeoriinfoRepository extends CrudRepository<AhslAddordersOeoriinfo, String> {


}
