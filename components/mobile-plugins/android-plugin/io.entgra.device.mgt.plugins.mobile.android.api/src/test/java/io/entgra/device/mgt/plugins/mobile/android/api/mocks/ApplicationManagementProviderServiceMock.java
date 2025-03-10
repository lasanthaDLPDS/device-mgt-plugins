/*
 * Copyright (c) 2018 - 2023, Entgra (Pvt) Ltd. (http://www.entgra.io) All Rights Reserved.
 *
 * Entgra (Pvt) Ltd. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.entgra.device.mgt.plugins.mobile.android.api.mocks;

import io.entgra.device.mgt.core.device.mgt.common.Device;
import io.entgra.device.mgt.core.device.mgt.common.DeviceIdentifier;
import io.entgra.device.mgt.core.device.mgt.common.app.mgt.Application;
import io.entgra.device.mgt.core.device.mgt.common.app.mgt.ApplicationManagementException;
import io.entgra.device.mgt.core.device.mgt.common.operation.mgt.Activity;
import io.entgra.device.mgt.core.device.mgt.common.operation.mgt.Operation;
import io.entgra.device.mgt.core.device.mgt.core.app.mgt.ApplicationManagementProviderService;

import java.util.List;

public class ApplicationManagementProviderServiceMock implements ApplicationManagementProviderService {
    @Override
    public void updateApplicationListInstalledInDevice(DeviceIdentifier deviceIdentifier, List<Application> list)
            throws ApplicationManagementException {

    }

    @Override
    public void updateApplicationListInstalledInDevice(Device device, List<Application> list) throws ApplicationManagementException {

    }

    @Override
    public List<Application> getApplicationListForDevice(DeviceIdentifier deviceIdentifier)
            throws ApplicationManagementException {
        return null;
    }

    @Override
    public List<Application> getApplicationListForDevice(Device device) throws ApplicationManagementException {
        return null;
    }

    @Override
    public Application[] getApplications(String s, int i, int i1) throws ApplicationManagementException {
        return new Application[0];
    }

    @Override
    public void updateApplicationStatus(DeviceIdentifier deviceIdentifier, Application application, String s)
            throws ApplicationManagementException {

    }

    @Override
    public String getApplicationStatus(DeviceIdentifier deviceIdentifier, Application application)
            throws ApplicationManagementException {
        return null;
    }

    @Override
    public Activity installApplicationForDevices(Operation operation, List<DeviceIdentifier> list)
            throws ApplicationManagementException {
        return null;
    }

    @Override
    public Activity installApplicationForUsers(Operation operation, List<String> list)
            throws ApplicationManagementException {
        return null;
    }

    @Override
    public Activity installApplicationForUserRoles(Operation operation, List<String> list)
            throws ApplicationManagementException {
        return null;
    }
}
