// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetUptimeCheckIPsUptimeCheckIp extends io.pulumi.resources.InvokeArgs {

    public static final GetUptimeCheckIPsUptimeCheckIp Empty = new GetUptimeCheckIPsUptimeCheckIp();

    /**
     * The IP address from which the Uptime check originates. This is a fully specified IP address
     * (not an IP address range). Most IP addresses, as of this publication, are in IPv4 format; however, one should not
     * rely on the IP addresses being in IPv4 format indefinitely, and should support interpreting this field in either
     * IPv4 or IPv6 format.
     * 
     */
    @InputImport(name="ipAddress", required=true)
    private final String ipAddress;

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * A more specific location within the region that typically encodes a particular city/town/metro
     * (and its containing state/province or country) within the broader umbrella region category.
     * 
     */
    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * A broad region category in which the IP address is located.
     * 
     */
    @InputImport(name="region", required=true)
    private final String region;

    public String getRegion() {
        return this.region;
    }

    public GetUptimeCheckIPsUptimeCheckIp(
        String ipAddress,
        String location,
        String region) {
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetUptimeCheckIPsUptimeCheckIp() {
        this.ipAddress = null;
        this.location = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUptimeCheckIPsUptimeCheckIp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private String location;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUptimeCheckIPsUptimeCheckIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.location = defaults.location;
    	      this.region = defaults.region;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public GetUptimeCheckIPsUptimeCheckIp build() {
            return new GetUptimeCheckIPsUptimeCheckIp(ipAddress, location, region);
        }
    }
}
