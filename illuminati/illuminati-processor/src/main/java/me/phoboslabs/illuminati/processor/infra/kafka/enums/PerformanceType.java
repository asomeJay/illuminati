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

package me.phoboslabs.illuminati.processor.infra.kafka.enums;

/**
 * Created by leekyoungil (leekyoungil@gmail.com) on 11/07/2017.
 */
public enum PerformanceType {
    SLOW_BUT_GUARANTEE_DATA("all"),
    FAST_BUT_SOMETIMES_DISAPPEAR("1"),
    FASTEST_BUT_NO_GUARANTEE_DATA("0");

    private String type;

    PerformanceType (String type) {
        this.type = type;
    }

    public String getType () {
        return this.type;
    }
}
