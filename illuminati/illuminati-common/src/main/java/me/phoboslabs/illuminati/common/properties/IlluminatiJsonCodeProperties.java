/*
 * Copyright 2017 Phoboslabs.me
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.phoboslabs.illuminati.common.properties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;
import java.util.Properties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IlluminatiJsonCodeProperties extends IlluminatiBaseProperties {

    private Map<Integer, String> jsonStatusCode;

    public IlluminatiJsonCodeProperties () {
        super();
    }

    public IlluminatiJsonCodeProperties (final Properties prop) {
        super(prop);
    }

    public String getMessage (int code) {
        return this.jsonStatusCode.get(code);
    }
}
