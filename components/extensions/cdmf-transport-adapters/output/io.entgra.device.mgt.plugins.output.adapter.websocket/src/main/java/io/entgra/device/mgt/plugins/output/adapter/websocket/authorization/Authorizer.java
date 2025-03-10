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

package io.entgra.device.mgt.plugins.output.adapter.websocket.authorization;

import io.entgra.device.mgt.plugins.output.adapter.websocket.authentication.AuthenticationInfo;

import javax.websocket.Session;
import java.util.Map;

/**
 * Check whether the client is authorized to connect.
 */
public interface Authorizer {

    /**
     * This is used to initialize the authenticator
     * @param globalProperties related to the output adapter
     */
    void init(Map<String, String> globalProperties);

    /**
     * Check whether the client is authorized to connect with the stream.
     * @param authenticationInfo authenticated client information.
     * @param session request session of the client.
     * @param stream stream name of the client connecting to.
     * @return true if authorized else return false.
     */
    boolean isAuthorized(AuthenticationInfo authenticationInfo, Session session, String stream);
}
