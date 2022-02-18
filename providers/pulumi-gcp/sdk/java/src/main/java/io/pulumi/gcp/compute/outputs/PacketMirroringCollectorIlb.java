// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PacketMirroringCollectorIlb {
    /**
     * The URL of the instances where this rule should be active.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"url"})
    private PacketMirroringCollectorIlb(String url) {
        this.url = Objects.requireNonNull(url);
    }

    /**
     * The URL of the instances where this rule should be active.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringCollectorIlb defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringCollectorIlb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public PacketMirroringCollectorIlb build() {
            return new PacketMirroringCollectorIlb(url);
        }
    }
}
