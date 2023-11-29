package ru.don.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.don.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {

    Response modify(Response response);
}