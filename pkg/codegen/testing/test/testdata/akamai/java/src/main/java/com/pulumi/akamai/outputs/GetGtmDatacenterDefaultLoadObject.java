// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGtmDatacenterDefaultLoadObject {
    private String loadObject;
    private Integer loadObjectPort;
    private List<String> loadServers;

    private GetGtmDatacenterDefaultLoadObject() {}
    public String loadObject() {
        return this.loadObject;
    }
    public Integer loadObjectPort() {
        return this.loadObjectPort;
    }
    public List<String> loadServers() {
        return this.loadServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGtmDatacenterDefaultLoadObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String loadObject;
        private Integer loadObjectPort;
        private List<String> loadServers;
        public Builder() {}
        public Builder(GetGtmDatacenterDefaultLoadObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadObject = defaults.loadObject;
    	      this.loadObjectPort = defaults.loadObjectPort;
    	      this.loadServers = defaults.loadServers;
        }

        @CustomType.Setter
        public Builder loadObject(String loadObject) {
            this.loadObject = Objects.requireNonNull(loadObject);
            return this;
        }
        @CustomType.Setter
        public Builder loadObjectPort(Integer loadObjectPort) {
            this.loadObjectPort = Objects.requireNonNull(loadObjectPort);
            return this;
        }
        @CustomType.Setter
        public Builder loadServers(List<String> loadServers) {
            this.loadServers = Objects.requireNonNull(loadServers);
            return this;
        }
        public Builder loadServers(String... loadServers) {
            return loadServers(List.of(loadServers));
        }
        public GetGtmDatacenterDefaultLoadObject build() {
            final var _resultValue = new GetGtmDatacenterDefaultLoadObject();
            _resultValue.loadObject = loadObject;
            _resultValue.loadObjectPort = loadObjectPort;
            _resultValue.loadServers = loadServers;
            return _resultValue;
        }
    }
}
