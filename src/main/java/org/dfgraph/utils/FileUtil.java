package org.dfgraph.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    /**
     * Recursively retrieves all Java files from a directory.
     *
     * @param directory The directory to search in.
     * @return List of Java files.
     */
    public static List<File> getAllJavaFiles(File directory) {
        List<File> javaFiles = new ArrayList<>();
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                if (file.isDirectory()) {
                    javaFiles.addAll(getAllJavaFiles(file));
                } else if (file.getName().endsWith(".java")) {
                    javaFiles.add(file);
                }
            }
        }
        return javaFiles;
    }
}
