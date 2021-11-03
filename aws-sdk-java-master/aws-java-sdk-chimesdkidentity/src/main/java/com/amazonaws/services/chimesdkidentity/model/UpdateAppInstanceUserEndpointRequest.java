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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstanceUserEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppInstanceUserEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     */
    private String appInstanceUserArn;
    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     * <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     */
    private String allowMessages;

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the <code>AppInstanceUser</code>.
     */

    public void setAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @return The ARN of the <code>AppInstanceUser</code>.
     */

    public String getAppInstanceUserArn() {
        return this.appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the <code>AppInstanceUser</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppInstanceUserEndpointRequest withAppInstanceUserArn(String appInstanceUserArn) {
        setAppInstanceUserArn(appInstanceUserArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param endpointId
     *        The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @return The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param endpointId
     *        The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppInstanceUserEndpointRequest withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>AppInstanceUserEndpoint</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @return The name of the <code>AppInstanceUserEndpoint</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>AppInstanceUserEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppInstanceUserEndpointRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     * <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * 
     * @param allowMessages
     *        Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     *        <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the
     *        endpoint will receive no messages.
     * @see AllowMessages
     */

    public void setAllowMessages(String allowMessages) {
        this.allowMessages = allowMessages;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     * <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * 
     * @return Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     *         <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the
     *         endpoint will receive no messages.
     * @see AllowMessages
     */

    public String getAllowMessages() {
        return this.allowMessages;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     * <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * 
     * @param allowMessages
     *        Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     *        <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the
     *        endpoint will receive no messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowMessages
     */

    public UpdateAppInstanceUserEndpointRequest withAllowMessages(String allowMessages) {
        setAllowMessages(allowMessages);
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     * <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * 
     * @param allowMessages
     *        Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     *        <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the
     *        endpoint will receive no messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowMessages
     */

    public UpdateAppInstanceUserEndpointRequest withAllowMessages(AllowMessages allowMessages) {
        this.allowMessages = allowMessages.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAppInstanceUserArn() != null)
            sb.append("AppInstanceUserArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getAllowMessages() != null)
            sb.append("AllowMessages: ").append(getAllowMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppInstanceUserEndpointRequest == false)
            return false;
        UpdateAppInstanceUserEndpointRequest other = (UpdateAppInstanceUserEndpointRequest) obj;
        if (other.getAppInstanceUserArn() == null ^ this.getAppInstanceUserArn() == null)
            return false;
        if (other.getAppInstanceUserArn() != null && other.getAppInstanceUserArn().equals(this.getAppInstanceUserArn()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAllowMessages() == null ^ this.getAllowMessages() == null)
            return false;
        if (other.getAllowMessages() != null && other.getAllowMessages().equals(this.getAllowMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceUserArn() == null) ? 0 : getAppInstanceUserArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAllowMessages() == null) ? 0 : getAllowMessages().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppInstanceUserEndpointRequest clone() {
        return (UpdateAppInstanceUserEndpointRequest) super.clone();
    }

}