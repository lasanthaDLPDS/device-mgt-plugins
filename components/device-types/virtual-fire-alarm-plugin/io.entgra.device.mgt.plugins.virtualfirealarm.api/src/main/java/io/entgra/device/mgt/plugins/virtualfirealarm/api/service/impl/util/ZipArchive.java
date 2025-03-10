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

package io.entgra.device.mgt.plugins.virtualfirealarm.api.service.impl.util;

/**
 * This is an utility class to hold zip files.
 */
public class ZipArchive {

    private byte[] zipFileContent = null;
    private String fileName = null;

    public ZipArchive(String fileName, byte[] zipFile) {
        this.fileName = fileName;
        this.zipFileContent = zipFile;
    }

    public byte[] getZipFileContent() {
        return zipFileContent;
    }

    public String getFileName() {
        return fileName;
    }
}
