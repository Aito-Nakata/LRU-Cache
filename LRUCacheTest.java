public class LRUCacheTest{
    //Test(1つも使われていない場合、追加したものから消えるようにする)
    public void testLRU_access(){
        LRUCache<String> lru = new LRUCache<>();
        lru.put("a","dataA");
        lru.put("b","dataB");
        lru.put("c","dataC");
        assertEquals(null,lru.get("a"));
    }

    //Test(getされたら使われたとみなすようにする)
    public void testLRU_use(){
        LRUCache<String> lru = new LRUCache<>();
        lru.put("a","dataA");
        lru.put("b","dataB");
        assertEquals("dataA",lru.get("a"));
        lru.put("c","dataC");
        assertEquals(null,lru.get("a"));
    }
}