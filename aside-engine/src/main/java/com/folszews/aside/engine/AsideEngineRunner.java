package com.folszews.aside.engine;

import com.folszews.aside.engine.options.EngineOptions;
import com.folszews.aside.engine.options.EngineOptionsFactory;

public class AsideEngineRunner {

    public static void main( String[] args ) {
        AsideEngine engine = new AsideEngine( getCurrentPath( args ), readOptionsFromArgs( args ) );
        engine.generateDocumentationFile();
    }

    private static EngineOptions readOptionsFromArgs( String[] args ) {
        return new EngineOptionsFactory().createEngineOptions( args );
    }

    private static String getCurrentPath( String[] args ) {
        return args[0];
    }

}
