package com.company.name.box.packing.service;

import com.company.name.box.packing.model.Package;
import com.company.name.box.packing.model.Box;

import java.util.List;

public class SizeFitServiceImpl implements SizeFitService {
    @Override
    public boolean isPackageFitInBox(Box box, Package pack) {
        validate(box, pack);
        List<Double> packSortedDimensions = pack.getSortedDimensions();
        List<Double> boxSortedDimensions = box.getSortedDimensions();
        for (int i = 0; i < packSortedDimensions.size(); i++) {
            if ((packSortedDimensions.get(i) > boxSortedDimensions.get(i))) {
                return false;
            }
        }
        return true;
    }

    private void validate(Box box, Package pack) {
        if (null == box) {
            throw new IllegalArgumentException("Box cannot be null");
        }
        if (null == pack) {
            throw new IllegalArgumentException("Package cannot be null");
        }
    }
}
