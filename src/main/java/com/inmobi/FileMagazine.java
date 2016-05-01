package com.inmobi;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


/**
 * Created by prathik.raj on 5/1/16.
 */
public class FileMagazine implements Magazine {
    public void publish(File file) throws IOException {
        FileUtils.copyFile(file, new File("/tmp/screenshots/"+UUID.randomUUID().toString() + ".png"));
    }
}
