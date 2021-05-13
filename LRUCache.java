import java.util.HashMap;
import java.lang.String;

public class LRUCache<T> implements lru<T> {

    class Node{
        String key;
        T value;
        Node next,prev;
    
        //コンストラクタ
        public Node(String key, T value){
            this.key = key;
            this.value = value;
        }
    }

    private HashMap<String, T> map = new HashMap<>();
    Node head,tail;

    //データの追加
    @Override
    public void put(String key, T value){
        
    }

    //データの使用
    @Override
    public int get(String key){
        
    }

    //ノードの削除
    private void removeNode(Node){

    }

}
