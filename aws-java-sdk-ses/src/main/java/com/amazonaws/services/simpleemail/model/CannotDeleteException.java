/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simpleemail.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Indicates that the delete operation could not be completed.
 * </p>
 */
public class CannotDeleteException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String name;

    /**
     * Constructs a new CannotDeleteException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CannotDeleteException(String message) {
        super(message);
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CannotDeleteException withName(String name) {
        setName(name);
        return this;
    }

}