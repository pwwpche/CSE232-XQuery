

public class Pair<K, V> {

    private final K v0;
    private final V v1;

    public static <K, V> Pair<K, V> mkPair(K v0, V v1) {
        return new Pair<K, V>(v0, v1);
    }

    public Pair(K e0, V e1) {
        this.v0 = e0;
        this.v1 = e1;
    }

    public K getV0() {
        return v0;
    }

    public V getV1() {
        return v1;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<K, V> other = (Pair<K, V>) o;
        return v0.equals(other.getV0()) && v1.equals(other.getV1());
    }

    @Override
    public int hashCode(){
        return v0.hashCode() * v1.hashCode();
    }


}