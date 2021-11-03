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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the key-value pair that are assigned to a file during the execution of a Tagging step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/S3Tag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name assigned to the tag that you create.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value that corresponds to the key.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name assigned to the tag that you create.
     * </p>
     * 
     * @param key
     *        The name assigned to the tag that you create.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name assigned to the tag that you create.
     * </p>
     * 
     * @return The name assigned to the tag that you create.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name assigned to the tag that you create.
     * </p>
     * 
     * @param key
     *        The name assigned to the tag that you create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value that corresponds to the key.
     * </p>
     * 
     * @param value
     *        The value that corresponds to the key.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value that corresponds to the key.
     * </p>
     * 
     * @return The value that corresponds to the key.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value that corresponds to the key.
     * </p>
     * 
     * @param value
     *        The value that corresponds to the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Tag withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Tag == false)
            return false;
        S3Tag other = (S3Tag) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public S3Tag clone() {
        try {
            return (S3Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.S3TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}