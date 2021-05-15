import java.util.HashMap;
import java.lang.String;


public class LRUCache<T> implements lru<T> {

    class Node{
        String key;
        T value;
        Node next,prev;

        public Node(String key, T value){
            this.key = key;
            this.value = value;
        }
    }

    private HashMap<String, Node> map = new HashMap<String, Node>();
    Node head;
    Node tail;
    private int maxSize = 2;

    //データの追加
    @Override
    public void put(String key, T value){
        if(map.containsKey(key)){ //既にデータが追加されている場合
            Node N = map.get(key); //移動させるノード
            N.value = value;
            removeNode(N);
            putNodeTop(N);
        }
        
        Node ref = new Node(key,value); //追加するノード
        ref.next = ref.prev = null;

        if(map.size() >= maxSize){ //最大メモリサイズを超えた時
            map.remove(tail.key);
            removeNode(tail);
            putNodeTop(ref);
        }else{
            putNodeTop(ref);
        }

        map.put(key, ref);
    }

    //データの使用
    @Override
    public void get(String key){
        if(map.containsKey(key)){
            Node getNode = map.get(key); //使用するデータを含むノード
            removeNode(getNode);
            putNodeTop(getNode);

            System.out.println(getNode.value);
        }else{
            System.out.println("No Date.");
        }
    }

    //ノードの削除
    private void removeNode(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;

        if(prevNode != null){
            prevNode.next = node.next;
        }else{
            head = nextNode;
        }

        if(nextNode != null){
            nextNode.prev = node.prev;
        }else{
            tail = prevNode;
        }
    }

    //ノードをTopに追加
    private void putNodeTop(Node node){
        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }else{
            head = node;
        }

        if(tail == null){
            tail = head;
        }
    }
}
