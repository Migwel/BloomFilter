package dev.migwel.design.bloomfilter.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultBloomFilterTest {

    private final DefaultBloomFilter<String> filter = new DefaultBloomFilter<>();

    @Test
    void isPresent() {
        Assertions.assertTrue(filter.isPresent("myString"));
    }
}
