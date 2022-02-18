// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyRingImportJobAttestationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyRingImportJobAttestationGetArgs Empty = new KeyRingImportJobAttestationGetArgs();

    @InputImport(name="content")
    private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    @InputImport(name="format")
    private final @Nullable Input<String> format;

    public Input<String> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    public KeyRingImportJobAttestationGetArgs(
        @Nullable Input<String> content,
        @Nullable Input<String> format) {
        this.content = content;
        this.format = format;
    }

    private KeyRingImportJobAttestationGetArgs() {
        this.content = Input.empty();
        this.format = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyRingImportJobAttestationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> content;
        private @Nullable Input<String> format;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyRingImportJobAttestationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.format = defaults.format;
        }

        public Builder setContent(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder setFormat(@Nullable Input<String> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public KeyRingImportJobAttestationGetArgs build() {
            return new KeyRingImportJobAttestationGetArgs(content, format);
        }
    }
}
