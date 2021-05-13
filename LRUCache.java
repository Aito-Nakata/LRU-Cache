import java.util.HashMap;
import java.util.Optional;
public class LRUCache<T> implements lru<T> {

    private HashMap<String, T> map = new HashMap<>(); //文字・キー共に文字列を格納

    //データの追加
    @Override
    public void put(String key, T value){
        map.put(key,value);
    }

    //データの使用
    @Override
    public Optional<T> get(String key){
        System.out.println(map.get(key));
    }

    //データの参照
    public Optional<T> view_data(){
        System.out.println(map.size());
    }
}
