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
package com.amazonaws.services.lakeformation.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lakeformation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RevokePermissionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RevokePermissionsRequestMarshaller {

    private static final MarshallingInfo<String> CATALOGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CatalogId").build();
    private static final MarshallingInfo<StructuredPojo> PRINCIPAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Principal").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Resource").build();
    private static final MarshallingInfo<List> PERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Permissions").build();
    private static final MarshallingInfo<List> PERMISSIONSWITHGRANTOPTION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PermissionsWithGrantOption").build();

    private static final RevokePermissionsRequestMarshaller instance = new RevokePermissionsRequestMarshaller();

    public static RevokePermissionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RevokePermissionsRequest revokePermissionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (revokePermissionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(revokePermissionsRequest.getCatalogId(), CATALOGID_BINDING);
            protocolMarshaller.marshall(revokePermissionsRequest.getPrincipal(), PRINCIPAL_BINDING);
            protocolMarshaller.marshall(revokePermissionsRequest.getResource(), RESOURCE_BINDING);
            protocolMarshaller.marshall(revokePermissionsRequest.getPermissions(), PERMISSIONS_BINDING);
            protocolMarshaller.marshall(revokePermissionsRequest.getPermissionsWithGrantOption(), PERMISSIONSWITHGRANTOPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}