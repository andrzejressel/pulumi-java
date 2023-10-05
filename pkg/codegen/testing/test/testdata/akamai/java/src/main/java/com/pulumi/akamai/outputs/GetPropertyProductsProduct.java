// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPropertyProductsProduct {
    private String productId;
    private String productName;

    private GetPropertyProductsProduct() {}
    public String productId() {
        return this.productId;
    }
    public String productName() {
        return this.productName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyProductsProduct defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String productId;
        private String productName;
        public Builder() {}
        public Builder(GetPropertyProductsProduct defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.productId = defaults.productId;
    	      this.productName = defaults.productName;
        }

        @CustomType.Setter
        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }
        @CustomType.Setter
        public Builder productName(String productName) {
            this.productName = Objects.requireNonNull(productName);
            return this;
        }
        public GetPropertyProductsProduct build() {
            final var _resultValue = new GetPropertyProductsProduct();
            _resultValue.productId = productId;
            _resultValue.productName = productName;
            return _resultValue;
        }
    }
}
