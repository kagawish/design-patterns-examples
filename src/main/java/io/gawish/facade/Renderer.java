package io.gawish.facade;

public class Renderer {
    private Raytracer raytracer;

    public Renderer(Raytracer raytracer) {
        this.raytracer = raytracer;
    }

    public void render(Scene s1) {
        System.out.println("Rendering scene");
        for (Mesh m : s1.getMeshes()) {
            this.raytracer.traceLightRays(s1.getLight(), m);
        }
    }
}
