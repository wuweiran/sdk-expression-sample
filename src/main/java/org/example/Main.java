package org.example;

import static com.microsoft.purview.workflow.Functions.*;
import static com.microsoft.purview.workflow.BuiltInVariables.*;
import static com.microsoft.purview.workflow.Primitives.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(createArray(workflowRequestor, s("666"), i(1), f(1.1)).getExpression());
    }
}