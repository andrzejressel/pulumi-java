// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1beta.inputs.DevicePolicyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A condition necessary for an `AccessLevel` to be granted. The Condition is an AND over its fields. So a Condition is true if: 1) the request IP is from one of the listed subnetworks AND 2) the originating device complies with the listed device policy AND 3) all listed access levels are granted AND 4) the request was sent at a time allowed by the DateTimeRestriction.
 * 
 */
public final class ConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConditionArgs Empty = new ConditionArgs();

    /**
     * Device specific restrictions, all restrictions must hold for the Condition to be true. If not specified, all devices are allowed.
     * 
     */
    @InputImport(name="devicePolicy")
    private final @Nullable Input<DevicePolicyArgs> devicePolicy;

    public Input<DevicePolicyArgs> getDevicePolicy() {
        return this.devicePolicy == null ? Input.empty() : this.devicePolicy;
    }

    /**
     * CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address block, the specified IP address portion must be properly truncated (i.e. all the host bits must be zero) or the input is considered malformed. For example, "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly, for IPv6, "2001:db8::/32" is accepted whereas "2001:db8::1/32" is not. The originating IP of a request must be in one of the listed subnets in order for this Condition to be true. If empty, all IP addresses are allowed.
     * 
     */
    @InputImport(name="ipSubnetworks")
    private final @Nullable Input<List<String>> ipSubnetworks;

    public Input<List<String>> getIpSubnetworks() {
        return this.ipSubnetworks == null ? Input.empty() : this.ipSubnetworks;
    }

    /**
     * The request must be made by one of the provided user or service accounts. Groups are not supported. Syntax: `user:{emailid}` `serviceAccount:{emailid}` If not specified, a request may come from any user.
     * 
     */
    @InputImport(name="members")
    private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * Whether to negate the Condition. If true, the Condition becomes a NAND over its non-empty fields, each field must be false for the Condition overall to be satisfied. Defaults to false.
     * 
     */
    @InputImport(name="negate")
    private final @Nullable Input<Boolean> negate;

    public Input<Boolean> getNegate() {
        return this.negate == null ? Input.empty() : this.negate;
    }

    /**
     * The request must originate from one of the provided countries/regions. Must be valid ISO 3166-1 alpha-2 codes.
     * 
     */
    @InputImport(name="regions")
    private final @Nullable Input<List<String>> regions;

    public Input<List<String>> getRegions() {
        return this.regions == null ? Input.empty() : this.regions;
    }

    /**
     * A list of other access levels defined in the same `Policy`, referenced by resource name. Referencing an `AccessLevel` which does not exist is an error. All access levels listed must be granted for the Condition to be true. Example: "`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME"`
     * 
     */
    @InputImport(name="requiredAccessLevels")
    private final @Nullable Input<List<String>> requiredAccessLevels;

    public Input<List<String>> getRequiredAccessLevels() {
        return this.requiredAccessLevels == null ? Input.empty() : this.requiredAccessLevels;
    }

    public ConditionArgs(
        @Nullable Input<DevicePolicyArgs> devicePolicy,
        @Nullable Input<List<String>> ipSubnetworks,
        @Nullable Input<List<String>> members,
        @Nullable Input<Boolean> negate,
        @Nullable Input<List<String>> regions,
        @Nullable Input<List<String>> requiredAccessLevels) {
        this.devicePolicy = devicePolicy;
        this.ipSubnetworks = ipSubnetworks;
        this.members = members;
        this.negate = negate;
        this.regions = regions;
        this.requiredAccessLevels = requiredAccessLevels;
    }

    private ConditionArgs() {
        this.devicePolicy = Input.empty();
        this.ipSubnetworks = Input.empty();
        this.members = Input.empty();
        this.negate = Input.empty();
        this.regions = Input.empty();
        this.requiredAccessLevels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DevicePolicyArgs> devicePolicy;
        private @Nullable Input<List<String>> ipSubnetworks;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<Boolean> negate;
        private @Nullable Input<List<String>> regions;
        private @Nullable Input<List<String>> requiredAccessLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devicePolicy = defaults.devicePolicy;
    	      this.ipSubnetworks = defaults.ipSubnetworks;
    	      this.members = defaults.members;
    	      this.negate = defaults.negate;
    	      this.regions = defaults.regions;
    	      this.requiredAccessLevels = defaults.requiredAccessLevels;
        }

        public Builder setDevicePolicy(@Nullable Input<DevicePolicyArgs> devicePolicy) {
            this.devicePolicy = devicePolicy;
            return this;
        }

        public Builder setDevicePolicy(@Nullable DevicePolicyArgs devicePolicy) {
            this.devicePolicy = Input.ofNullable(devicePolicy);
            return this;
        }

        public Builder setIpSubnetworks(@Nullable Input<List<String>> ipSubnetworks) {
            this.ipSubnetworks = ipSubnetworks;
            return this;
        }

        public Builder setIpSubnetworks(@Nullable List<String> ipSubnetworks) {
            this.ipSubnetworks = Input.ofNullable(ipSubnetworks);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
            return this;
        }

        public Builder setNegate(@Nullable Input<Boolean> negate) {
            this.negate = negate;
            return this;
        }

        public Builder setNegate(@Nullable Boolean negate) {
            this.negate = Input.ofNullable(negate);
            return this;
        }

        public Builder setRegions(@Nullable Input<List<String>> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = Input.ofNullable(regions);
            return this;
        }

        public Builder setRequiredAccessLevels(@Nullable Input<List<String>> requiredAccessLevels) {
            this.requiredAccessLevels = requiredAccessLevels;
            return this;
        }

        public Builder setRequiredAccessLevels(@Nullable List<String> requiredAccessLevels) {
            this.requiredAccessLevels = Input.ofNullable(requiredAccessLevels);
            return this;
        }

        public ConditionArgs build() {
            return new ConditionArgs(devicePolicy, ipSubnetworks, members, negate, regions, requiredAccessLevels);
        }
    }
}
