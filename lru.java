/*
 * lruのインターフェースの作成(後からメソッドの実装をするため,処理を変えるため)
 */

public interface lru<T> {
    public void put(String key, T value); //データの追加
    public void get(String key); //データの使用
}