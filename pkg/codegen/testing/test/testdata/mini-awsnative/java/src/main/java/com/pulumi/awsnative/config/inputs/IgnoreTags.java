// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.config.inputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class IgnoreTags {
    /**
     * @return List of exact resource tag keys to ignore across all resources handled by this provider. This configuration prevents Pulumi from returning the tag in any `tags` attributes and displaying any configuration difference for the tag value. If any resource configuration still has this tag key configured in the `tags` argument, it will display a perpetual difference until the tag is removed from the argument or `ignoreChanges` is also used.
     * 
     */
    private @Nullable List<String> keyPrefixes;
    /**
     * @return List of resource tag key prefixes to ignore across all resources handled by this provider. This configuration prevents Pulumi from returning any tag key matching the prefixes in any `tags` attributes and displaying any configuration difference for those tag values. If any resource configuration still has a tag matching one of the prefixes configured in the `tags` argument, it will display a perpetual difference until the tag is removed from the argument or `ignoreChanges` is also used.
     * 
     */
    private @Nullable List<String> keys;

    private IgnoreTags() {}
    /**
     * @return List of exact resource tag keys to ignore across all resources handled by this provider. This configuration prevents Pulumi from returning the tag in any `tags` attributes and displaying any configuration difference for the tag value. If any resource configuration still has this tag key configured in the `tags` argument, it will display a perpetual difference until the tag is removed from the argument or `ignoreChanges` is also used.
     * 
     */
    public List<String> keyPrefixes() {
        return this.keyPrefixes == null ? List.of() : this.keyPrefixes;
    }
    /**
     * @return List of resource tag key prefixes to ignore across all resources handled by this provider. This configuration prevents Pulumi from returning any tag key matching the prefixes in any `tags` attributes and displaying any configuration difference for those tag values. If any resource configuration still has a tag matching one of the prefixes configured in the `tags` argument, it will display a perpetual difference until the tag is removed from the argument or `ignoreChanges` is also used.
     * 
     */
    public List<String> keys() {
        return this.keys == null ? List.of() : this.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IgnoreTags defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> keyPrefixes;
        private @Nullable List<String> keys;
        public Builder() {}
        public Builder(IgnoreTags defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyPrefixes = defaults.keyPrefixes;
    	      this.keys = defaults.keys;
        }

        @CustomType.Setter
        public Builder keyPrefixes(@Nullable List<String> keyPrefixes) {
            this.keyPrefixes = keyPrefixes;
            return this;
        }
        public Builder keyPrefixes(String... keyPrefixes) {
            return keyPrefixes(List.of(keyPrefixes));
        }
        @CustomType.Setter
        public Builder keys(@Nullable List<String> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }
        public IgnoreTags build() {
            final var _resultValue = new IgnoreTags();
            _resultValue.keyPrefixes = keyPrefixes;
            _resultValue.keys = keys;
            return _resultValue;
        }
    }
}
