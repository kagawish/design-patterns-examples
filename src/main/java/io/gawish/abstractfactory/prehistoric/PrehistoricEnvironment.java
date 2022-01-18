package io.gawish.abstractfactory.prehistoric;

import io.gawish.abstractfactory.Environment;
import io.gawish.abstractfactory.Transport;

public class PrehistoricEnvironment extends Environment {
    @Override
    public Transport getTransport() {
        return new Walk();
    }
}
