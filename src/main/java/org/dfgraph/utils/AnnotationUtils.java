package org.dfgraph.utils;

import com.github.javaparser.ast.body.MethodDeclaration;

public class AnnotationUtils {

    /**
     * Checks if a method has a specific annotation.
     *
     * @param method The method to check.
     * @param annotationName The name of the annotation.
     * @return true if the method has the specified annotation, false otherwise.
     */
    public static boolean hasAnnotation(MethodDeclaration method, String annotationName) {
        return method.getAnnotations()
                .stream()
                .anyMatch(annotation -> annotation.getNameAsString().equals(annotationName));
    }
}
