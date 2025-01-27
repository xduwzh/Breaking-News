package com.hang.anno;

import com.hang.validation.StateValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;


@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(
        validatedBy = {StateValidation.class}
)
public @interface State {
    String message() default "{state param could only be published or draft.}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
