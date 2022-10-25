public class Foo {
    private String id;

    public Foo(String id) {
        this.id = id;
    }

    public String bar(String s){
        // computing the result
        String result=s+"bar"+id;
        return result;
    }
}
