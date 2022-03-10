// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VaultCertificateResponse {
    /**
     * For Windows VMs, specifies the certificate store on the Virtual Machine to which the certificate should be added. The specified certificate store is implicitly in the LocalMachine account. <br><br>For Linux VMs, the certificate file is placed under the /var/lib/waagent directory, with the file name <UppercaseThumbprint>.crt for the X509 certificate file and <UppercaseThumbprint>.prv for private key. Both of these files are .pem formatted.
     * 
     */
    private final String certificateStore;
    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret. For adding a secret to the Key Vault, see [Add a key or secret to the key vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add). In this case, your certificate needs to be It is the Base64 encoding of the following JSON Object which is encoded in UTF-8: <br><br> {<br>  "data":"<Base64-encoded-certificate>",<br>  "dataType":"pfx",<br>  "password":"<pfx-file-password>"<br>}
     * 
     */
    private final String certificateUrl;

    @OutputCustomType.Constructor
    private VaultCertificateResponse(
        @OutputCustomType.Parameter("certificateStore") String certificateStore,
        @OutputCustomType.Parameter("certificateUrl") String certificateUrl) {
        this.certificateStore = certificateStore;
        this.certificateUrl = certificateUrl;
    }

    /**
     * For Windows VMs, specifies the certificate store on the Virtual Machine to which the certificate should be added. The specified certificate store is implicitly in the LocalMachine account. <br><br>For Linux VMs, the certificate file is placed under the /var/lib/waagent directory, with the file name <UppercaseThumbprint>.crt for the X509 certificate file and <UppercaseThumbprint>.prv for private key. Both of these files are .pem formatted.
     * 
    */
    public String getCertificateStore() {
        return this.certificateStore;
    }
    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret. For adding a secret to the Key Vault, see [Add a key or secret to the key vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add). In this case, your certificate needs to be It is the Base64 encoding of the following JSON Object which is encoded in UTF-8: <br><br> {<br>  "data":"<Base64-encoded-certificate>",<br>  "dataType":"pfx",<br>  "password":"<pfx-file-password>"<br>}
     * 
    */
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateStore;
        private String certificateUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateStore = defaults.certificateStore;
    	      this.certificateUrl = defaults.certificateUrl;
        }

        public Builder setCertificateStore(String certificateStore) {
            this.certificateStore = Objects.requireNonNull(certificateStore);
            return this;
        }

        public Builder setCertificateUrl(String certificateUrl) {
            this.certificateUrl = Objects.requireNonNull(certificateUrl);
            return this;
        }
        public VaultCertificateResponse build() {
            return new VaultCertificateResponse(certificateStore, certificateUrl);
        }
    }
}
