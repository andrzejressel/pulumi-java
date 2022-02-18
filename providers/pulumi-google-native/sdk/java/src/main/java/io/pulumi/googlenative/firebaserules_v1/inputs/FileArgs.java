// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaserules_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * `File` containing source content.
 * 
 */
public final class FileArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileArgs Empty = new FileArgs();

    /**
     * Textual Content.
     * 
     */
    @InputImport(name="content", required=true)
    private final Input<String> content;

    public Input<String> getContent() {
        return this.content;
    }

    /**
     * Fingerprint (e.g. github sha) associated with the `File`.
     * 
     */
    @InputImport(name="fingerprint")
    private final @Nullable Input<String> fingerprint;

    public Input<String> getFingerprint() {
        return this.fingerprint == null ? Input.empty() : this.fingerprint;
    }

    /**
     * File name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public FileArgs(
        Input<String> content,
        @Nullable Input<String> fingerprint,
        Input<String> name) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.fingerprint = fingerprint;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private FileArgs() {
        this.content = Input.empty();
        this.fingerprint = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> content;
        private @Nullable Input<String> fingerprint;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(FileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.fingerprint = defaults.fingerprint;
    	      this.name = defaults.name;
        }

        public Builder setContent(Input<String> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContent(String content) {
            this.content = Input.of(Objects.requireNonNull(content));
            return this;
        }

        public Builder setFingerprint(@Nullable Input<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public Builder setFingerprint(@Nullable String fingerprint) {
            this.fingerprint = Input.ofNullable(fingerprint);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public FileArgs build() {
            return new FileArgs(content, fingerprint, name);
        }
    }
}
