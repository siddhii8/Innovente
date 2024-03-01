package com.innoventes.test.app.validation;

import com.innoventes.test.app.dto.EvenNumberOrZero;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EvenNumberOrZeroValidator implements ConstraintValidator<EvenNumberOrZero, Integer> {


    @Override
    public void initialize(EvenNumberOrZero constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer  value, ConstraintValidatorContext constraintValidatorContext) {
        return value ==0|| value %2 ==0;
    }
}
