// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBotmanAkamaiBotCategoryResult {
    private @Nullable String categoryName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String json;

    private GetBotmanAkamaiBotCategoryResult() {}
    public Optional<String> categoryName() {
        return Optional.ofNullable(this.categoryName);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String json() {
        return this.json;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotmanAkamaiBotCategoryResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String categoryName;
        private String id;
        private String json;
        public Builder() {}
        public Builder(GetBotmanAkamaiBotCategoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoryName = defaults.categoryName;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
        }

        @CustomType.Setter
        public Builder categoryName(@Nullable String categoryName) {
            this.categoryName = categoryName;
            return this;
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
        public GetBotmanAkamaiBotCategoryResult build() {
            final var _resultValue = new GetBotmanAkamaiBotCategoryResult();
            _resultValue.categoryName = categoryName;
            _resultValue.id = id;
            _resultValue.json = json;
            return _resultValue;
        }
    }
}
