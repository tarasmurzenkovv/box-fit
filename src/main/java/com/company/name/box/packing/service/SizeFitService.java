package com.company.name.box.packing.service;

import com.company.name.box.packing.model.Package;
import com.company.name.box.packing.model.Box;

public interface SizeFitService {
    boolean isPackageFitInBox(Box box, Package pack);
}
