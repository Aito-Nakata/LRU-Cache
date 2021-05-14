public class LRUCacheTest_access{
    //Test(一つも使われたいない場合,最初に追加したものから消えればよい)
    public static void main ( String [] args ) {
        lru<String> lru = new LRUCache<>();
        lru.put("a","dataA");
        lru.put("b","dataB");
        lru.get("a");
    }
}