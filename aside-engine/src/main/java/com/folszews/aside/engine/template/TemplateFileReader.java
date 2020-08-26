package com.folszews.aside.engine.template;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class TemplateFileReader {

    private final String filePath;

    TemplateFileReader( String filePath ) {
        this.filePath = filePath;
    }

    String getFileContents() {
        File file = new File( filePath );
        StringBuilder fileContents = new StringBuilder( (int) file.length() );

        try ( Scanner scanner = new Scanner( file ) ) {
            while ( scanner.hasNextLine() ) {
                fileContents.append( scanner.nextLine() ).append( System.lineSeparator() );
            }
            return fileContents.toString();
        } catch ( FileNotFoundException e ) {
            // TODO
            e.printStackTrace();
        }
        return null;
    }
}
