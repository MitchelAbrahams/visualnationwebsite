package com.visualnation.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = IsEmailConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsEmail {

    public String value() default "@";

    public String message() default "not a correct email format";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};

}
