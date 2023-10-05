// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSecSelectableHostnamesResult {
    private @Nullable Boolean activeInProduction;
    private @Nullable Boolean activeInStaging;
    private @Nullable Integer configId;
    private @Nullable String contractid;
    private @Nullable Integer groupid;
    private List<String> hostnames;
    private String hostnamesJson;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String outputText;

    private GetAppSecSelectableHostnamesResult() {}
    public Optional<Boolean> activeInProduction() {
        return Optional.ofNullable(this.activeInProduction);
    }
    public Optional<Boolean> activeInStaging() {
        return Optional.ofNullable(this.activeInStaging);
    }
    public Optional<Integer> configId() {
        return Optional.ofNullable(this.configId);
    }
    public Optional<String> contractid() {
        return Optional.ofNullable(this.contractid);
    }
    public Optional<Integer> groupid() {
        return Optional.ofNullable(this.groupid);
    }
    public List<String> hostnames() {
        return this.hostnames;
    }
    public String hostnamesJson() {
        return this.hostnamesJson;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String outputText() {
        return this.outputText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSecSelectableHostnamesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean activeInProduction;
        private @Nullable Boolean activeInStaging;
        private @Nullable Integer configId;
        private @Nullable String contractid;
        private @Nullable Integer groupid;
        private List<String> hostnames;
        private String hostnamesJson;
        private String id;
        private String outputText;
        public Builder() {}
        public Builder(GetAppSecSelectableHostnamesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeInProduction = defaults.activeInProduction;
    	      this.activeInStaging = defaults.activeInStaging;
    	      this.configId = defaults.configId;
    	      this.contractid = defaults.contractid;
    	      this.groupid = defaults.groupid;
    	      this.hostnames = defaults.hostnames;
    	      this.hostnamesJson = defaults.hostnamesJson;
    	      this.id = defaults.id;
    	      this.outputText = defaults.outputText;
        }

        @CustomType.Setter
        public Builder activeInProduction(@Nullable Boolean activeInProduction) {
            this.activeInProduction = activeInProduction;
            return this;
        }
        @CustomType.Setter
        public Builder activeInStaging(@Nullable Boolean activeInStaging) {
            this.activeInStaging = activeInStaging;
            return this;
        }
        @CustomType.Setter
        public Builder configId(@Nullable Integer configId) {
            this.configId = configId;
            return this;
        }
        @CustomType.Setter
        public Builder contractid(@Nullable String contractid) {
            this.contractid = contractid;
            return this;
        }
        @CustomType.Setter
        public Builder groupid(@Nullable Integer groupid) {
            this.groupid = groupid;
            return this;
        }
        @CustomType.Setter
        public Builder hostnames(List<String> hostnames) {
            this.hostnames = Objects.requireNonNull(hostnames);
            return this;
        }
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }
        @CustomType.Setter
        public Builder hostnamesJson(String hostnamesJson) {
            this.hostnamesJson = Objects.requireNonNull(hostnamesJson);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder outputText(String outputText) {
            this.outputText = Objects.requireNonNull(outputText);
            return this;
        }
        public GetAppSecSelectableHostnamesResult build() {
            final var _resultValue = new GetAppSecSelectableHostnamesResult();
            _resultValue.activeInProduction = activeInProduction;
            _resultValue.activeInStaging = activeInStaging;
            _resultValue.configId = configId;
            _resultValue.contractid = contractid;
            _resultValue.groupid = groupid;
            _resultValue.hostnames = hostnames;
            _resultValue.hostnamesJson = hostnamesJson;
            _resultValue.id = id;
            _resultValue.outputText = outputText;
            return _resultValue;
        }
    }
}
