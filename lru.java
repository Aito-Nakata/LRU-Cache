import java.util.Optional;

/*
 * lruのインターフェースの作成(後からメソッドの実装をするため,処理を変えるため)
 * パラメータ <T> は文字配列
 */

public interface lru<T> {
    public Optional<T> get(String key); //データの使用
    public void put(String key, T value); //データの追加
}