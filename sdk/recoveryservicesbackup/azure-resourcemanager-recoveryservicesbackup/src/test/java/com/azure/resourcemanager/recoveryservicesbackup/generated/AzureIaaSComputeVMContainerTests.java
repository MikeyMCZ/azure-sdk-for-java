// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSComputeVMContainer;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureIaaSComputeVMContainerTests {
    @Test
    public void testDeserialize() {
        AzureIaaSComputeVMContainer model =
            BinaryData
                .fromString(
                    "{\"containerType\":\"Microsoft.Compute/virtualMachines\",\"virtualMachineId\":\"vqecr\",\"virtualMachineVersion\":\"tmxxdtddmflhuy\",\"resourceGroup\":\"zv\",\"friendlyName\":\"napxbannovv\",\"backupManagementType\":\"AzureBackupServer\",\"registrationStatus\":\"ytprwnwvroev\",\"healthStatus\":\"lyokrrrou\",\"protectableObjectType\":\"vnsasbcrymodi\"}")
                .toObject(AzureIaaSComputeVMContainer.class);
        Assertions.assertEquals("napxbannovv", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_BACKUP_SERVER, model.backupManagementType());
        Assertions.assertEquals("ytprwnwvroev", model.registrationStatus());
        Assertions.assertEquals("lyokrrrou", model.healthStatus());
        Assertions.assertEquals("vnsasbcrymodi", model.protectableObjectType());
        Assertions.assertEquals("vqecr", model.virtualMachineId());
        Assertions.assertEquals("tmxxdtddmflhuy", model.virtualMachineVersion());
        Assertions.assertEquals("zv", model.resourceGroup());
    }

    @Test
    public void testSerialize() {
        AzureIaaSComputeVMContainer model =
            new AzureIaaSComputeVMContainer()
                .withFriendlyName("napxbannovv")
                .withBackupManagementType(BackupManagementType.AZURE_BACKUP_SERVER)
                .withRegistrationStatus("ytprwnwvroev")
                .withHealthStatus("lyokrrrou")
                .withProtectableObjectType("vnsasbcrymodi")
                .withVirtualMachineId("vqecr")
                .withVirtualMachineVersion("tmxxdtddmflhuy")
                .withResourceGroup("zv");
        model = BinaryData.fromObject(model).toObject(AzureIaaSComputeVMContainer.class);
        Assertions.assertEquals("napxbannovv", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_BACKUP_SERVER, model.backupManagementType());
        Assertions.assertEquals("ytprwnwvroev", model.registrationStatus());
        Assertions.assertEquals("lyokrrrou", model.healthStatus());
        Assertions.assertEquals("vnsasbcrymodi", model.protectableObjectType());
        Assertions.assertEquals("vqecr", model.virtualMachineId());
        Assertions.assertEquals("tmxxdtddmflhuy", model.virtualMachineVersion());
        Assertions.assertEquals("zv", model.resourceGroup());
    }
}