package io.gawish;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        io.gawish.abstractfactory.Runner.run();
        io.gawish.factorymethod.Runner.run();
        io.gawish.builder.Runner.run();
        io.gawish.singleton.Runner.run();
    }
}
