package com.bjnangle.webservice.dao;

import com.bjnangle.webservice.model.HisbedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: nics
 * @description: ${description}
 * @author: weixd
 * @createTime: 2019-01-10 14:18
 **/
@Repository
public interface HisbedRepository extends JpaRepository<HisbedEntity, Integer> {


}
