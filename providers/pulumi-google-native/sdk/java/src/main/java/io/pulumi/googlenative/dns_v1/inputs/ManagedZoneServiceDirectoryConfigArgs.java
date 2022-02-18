// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dns_v1.inputs.ManagedZoneServiceDirectoryConfigNamespaceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information about Service Directory-backed zones.
 * 
 */
public final class ManagedZoneServiceDirectoryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneServiceDirectoryConfigArgs Empty = new ManagedZoneServiceDirectoryConfigArgs();

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Contains information about the namespace associated with the zone.
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable Input<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace;

    public Input<ManagedZoneServiceDirectoryConfigNamespaceArgs> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    public ManagedZoneServiceDirectoryConfigArgs(
        @Nullable Input<String> kind,
        @Nullable Input<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace) {
        this.kind = kind;
        this.namespace = namespace;
    }

    private ManagedZoneServiceDirectoryConfigArgs() {
        this.kind = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneServiceDirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;
        private @Nullable Input<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneServiceDirectoryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.namespace = defaults.namespace;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setNamespace(@Nullable Input<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable ManagedZoneServiceDirectoryConfigNamespaceArgs namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public ManagedZoneServiceDirectoryConfigArgs build() {
            return new ManagedZoneServiceDirectoryConfigArgs(kind, namespace);
        }
    }
}
