package org.dfgraph.utils;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

import java.io.File;
import java.io.FileNotFoundException;

public class JavaParserUtils {

    /**
     * Parses a Java file and returns its CompilationUnit.
     *
     * @param file Java file to parse.
     * @return CompilationUnit of the Java file.
     * @throws FileNotFoundException if the file is not found.
     */
    public static CompilationUnit parseJavaFile(File file) throws FileNotFoundException {
        JavaParser parser = new JavaParser();
        CompilationUnit cu = parser.parse(file).getResult().orElseThrow();
        return cu;
    }
}
