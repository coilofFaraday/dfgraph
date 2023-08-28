package org.dfgraph.core;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import org.dfgraph.utils.AnnotationUtils;

import java.util.ArrayList;
import java.util.List;

public class ControllerAnalyzer {

    private CompilationUnit cu;

    public ControllerAnalyzer(CompilationUnit cu) {
        this.cu = cu;
    }

    /**
     * Extracts methods that are likely to handle user input based on annotations.
     *
     * @return List of methods that handle user input.
     */
    public List<MethodDeclaration> extractInputHandlingMethods() {
        List<MethodDeclaration> inputMethods = new ArrayList<>();
        List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);

        for (MethodDeclaration method : methods) {
            // Here, we're assuming that methods with annotations like "GetMapping", "PostMapping", etc.
            // are the ones handling user input in a Spring application.
            if (AnnotationUtils.hasAnnotation(method, "GetMapping") ||
                    AnnotationUtils.hasAnnotation(method, "PostMapping") ||
                    AnnotationUtils.hasAnnotation(method, "RequestMapping")) {
                inputMethods.add(method);
            }
        }

        return inputMethods;
    }
}
