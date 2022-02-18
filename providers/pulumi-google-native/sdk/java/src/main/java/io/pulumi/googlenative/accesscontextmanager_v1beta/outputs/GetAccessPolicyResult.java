// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetAccessPolicyResult {
    /**
     * Resource name of the `AccessPolicy`. Format: `accessPolicies/{policy_id}`
     * 
     */
    private final String name;
    /**
     * The parent of this `AccessPolicy` in the Cloud Resource Hierarchy. Currently immutable once created. Format: `organizations/{organization_id}`
     * 
     */
    private final String parent;
    /**
     * Human readable title. Does not affect behavior.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"name","parent","title"})
    private GetAccessPolicyResult(
        String name,
        String parent,
        String title) {
        this.name = Objects.requireNonNull(name);
        this.parent = Objects.requireNonNull(parent);
        this.title = Objects.requireNonNull(title);
    }

    /**
     * Resource name of the `AccessPolicy`. Format: `accessPolicies/{policy_id}`
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The parent of this `AccessPolicy` in the Cloud Resource Hierarchy. Currently immutable once created. Format: `organizations/{organization_id}`
     * 
     */
    public String getParent() {
        return this.parent;
    }
    /**
     * Human readable title. Does not affect behavior.
     * 
     */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String parent;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.title = defaults.title;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public GetAccessPolicyResult build() {
            return new GetAccessPolicyResult(name, parent, title);
        }
    }
}
