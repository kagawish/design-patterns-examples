package io.gawish.facade;

public class Runner {
    public static void run() {
        Camera c1 = new Camera();
        Light l1 = new Light();
        Scene s1 = new Scene(c1, l1);

        FileReader fileReader = new FileReader();
        Model model = fileReader.read("path1");
        Model model2 = fileReader.read("path2");
        MeshBuilder meshBuilder = new MeshBuilder();
        Mesh mesh = meshBuilder.createMesh(model);
        Mesh mesh2 = meshBuilder.createMesh(model2);

        s1.addMesh(mesh);
        s1.addMesh(mesh2);

        Raytracer raytracer = new Raytracer();
        Renderer renderer = new Renderer(raytracer);
        renderer.render(s1);
    }
}
