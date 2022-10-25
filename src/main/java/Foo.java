public class Foo {
    private String id;

    public Foo(String id) {
        this.id = id;
    }

    public String bar(String s){
        String r="bar";
        for (int i=0; i<10;i++) {
            r += s + id;
        }
        return r;
    }
}
