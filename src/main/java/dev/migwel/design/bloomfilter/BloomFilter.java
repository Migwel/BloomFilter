package dev.migwel.design.bloomfilter;

public interface BloomFilter<T> {

    /**
     * Add an entry to the bloom filter
     *
     * @param value
     */
    void insert(T value);

    /**
     * Verifies whether a value is present in the bloom filter.
     *
     * <p>Bloom filters can tell whether a value is <b>not</b> present but cannot definitely say
     * whether a value is actually present
     *
     * @param value The value for which we want to verify the presence
     * @return
     *     <ul>
     *       <li>false if the value is not present. This means that the provided value has never
     *           been inserted before
     *       <li>true if the value may be present. This means that it's likely that the value has
     *           been inserted before but it's not certain
     *     </ul>
     */
    boolean isPresent(T value);
}
