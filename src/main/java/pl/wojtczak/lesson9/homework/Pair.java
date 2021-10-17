package pl.wojtczak.lesson9.homework;



public class Pair <K, V> {
    private final K key;
    private final V var;

    public Pair(K key,V var)

    {
        this.key = key;
        this.var = var;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return var;
    }
}
