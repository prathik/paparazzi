package com.inmobi;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by prathik.raj on 5/1/16.
 */
public class SeleniumCamera implements Camera  {
    String url;

    SeleniumCamera(String url) {
        this.url = url;
    }

    public File takePhoto() throws IOException {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get(this.url);
        File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        webDriver.close();
        return scrFile;
    }
}
