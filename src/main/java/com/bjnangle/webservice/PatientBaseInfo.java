package com.bjnangle.webservice;

import com.bjnangle.webservice.base.CommonService;
import com.bjnangle.webservice.dao.AhslPatientRepository;
import com.bjnangle.webservice.helper.*;
import com.bjnangle.webservice.model.AhslPatient;
import org.apache.commons.collections.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * 患者基本信息
 */
public class PatientBaseInfo extends CommonService {

    private AhslPatientRepository ahslPatientRepository = (AhslPatientRepository) SpringContextHelper.getBean("ahslPatientRepository");

    @Override
    protected Boolean listMap2ObjectAndUpdateDB(List<Map<String, String>> listMap, Class<Object> objectClass) {
        List<AhslPatient> entityList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(listMap)) {
            for (Map<String, String> map : listMap) {
                AhslPatient entity = new AhslPatient();

                entity.setPatpatientid(map.get("PATPatientID"));
                entity.setPatname(map.get("PATName"));
                entity.setPatdob(map.get("PATDob"));
                entity.setPatsexdesc(map.get("PATSexDesc"));
                entity.setPattelephone(map.get("PATTelephone"));
                entity.setPatremarks(map.get("PATRemarks"));
                entity.setUpdateuserdesc(map.get("UpdateUserDesc"));
                entity.setUpdatedate(map.get("UpdateDate"));
                entity.setUpdatetime(map.get("UpdateTime"));
                entity.setInsdatetime(DateHelper.getDateTime());

                entityList.add(entity);

            }
        }
        ahslPatientRepository.saveAll(entityList);
        return Boolean.TRUE;
    }

}
