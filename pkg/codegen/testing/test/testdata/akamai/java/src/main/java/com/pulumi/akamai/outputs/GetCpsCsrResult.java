// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCpsCsrResult {
    private String csrEcdsa;
    private String csrRsa;
    private Integer enrollmentId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetCpsCsrResult() {}
    public String csrEcdsa() {
        return this.csrEcdsa;
    }
    public String csrRsa() {
        return this.csrRsa;
    }
    public Integer enrollmentId() {
        return this.enrollmentId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCpsCsrResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String csrEcdsa;
        private String csrRsa;
        private Integer enrollmentId;
        private String id;
        public Builder() {}
        public Builder(GetCpsCsrResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csrEcdsa = defaults.csrEcdsa;
    	      this.csrRsa = defaults.csrRsa;
    	      this.enrollmentId = defaults.enrollmentId;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder csrEcdsa(String csrEcdsa) {
            this.csrEcdsa = Objects.requireNonNull(csrEcdsa);
            return this;
        }
        @CustomType.Setter
        public Builder csrRsa(String csrRsa) {
            this.csrRsa = Objects.requireNonNull(csrRsa);
            return this;
        }
        @CustomType.Setter
        public Builder enrollmentId(Integer enrollmentId) {
            this.enrollmentId = Objects.requireNonNull(enrollmentId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetCpsCsrResult build() {
            final var _resultValue = new GetCpsCsrResult();
            _resultValue.csrEcdsa = csrEcdsa;
            _resultValue.csrRsa = csrRsa;
            _resultValue.enrollmentId = enrollmentId;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
