// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SlsaBuilder encapsulates the identity of the builder of this provenance.
 * 
 */
public final class SlsaBuilderArgs extends io.pulumi.resources.ResourceArgs {

    public static final SlsaBuilderArgs Empty = new SlsaBuilderArgs();

    /**
     * id is the id of the slsa provenance builder
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    public SlsaBuilderArgs(@Nullable Input<String> id) {
        this.id = id;
    }

    private SlsaBuilderArgs() {
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlsaBuilderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(SlsaBuilderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public SlsaBuilderArgs build() {
            return new SlsaBuilderArgs(id);
        }
    }
}
