package com.bjnangle.webservice;

import com.bjnangle.webservice.base.CommonService;
import com.bjnangle.webservice.dao.AhslInpatientRepository;
import com.bjnangle.webservice.helper.SpringContextHelper;
import com.bjnangle.webservice.model.AhslInpatient;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 住院登记
 */
public class InPatientEncounterStarted extends CommonService {

    private AhslInpatientRepository ahslInpatientRepository = (AhslInpatientRepository) SpringContextHelper.getBean("ahslInpatientRepository");


    @Override
    protected Boolean listMap2ObjectAndUpdateDB(List<Map<String, String>> listMap, Class<Object> objectClass) {
        List<AhslInpatient> entityList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(listMap)) {
            for (Map<String, String> map : listMap) {
                AhslInpatient entity = new AhslInpatient();

                entity.setPatpatientid(map.get("PATPatientID"));
                entity.setPaadmadmwardcode(map.get("hushisiteid"));
                entity.setPaadmadmdeptcode(map.get("roomId"));
                entity.setPaadmcurbedno(map.get("bedId"));

                entityList.add(entity);

            }
        }
        ahslInpatientRepository.saveAll(entityList);
        return Boolean.TRUE;
    }

}
