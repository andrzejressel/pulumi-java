// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExtensionStatusResponse {
    /**
     * Status code provided by the Extension
     * 
     */
    private final @Nullable String code;
    /**
     * Short description of status of this instance of the extension.
     * 
     */
    private final @Nullable String displayStatus;
    /**
     * Level of the status.
     * 
     */
    private final @Nullable String level;
    /**
     * Detailed message of the status from the Extension instance.
     * 
     */
    private final @Nullable String message;
    /**
     * DateLiteral (per ISO8601) noting the time of installation status.
     * 
     */
    private final @Nullable String time;

    @OutputCustomType.Constructor
    private ExtensionStatusResponse(
        @OutputCustomType.Parameter("code") @Nullable String code,
        @OutputCustomType.Parameter("displayStatus") @Nullable String displayStatus,
        @OutputCustomType.Parameter("level") @Nullable String level,
        @OutputCustomType.Parameter("message") @Nullable String message,
        @OutputCustomType.Parameter("time") @Nullable String time) {
        this.code = code;
        this.displayStatus = displayStatus;
        this.level = level;
        this.message = message;
        this.time = time;
    }

    /**
     * Status code provided by the Extension
     * 
    */
    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    /**
     * Short description of status of this instance of the extension.
     * 
    */
    public Optional<String> getDisplayStatus() {
        return Optional.ofNullable(this.displayStatus);
    }
    /**
     * Level of the status.
     * 
    */
    public Optional<String> getLevel() {
        return Optional.ofNullable(this.level);
    }
    /**
     * Detailed message of the status from the Extension instance.
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * DateLiteral (per ISO8601) noting the time of installation status.
     * 
    */
    public Optional<String> getTime() {
        return Optional.ofNullable(this.time);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String displayStatus;
        private @Nullable String level;
        private @Nullable String message;
        private @Nullable String time;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.displayStatus = defaults.displayStatus;
    	      this.level = defaults.level;
    	      this.message = defaults.message;
    	      this.time = defaults.time;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setDisplayStatus(@Nullable String displayStatus) {
            this.displayStatus = displayStatus;
            return this;
        }

        public Builder setLevel(@Nullable String level) {
            this.level = level;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setTime(@Nullable String time) {
            this.time = time;
            return this;
        }
        public ExtensionStatusResponse build() {
            return new ExtensionStatusResponse(code, displayStatus, level, message, time);
        }
    }
}
