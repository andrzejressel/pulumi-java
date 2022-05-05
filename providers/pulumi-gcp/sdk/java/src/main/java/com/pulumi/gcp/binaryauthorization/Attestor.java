// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.binaryauthorization;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.binaryauthorization.AttestorArgs;
import com.pulumi.gcp.binaryauthorization.inputs.AttestorState;
import com.pulumi.gcp.binaryauthorization.outputs.AttestorAttestationAuthorityNote;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An attestor that attests to container image artifacts.
 * 
 * To get more information about Attestor, see:
 * 
 * * [API documentation](https://cloud.google.com/binary-authorization/docs/reference/rest/)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/binary-authorization/)
 * 
 * ## Example Usage
 * ### Binary Authorization Attestor Basic
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var note = new Note(&#34;note&#34;, NoteArgs.builder()        
 *             .attestationAuthority(NoteAttestationAuthority.builder()
 *                 .hint(NoteAttestationAuthorityHint.builder()
 *                     .humanReadableName(&#34;Attestor Note&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var attestor = new Attestor(&#34;attestor&#34;, AttestorArgs.builder()        
 *             .attestationAuthorityNote(AttestorAttestationAuthorityNote.builder()
 *                 .noteReference(note.getName())
 *                 .publicKeys(AttestorAttestationAuthorityNotePublicKey.builder()
 *                     .asciiArmoredPgpPublicKey(&#34;&#34;&#34;
 * mQENBFtP0doBCADF+joTiXWKVuP8kJt3fgpBSjT9h8ezMfKA4aXZctYLx5wslWQl
 * bB7Iu2ezkECNzoEeU7WxUe8a61pMCh9cisS9H5mB2K2uM4Jnf8tgFeXn3akJDVo0
 * oR1IC+Dp9mXbRSK3MAvKkOwWlG99sx3uEdvmeBRHBOO+grchLx24EThXFOyP9Fk6
 * V39j6xMjw4aggLD15B4V0v9JqBDdJiIYFzszZDL6pJwZrzcP0z8JO4rTZd+f64bD
 * Mpj52j/pQfA8lZHOaAgb1OrthLdMrBAjoDjArV4Ek7vSbrcgYWcI6BhsQrFoxKdX
 * 83TZKai55ZCfCLIskwUIzA1NLVwyzCS+fSN/ABEBAAG0KCJUZXN0IEF0dGVzdG9y
 * IiA8ZGFuYWhvZmZtYW5AZ29vZ2xlLmNvbT6JAU4EEwEIADgWIQRfWkqHt6hpTA1L
 * uY060eeM4dc66AUCW0/R2gIbLwULCQgHAgYVCgkICwIEFgIDAQIeAQIXgAAKCRA6
 * 0eeM4dc66HdpCAC4ot3b0OyxPb0Ip+WT2U0PbpTBPJklesuwpIrM4Lh0N+1nVRLC
 * 51WSmVbM8BiAFhLbN9LpdHhds1kUrHF7+wWAjdR8sqAj9otc6HGRM/3qfa2qgh+U
 * WTEk/3us/rYSi7T7TkMuutRMIa1IkR13uKiW56csEMnbOQpn9rDqwIr5R8nlZP5h
 * MAU9vdm1DIv567meMqTaVZgR3w7bck2P49AO8lO5ERFpVkErtu/98y+rUy9d789l
 * +OPuS1NGnxI1YKsNaWJF4uJVuvQuZ1twrhCbGNtVorO2U12+cEq+YtUxj7kmdOC1
 * qoIRW6y0+UlAc+MbqfL0ziHDOAmcqz1GnROg
 * =6Bvm
 *                     &#34;&#34;&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Binary Authorization Attestor Kms
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var keyring = new KeyRing(&#34;keyring&#34;, KeyRingArgs.builder()        
 *             .location(&#34;global&#34;)
 *             .build());
 * 
 *         var crypto_key = new CryptoKey(&#34;crypto-key&#34;, CryptoKeyArgs.builder()        
 *             .keyRing(keyring.getId())
 *             .purpose(&#34;ASYMMETRIC_SIGN&#34;)
 *             .versionTemplate(CryptoKeyVersionTemplate.builder()
 *                 .algorithm(&#34;RSA_SIGN_PKCS1_4096_SHA512&#34;)
 *                 .build())
 *             .build());
 * 
 *         final var version = KmsFunctions.getKMSCryptoKeyVersion(GetKMSCryptoKeyVersionArgs.builder()
 *             .cryptoKey(crypto_key.getId())
 *             .build());
 * 
 *         var note = new Note(&#34;note&#34;, NoteArgs.builder()        
 *             .attestationAuthority(NoteAttestationAuthority.builder()
 *                 .hint(NoteAttestationAuthorityHint.builder()
 *                     .humanReadableName(&#34;Attestor Note&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var attestor = new Attestor(&#34;attestor&#34;, AttestorArgs.builder()        
 *             .attestationAuthorityNote(AttestorAttestationAuthorityNote.builder()
 *                 .noteReference(note.getName())
 *                 .publicKeys(AttestorAttestationAuthorityNotePublicKey.builder()
 *                     .id(version.apply(getKMSCryptoKeyVersionResult -&gt; getKMSCryptoKeyVersionResult).apply(version -&gt; version.apply(getKMSCryptoKeyVersionResult -&gt; getKMSCryptoKeyVersionResult.getId())))
 *                     .pkixPublicKey(AttestorAttestationAuthorityNotePublicKeyPkixPublicKey.builder()
 *                         .publicKeyPem(version.apply(getKMSCryptoKeyVersionResult -&gt; getKMSCryptoKeyVersionResult).apply(version -&gt; version.apply(getKMSCryptoKeyVersionResult -&gt; getKMSCryptoKeyVersionResult.getPublicKeys()[0].getPem())))
 *                         .signatureAlgorithm(version.apply(getKMSCryptoKeyVersionResult -&gt; getKMSCryptoKeyVersionResult).apply(version -&gt; version.apply(getKMSCryptoKeyVersionResult -&gt; getKMSCryptoKeyVersionResult.getPublicKeys()[0].getAlgorithm())))
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Attestor can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:binaryauthorization/attestor:Attestor default projects/{{project}}/attestors/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:binaryauthorization/attestor:Attestor default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:binaryauthorization/attestor:Attestor default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:binaryauthorization/attestor:Attestor")
public class Attestor extends com.pulumi.resources.CustomResource {
    /**
     * A Container Analysis ATTESTATION_AUTHORITY Note, created by the user.
     * Structure is documented below.
     * 
     */
    @Export(name="attestationAuthorityNote", type=AttestorAttestationAuthorityNote.class, parameters={})
    private Output<AttestorAttestationAuthorityNote> attestationAuthorityNote;

    /**
     * @return A Container Analysis ATTESTATION_AUTHORITY Note, created by the user.
     * Structure is documented below.
     * 
     */
    public Output<AttestorAttestationAuthorityNote> attestationAuthorityNote() {
        return this.attestationAuthorityNote;
    }
    /**
     * A descriptive comment. This field may be updated. The field may be
     * displayed in chooser dialogs.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A descriptive comment. This field may be updated. The field may be
     * displayed in chooser dialogs.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Attestor(String name) {
        this(name, AttestorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Attestor(String name, AttestorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Attestor(String name, AttestorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:binaryauthorization/attestor:Attestor", name, args == null ? AttestorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Attestor(String name, Output<String> id, @Nullable AttestorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:binaryauthorization/attestor:Attestor", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Attestor get(String name, Output<String> id, @Nullable AttestorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Attestor(name, id, state, options);
    }
}
