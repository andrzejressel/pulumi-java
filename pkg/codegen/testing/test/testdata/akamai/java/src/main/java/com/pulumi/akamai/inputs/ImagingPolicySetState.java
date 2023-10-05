// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImagingPolicySetState extends com.pulumi.resources.ResourceArgs {

    public static final ImagingPolicySetState Empty = new ImagingPolicySetState();

    /**
     * The unique identifier for the Akamai Contract containing the Policy Set(s)
     * 
     */
    @Import(name="contractId")
    private @Nullable Output<String> contractId;

    /**
     * @return The unique identifier for the Akamai Contract containing the Policy Set(s)
     * 
     */
    public Optional<Output<String>> contractId() {
        return Optional.ofNullable(this.contractId);
    }

    /**
     * A friendly name for the Policy Set
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A friendly name for the Policy Set
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The geographic region which media using this Policy Set is optimized for
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The geographic region which media using this Policy Set is optimized for
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The type of media this Policy Set manages
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of media this Policy Set manages
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ImagingPolicySetState() {}

    private ImagingPolicySetState(ImagingPolicySetState $) {
        this.contractId = $.contractId;
        this.name = $.name;
        this.region = $.region;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImagingPolicySetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImagingPolicySetState $;

        public Builder() {
            $ = new ImagingPolicySetState();
        }

        public Builder(ImagingPolicySetState defaults) {
            $ = new ImagingPolicySetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param contractId The unique identifier for the Akamai Contract containing the Policy Set(s)
         * 
         * @return builder
         * 
         */
        public Builder contractId(@Nullable Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        /**
         * @param contractId The unique identifier for the Akamai Contract containing the Policy Set(s)
         * 
         * @return builder
         * 
         */
        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        /**
         * @param name A friendly name for the Policy Set
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A friendly name for the Policy Set
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region The geographic region which media using this Policy Set is optimized for
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The geographic region which media using this Policy Set is optimized for
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param type The type of media this Policy Set manages
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of media this Policy Set manages
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ImagingPolicySetState build() {
            return $;
        }
    }

}
