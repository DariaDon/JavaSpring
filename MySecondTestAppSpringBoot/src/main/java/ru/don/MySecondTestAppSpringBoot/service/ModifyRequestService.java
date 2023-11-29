package ru.don.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.don.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
