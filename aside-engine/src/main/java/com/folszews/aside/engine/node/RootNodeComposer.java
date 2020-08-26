package com.folszews.aside.engine.node;

import com.folszews.aside.engine.node.AsideNode;
import com.folszews.aside.engine.node.NodeComposer;

class RootNodeComposer implements NodeComposer {
    private final String rootPath;

    RootNodeComposer( String rootPath ) {
        this.rootPath = rootPath;
    }

    @Override
    public AsideNode compose( AsideNode parentNode ) {
        return null;
    }
}
