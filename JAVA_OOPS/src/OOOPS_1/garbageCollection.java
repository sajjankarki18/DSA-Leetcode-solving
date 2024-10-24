package OOOPS_1;

public class garbageCollection {
    public static void main(String[] args) {
        GC obj;

        for (int i = 0; i<=100000000;i++){
            obj = new GC("sajan karki");
        }
    }
}

class GC{
    String name;

    public GC(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}