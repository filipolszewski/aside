package com.folszews.aside.engine.template;

public class TemplateReader {

    public static Template getTemplate( String asideRootPath ) {
        String fileContents = new TemplateFileReader( asideRootPath ).getFileContents();
        String rootName = parseRootName( fileContents );
        return new Template( rootName );
    }

    private static String parseRootName( String fileContents ) {
        return null;
    }

}
