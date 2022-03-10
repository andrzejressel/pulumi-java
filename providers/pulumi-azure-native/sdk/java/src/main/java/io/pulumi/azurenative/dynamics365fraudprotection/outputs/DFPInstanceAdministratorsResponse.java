// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dynamics365fraudprotection.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DFPInstanceAdministratorsResponse {
    /**
     * An array of administrator user identities.
     * 
     */
    private final @Nullable List<String> members;

    @OutputCustomType.Constructor
    private DFPInstanceAdministratorsResponse(@OutputCustomType.Parameter("members") @Nullable List<String> members) {
        this.members = members;
    }

    /**
     * An array of administrator user identities.
     * 
    */
    public List<String> getMembers() {
        return this.members == null ? List.of() : this.members;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DFPInstanceAdministratorsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> members;

        public Builder() {
    	      // Empty
        }

        public Builder(DFPInstanceAdministratorsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.members = defaults.members;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = members;
            return this;
        }
        public DFPInstanceAdministratorsResponse build() {
            return new DFPInstanceAdministratorsResponse(members);
        }
    }
}
