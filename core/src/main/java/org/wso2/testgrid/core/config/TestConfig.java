/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.testgrid.core.config;

import java.util.List;
import java.util.Map;

/**
 * This class is used to retrieve test configuration values given by the user or generated by the test grid framework.
 *
 * @since 1.0.0
 */
public class TestConfig {

    private ProductConfig productConfig;
    private String deploymentPatternRepository;
    private String deploymentPattern;
    private List<Map<String, String>> infraParams;
    private ScenarioConfig scenarioConfig;

    /**
     * Returns the product config.
     *
     * @return product config
     */
    public ProductConfig getProductConfig() {
        return productConfig;
    }

    /**
     * Sets the product config.
     *
     * @param productConfig product config
     */
    public void setProductConfig(ProductConfig productConfig) {
        this.productConfig = productConfig;
    }

    /**
     * Returns the deployment pattern repository.
     *
     * @return deployment pattern repository
     */
    public String getDeploymentPatternRepository() {
        return deploymentPatternRepository;
    }

    /**
     * Sets the deployment pattern repository.
     *
     * @param deploymentPatternRepository deployment pattern repository
     */
    public void setDeploymentPatternRepository(String deploymentPatternRepository) {
        this.deploymentPatternRepository = deploymentPatternRepository;
    }

    /**
     * Returns the deployment pattern.
     *
     * @return deployment pattern
     */
    public String getDeploymentPattern() {
        return deploymentPattern;
    }

    /**
     * Sets the deployment pattern.
     *
     * @param deploymentPattern deployment pattern
     */
    public void setDeploymentPattern(String deploymentPattern) {
        this.deploymentPattern = deploymentPattern;
    }

    /**
     * Returns the infrastructure parameters.
     *
     * @return infrastructure parameters
     */
    public List<Map<String, String>> getInfraParams() {
        return infraParams;
    }

    /**
     * Sets the infrastructure parameters.
     *
     * @param infraParams infrastructure parameters
     */
    public void setInfraParams(List<Map<String, String>> infraParams) {
        this.infraParams = infraParams;
    }

    /**
     * Returns the test scenario config.
     *
     * @return test scenario config
     */
    public ScenarioConfig getScenarioConfig() {
        return scenarioConfig;
    }

    /**
     * Sets the test scenario config.
     *
     * @param scenarioConfig test scenario config
     */
    public void setScenarioConfig(ScenarioConfig scenarioConfig) {
        this.scenarioConfig = scenarioConfig;
    }
}
