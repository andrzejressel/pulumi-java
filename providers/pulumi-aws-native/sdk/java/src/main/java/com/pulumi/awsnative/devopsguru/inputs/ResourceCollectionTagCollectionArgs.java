// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devopsguru.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Tagged resource for DevOps Guru to monitor
 * 
 */
public final class ResourceCollectionTagCollectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceCollectionTagCollectionArgs Empty = new ResourceCollectionTagCollectionArgs();

    /**
     * A Tag key for DevOps Guru app boundary.
     * 
     */
    @Import(name="appBoundaryKey")
    private @Nullable Output<String> appBoundaryKey;

    /**
     * @return A Tag key for DevOps Guru app boundary.
     * 
     */
    public Optional<Output<String>> appBoundaryKey() {
        return Optional.ofNullable(this.appBoundaryKey);
    }

    /**
     * Tag values of DevOps Guru app boundary.
     * 
     */
    @Import(name="tagValues")
    private @Nullable Output<List<String>> tagValues;

    /**
     * @return Tag values of DevOps Guru app boundary.
     * 
     */
    public Optional<Output<List<String>>> tagValues() {
        return Optional.ofNullable(this.tagValues);
    }

    private ResourceCollectionTagCollectionArgs() {}

    private ResourceCollectionTagCollectionArgs(ResourceCollectionTagCollectionArgs $) {
        this.appBoundaryKey = $.appBoundaryKey;
        this.tagValues = $.tagValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceCollectionTagCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceCollectionTagCollectionArgs $;

        public Builder() {
            $ = new ResourceCollectionTagCollectionArgs();
        }

        public Builder(ResourceCollectionTagCollectionArgs defaults) {
            $ = new ResourceCollectionTagCollectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appBoundaryKey A Tag key for DevOps Guru app boundary.
         * 
         * @return builder
         * 
         */
        public Builder appBoundaryKey(@Nullable Output<String> appBoundaryKey) {
            $.appBoundaryKey = appBoundaryKey;
            return this;
        }

        /**
         * @param appBoundaryKey A Tag key for DevOps Guru app boundary.
         * 
         * @return builder
         * 
         */
        public Builder appBoundaryKey(String appBoundaryKey) {
            return appBoundaryKey(Output.of(appBoundaryKey));
        }

        /**
         * @param tagValues Tag values of DevOps Guru app boundary.
         * 
         * @return builder
         * 
         */
        public Builder tagValues(@Nullable Output<List<String>> tagValues) {
            $.tagValues = tagValues;
            return this;
        }

        /**
         * @param tagValues Tag values of DevOps Guru app boundary.
         * 
         * @return builder
         * 
         */
        public Builder tagValues(List<String> tagValues) {
            return tagValues(Output.of(tagValues));
        }

        /**
         * @param tagValues Tag values of DevOps Guru app boundary.
         * 
         * @return builder
         * 
         */
        public Builder tagValues(String... tagValues) {
            return tagValues(List.of(tagValues));
        }

        public ResourceCollectionTagCollectionArgs build() {
            return $;
        }
    }

}
