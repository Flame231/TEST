package org.example;

import java.io.File;
import java.io.IOException;

public class FileUtil {

    public static File getFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            return file;
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
