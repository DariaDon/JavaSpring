package ru.don.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.don.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;

@Service
public class UnsupportedCodeValidation {
    public void Valid(int uid) throws UnsupportedCodeException {
        if (uid == 123) {
            throw new UnsupportedCodeException();
        }
    }
}