package com.company.name.box.packing.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Package {
    private final double width, height, length;

    public Package(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
        if (width <= 0) {
            throw new IllegalArgumentException("width cannot be 0 or negative");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("height cannot be 0 or negative");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("length cannot be 0 or negative");
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public List<Double> getSortedDimensions() {
        List<Double> dimensionList = Arrays.asList(width, height, length);
        dimensionList.sort(Comparator.naturalOrder());
        return dimensionList;
    }
}
