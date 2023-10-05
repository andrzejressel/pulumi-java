// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IamBlockedUserPropertiesState extends com.pulumi.resources.ResourceArgs {

    public static final IamBlockedUserPropertiesState Empty = new IamBlockedUserPropertiesState();

    /**
     * List of properties to block for a user
     * 
     */
    @Import(name="blockedProperties")
    private @Nullable Output<List<Integer>> blockedProperties;

    /**
     * @return List of properties to block for a user
     * 
     */
    public Optional<Output<List<Integer>>> blockedProperties() {
        return Optional.ofNullable(this.blockedProperties);
    }

    /**
     * A unique identifier for a group
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<Integer> groupId;

    /**
     * @return A unique identifier for a group
     * 
     */
    public Optional<Output<Integer>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * A unique identifier for a user&#39;s profile, which corresponds to a user&#39;s actual profile or client ID
     * 
     */
    @Import(name="identityId")
    private @Nullable Output<String> identityId;

    /**
     * @return A unique identifier for a user&#39;s profile, which corresponds to a user&#39;s actual profile or client ID
     * 
     */
    public Optional<Output<String>> identityId() {
        return Optional.ofNullable(this.identityId);
    }

    private IamBlockedUserPropertiesState() {}

    private IamBlockedUserPropertiesState(IamBlockedUserPropertiesState $) {
        this.blockedProperties = $.blockedProperties;
        this.groupId = $.groupId;
        this.identityId = $.identityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IamBlockedUserPropertiesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamBlockedUserPropertiesState $;

        public Builder() {
            $ = new IamBlockedUserPropertiesState();
        }

        public Builder(IamBlockedUserPropertiesState defaults) {
            $ = new IamBlockedUserPropertiesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockedProperties List of properties to block for a user
         * 
         * @return builder
         * 
         */
        public Builder blockedProperties(@Nullable Output<List<Integer>> blockedProperties) {
            $.blockedProperties = blockedProperties;
            return this;
        }

        /**
         * @param blockedProperties List of properties to block for a user
         * 
         * @return builder
         * 
         */
        public Builder blockedProperties(List<Integer> blockedProperties) {
            return blockedProperties(Output.of(blockedProperties));
        }

        /**
         * @param blockedProperties List of properties to block for a user
         * 
         * @return builder
         * 
         */
        public Builder blockedProperties(Integer... blockedProperties) {
            return blockedProperties(List.of(blockedProperties));
        }

        /**
         * @param groupId A unique identifier for a group
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<Integer> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId A unique identifier for a group
         * 
         * @return builder
         * 
         */
        public Builder groupId(Integer groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param identityId A unique identifier for a user&#39;s profile, which corresponds to a user&#39;s actual profile or client ID
         * 
         * @return builder
         * 
         */
        public Builder identityId(@Nullable Output<String> identityId) {
            $.identityId = identityId;
            return this;
        }

        /**
         * @param identityId A unique identifier for a user&#39;s profile, which corresponds to a user&#39;s actual profile or client ID
         * 
         * @return builder
         * 
         */
        public Builder identityId(String identityId) {
            return identityId(Output.of(identityId));
        }

        public IamBlockedUserPropertiesState build() {
            return $;
        }
    }

}
