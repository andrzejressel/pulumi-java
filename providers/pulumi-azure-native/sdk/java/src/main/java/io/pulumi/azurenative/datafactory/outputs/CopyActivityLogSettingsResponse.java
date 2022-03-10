// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CopyActivityLogSettingsResponse {
    /**
     * Specifies whether to enable reliable logging. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object enableReliableLogging;
    /**
     * Gets or sets the log level, support: Info, Warning. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object logLevel;

    @OutputCustomType.Constructor
    private CopyActivityLogSettingsResponse(
        @OutputCustomType.Parameter("enableReliableLogging") @Nullable Object enableReliableLogging,
        @OutputCustomType.Parameter("logLevel") @Nullable Object logLevel) {
        this.enableReliableLogging = enableReliableLogging;
        this.logLevel = logLevel;
    }

    /**
     * Specifies whether to enable reliable logging. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getEnableReliableLogging() {
        return Optional.ofNullable(this.enableReliableLogging);
    }
    /**
     * Gets or sets the log level, support: Info, Warning. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getLogLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyActivityLogSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object enableReliableLogging;
        private @Nullable Object logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyActivityLogSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableReliableLogging = defaults.enableReliableLogging;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder setEnableReliableLogging(@Nullable Object enableReliableLogging) {
            this.enableReliableLogging = enableReliableLogging;
            return this;
        }

        public Builder setLogLevel(@Nullable Object logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public CopyActivityLogSettingsResponse build() {
            return new CopyActivityLogSettingsResponse(enableReliableLogging, logLevel);
        }
    }
}
