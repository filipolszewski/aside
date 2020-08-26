package com.folszews.aside.engine;

import com.folszews.aside.engine.node.AsideNode;
import com.folszews.aside.engine.node.NodeComposerService;
import com.folszews.aside.engine.template.Template;
import com.folszews.aside.engine.template.TemplateReader;

class AsideEngine {

    private final String asideRootPath;

    AsideEngine( String asideRootPath ) {
        this.asideRootPath = asideRootPath;
    }

    void generateDocumentationFile() {
        Template rootNodeTemplate = TemplateReader.getTemplate( asideRootPath );
        AsideNode rootNode = new NodeComposerService( asideRootPath ).compose();
        saveToFile( rootNode );
    }

    private void saveToFile( AsideNode rootNode ) {

    }

}
