// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RequiredTrafficResponse {
    /**
     * The direction of required traffic
     * 
     */
    private final String direction;
    /**
     * The FQDN list of required traffic
     * 
     */
    private final List<String> fqdns;
    /**
     * The ip list of required traffic
     * 
     */
    private final List<String> ips;
    /**
     * The port of required traffic
     * 
     */
    private final Integer port;
    /**
     * The protocol of required traffic
     * 
     */
    private final String protocol;

    @OutputCustomType.Constructor
    private RequiredTrafficResponse(
        @OutputCustomType.Parameter("direction") String direction,
        @OutputCustomType.Parameter("fqdns") List<String> fqdns,
        @OutputCustomType.Parameter("ips") List<String> ips,
        @OutputCustomType.Parameter("port") Integer port,
        @OutputCustomType.Parameter("protocol") String protocol) {
        this.direction = direction;
        this.fqdns = fqdns;
        this.ips = ips;
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * The direction of required traffic
     * 
    */
    public String getDirection() {
        return this.direction;
    }
    /**
     * The FQDN list of required traffic
     * 
    */
    public List<String> getFqdns() {
        return this.fqdns;
    }
    /**
     * The ip list of required traffic
     * 
    */
    public List<String> getIps() {
        return this.ips;
    }
    /**
     * The port of required traffic
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * The protocol of required traffic
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequiredTrafficResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String direction;
        private List<String> fqdns;
        private List<String> ips;
        private Integer port;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(RequiredTrafficResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.fqdns = defaults.fqdns;
    	      this.ips = defaults.ips;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setFqdns(List<String> fqdns) {
            this.fqdns = Objects.requireNonNull(fqdns);
            return this;
        }

        public Builder setIps(List<String> ips) {
            this.ips = Objects.requireNonNull(ips);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public RequiredTrafficResponse build() {
            return new RequiredTrafficResponse(direction, fqdns, ips, port, protocol);
        }
    }
}
