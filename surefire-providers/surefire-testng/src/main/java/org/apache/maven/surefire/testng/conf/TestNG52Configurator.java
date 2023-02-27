/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven.surefire.testng.conf;

import org.apache.maven.surefire.api.booter.ProviderParameterNames;

/**
 * TestNG 5.2 configurator.
 * <br>
 * Allowed options:
 * -groups
 * -excludedgroups
 * -junit (boolean)
 * -threadcount (int)
 * -parallel (String)
 * <br>
 *
 * @author <a href='mailto:the[dot]mindstorm[at]gmail[dot]com'>Alex Popescu</a>
 */
public class TestNG52Configurator extends AbstractDirectConfigurator {
    public TestNG52Configurator() {
        setters.put(ProviderParameterNames.PARALLEL_PROP, new Setter("setParallel", String.class));
    }
}
