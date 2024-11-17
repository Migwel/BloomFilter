package dev.migwel.design.bloomfilter.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DefaultBloomFilterTest {

    private final DefaultBloomFilter<String> filter = new DefaultBloomFilter<>();

    @Test
    void isPresent() {
        assertThat(filter.isPresent("myString")).isTrue();
    }
}
