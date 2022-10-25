import com.google.common.collect.HashBasedTable;

public class Foo {
    private String id;

    public Foo(String id) {
        this.id = id;
    }

    public String bar(String s){
        return s+id;
    }
    
    public float bar2(){
        HashBasedTable<Integer, String, Float> at=HashBasedTable.create();
         return at.get(0, id);
    }
}
