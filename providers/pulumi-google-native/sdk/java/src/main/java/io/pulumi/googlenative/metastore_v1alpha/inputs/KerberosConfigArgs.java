// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.metastore_v1alpha.inputs.SecretArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration information for a Kerberos principal.
 * 
 */
public final class KerberosConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final KerberosConfigArgs Empty = new KerberosConfigArgs();

    /**
     * A Kerberos keytab file that can be used to authenticate a service principal with a Kerberos Key Distribution Center (KDC).
     * 
     */
    @InputImport(name="keytab")
    private final @Nullable Input<SecretArgs> keytab;

    public Input<SecretArgs> getKeytab() {
        return this.keytab == null ? Input.empty() : this.keytab;
    }

    /**
     * A Cloud Storage URI that specifies the path to a krb5.conf file. It is of the form gs://{bucket_name}/path/to/krb5.conf, although the file does not need to be named krb5.conf explicitly.
     * 
     */
    @InputImport(name="krb5ConfigGcsUri")
    private final @Nullable Input<String> krb5ConfigGcsUri;

    public Input<String> getKrb5ConfigGcsUri() {
        return this.krb5ConfigGcsUri == null ? Input.empty() : this.krb5ConfigGcsUri;
    }

    /**
     * A Kerberos principal that exists in the both the keytab the KDC to authenticate as. A typical principal is of the form primary/instance@REALM, but there is no exact format.
     * 
     */
    @InputImport(name="principal")
    private final @Nullable Input<String> principal;

    public Input<String> getPrincipal() {
        return this.principal == null ? Input.empty() : this.principal;
    }

    public KerberosConfigArgs(
        @Nullable Input<SecretArgs> keytab,
        @Nullable Input<String> krb5ConfigGcsUri,
        @Nullable Input<String> principal) {
        this.keytab = keytab;
        this.krb5ConfigGcsUri = krb5ConfigGcsUri;
        this.principal = principal;
    }

    private KerberosConfigArgs() {
        this.keytab = Input.empty();
        this.krb5ConfigGcsUri = Input.empty();
        this.principal = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KerberosConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecretArgs> keytab;
        private @Nullable Input<String> krb5ConfigGcsUri;
        private @Nullable Input<String> principal;

        public Builder() {
    	      // Empty
        }

        public Builder(KerberosConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keytab = defaults.keytab;
    	      this.krb5ConfigGcsUri = defaults.krb5ConfigGcsUri;
    	      this.principal = defaults.principal;
        }

        public Builder setKeytab(@Nullable Input<SecretArgs> keytab) {
            this.keytab = keytab;
            return this;
        }

        public Builder setKeytab(@Nullable SecretArgs keytab) {
            this.keytab = Input.ofNullable(keytab);
            return this;
        }

        public Builder setKrb5ConfigGcsUri(@Nullable Input<String> krb5ConfigGcsUri) {
            this.krb5ConfigGcsUri = krb5ConfigGcsUri;
            return this;
        }

        public Builder setKrb5ConfigGcsUri(@Nullable String krb5ConfigGcsUri) {
            this.krb5ConfigGcsUri = Input.ofNullable(krb5ConfigGcsUri);
            return this;
        }

        public Builder setPrincipal(@Nullable Input<String> principal) {
            this.principal = principal;
            return this;
        }

        public Builder setPrincipal(@Nullable String principal) {
            this.principal = Input.ofNullable(principal);
            return this;
        }

        public KerberosConfigArgs build() {
            return new KerberosConfigArgs(keytab, krb5ConfigGcsUri, principal);
        }
    }
}
