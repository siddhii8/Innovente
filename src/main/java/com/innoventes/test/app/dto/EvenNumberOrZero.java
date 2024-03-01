package com.innoventes.test.app.dto;

import com.innoventes.test.app.validation.EvenNumberOrZeroValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
@Documented
@Constraint(validatedBy = EvenNumberOrZeroValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface EvenNumberOrZero {
String message() default "Field must be an even number or zero ";
Class<?> [] groups() default {};
Class<? extends Payload>[] payload() default {};

}
