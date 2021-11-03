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
package com.amazonaws.services.fms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EC2ReplaceRouteAction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2ReplaceRouteActionJsonUnmarshaller implements Unmarshaller<EC2ReplaceRouteAction, JsonUnmarshallerContext> {

    public EC2ReplaceRouteAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        EC2ReplaceRouteAction eC2ReplaceRouteAction = new EC2ReplaceRouteAction();

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
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    eC2ReplaceRouteAction.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationCidrBlock", targetDepth)) {
                    context.nextToken();
                    eC2ReplaceRouteAction.setDestinationCidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationPrefixListId", targetDepth)) {
                    context.nextToken();
                    eC2ReplaceRouteAction.setDestinationPrefixListId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationIpv6CidrBlock", targetDepth)) {
                    context.nextToken();
                    eC2ReplaceRouteAction.setDestinationIpv6CidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayId", targetDepth)) {
                    context.nextToken();
                    eC2ReplaceRouteAction.setGatewayId(ActionTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RouteTableId", targetDepth)) {
                    context.nextToken();
                    eC2ReplaceRouteAction.setRouteTableId(ActionTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eC2ReplaceRouteAction;
    }

    private static EC2ReplaceRouteActionJsonUnmarshaller instance;

    public static EC2ReplaceRouteActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EC2ReplaceRouteActionJsonUnmarshaller();
        return instance;
    }
}