package com.arquitecturahexadecimal.demoarquitect.application.usecases;

import com.arquitecturahexadecimal.demoarquitect.domain.models.AdditionalTaskinfo;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl  implements GetAdditionalTaskInfoUseCase{
    
    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort=externalServicePort;
    }

    @Override
    public AdditionalTaskinfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.GetAdditionalTaksInfo(id);
    }
}
