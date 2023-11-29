package ru.don.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.don.MySecondTestAppSpringBoot.model.Request;

@Service
public class ModifySourceRequestService implements ModifyRequestService {
    @Override
    public void modify(Request request) {
        request.setSource("source_new");
    }
}