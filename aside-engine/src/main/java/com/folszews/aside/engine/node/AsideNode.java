package com.folszews.aside.engine.node;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Documentation;

import java.util.List;

public class AsideNode {

    private final String nodePath;
    private final Documentation documentation;
    private final List<AsideNode> childrenNodes;
    private final AsideNode parentNode;

    public AsideNode( String nodePath, Documentation documentation,
                      List<AsideNode> childrenNodes, AsideNode parentNode ) {
        this.nodePath = nodePath;
        this.documentation = documentation;
        this.childrenNodes = childrenNodes;
        this.parentNode = parentNode;
    }

    public String getNodePath() {
        return nodePath;
    }

    public Documentation getDocumentation() {
        return documentation;
    }

    public boolean isRootNode() {
        return this.parentNode == null;
    }
}
