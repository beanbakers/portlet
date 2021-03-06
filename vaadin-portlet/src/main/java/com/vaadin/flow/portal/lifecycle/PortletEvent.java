/*
 * Copyright 2000-2019 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.flow.portal.lifecycle;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * A generic IPC event.
 *
 * @author Vaadin Ltd
 * @since
 *
 */
public class PortletEvent implements Serializable {

    private final String eventName;
    private final Map<String, String[]> parameters;

    /**
     * Creates a new event instance using {@code eventName} and
     * {@code parameters}.
     *
     * @param eventName
     *            an event name
     * @param parameters
     *            event parameters
     */
    public PortletEvent(String eventName, Map<String, String[]> parameters) {
        this.eventName = eventName;
        this.parameters = new HashMap<>(parameters);
    }

    public String getEventName() {
        return eventName;
    }

    public Map<String, String[]> getParameters() {
        return Collections.unmodifiableMap(parameters);
    }
}
