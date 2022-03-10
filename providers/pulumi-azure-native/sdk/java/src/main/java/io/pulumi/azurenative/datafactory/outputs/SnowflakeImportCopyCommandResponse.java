// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class SnowflakeImportCopyCommandResponse {
    /**
     * Additional copy options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalCopyOptions": { "DATE_FORMAT": "MM/DD/YYYY", "TIME_FORMAT": "'HH24:MI:SS.FF'" }
     * 
     */
    private final @Nullable Map<String,Object> additionalCopyOptions;
    /**
     * Additional format options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalFormatOptions": { "FORCE": "TRUE", "LOAD_UNCERTAIN_FILES": "'FALSE'" }
     * 
     */
    private final @Nullable Map<String,Object> additionalFormatOptions;
    /**
     * The import setting type.
     * Expected value is 'SnowflakeImportCopyCommand'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private SnowflakeImportCopyCommandResponse(
        @OutputCustomType.Parameter("additionalCopyOptions") @Nullable Map<String,Object> additionalCopyOptions,
        @OutputCustomType.Parameter("additionalFormatOptions") @Nullable Map<String,Object> additionalFormatOptions,
        @OutputCustomType.Parameter("type") String type) {
        this.additionalCopyOptions = additionalCopyOptions;
        this.additionalFormatOptions = additionalFormatOptions;
        this.type = type;
    }

    /**
     * Additional copy options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalCopyOptions": { "DATE_FORMAT": "MM/DD/YYYY", "TIME_FORMAT": "'HH24:MI:SS.FF'" }
     * 
    */
    public Map<String,Object> getAdditionalCopyOptions() {
        return this.additionalCopyOptions == null ? Map.of() : this.additionalCopyOptions;
    }
    /**
     * Additional format options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalFormatOptions": { "FORCE": "TRUE", "LOAD_UNCERTAIN_FILES": "'FALSE'" }
     * 
    */
    public Map<String,Object> getAdditionalFormatOptions() {
        return this.additionalFormatOptions == null ? Map.of() : this.additionalFormatOptions;
    }
    /**
     * The import setting type.
     * Expected value is 'SnowflakeImportCopyCommand'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnowflakeImportCopyCommandResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> additionalCopyOptions;
        private @Nullable Map<String,Object> additionalFormatOptions;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SnowflakeImportCopyCommandResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCopyOptions = defaults.additionalCopyOptions;
    	      this.additionalFormatOptions = defaults.additionalFormatOptions;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalCopyOptions(@Nullable Map<String,Object> additionalCopyOptions) {
            this.additionalCopyOptions = additionalCopyOptions;
            return this;
        }

        public Builder setAdditionalFormatOptions(@Nullable Map<String,Object> additionalFormatOptions) {
            this.additionalFormatOptions = additionalFormatOptions;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SnowflakeImportCopyCommandResponse build() {
            return new SnowflakeImportCopyCommandResponse(additionalCopyOptions, additionalFormatOptions, type);
        }
    }
}
