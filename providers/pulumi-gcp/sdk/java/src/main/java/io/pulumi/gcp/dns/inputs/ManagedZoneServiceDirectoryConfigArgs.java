// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigNamespaceArgs;
import java.util.Objects;


public final class ManagedZoneServiceDirectoryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneServiceDirectoryConfigArgs Empty = new ManagedZoneServiceDirectoryConfigArgs();

    /**
     * The namespace associated with the zone.
     * Structure is documented below.
     * 
     */
    @InputImport(name="namespace", required=true)
    private final Input<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace;

    public Input<ManagedZoneServiceDirectoryConfigNamespaceArgs> getNamespace() {
        return this.namespace;
    }

    public ManagedZoneServiceDirectoryConfigArgs(Input<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace) {
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private ManagedZoneServiceDirectoryConfigArgs() {
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneServiceDirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneServiceDirectoryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder setNamespace(Input<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setNamespace(ManagedZoneServiceDirectoryConfigNamespaceArgs namespace) {
            this.namespace = Input.of(Objects.requireNonNull(namespace));
            return this;
        }

        public ManagedZoneServiceDirectoryConfigArgs build() {
            return new ManagedZoneServiceDirectoryConfigArgs(namespace);
        }
    }
}
