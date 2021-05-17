public class LRUCacheTest_use {
    //Test(getされたら使われたとみなす)
    public static void main ( String [] args ) {
        lru<String> lru = new LRUCache<>();
        lru.put("a","dataA");
        lru.put("b","dataB");
        lru.get("a");
        lru.put("c","dataC");
        lru.get("b");
    }
}
