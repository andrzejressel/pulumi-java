// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * POSIX Group definition to represent a group in a POSIX compliant system.
 * 
 */
public final class PosixGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final PosixGroupArgs Empty = new PosixGroupArgs();

    /**
     * GID of the POSIX group.
     * 
     */
    @InputImport(name="gid")
    private final @Nullable Input<String> gid;

    public Input<String> getGid() {
        return this.gid == null ? Input.empty() : this.gid;
    }

    /**
     * Name of the POSIX group.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * System identifier for which group name and gid apply to. If not specified it will default to empty value.
     * 
     */
    @InputImport(name="systemId")
    private final @Nullable Input<String> systemId;

    public Input<String> getSystemId() {
        return this.systemId == null ? Input.empty() : this.systemId;
    }

    public PosixGroupArgs(
        @Nullable Input<String> gid,
        @Nullable Input<String> name,
        @Nullable Input<String> systemId) {
        this.gid = gid;
        this.name = name;
        this.systemId = systemId;
    }

    private PosixGroupArgs() {
        this.gid = Input.empty();
        this.name = Input.empty();
        this.systemId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PosixGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> gid;
        private @Nullable Input<String> name;
        private @Nullable Input<String> systemId;

        public Builder() {
    	      // Empty
        }

        public Builder(PosixGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gid = defaults.gid;
    	      this.name = defaults.name;
    	      this.systemId = defaults.systemId;
        }

        public Builder setGid(@Nullable Input<String> gid) {
            this.gid = gid;
            return this;
        }

        public Builder setGid(@Nullable String gid) {
            this.gid = Input.ofNullable(gid);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSystemId(@Nullable Input<String> systemId) {
            this.systemId = systemId;
            return this;
        }

        public Builder setSystemId(@Nullable String systemId) {
            this.systemId = Input.ofNullable(systemId);
            return this;
        }

        public PosixGroupArgs build() {
            return new PosixGroupArgs(gid, name, systemId);
        }
    }
}
