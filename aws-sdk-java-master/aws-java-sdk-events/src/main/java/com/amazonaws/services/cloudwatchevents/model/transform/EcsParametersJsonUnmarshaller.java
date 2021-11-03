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
package com.amazonaws.services.cloudwatchevents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EcsParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsParametersJsonUnmarshaller implements Unmarshaller<EcsParameters, JsonUnmarshallerContext> {

    public EcsParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        EcsParameters ecsParameters = new EcsParameters();

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
                if (context.testExpression("TaskDefinitionArn", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setTaskDefinitionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskCount", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setTaskCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LaunchType", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setLaunchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkConfiguration", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PlatformVersion", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setPlatformVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Group", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CapacityProviderStrategy", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setCapacityProviderStrategy(new ListUnmarshaller<CapacityProviderStrategyItem>(CapacityProviderStrategyItemJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EnableECSManagedTags", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setEnableECSManagedTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableExecuteCommand", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setEnableExecuteCommand(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PlacementConstraints", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setPlacementConstraints(new ListUnmarshaller<PlacementConstraint>(PlacementConstraintJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PlacementStrategy", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setPlacementStrategy(new ListUnmarshaller<PlacementStrategy>(PlacementStrategyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PropagateTags", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setPropagateTags(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReferenceId", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setReferenceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    ecsParameters.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ecsParameters;
    }

    private static EcsParametersJsonUnmarshaller instance;

    public static EcsParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EcsParametersJsonUnmarshaller();
        return instance;
    }
}