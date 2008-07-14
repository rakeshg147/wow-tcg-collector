package xml;

import java.io.FilenameFilter;
import java.io.File;

class XMLFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
        return (name.endsWith(".xml"));
    }
}

