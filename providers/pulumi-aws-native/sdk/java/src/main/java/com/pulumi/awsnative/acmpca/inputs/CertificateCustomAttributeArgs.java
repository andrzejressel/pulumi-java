// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Structure that contains X.500 attribute type and value.
 * 
 */
public final class CertificateCustomAttributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCustomAttributeArgs Empty = new CertificateCustomAttributeArgs();

    @Import(name="objectIdentifier", required=true)
    private Output<String> objectIdentifier;

    public Output<String> objectIdentifier() {
        return this.objectIdentifier;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private CertificateCustomAttributeArgs() {}

    private CertificateCustomAttributeArgs(CertificateCustomAttributeArgs $) {
        this.objectIdentifier = $.objectIdentifier;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCustomAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCustomAttributeArgs $;

        public Builder() {
            $ = new CertificateCustomAttributeArgs();
        }

        public Builder(CertificateCustomAttributeArgs defaults) {
            $ = new CertificateCustomAttributeArgs(Objects.requireNonNull(defaults));
        }

        public Builder objectIdentifier(Output<String> objectIdentifier) {
            $.objectIdentifier = objectIdentifier;
            return this;
        }

        public Builder objectIdentifier(String objectIdentifier) {
            return objectIdentifier(Output.of(objectIdentifier));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CertificateCustomAttributeArgs build() {
            $.objectIdentifier = Objects.requireNonNull($.objectIdentifier, "expected parameter 'objectIdentifier' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
