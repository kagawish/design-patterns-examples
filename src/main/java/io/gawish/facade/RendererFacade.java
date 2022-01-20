package io.gawish.facade;

import java.util.List;

public class RendererFacade {
    public static void render(List<String> paths) {
        Camera c1 = new Camera();
        Light l1 = new Light();
        Scene s1 = new Scene(c1, l1);

        FileReader fileReader = new FileReader();
        MeshBuilder meshBuilder = new MeshBuilder();
        for (String path : paths) {
            Model model = fileReader.read(path);
            Mesh mesh = meshBuilder.createMesh(model);
            s1.addMesh(mesh);
        }

        Raytracer raytracer = new Raytracer();
        Renderer renderer = new Renderer(raytracer);
        renderer.render(s1);
    }

    public static void renderFromModels(List<Model> models) {
        Camera c1 = new Camera();
        Light l1 = new Light();
        Scene s1 = new Scene(c1, l1);

        MeshBuilder meshBuilder = new MeshBuilder();
        for (Model model : models) {
            Mesh mesh = meshBuilder.createMesh(model);
            s1.addMesh(mesh);
        }

        Raytracer raytracer = new Raytracer();
        Renderer renderer = new Renderer(raytracer);
        renderer.render(s1);
    }

    public static Scene getDefaultScene() {
        Camera c1 = new Camera();
        Light l1 = new Light();
        Scene s1 = new Scene(c1, l1);

        return s1;
    }
}
