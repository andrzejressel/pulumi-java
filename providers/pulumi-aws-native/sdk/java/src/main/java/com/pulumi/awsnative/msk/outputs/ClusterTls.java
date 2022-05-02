// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.msk.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTls {
    private final @Nullable List<String> certificateAuthorityArnList;
    private final @Nullable Boolean enabled;

    @CustomType.Constructor
    private ClusterTls(
        @CustomType.Parameter("certificateAuthorityArnList") @Nullable List<String> certificateAuthorityArnList,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled) {
        this.certificateAuthorityArnList = certificateAuthorityArnList;
        this.enabled = enabled;
    }

    public List<String> certificateAuthorityArnList() {
        return this.certificateAuthorityArnList == null ? List.of() : this.certificateAuthorityArnList;
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> certificateAuthorityArnList;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterTls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityArnList = defaults.certificateAuthorityArnList;
    	      this.enabled = defaults.enabled;
        }

        public Builder certificateAuthorityArnList(@Nullable List<String> certificateAuthorityArnList) {
            this.certificateAuthorityArnList = certificateAuthorityArnList;
            return this;
        }
        public Builder certificateAuthorityArnList(String... certificateAuthorityArnList) {
            return certificateAuthorityArnList(List.of(certificateAuthorityArnList));
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }        public ClusterTls build() {
            return new ClusterTls(certificateAuthorityArnList, enabled);
        }
    }
}
