package com.application.service.event.impl;

import com.application.service.event.EventAppService;
import com.domain.service.HiDomainService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class EventAppServiceImpl implements EventAppService {
    // Call Domain Service

    @Resource
    private HiDomainService hiDomainService;
    @Override
    public String sayHi(String who) {
        return hiDomainService.sayHi(who);
    }
}
