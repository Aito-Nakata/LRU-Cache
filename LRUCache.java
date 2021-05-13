import java.util.HashMap;
public class LRUCache<T> implements lru<T> {

    private HashMap<String, String> map = new HashMap<>(); //文字・キー共に文字列を格納

    //データの追加
    @Override
    public void put(String key, T value){

    }

    //データの使用
    @Override
    public Optional<T> get(String key){

    }
}
