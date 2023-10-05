// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.x_iam.outputs;

import com.pulumi.aws.x.outputs.GetPolicyDocumentStatement;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyDocumentResult {
    private String id;
    private String json;
    private @Nullable List<GetPolicyDocumentStatement> statements;

    private GetPolicyDocumentResult() {}
    public String id() {
        return this.id;
    }
    public String json() {
        return this.json;
    }
    public List<GetPolicyDocumentStatement> statements() {
        return this.statements == null ? List.of() : this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDocumentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String json;
        private @Nullable List<GetPolicyDocumentStatement> statements;
        public Builder() {}
        public Builder(GetPolicyDocumentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.json = defaults.json;
    	      this.statements = defaults.statements;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            this.json = Objects.requireNonNull(json);
            return this;
        }
        @CustomType.Setter
        public Builder statements(@Nullable List<GetPolicyDocumentStatement> statements) {
            this.statements = statements;
            return this;
        }
        public Builder statements(GetPolicyDocumentStatement... statements) {
            return statements(List.of(statements));
        }
        public GetPolicyDocumentResult build() {
            final var _resultValue = new GetPolicyDocumentResult();
            _resultValue.id = id;
            _resultValue.json = json;
            _resultValue.statements = statements;
            return _resultValue;
        }
    }
}
