package io.gawish.facade;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void run() {
        List<String> paths = new ArrayList<>();
        paths.add("path1");
        paths.add("path2");
        RendererFacade.render(paths);

        Scene scene = RendererFacade.getDefaultScene();
    }
}

