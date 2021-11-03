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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/StartDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDeploymentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the asynchronous operation that this request started. You can use it combined with the
     * <a>ListOperations</a> call to track the operation's progress.
     * </p>
     */
    private String operationId;

    /**
     * <p>
     * The unique ID of the asynchronous operation that this request started. You can use it combined with the
     * <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param operationId
     *        The unique ID of the asynchronous operation that this request started. You can use it combined with the
     *        <a>ListOperations</a> call to track the operation's progress.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The unique ID of the asynchronous operation that this request started. You can use it combined with the
     * <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @return The unique ID of the asynchronous operation that this request started. You can use it combined with the
     *         <a>ListOperations</a> call to track the operation's progress.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * The unique ID of the asynchronous operation that this request started. You can use it combined with the
     * <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param operationId
     *        The unique ID of the asynchronous operation that this request started. You can use it combined with the
     *        <a>ListOperations</a> call to track the operation's progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentResult withOperationId(String operationId) {
        setOperationId(operationId);
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
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDeploymentResult == false)
            return false;
        StartDeploymentResult other = (StartDeploymentResult) obj;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return hashCode;
    }

    @Override
    public StartDeploymentResult clone() {
        try {
            return (StartDeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}