package com.arquitecturahexadecimal.demoarquitect.domain.ports.out;

import com.arquitecturahexadecimal.demoarquitect.domain.models.AdditionalTaskinfo;

public interface ExternalServicePort {
    AdditionalTaskinfo GetAdditionalTaksInfo(Long taskId);
}
