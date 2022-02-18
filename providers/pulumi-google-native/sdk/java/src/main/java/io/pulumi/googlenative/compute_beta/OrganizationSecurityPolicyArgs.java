// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.OrganizationSecurityPolicyType;
import io.pulumi.googlenative.compute_beta.inputs.SecurityPolicyAdaptiveProtectionConfigArgs;
import io.pulumi.googlenative.compute_beta.inputs.SecurityPolicyAdvancedOptionsConfigArgs;
import io.pulumi.googlenative.compute_beta.inputs.SecurityPolicyAssociationArgs;
import io.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRecaptchaOptionsConfigArgs;
import io.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationSecurityPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationSecurityPolicyArgs Empty = new OrganizationSecurityPolicyArgs();

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

    @InputImport(name="parentId")
    private final @Nullable Input<String> parentId;

    public Input<String> getParentId() {
        return this.parentId == null ? Input.empty() : this.parentId;
    }

    @InputImport(name="recaptchaOptionsConfig")
    private final @Nullable Input<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig;

    public Input<SecurityPolicyRecaptchaOptionsConfigArgs> getRecaptchaOptionsConfig() {
        return this.recaptchaOptionsConfig == null ? Input.empty() : this.recaptchaOptionsConfig;
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
    private final @Nullable Input<OrganizationSecurityPolicyType> type;

    public Input<OrganizationSecurityPolicyType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public OrganizationSecurityPolicyArgs(
        @Nullable Input<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig,
        @Nullable Input<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig,
        @Nullable Input<List<SecurityPolicyAssociationArgs>> associations,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> parentId,
        @Nullable Input<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig,
        @Nullable Input<String> requestId,
        @Nullable Input<List<SecurityPolicyRuleArgs>> rules,
        @Nullable Input<OrganizationSecurityPolicyType> type) {
        this.adaptiveProtectionConfig = adaptiveProtectionConfig;
        this.advancedOptionsConfig = advancedOptionsConfig;
        this.associations = associations;
        this.description = description;
        this.displayName = displayName;
        this.labels = labels;
        this.name = name;
        this.parentId = parentId;
        this.recaptchaOptionsConfig = recaptchaOptionsConfig;
        this.requestId = requestId;
        this.rules = rules;
        this.type = type;
    }

    private OrganizationSecurityPolicyArgs() {
        this.adaptiveProtectionConfig = Input.empty();
        this.advancedOptionsConfig = Input.empty();
        this.associations = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.parentId = Input.empty();
        this.recaptchaOptionsConfig = Input.empty();
        this.requestId = Input.empty();
        this.rules = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig;
        private @Nullable Input<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig;
        private @Nullable Input<List<SecurityPolicyAssociationArgs>> associations;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> parentId;
        private @Nullable Input<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig;
        private @Nullable Input<String> requestId;
        private @Nullable Input<List<SecurityPolicyRuleArgs>> rules;
        private @Nullable Input<OrganizationSecurityPolicyType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationSecurityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveProtectionConfig = defaults.adaptiveProtectionConfig;
    	      this.advancedOptionsConfig = defaults.advancedOptionsConfig;
    	      this.associations = defaults.associations;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parentId = defaults.parentId;
    	      this.recaptchaOptionsConfig = defaults.recaptchaOptionsConfig;
    	      this.requestId = defaults.requestId;
    	      this.rules = defaults.rules;
    	      this.type = defaults.type;
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

        public Builder setParentId(@Nullable Input<String> parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setParentId(@Nullable String parentId) {
            this.parentId = Input.ofNullable(parentId);
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

        public Builder setType(@Nullable Input<OrganizationSecurityPolicyType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable OrganizationSecurityPolicyType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public OrganizationSecurityPolicyArgs build() {
            return new OrganizationSecurityPolicyArgs(adaptiveProtectionConfig, advancedOptionsConfig, associations, description, displayName, labels, name, parentId, recaptchaOptionsConfig, requestId, rules, type);
        }
    }
}
