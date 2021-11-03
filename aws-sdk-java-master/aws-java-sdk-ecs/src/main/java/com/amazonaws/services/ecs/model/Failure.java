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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A failed resource. For a list of common causes, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/api_failures_messages.html">API failure reasons</a>
 * in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Failure" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Failure implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the failed resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The reason for the failure.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The details of the failure.
     * </p>
     */
    private String detail;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the failed resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the failed resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the failed resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the failed resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the failed resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the failed resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Failure withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * 
     * @param reason
     *        The reason for the failure.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * 
     * @return The reason for the failure.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * 
     * @param reason
     *        The reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Failure withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The details of the failure.
     * </p>
     * 
     * @param detail
     *        The details of the failure.
     */

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * The details of the failure.
     * </p>
     * 
     * @return The details of the failure.
     */

    public String getDetail() {
        return this.detail;
    }

    /**
     * <p>
     * The details of the failure.
     * </p>
     * 
     * @param detail
     *        The details of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Failure withDetail(String detail) {
        setDetail(detail);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getDetail() != null)
            sb.append("Detail: ").append(getDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Failure == false)
            return false;
        Failure other = (Failure) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getDetail() == null ^ this.getDetail() == null)
            return false;
        if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return hashCode;
    }

    @Override
    public Failure clone() {
        try {
            return (Failure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.FailureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}