package io.gawish.facade;

public class FileReader {
    public Model read(String path) {
        System.out.println("Reading file at path: ".concat(path));
        return new Model();
    }
}