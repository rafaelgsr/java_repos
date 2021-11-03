/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TransformOperation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformOperationJsonUnmarshaller implements Unmarshaller<TransformOperation, JsonUnmarshallerContext> {

    public TransformOperation unmarshall(JsonUnmarshallerContext context) throws Exception {
        TransformOperation transformOperation = new TransformOperation();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ProjectOperation", targetDepth)) {
                    context.nextToken();
                    transformOperation.setProjectOperation(ProjectOperationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FilterOperation", targetDepth)) {
                    context.nextToken();
                    transformOperation.setFilterOperation(FilterOperationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreateColumnsOperation", targetDepth)) {
                    context.nextToken();
                    transformOperation.setCreateColumnsOperation(CreateColumnsOperationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RenameColumnOperation", targetDepth)) {
                    context.nextToken();
                    transformOperation.setRenameColumnOperation(RenameColumnOperationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CastColumnTypeOperation", targetDepth)) {
                    context.nextToken();
                    transformOperation.setCastColumnTypeOperation(CastColumnTypeOperationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TagColumnOperation", targetDepth)) {
                    context.nextToken();
                    transformOperation.setTagColumnOperation(TagColumnOperationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UntagColumnOperation", targetDepth)) {
                    context.nextToken();
                    transformOperation.setUntagColumnOperation(UntagColumnOperationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return transformOperation;
    }

    private static TransformOperationJsonUnmarshaller instance;

    public static TransformOperationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransformOperationJsonUnmarshaller();
        return instance;
    }
}