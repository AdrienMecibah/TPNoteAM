public class Foo {
    private String id;

    public Foo(String id) {
        this.id = id;
    }

    public int methodeATester1(){
        int result=0;
        if (id.isEmpty()){
            result=42;
        }else{
            for (char c : id.toCharArray()){
                result+=(int)c;
            }
        }
        return result;
    }

    public String bar(String s){
        return s+id;
    }

}

