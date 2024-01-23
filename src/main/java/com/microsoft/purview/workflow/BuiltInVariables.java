package com.microsoft.purview.workflow;

public class BuiltInVariables {
    public static Expression workflowRequestor = () -> "runInput()['requestor']";
}
