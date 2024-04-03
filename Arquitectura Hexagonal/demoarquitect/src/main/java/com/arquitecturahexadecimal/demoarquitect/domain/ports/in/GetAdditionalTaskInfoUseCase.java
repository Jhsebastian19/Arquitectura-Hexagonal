package com.arquitecturahexadecimal.demoarquitect.domain.ports.in;

import com.arquitecturahexadecimal.demoarquitect.domain.models.AdditionalTaskinfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskinfo getAdditionalTaskInfo(Long id) ;
}
