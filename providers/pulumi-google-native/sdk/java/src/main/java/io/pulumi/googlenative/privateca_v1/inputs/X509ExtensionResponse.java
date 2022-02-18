// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1.inputs.ObjectIdResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * An X509Extension specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
 * 
 */
public final class X509ExtensionResponse extends io.pulumi.resources.InvokeArgs {

    public static final X509ExtensionResponse Empty = new X509ExtensionResponse();

    /**
     * Optional. Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error).
     * 
     */
    @InputImport(name="critical", required=true)
    private final Boolean critical;

    public Boolean getCritical() {
        return this.critical;
    }

    /**
     * The OID for this X.509 extension.
     * 
     */
    @InputImport(name="objectId", required=true)
    private final ObjectIdResponse objectId;

    public ObjectIdResponse getObjectId() {
        return this.objectId;
    }

    /**
     * The value of this X.509 extension.
     * 
     */
    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public X509ExtensionResponse(
        Boolean critical,
        ObjectIdResponse objectId,
        String value) {
        this.critical = Objects.requireNonNull(critical, "expected parameter 'critical' to be non-null");
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private X509ExtensionResponse() {
        this.critical = null;
        this.objectId = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X509ExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean critical;
        private ObjectIdResponse objectId;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(X509ExtensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        public Builder setCritical(Boolean critical) {
            this.critical = Objects.requireNonNull(critical);
            return this;
        }

        public Builder setObjectId(ObjectIdResponse objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public X509ExtensionResponse build() {
            return new X509ExtensionResponse(critical, objectId, value);
        }
    }
}
