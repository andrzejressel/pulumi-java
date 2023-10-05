// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorEcmsDatabase {
    private @Nullable String database;
    private @Nullable String extractLocation;
    private @Nullable String headerName;
    private @Nullable Boolean locked;
    private @Nullable String queryParameterName;
    private @Nullable String regexPattern;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorEcmsDatabase() {}
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }
    public Optional<String> extractLocation() {
        return Optional.ofNullable(this.extractLocation);
    }
    public Optional<String> headerName() {
        return Optional.ofNullable(this.headerName);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> queryParameterName() {
        return Optional.ofNullable(this.queryParameterName);
    }
    public Optional<String> regexPattern() {
        return Optional.ofNullable(this.regexPattern);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorEcmsDatabase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String database;
        private @Nullable String extractLocation;
        private @Nullable String headerName;
        private @Nullable Boolean locked;
        private @Nullable String queryParameterName;
        private @Nullable String regexPattern;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorEcmsDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.extractLocation = defaults.extractLocation;
    	      this.headerName = defaults.headerName;
    	      this.locked = defaults.locked;
    	      this.queryParameterName = defaults.queryParameterName;
    	      this.regexPattern = defaults.regexPattern;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder database(@Nullable String database) {
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder extractLocation(@Nullable String extractLocation) {
            this.extractLocation = extractLocation;
            return this;
        }
        @CustomType.Setter
        public Builder headerName(@Nullable String headerName) {
            this.headerName = headerName;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder queryParameterName(@Nullable String queryParameterName) {
            this.queryParameterName = queryParameterName;
            return this;
        }
        @CustomType.Setter
        public Builder regexPattern(@Nullable String regexPattern) {
            this.regexPattern = regexPattern;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorEcmsDatabase build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorEcmsDatabase();
            _resultValue.database = database;
            _resultValue.extractLocation = extractLocation;
            _resultValue.headerName = headerName;
            _resultValue.locked = locked;
            _resultValue.queryParameterName = queryParameterName;
            _resultValue.regexPattern = regexPattern;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
