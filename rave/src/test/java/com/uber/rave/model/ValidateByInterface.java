package com.uber.rave.model;

import androidx.annotation.NonNull;
import androidx.annotation.Size;

import com.uber.rave.annotation.Validated;

/**
 * Example of an interface using RAVE.
 */
@Validated(factory = TestFactory.class)
public interface ValidateByInterface {

    /**
     * @return Example of a method using RAVE.
     */
    @NonNull
    @Size(min = 0, max = 4)
    String getNonNullString();
}
