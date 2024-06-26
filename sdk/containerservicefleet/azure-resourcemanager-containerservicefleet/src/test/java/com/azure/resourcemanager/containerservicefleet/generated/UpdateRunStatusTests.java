// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStatus;

public final class UpdateRunStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateRunStatus model = BinaryData.fromString(
            "{\"status\":{\"startTime\":\"2021-09-05T10:33:45Z\",\"completedTime\":\"2021-08-20T18:32:02Z\",\"state\":\"Skipped\"},\"stages\":[{\"status\":{\"startTime\":\"2021-03-22T06:48:14Z\",\"completedTime\":\"2021-04-09T05:45:58Z\",\"state\":\"Stopped\"},\"name\":\"jcrcczsqpjhvmda\",\"groups\":[{\"status\":{\"startTime\":\"2021-10-10T23:28:16Z\",\"completedTime\":\"2021-08-31T06:22:10Z\",\"state\":\"Skipped\"},\"name\":\"noae\",\"members\":[{},{},{},{}]},{\"status\":{\"startTime\":\"2021-11-03T13:36:16Z\",\"completedTime\":\"2021-12-08T18:07:33Z\",\"state\":\"Running\"},\"name\":\"pjmcmatuokthfuiu\",\"members\":[{},{},{},{}]}],\"afterStageWaitStatus\":{\"status\":{\"startTime\":\"2021-06-02T06:16:12Z\",\"completedTime\":\"2021-06-22T02:08:06Z\",\"state\":\"Running\"},\"waitDurationInSeconds\":1276916323}},{\"status\":{\"startTime\":\"2021-05-26T02:59:13Z\",\"completedTime\":\"2021-02-09T15:41:34Z\",\"state\":\"Skipped\"},\"name\":\"fuaxbe\",\"groups\":[{\"status\":{\"startTime\":\"2021-11-26T08:00:14Z\",\"completedTime\":\"2021-09-30T07:23:02Z\",\"state\":\"Completed\"},\"name\":\"xw\",\"members\":[{},{}]}],\"afterStageWaitStatus\":{\"status\":{\"startTime\":\"2021-06-02T14:17:50Z\",\"completedTime\":\"2021-02-03T23:59:34Z\",\"state\":\"NotStarted\"},\"waitDurationInSeconds\":1241699361}},{\"status\":{\"startTime\":\"2021-03-09T16:39:27Z\",\"completedTime\":\"2021-08-24T09:58:36Z\",\"state\":\"Completed\"},\"name\":\"s\",\"groups\":[{\"status\":{\"startTime\":\"2021-05-12T02:27:32Z\",\"completedTime\":\"2021-04-07T03:00:59Z\",\"state\":\"NotStarted\"},\"name\":\"hqyudxorrqnbpoc\",\"members\":[{},{},{},{}]},{\"status\":{\"startTime\":\"2021-06-24T07:32:51Z\",\"completedTime\":\"2021-08-03T05:42:41Z\",\"state\":\"NotStarted\"},\"name\":\"sllr\",\"members\":[{},{},{}]},{\"status\":{\"startTime\":\"2021-01-12T05:42:21Z\",\"completedTime\":\"2021-12-05T03:26:34Z\",\"state\":\"Stopped\"},\"name\":\"ulexxbczwtr\",\"members\":[{},{}]},{\"status\":{\"startTime\":\"2021-12-06T02:01:05Z\",\"completedTime\":\"2020-12-29T03:11:36Z\",\"state\":\"NotStarted\"},\"name\":\"myokacspkwlh\",\"members\":[{},{},{}]}],\"afterStageWaitStatus\":{\"status\":{\"startTime\":\"2021-11-18T04:52:43Z\",\"completedTime\":\"2021-11-08T00:37:22Z\",\"state\":\"Running\"},\"waitDurationInSeconds\":306270503}}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{\"version\":\"cciw\"},{\"version\":\"juqk\"},{\"version\":\"sa\"}]}}")
            .toObject(UpdateRunStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateRunStatus model = new UpdateRunStatus();
        model = BinaryData.fromObject(model).toObject(UpdateRunStatus.class);
    }
}
