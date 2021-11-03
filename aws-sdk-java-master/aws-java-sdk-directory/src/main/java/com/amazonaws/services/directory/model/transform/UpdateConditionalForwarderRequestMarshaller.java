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
package com.amazonaws.services.directory.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateConditionalForwarderRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateConditionalForwarderRequestMarshaller {

    private static final MarshallingInfo<String> DIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryId").build();
    private static final MarshallingInfo<String> REMOTEDOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoteDomainName").build();
    private static final MarshallingInfo<List> DNSIPADDRS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DnsIpAddrs").build();

    private static final UpdateConditionalForwarderRequestMarshaller instance = new UpdateConditionalForwarderRequestMarshaller();

    public static UpdateConditionalForwarderRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateConditionalForwarderRequest updateConditionalForwarderRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateConditionalForwarderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateConditionalForwarderRequest.getDirectoryId(), DIRECTORYID_BINDING);
            protocolMarshaller.marshall(updateConditionalForwarderRequest.getRemoteDomainName(), REMOTEDOMAINNAME_BINDING);
            protocolMarshaller.marshall(updateConditionalForwarderRequest.getDnsIpAddrs(), DNSIPADDRS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}