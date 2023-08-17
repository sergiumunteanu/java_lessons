package edu.step.inheritance.interfaces;

public interface FileInterface {
    public int value = 10;
    void create(String path);
    void delete(String path);

    default void operation() {
//        value = 20;
    }
}

interface BigInterface extends FileInterface {

}


class LocalFiles implements FileInterface{

    public void create(String path) {

    }

    public void delete(String path) {

    }
}

class NetworkFiles implements FileInterface{

    public void create(String path) {

    }

    public void delete(String path) {

    }
}

class ExternalFiles implements FileInterface {

    public void create(String path) {

    }

    public void delete(String path) {

    }
}