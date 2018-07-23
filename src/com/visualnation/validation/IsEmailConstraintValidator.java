package com.visualnation.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsEmailConstraintValidator implements ConstraintValidator<IsEmail, String> {

    private String isEmailPrefix;

    @Override
    public void initialize(IsEmail isEmail) {
        isEmailPrefix = isEmail.value();
    }

    @Override
    public boolean isValid(String theEmail, ConstraintValidatorContext theConstraintValidatorContext) {

        boolean result = theEmail.contains("@");

        return result;
    }
}
