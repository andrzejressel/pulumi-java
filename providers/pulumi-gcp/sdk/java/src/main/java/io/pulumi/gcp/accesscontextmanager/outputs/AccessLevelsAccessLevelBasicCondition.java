// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevelBasicConditionDevicePolicy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessLevelsAccessLevelBasicCondition {
    /**
     * Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * 
     */
    private final @Nullable AccessLevelsAccessLevelBasicConditionDevicePolicy devicePolicy;
    /**
     * A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly,
     * for IPv6, "2001:db8::/32" is accepted whereas "2001:db8::1/32"
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     * 
     */
    private final @Nullable List<String> ipSubnetworks;
    /**
     * An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     * 
     */
    private final @Nullable List<String> members;
    /**
     * Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     * 
     */
    private final @Nullable Boolean negate;
    /**
     * The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     * 
     */
    private final @Nullable List<String> regions;
    /**
     * A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    private final @Nullable List<String> requiredAccessLevels;

    @OutputCustomType.Constructor({"devicePolicy","ipSubnetworks","members","negate","regions","requiredAccessLevels"})
    private AccessLevelsAccessLevelBasicCondition(
        @Nullable AccessLevelsAccessLevelBasicConditionDevicePolicy devicePolicy,
        @Nullable List<String> ipSubnetworks,
        @Nullable List<String> members,
        @Nullable Boolean negate,
        @Nullable List<String> regions,
        @Nullable List<String> requiredAccessLevels) {
        this.devicePolicy = devicePolicy;
        this.ipSubnetworks = ipSubnetworks;
        this.members = members;
        this.negate = negate;
        this.regions = regions;
        this.requiredAccessLevels = requiredAccessLevels;
    }

    /**
     * Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * 
     */
    public Optional<AccessLevelsAccessLevelBasicConditionDevicePolicy> getDevicePolicy() {
        return Optional.ofNullable(this.devicePolicy);
    }
    /**
     * A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly,
     * for IPv6, "2001:db8::/32" is accepted whereas "2001:db8::1/32"
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     * 
     */
    public List<String> getIpSubnetworks() {
        return this.ipSubnetworks == null ? List.of() : this.ipSubnetworks;
    }
    /**
     * An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     * 
     */
    public List<String> getMembers() {
        return this.members == null ? List.of() : this.members;
    }
    /**
     * Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     * 
     */
    public Optional<Boolean> getNegate() {
        return Optional.ofNullable(this.negate);
    }
    /**
     * The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     * 
     */
    public List<String> getRegions() {
        return this.regions == null ? List.of() : this.regions;
    }
    /**
     * A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    public List<String> getRequiredAccessLevels() {
        return this.requiredAccessLevels == null ? List.of() : this.requiredAccessLevels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsAccessLevelBasicCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccessLevelsAccessLevelBasicConditionDevicePolicy devicePolicy;
        private @Nullable List<String> ipSubnetworks;
        private @Nullable List<String> members;
        private @Nullable Boolean negate;
        private @Nullable List<String> regions;
        private @Nullable List<String> requiredAccessLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsAccessLevelBasicCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devicePolicy = defaults.devicePolicy;
    	      this.ipSubnetworks = defaults.ipSubnetworks;
    	      this.members = defaults.members;
    	      this.negate = defaults.negate;
    	      this.regions = defaults.regions;
    	      this.requiredAccessLevels = defaults.requiredAccessLevels;
        }

        public Builder setDevicePolicy(@Nullable AccessLevelsAccessLevelBasicConditionDevicePolicy devicePolicy) {
            this.devicePolicy = devicePolicy;
            return this;
        }

        public Builder setIpSubnetworks(@Nullable List<String> ipSubnetworks) {
            this.ipSubnetworks = ipSubnetworks;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = members;
            return this;
        }

        public Builder setNegate(@Nullable Boolean negate) {
            this.negate = negate;
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setRequiredAccessLevels(@Nullable List<String> requiredAccessLevels) {
            this.requiredAccessLevels = requiredAccessLevels;
            return this;
        }

        public AccessLevelsAccessLevelBasicCondition build() {
            return new AccessLevelsAccessLevelBasicCondition(devicePolicy, ipSubnetworks, members, negate, regions, requiredAccessLevels);
        }
    }
}
