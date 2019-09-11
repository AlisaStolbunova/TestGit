package work.home.lesson12_Generics;

final class PairUtil {

    static <T, V> Pair<V, T> swap(Pair<T, V> pair) {
        return new Pair<>(pair.getV(),pair.getK());
    }
}
