// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.networksecurity_v1beta1.outputs.RuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetAuthorizationPolicyResult {
    /**
     * The action to take when a rule match is found. Possible values are "ALLOW" or "DENY".
     * 
     */
    private final String action;
    /**
     * The timestamp when the resource was created.
     * 
     */
    private final String createTime;
    /**
     * Optional. Free-text description of the resource.
     * 
     */
    private final String description;
    /**
     * Optional. Set of label tags associated with the AuthorizationPolicy resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Name of the AuthorizationPolicy resource. It matches pattern `projects/{project}/locations/{location}/authorizationPolicies/`.
     * 
     */
    private final String name;
    /**
     * Optional. List of rules to match. Note that at least one of the rules must match in order for the action specified in the 'action' field to be taken. A rule is a match if there is a matching source and destination. If left blank, the action specified in the `action` field will be applied on every request.
     * 
     */
    private final List<RuleResponse> rules;
    /**
     * The timestamp when the resource was updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"action","createTime","description","labels","name","rules","updateTime"})
    private GetAuthorizationPolicyResult(
        String action,
        String createTime,
        String description,
        Map<String,String> labels,
        String name,
        List<RuleResponse> rules,
        String updateTime) {
        this.action = Objects.requireNonNull(action);
        this.createTime = Objects.requireNonNull(createTime);
        this.description = Objects.requireNonNull(description);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.rules = Objects.requireNonNull(rules);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The action to take when a rule match is found. Possible values are "ALLOW" or "DENY".
     * 
     */
    public String getAction() {
        return this.action;
    }
    /**
     * The timestamp when the resource was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. Free-text description of the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional. Set of label tags associated with the AuthorizationPolicy resource.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Name of the AuthorizationPolicy resource. It matches pattern `projects/{project}/locations/{location}/authorizationPolicies/`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. List of rules to match. Note that at least one of the rules must match in order for the action specified in the 'action' field to be taken. A rule is a match if there is a matching source and destination. If left blank, the action specified in the `action` field will be applied on every request.
     * 
     */
    public List<RuleResponse> getRules() {
        return this.rules;
    }
    /**
     * The timestamp when the resource was updated.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizationPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String createTime;
        private String description;
        private Map<String,String> labels;
        private String name;
        private List<RuleResponse> rules;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizationPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRules(List<RuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetAuthorizationPolicyResult build() {
            return new GetAuthorizationPolicyResult(action, createTime, description, labels, name, rules, updateTime);
        }
    }
}
