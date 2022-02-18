// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A representation of a Datastore kind.
 * 
 */
public final class GooglePrivacyDlpV2KindExpressionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2KindExpressionArgs Empty = new GooglePrivacyDlpV2KindExpressionArgs();

    /**
     * The name of the kind.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public GooglePrivacyDlpV2KindExpressionArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private GooglePrivacyDlpV2KindExpressionArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KindExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KindExpressionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public GooglePrivacyDlpV2KindExpressionArgs build() {
            return new GooglePrivacyDlpV2KindExpressionArgs(name);
        }
    }
}
