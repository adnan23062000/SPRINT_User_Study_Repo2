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

package org.wso2.carbon.testgrid.common;

/**
 * This is the test model for a single SolutionPattern.
 */
public class TestScenario {

    public enum TestScenarioStatus {
        EXECUTION_PLANNED, INFRASTRUCTURE_PREPARATION, DEPLOYMENT_PREPARATION, TEST_EXECUTION, REPORT_GENERATION,
        EXECUTION_COMPLETED
    }

    public enum InfrastructureType {
        AWS, GCC, OPENSTACK
    }

    public enum ScriptType {
        EC2, ECS, K8S, CLOUD_FORMATION
    }

    public enum DeployerType {
        PUPPET, ANSIBLE, CHEF
    }

    private boolean isEnabled;
    private int id;
    private String solutionPattern;
    private Deployment deployment;
    private TestReport report;
    private String tempLocation;
    private String scenarioLocation;
    private InfrastructureType infrastructureType;
    private ScriptType scriptType;
    private DeployerType deployerType;
    private TestScenarioStatus status;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSolutionPattern() {
        return solutionPattern;
    }

    public void setSolutionPattern(String solutionPattern) {
        this.solutionPattern = solutionPattern;
    }

    public Deployment getDeployment() {
        return deployment;
    }

    public void setDeployment(Deployment deployment) {
        this.deployment = deployment;
    }

    public String getTempLocation() {
        return tempLocation;
    }

    public void setTempLocation(String tempLocation) {
        this.tempLocation = tempLocation;
    }

    public TestReport getReport() {
        return report;
    }

    public void setReport(TestReport report) {
        this.report = report;
    }

    public TestScenarioStatus getStatus() {
        return status;
    }

    public void setStatus(TestScenarioStatus status) {
        this.status = status;
    }

    public InfrastructureType getInfrastructureType() {
        return infrastructureType;
    }

    public void setInfrastructureType(InfrastructureType infrastructureType) {
        this.infrastructureType = infrastructureType;
    }

    public ScriptType getScriptType() {
        return scriptType;
    }

    public void setScriptType(ScriptType scriptType) {
        this.scriptType = scriptType;
    }

    public DeployerType getDeployerType() {
        return deployerType;
    }

    public void setDeployerType(DeployerType deployerType) {
        this.deployerType = deployerType;
    }

    public String getScenarioLocation() {
        return scenarioLocation;
    }

    public void setScenarioLocation(String scenarioLocation) {
        this.scenarioLocation = scenarioLocation;
    }
}