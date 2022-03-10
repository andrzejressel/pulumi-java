// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNamespaceIpFilterRuleResult {
    /**
     * The IP Filter Action
     * 
     */
    private final @Nullable String action;
    /**
     * IP Filter name
     * 
     */
    private final @Nullable String filterName;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * IP Mask
     * 
     */
    private final @Nullable String ipMask;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetNamespaceIpFilterRuleResult(
        @OutputCustomType.Parameter("action") @Nullable String action,
        @OutputCustomType.Parameter("filterName") @Nullable String filterName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("ipMask") @Nullable String ipMask,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("type") String type) {
        this.action = action;
        this.filterName = filterName;
        this.id = id;
        this.ipMask = ipMask;
        this.name = name;
        this.type = type;
    }

    /**
     * The IP Filter Action
     * 
    */
    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * IP Filter name
     * 
    */
    public Optional<String> getFilterName() {
        return Optional.ofNullable(this.filterName);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * IP Mask
     * 
    */
    public Optional<String> getIpMask() {
        return Optional.ofNullable(this.ipMask);
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceIpFilterRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String filterName;
        private String id;
        private @Nullable String ipMask;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceIpFilterRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.filterName = defaults.filterName;
    	      this.id = defaults.id;
    	      this.ipMask = defaults.ipMask;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setAction(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder setFilterName(@Nullable String filterName) {
            this.filterName = filterName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIpMask(@Nullable String ipMask) {
            this.ipMask = ipMask;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetNamespaceIpFilterRuleResult build() {
            return new GetNamespaceIpFilterRuleResult(action, filterName, id, ipMask, name, type);
        }
    }
}
