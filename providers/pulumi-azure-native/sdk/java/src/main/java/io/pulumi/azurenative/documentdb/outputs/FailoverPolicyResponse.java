// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FailoverPolicyResponse {
    /**
     * The failover priority of the region. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     * 
     */
    private final @Nullable Integer failoverPriority;
    /**
     * The unique identifier of the region in which the database account replicates to. Example: &lt;accountName&gt;-&lt;locationName&gt;.
     * 
     */
    private final String id;
    /**
     * The name of the region in which the database account exists.
     * 
     */
    private final @Nullable String locationName;

    @OutputCustomType.Constructor
    private FailoverPolicyResponse(
        @OutputCustomType.Parameter("failoverPriority") @Nullable Integer failoverPriority,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("locationName") @Nullable String locationName) {
        this.failoverPriority = failoverPriority;
        this.id = id;
        this.locationName = locationName;
    }

    /**
     * The failover priority of the region. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     * 
    */
    public Optional<Integer> getFailoverPriority() {
        return Optional.ofNullable(this.failoverPriority);
    }
    /**
     * The unique identifier of the region in which the database account replicates to. Example: &lt;accountName&gt;-&lt;locationName&gt;.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the region in which the database account exists.
     * 
    */
    public Optional<String> getLocationName() {
        return Optional.ofNullable(this.locationName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer failoverPriority;
        private String id;
        private @Nullable String locationName;

        public Builder() {
    	      // Empty
        }

        public Builder(FailoverPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPriority = defaults.failoverPriority;
    	      this.id = defaults.id;
    	      this.locationName = defaults.locationName;
        }

        public Builder setFailoverPriority(@Nullable Integer failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocationName(@Nullable String locationName) {
            this.locationName = locationName;
            return this;
        }
        public FailoverPolicyResponse build() {
            return new FailoverPolicyResponse(failoverPriority, id, locationName);
        }
    }
}
