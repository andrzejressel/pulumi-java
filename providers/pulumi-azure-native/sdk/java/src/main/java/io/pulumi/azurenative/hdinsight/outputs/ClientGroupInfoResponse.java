// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClientGroupInfoResponse {
    /**
     * The AAD security group id.
     * 
     */
    private final @Nullable String groupId;
    /**
     * The AAD security group name.
     * 
     */
    private final @Nullable String groupName;

    @OutputCustomType.Constructor
    private ClientGroupInfoResponse(
        @OutputCustomType.Parameter("groupId") @Nullable String groupId,
        @OutputCustomType.Parameter("groupName") @Nullable String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    /**
     * The AAD security group id.
     * 
    */
    public Optional<String> getGroupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * The AAD security group name.
     * 
    */
    public Optional<String> getGroupName() {
        return Optional.ofNullable(this.groupName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientGroupInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String groupId;
        private @Nullable String groupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientGroupInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.groupName = defaults.groupName;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setGroupName(@Nullable String groupName) {
            this.groupName = groupName;
            return this;
        }
        public ClientGroupInfoResponse build() {
            return new ClientGroupInfoResponse(groupId, groupName);
        }
    }
}
