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

package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * RemoveTagsFromResourceRequest Marshaller
 */

public class RemoveTagsFromResourceRequestMarshaller
        implements
        Marshaller<Request<RemoveTagsFromResourceRequest>, RemoveTagsFromResourceRequest> {

    public Request<RemoveTagsFromResourceRequest> marshall(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest) {

        if (removeTagsFromResourceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RemoveTagsFromResourceRequest> request = new DefaultRequest<RemoveTagsFromResourceRequest>(
                removeTagsFromResourceRequest, "AmazonRDS");
        request.addParameter("Action", "RemoveTagsFromResource");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (removeTagsFromResourceRequest.getResourceName() != null) {
            request.addParameter("ResourceName",
                    StringUtils.fromString(removeTagsFromResourceRequest
                            .getResourceName()));
        }

        com.amazonaws.internal.SdkInternalList<String> tagKeysList = (com.amazonaws.internal.SdkInternalList<String>) removeTagsFromResourceRequest
                .getTagKeys();
        if (!tagKeysList.isEmpty() || !tagKeysList.isAutoConstruct()) {
            int tagKeysListIndex = 1;

            for (String tagKeysListValue : tagKeysList) {
                if (tagKeysListValue != null) {
                    request.addParameter("TagKeys.member." + tagKeysListIndex,
                            StringUtils.fromString(tagKeysListValue));
                }
                tagKeysListIndex++;
            }
        }

        return request;
    }

}
