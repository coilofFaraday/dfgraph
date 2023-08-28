package org.dfgraph.core;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;

import java.util.List;

public class ModelAnalyzer {

    private CompilationUnit cu;

    public ModelAnalyzer(CompilationUnit cu) {
        this.cu = cu;
    }

    /**
     * Extracts methods that are likely to transform data.
     *
     * @return List of methods that transform data.
     */
    public List<MethodDeclaration> extractDataTransformingMethods() {
        // For simplicity, we're assuming that all methods in the model class are related to data transformation.
        return cu.findAll(MethodDeclaration.class);
    }
}
