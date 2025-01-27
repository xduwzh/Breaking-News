package com.hang.validation;

import com.hang.anno.State;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StateValidation implements ConstraintValidator<State,String> {
    /**
     *
     * @param s need to be validated
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == null){
            return false;
        }

        if(s.equals("published") || s.equals("draft")){
            return true;
        }
        return false;
    }
}
