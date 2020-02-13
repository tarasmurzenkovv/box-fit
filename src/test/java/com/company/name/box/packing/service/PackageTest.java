package com.company.name.box.packing.service;

import com.company.name.box.packing.model.Package;
import org.junit.Test;

public class PackageTest {
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForZeroWidth() {
        Package aPackage = new Package(0d, 1d, 1d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNegativeWidth() {
        Package aPackage = new Package(-1d, 1d, 1d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForZeroHeight() {
        Package aPackage = new Package(1d, 0d, 1d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNegativeHeight() {
        Package aPackage = new Package(1d, -1d, 1d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForZeroLenght() {
        Package aPackage = new Package(1d, 1d, 0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNegativeLength() {
        Package aPackage = new Package(1d, 1d, -1d);
    }
}
