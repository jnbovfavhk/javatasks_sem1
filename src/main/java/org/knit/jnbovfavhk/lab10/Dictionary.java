package org.knit.jnbovfavhk.lab10;

import java.util.Hashtable;

public class Dictionary<K, V> {
    private Hashtable<K, V> dict;

    public Dictionary() {
        this.dict = new Hashtable<>();
    }

    public void add(K key, V value) {
        dict.put(key, value);
    }

    public void remove(K key) {
        dict.remove(key);
    }

    public V get(K key) {
        return dict.get(key);
    }
}
