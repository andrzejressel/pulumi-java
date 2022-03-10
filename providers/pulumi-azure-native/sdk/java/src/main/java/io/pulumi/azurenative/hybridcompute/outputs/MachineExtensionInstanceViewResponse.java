// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.outputs;

import io.pulumi.azurenative.hybridcompute.outputs.MachineExtensionInstanceViewResponseStatus;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MachineExtensionInstanceViewResponse {
    /**
     * The machine extension name.
     * 
     */
    private final String name;
    /**
     * Instance view status.
     * 
     */
    private final @Nullable MachineExtensionInstanceViewResponseStatus status;
    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     */
    private final String type;
    /**
     * Specifies the version of the script handler.
     * 
     */
    private final String typeHandlerVersion;

    @OutputCustomType.Constructor
    private MachineExtensionInstanceViewResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("status") @Nullable MachineExtensionInstanceViewResponseStatus status,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("typeHandlerVersion") String typeHandlerVersion) {
        this.name = name;
        this.status = status;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * The machine extension name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Instance view status.
     * 
    */
    public Optional<MachineExtensionInstanceViewResponseStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Specifies the version of the script handler.
     * 
    */
    public String getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineExtensionInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable MachineExtensionInstanceViewResponseStatus status;
        private String type;
        private String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineExtensionInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(@Nullable MachineExtensionInstanceViewResponseStatus status) {
            this.status = status;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setTypeHandlerVersion(String typeHandlerVersion) {
            this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion);
            return this;
        }
        public MachineExtensionInstanceViewResponse build() {
            return new MachineExtensionInstanceViewResponse(name, status, type, typeHandlerVersion);
        }
    }
}
