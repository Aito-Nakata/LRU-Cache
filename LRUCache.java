import java.util.HashMap;
import java.util.Optional;
import java.lang.String;

public class LRUCache<T> implements lru<T> {

    private HashMap<String, Node> map = map = new HashMap<String, Node>();
    Node<T> head,tail;

    //データの追加
    @Override
    public void put(String key, T value){
        if(map.containsKey(key)){
            Node<T> N = map.get(key); //移動させるノード
            N.value = value;
            removeNode(N);
            putNodeTop(N);
        }
        
        Node<T> ref = new Node<>(); //追加するノード
        ref.key = key;
        ref.value = value;
        map.put(key, ref);
    }

    //データの使用
    @Override
    public void get(String key){
        if(map.containsKey(key)){
            Node<T> getNode = map.get(key); //使用するデータを含むノード
            removeNode(getNode);
            putNodeTop(getNode);

            System.out.println(getNode.value);
        }
        else{
        System.out.println("No Date.");
        }
    }

    //ノードの削除
    private void removeNode(Node<T> node){
        Node<T> prevNode = node.prev;
        Node<T> nextNode = node.next;

        if(prevNode != null){
            prevNode.next = node.next;
        }
        else{
            head = nextNode;
        }

        if(nextNode != null){
            nextNode.prev = node.prev;
        }
        else{
            tail = prevNode;
        }
    }

    //ノードをTopに追加
    private void putNodeTop(Node<T> node){
        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }
        else{
            head = node;
        }
    }
}
