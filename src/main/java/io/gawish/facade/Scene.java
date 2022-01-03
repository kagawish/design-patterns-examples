package io.gawish.facade;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private Camera camera;
    private Light light;
    private List<Mesh> meshes = new ArrayList<>();

    public Scene() {
    }

    public Scene(Camera camera, Light light) {
        this.camera = camera;
        this.light = light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void addMesh(Mesh mesh) {
        this.meshes.add(mesh);
    }

    public List<Mesh> getMeshes() {
        return this.meshes;
    }

    public Light getLight() {
        return light;
    }
}
