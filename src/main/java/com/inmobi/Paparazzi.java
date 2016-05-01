package com.inmobi;

import java.io.File;
import java.io.IOException;

/**
 * Created by prathik.raj on 5/1/16.
 */
public class Paparazzi {
    String url;
    Object config;

    public Paparazzi(String url, Object config) {
        this.url = url;
        this.config = config;
    }

    public void takePhoto() throws IOException {
        SeleniumCamera seleniumCamera = new SeleniumCamera(this.url);
        File file = seleniumCamera.takePhoto();
    }

    public static void main(String[] args) throws IOException {
        String conf = "abc";
        Paparazzi paparazzi = new Paparazzi("http://www.yahoo.com", conf);
        paparazzi.takePhoto();
    }
}
