// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyActivationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyActivationPlainArgs Empty = new GetPropertyActivationPlainArgs();

    @Import(name="network")
    private @Nullable String network;

    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }

    @Import(name="propertyId", required=true)
    private String propertyId;

    public String propertyId() {
        return this.propertyId;
    }

    @Import(name="version", required=true)
    private Integer version;

    public Integer version() {
        return this.version;
    }

    private GetPropertyActivationPlainArgs() {}

    private GetPropertyActivationPlainArgs(GetPropertyActivationPlainArgs $) {
        this.network = $.network;
        this.propertyId = $.propertyId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyActivationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyActivationPlainArgs $;

        public Builder() {
            $ = new GetPropertyActivationPlainArgs();
        }

        public Builder(GetPropertyActivationPlainArgs defaults) {
            $ = new GetPropertyActivationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder network(@Nullable String network) {
            $.network = network;
            return this;
        }

        public Builder propertyId(String propertyId) {
            $.propertyId = propertyId;
            return this;
        }

        public Builder version(Integer version) {
            $.version = version;
            return this;
        }

        public GetPropertyActivationPlainArgs build() {
            $.propertyId = Objects.requireNonNull($.propertyId, "expected parameter 'propertyId' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
