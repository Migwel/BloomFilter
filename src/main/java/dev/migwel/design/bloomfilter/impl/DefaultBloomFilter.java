package dev.migwel.design.bloomfilter.impl;

import dev.migwel.design.bloomfilter.BloomFilter;

/**
 * Our default implementation of the BloomFilter interface. Other, better, developers can give their
 * own implementation and use it instead of this one.
 */
public class DefaultBloomFilter<T> implements BloomFilter<T> {
    @Override
    public void insert(T value) {
        //
    }

    @Override
    public boolean isPresent(T value) {
        return true;
    }
}
