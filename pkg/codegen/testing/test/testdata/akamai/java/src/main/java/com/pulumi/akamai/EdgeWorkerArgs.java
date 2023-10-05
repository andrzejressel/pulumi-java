// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeWorkerArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeWorkerArgs Empty = new EdgeWorkerArgs();

    /**
     * Defines the group association for the EdgeWorker
     * 
     */
    @Import(name="groupId", required=true)
    private Output<Integer> groupId;

    /**
     * @return Defines the group association for the EdgeWorker
     * 
     */
    public Output<Integer> groupId() {
        return this.groupId;
    }

    /**
     * The path to the EdgeWorkers tgz code bundle
     * 
     */
    @Import(name="localBundle")
    private @Nullable Output<String> localBundle;

    /**
     * @return The path to the EdgeWorkers tgz code bundle
     * 
     */
    public Optional<Output<String>> localBundle() {
        return Optional.ofNullable(this.localBundle);
    }

    /**
     * The EdgeWorker name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The EdgeWorker name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The unique identifier of a resource tier
     * 
     */
    @Import(name="resourceTierId", required=true)
    private Output<Integer> resourceTierId;

    /**
     * @return The unique identifier of a resource tier
     * 
     */
    public Output<Integer> resourceTierId() {
        return this.resourceTierId;
    }

    private EdgeWorkerArgs() {}

    private EdgeWorkerArgs(EdgeWorkerArgs $) {
        this.groupId = $.groupId;
        this.localBundle = $.localBundle;
        this.name = $.name;
        this.resourceTierId = $.resourceTierId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeWorkerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeWorkerArgs $;

        public Builder() {
            $ = new EdgeWorkerArgs();
        }

        public Builder(EdgeWorkerArgs defaults) {
            $ = new EdgeWorkerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId Defines the group association for the EdgeWorker
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<Integer> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Defines the group association for the EdgeWorker
         * 
         * @return builder
         * 
         */
        public Builder groupId(Integer groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param localBundle The path to the EdgeWorkers tgz code bundle
         * 
         * @return builder
         * 
         */
        public Builder localBundle(@Nullable Output<String> localBundle) {
            $.localBundle = localBundle;
            return this;
        }

        /**
         * @param localBundle The path to the EdgeWorkers tgz code bundle
         * 
         * @return builder
         * 
         */
        public Builder localBundle(String localBundle) {
            return localBundle(Output.of(localBundle));
        }

        /**
         * @param name The EdgeWorker name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The EdgeWorker name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceTierId The unique identifier of a resource tier
         * 
         * @return builder
         * 
         */
        public Builder resourceTierId(Output<Integer> resourceTierId) {
            $.resourceTierId = resourceTierId;
            return this;
        }

        /**
         * @param resourceTierId The unique identifier of a resource tier
         * 
         * @return builder
         * 
         */
        public Builder resourceTierId(Integer resourceTierId) {
            return resourceTierId(Output.of(resourceTierId));
        }

        public EdgeWorkerArgs build() {
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.resourceTierId = Objects.requireNonNull($.resourceTierId, "expected parameter 'resourceTierId' to be non-null");
            return $;
        }
    }

}
