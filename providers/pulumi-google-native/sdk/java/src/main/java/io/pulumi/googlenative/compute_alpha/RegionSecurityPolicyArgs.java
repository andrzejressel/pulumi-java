// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.RegionSecurityPolicyType;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAdaptiveProtectionConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAdvancedOptionsConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAssociationArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyCloudArmorConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyDdosProtectionConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRecaptchaOptionsConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionSecurityPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionSecurityPolicyArgs Empty = new RegionSecurityPolicyArgs();

    @InputImport(name="adaptiveProtectionConfig")
    private final @Nullable Input<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig;

    public Input<SecurityPolicyAdaptiveProtectionConfigArgs> getAdaptiveProtectionConfig() {
        return this.adaptiveProtectionConfig == null ? Input.empty() : this.adaptiveProtectionConfig;
    }

    @InputImport(name="advancedOptionsConfig")
    private final @Nullable Input<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig;

    public Input<SecurityPolicyAdvancedOptionsConfigArgs> getAdvancedOptionsConfig() {
        return this.advancedOptionsConfig == null ? Input.empty() : this.advancedOptionsConfig;
    }

    /**
     * A list of associations that belong to this policy.
     * 
     */
    @InputImport(name="associations")
    private final @Nullable Input<List<SecurityPolicyAssociationArgs>> associations;

    public Input<List<SecurityPolicyAssociationArgs>> getAssociations() {
        return this.associations == null ? Input.empty() : this.associations;
    }

    @InputImport(name="cloudArmorConfig")
    private final @Nullable Input<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig;

    public Input<SecurityPolicyCloudArmorConfigArgs> getCloudArmorConfig() {
        return this.cloudArmorConfig == null ? Input.empty() : this.cloudArmorConfig;
    }

    @InputImport(name="ddosProtectionConfig")
    private final @Nullable Input<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig;

    public Input<SecurityPolicyDdosProtectionConfigArgs> getDdosProtectionConfig() {
        return this.ddosProtectionConfig == null ? Input.empty() : this.ddosProtectionConfig;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="recaptchaOptionsConfig")
    private final @Nullable Input<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig;

    public Input<SecurityPolicyRecaptchaOptionsConfigArgs> getRecaptchaOptionsConfig() {
        return this.recaptchaOptionsConfig == null ? Input.empty() : this.recaptchaOptionsConfig;
    }

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a security policy, a default rule with action "allow" will be added.
     * 
     */
    @InputImport(name="rules")
    private final @Nullable Input<List<SecurityPolicyRuleArgs>> rules;

    public Input<List<SecurityPolicyRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    /**
     * The type indicates the intended use of the security policy. CLOUD_ARMOR - Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. CLOUD_ARMOR_EDGE - Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google's cache.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<RegionSecurityPolicyType> type;

    public Input<RegionSecurityPolicyType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="validateOnly")
    private final @Nullable Input<String> validateOnly;

    public Input<String> getValidateOnly() {
        return this.validateOnly == null ? Input.empty() : this.validateOnly;
    }

    public RegionSecurityPolicyArgs(
        @Nullable Input<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig,
        @Nullable Input<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig,
        @Nullable Input<List<SecurityPolicyAssociationArgs>> associations,
        @Nullable Input<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig,
        @Nullable Input<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<List<SecurityPolicyRuleArgs>> rules,
        @Nullable Input<RegionSecurityPolicyType> type,
        @Nullable Input<String> validateOnly) {
        this.adaptiveProtectionConfig = adaptiveProtectionConfig;
        this.advancedOptionsConfig = advancedOptionsConfig;
        this.associations = associations;
        this.cloudArmorConfig = cloudArmorConfig;
        this.ddosProtectionConfig = ddosProtectionConfig;
        this.description = description;
        this.displayName = displayName;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.recaptchaOptionsConfig = recaptchaOptionsConfig;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.rules = rules;
        this.type = type;
        this.validateOnly = validateOnly;
    }

    private RegionSecurityPolicyArgs() {
        this.adaptiveProtectionConfig = Input.empty();
        this.advancedOptionsConfig = Input.empty();
        this.associations = Input.empty();
        this.cloudArmorConfig = Input.empty();
        this.ddosProtectionConfig = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.recaptchaOptionsConfig = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.rules = Input.empty();
        this.type = Input.empty();
        this.validateOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig;
        private @Nullable Input<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig;
        private @Nullable Input<List<SecurityPolicyAssociationArgs>> associations;
        private @Nullable Input<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig;
        private @Nullable Input<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<List<SecurityPolicyRuleArgs>> rules;
        private @Nullable Input<RegionSecurityPolicyType> type;
        private @Nullable Input<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionSecurityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveProtectionConfig = defaults.adaptiveProtectionConfig;
    	      this.advancedOptionsConfig = defaults.advancedOptionsConfig;
    	      this.associations = defaults.associations;
    	      this.cloudArmorConfig = defaults.cloudArmorConfig;
    	      this.ddosProtectionConfig = defaults.ddosProtectionConfig;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.recaptchaOptionsConfig = defaults.recaptchaOptionsConfig;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.rules = defaults.rules;
    	      this.type = defaults.type;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder setAdaptiveProtectionConfig(@Nullable Input<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig) {
            this.adaptiveProtectionConfig = adaptiveProtectionConfig;
            return this;
        }

        public Builder setAdaptiveProtectionConfig(@Nullable SecurityPolicyAdaptiveProtectionConfigArgs adaptiveProtectionConfig) {
            this.adaptiveProtectionConfig = Input.ofNullable(adaptiveProtectionConfig);
            return this;
        }

        public Builder setAdvancedOptionsConfig(@Nullable Input<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig) {
            this.advancedOptionsConfig = advancedOptionsConfig;
            return this;
        }

        public Builder setAdvancedOptionsConfig(@Nullable SecurityPolicyAdvancedOptionsConfigArgs advancedOptionsConfig) {
            this.advancedOptionsConfig = Input.ofNullable(advancedOptionsConfig);
            return this;
        }

        public Builder setAssociations(@Nullable Input<List<SecurityPolicyAssociationArgs>> associations) {
            this.associations = associations;
            return this;
        }

        public Builder setAssociations(@Nullable List<SecurityPolicyAssociationArgs> associations) {
            this.associations = Input.ofNullable(associations);
            return this;
        }

        public Builder setCloudArmorConfig(@Nullable Input<SecurityPolicyCloudArmorConfigArgs> cloudArmorConfig) {
            this.cloudArmorConfig = cloudArmorConfig;
            return this;
        }

        public Builder setCloudArmorConfig(@Nullable SecurityPolicyCloudArmorConfigArgs cloudArmorConfig) {
            this.cloudArmorConfig = Input.ofNullable(cloudArmorConfig);
            return this;
        }

        public Builder setDdosProtectionConfig(@Nullable Input<SecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig) {
            this.ddosProtectionConfig = ddosProtectionConfig;
            return this;
        }

        public Builder setDdosProtectionConfig(@Nullable SecurityPolicyDdosProtectionConfigArgs ddosProtectionConfig) {
            this.ddosProtectionConfig = Input.ofNullable(ddosProtectionConfig);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRecaptchaOptionsConfig(@Nullable Input<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig) {
            this.recaptchaOptionsConfig = recaptchaOptionsConfig;
            return this;
        }

        public Builder setRecaptchaOptionsConfig(@Nullable SecurityPolicyRecaptchaOptionsConfigArgs recaptchaOptionsConfig) {
            this.recaptchaOptionsConfig = Input.ofNullable(recaptchaOptionsConfig);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setRules(@Nullable Input<List<SecurityPolicyRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<SecurityPolicyRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder setType(@Nullable Input<RegionSecurityPolicyType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable RegionSecurityPolicyType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setValidateOnly(@Nullable Input<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }

        public Builder setValidateOnly(@Nullable String validateOnly) {
            this.validateOnly = Input.ofNullable(validateOnly);
            return this;
        }

        public RegionSecurityPolicyArgs build() {
            return new RegionSecurityPolicyArgs(adaptiveProtectionConfig, advancedOptionsConfig, associations, cloudArmorConfig, ddosProtectionConfig, description, displayName, labels, name, project, recaptchaOptionsConfig, region, requestId, rules, type, validateOnly);
        }
    }
}
