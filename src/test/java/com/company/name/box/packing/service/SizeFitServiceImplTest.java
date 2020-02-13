package com.company.name.box.packing.service;

import com.company.name.box.packing.model.Box;
import com.company.name.box.packing.model.Package;
import org.junit.Assert;
import org.junit.Test;

public class SizeFitServiceImplTest {
    private final SizeFitService sut = new SizeFitServiceImpl();

    @Test(expected = IllegalArgumentException.class)
    public void shouldValidateNullBox(){
        sut.isPackageFitInBox(null, new Package(1d,1d,1d));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldValidateNullPackage(){
        sut.isPackageFitInBox(Box.LARGE, null);
    }

    @Test
    public void shouldReturnTrueForFittedPackage(){
        Assert.assertTrue(sut.isPackageFitInBox(Box.LARGE, new Package(1d, 1d, 1d)));
    }

    @Test
    public void shouldReturnFalseForlargePackage(){
        Assert.assertFalse(sut.isPackageFitInBox(Box.LARGE, new Package(100d, 1d, 1d)));
    }
}
