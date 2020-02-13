package com.company.name.box.packing.model;

import java.util.List;

public enum Box {
    SMALL(new Package(1d, 1d, 1d)),
    MEDIUM(new Package(4d, 4d, 4d)),
    LARGE(new Package(20d, 20d, 20d));
    private final Package pack;

    Box(Package pack) {
        this.pack = pack;
    }

    public List<Double> getSortedDimensions() {
        return pack.getSortedDimensions();
    }
}
