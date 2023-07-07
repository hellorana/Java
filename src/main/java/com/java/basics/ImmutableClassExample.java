package com.java.basics;

import java.util.Date;

public final class ImmutableClassExample {

    //Integer and String are immutable field, since they does nt provide any setter methods to change its content.
    private final Integer immutableField1;

    private final String immutableField2;

    // Date field is mutable as it provides setter methods to change various date/time parts
    private final Date  mutableField;

    // if you don't create constructors it will show error, since it will ensure no unplanned constructors(constructor is set to private)

    private ImmutableClassExample(Integer immutableField1, String immutableField2, Date mutableField) {
        this.immutableField1 = immutableField1;
        this.immutableField2 = immutableField2;
        this.mutableField = new Date(mutableField.getTime());
    }

    // complete it later



}
