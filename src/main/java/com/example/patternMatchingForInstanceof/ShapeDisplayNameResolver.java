package com.example.patternMatchingForInstanceof;

import com.example.patternMatchingForInstanceof.withDisplayName.DisplayNamed;
import com.example.patternMatchingForInstanceof.withNameShapes.Named;

public class ShapeDisplayNameResolver {

    public String resolveShape(Shape shape) {
        return switch (shape) {
            case DisplayNamed exampleShape -> exampleShape.getDisplayName();
            case Named exampleShape -> String.format("This is %s name!", exampleShape.getName());
            default -> throw new IllegalArgumentException();
        };
    }
}

// TIP: shape can be DisplayNamed or Named
// if shape is DisplayNamed use getDisplayName method
// if shape is Named use getName method and format it to expected display string
