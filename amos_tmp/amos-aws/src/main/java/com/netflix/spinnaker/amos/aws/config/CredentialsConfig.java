/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.amos.aws.config;

import java.util.List;

/**
 * A mutable credentials configurations structure suitable for transformation into concrete
 * credentials implementations.
 */
public class CredentialsConfig {
    public static class Region {
        private String name;
        private List<String> availabilityZones;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getAvailabilityZones() {
            return availabilityZones;
        }

        public void setAvailabilityZones(List<String> availabilityZones) {
            this.availabilityZones = availabilityZones;
        }
    }

    public static class Account {
        private String name;
        private String environment;
        private String accountType;
        private String accountId;
        private String defaultKeyPair;
        private List<Region> regions;
        private List<String> requiredGroupMembership;
        private String edda;
        private Boolean eddaEnabled;
        private String discovery;
        private Boolean discoveryEnabled;
        private String front50;
        private Boolean front50Enabled;
        private String assumeRole;
        private String sessionName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEnvironment() {
            return environment;
        }

        public void setEnvironment(String environment) {
            this.environment = environment;
        }

        public String getAccountType() {
            return accountType;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }

        public String getAccountId() {
            return accountId;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        public String getDefaultKeyPair() {
            return defaultKeyPair;
        }

        public void setDefaultKeyPair(String defaultKeyPair) {
            this.defaultKeyPair = defaultKeyPair;
        }

        public List<Region> getRegions() {
            return regions;
        }

        public void setRegions(List<Region> regions) {
            this.regions = regions;
        }

        public List<String> getRequiredGroupMembership() {
            return requiredGroupMembership;
        }

        public void setRequiredGroupMembership(List<String> requiredGroupMembership) {
            this.requiredGroupMembership = requiredGroupMembership;
        }

        public String getEdda() {
            return edda;
        }

        public void setEdda(String edda) {
            this.edda = edda;
        }

        public Boolean getEddaEnabled() {
            return eddaEnabled;
        }

        public void setEddaEnabled(Boolean eddaEnabled) {
            this.eddaEnabled = eddaEnabled;
        }

        public String getDiscovery() {
            return discovery;
        }

        public void setDiscovery(String discovery) {
            this.discovery = discovery;
        }

        public Boolean getDiscoveryEnabled() {
            return discoveryEnabled;
        }

        public void setDiscoveryEnabled(Boolean discoveryEnabled) {
            this.discoveryEnabled = discoveryEnabled;
        }

        public String getFront50() {
            return front50;
        }

        public void setFront50(String front50) {
            this.front50 = front50;
        }

        public Boolean getFront50Enabled() {
            return front50Enabled;
        }

        public void setFront50Enabled(Boolean front50Enabled) {
            this.front50Enabled = front50Enabled;
        }

        public String getAssumeRole() {
            return assumeRole;
        }

        public void setAssumeRole(String assumeRole) {
            this.assumeRole = assumeRole;
        }

        public String getSessionName() {
            return sessionName;
        }

        public void setSessionName(String sessionName) {
            this.sessionName = sessionName;
        }
    }

    private String defaultKeyPairTemplate;
    private List<Region> defaultRegions;
    private String defaultEddaTemplate;
    private String defaultFront50Template;
    private String defaultDiscoveryTemplate;
    private String defaultAssumeRole;
    private String defaultSessionName;

    private List<Account> accounts;

    public String getDefaultKeyPairTemplate() {
        return defaultKeyPairTemplate;
    }

    public void setDefaultKeyPairTemplate(String defaultKeyPairTemplate) {
        this.defaultKeyPairTemplate = defaultKeyPairTemplate;
    }

    public List<Region> getDefaultRegions() {
        return defaultRegions;
    }

    public void setDefaultRegions(List<Region> defaultRegions) {
        this.defaultRegions = defaultRegions;
    }

    public String getDefaultEddaTemplate() {
        return defaultEddaTemplate;
    }

    public void setDefaultEddaTemplate(String defaultEddaTemplate) {
        this.defaultEddaTemplate = defaultEddaTemplate;
    }

    public String getDefaultFront50Template() {
        return defaultFront50Template;
    }

    public void setDefaultFront50Template(String defaultFront50Template) {
        this.defaultFront50Template = defaultFront50Template;
    }

    public String getDefaultDiscoveryTemplate() {
        return defaultDiscoveryTemplate;
    }

    public void setDefaultDiscoveryTemplate(String defaultDiscoveryTemplate) {
        this.defaultDiscoveryTemplate = defaultDiscoveryTemplate;
    }

    public String getDefaultAssumeRole() {
        return defaultAssumeRole;
    }

    public void setDefaultAssumeRole(String defaultAssumeRole) {
        this.defaultAssumeRole = defaultAssumeRole;
    }

    public String getDefaultSessionName() {
        return defaultSessionName;
    }

    public void setDefaultSessionName(String defaultSessionName) {
        this.defaultSessionName = defaultSessionName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
