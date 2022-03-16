// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.containeranalysis_v1alpha1.OccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.AttestationResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.BuildDetailsResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.ComplianceOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DSSEAttestationOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DeploymentResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DerivedResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DiscoveredResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DocumentOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.EnvelopeResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.FileOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.InstallationResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.PackageInfoOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.RelationshipOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.ResourceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.UpgradeOccurrenceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.VulnerabilityDetailsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new `Occurrence`. Use this method to create `Occurrences` for a resource.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:containeranalysis/v1alpha1:Occurrence")
public class Occurrence extends io.pulumi.resources.CustomResource {
    /**
     * Describes an attestation of an artifact.
     * 
     */
    @Export(name="attestation", type=AttestationResponse.class, parameters={})
    private Output<AttestationResponse> attestation;

    /**
     * @return Describes an attestation of an artifact.
     * 
     */
    public Output<AttestationResponse> getAttestation() {
        return this.attestation;
    }
    /**
     * Build details for a verifiable build.
     * 
     */
    @Export(name="buildDetails", type=BuildDetailsResponse.class, parameters={})
    private Output<BuildDetailsResponse> buildDetails;

    /**
     * @return Build details for a verifiable build.
     * 
     */
    public Output<BuildDetailsResponse> getBuildDetails() {
        return this.buildDetails;
    }
    /**
     * Describes whether or not a resource passes compliance checks.
     * 
     */
    @Export(name="compliance", type=ComplianceOccurrenceResponse.class, parameters={})
    private Output<ComplianceOccurrenceResponse> compliance;

    /**
     * @return Describes whether or not a resource passes compliance checks.
     * 
     */
    public Output<ComplianceOccurrenceResponse> getCompliance() {
        return this.compliance;
    }
    /**
     * The time this `Occurrence` was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time this `Occurrence` was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Describes the deployment of an artifact on a runtime.
     * 
     */
    @Export(name="deployment", type=DeploymentResponse.class, parameters={})
    private Output<DeploymentResponse> deployment;

    /**
     * @return Describes the deployment of an artifact on a runtime.
     * 
     */
    public Output<DeploymentResponse> getDeployment() {
        return this.deployment;
    }
    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
     */
    @Export(name="derivedImage", type=DerivedResponse.class, parameters={})
    private Output<DerivedResponse> derivedImage;

    /**
     * @return Describes how this resource derives from the basis in the associated note.
     * 
     */
    public Output<DerivedResponse> getDerivedImage() {
        return this.derivedImage;
    }
    /**
     * Describes the initial scan status for this resource.
     * 
     */
    @Export(name="discovered", type=DiscoveredResponse.class, parameters={})
    private Output<DiscoveredResponse> discovered;

    /**
     * @return Describes the initial scan status for this resource.
     * 
     */
    public Output<DiscoveredResponse> getDiscovered() {
        return this.discovered;
    }
    /**
     * This represents a DSSE attestation occurrence
     * 
     */
    @Export(name="dsseAttestation", type=DSSEAttestationOccurrenceResponse.class, parameters={})
    private Output<DSSEAttestationOccurrenceResponse> dsseAttestation;

    /**
     * @return This represents a DSSE attestation occurrence
     * 
     */
    public Output<DSSEAttestationOccurrenceResponse> getDsseAttestation() {
        return this.dsseAttestation;
    }
    /**
     * https://github.com/secure-systems-lab/dsse
     * 
     */
    @Export(name="envelope", type=EnvelopeResponse.class, parameters={})
    private Output<EnvelopeResponse> envelope;

    /**
     * @return https://github.com/secure-systems-lab/dsse
     * 
     */
    public Output<EnvelopeResponse> getEnvelope() {
        return this.envelope;
    }
    /**
     * Describes the installation of a package on the linked resource.
     * 
     */
    @Export(name="installation", type=InstallationResponse.class, parameters={})
    private Output<InstallationResponse> installation;

    /**
     * @return Describes the installation of a package on the linked resource.
     * 
     */
    public Output<InstallationResponse> getInstallation() {
        return this.installation;
    }
    /**
     * This explicitly denotes which of the `Occurrence` details are specified. This field can be used as a filter in list requests.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return This explicitly denotes which of the `Occurrence` details are specified. This field can be used as a filter in list requests.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The name of the `Occurrence` in the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the `Occurrence` in the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * An analysis note associated with this image, in the form "providers/{provider_id}/notes/{NOTE_ID}" This field can be used as a filter in list requests.
     * 
     */
    @Export(name="noteName", type=String.class, parameters={})
    private Output<String> noteName;

    /**
     * @return An analysis note associated with this image, in the form "providers/{provider_id}/notes/{NOTE_ID}" This field can be used as a filter in list requests.
     * 
     */
    public Output<String> getNoteName() {
        return this.noteName;
    }
    /**
     * A description of actions that can be taken to remedy the `Note`
     * 
     */
    @Export(name="remediation", type=String.class, parameters={})
    private Output<String> remediation;

    /**
     * @return A description of actions that can be taken to remedy the `Note`
     * 
     */
    public Output<String> getRemediation() {
        return this.remediation;
    }
    /**
     *  The resource for which the `Occurrence` applies.
     * 
     */
    @Export(name="resource", type=ResourceResponse.class, parameters={})
    private Output<ResourceResponse> resource;

    /**
     * @return  The resource for which the `Occurrence` applies.
     * 
     */
    public Output<ResourceResponse> getResource() {
        return this.resource;
    }
    /**
     * The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
     * 
     */
    @Export(name="resourceUrl", type=String.class, parameters={})
    private Output<String> resourceUrl;

    /**
     * @return The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
     * 
     */
    public Output<String> getResourceUrl() {
        return this.resourceUrl;
    }
    /**
     * Describes a specific software bill of materials document.
     * 
     */
    @Export(name="sbom", type=DocumentOccurrenceResponse.class, parameters={})
    private Output<DocumentOccurrenceResponse> sbom;

    /**
     * @return Describes a specific software bill of materials document.
     * 
     */
    public Output<DocumentOccurrenceResponse> getSbom() {
        return this.sbom;
    }
    /**
     * Describes a specific SPDX File.
     * 
     */
    @Export(name="spdxFile", type=FileOccurrenceResponse.class, parameters={})
    private Output<FileOccurrenceResponse> spdxFile;

    /**
     * @return Describes a specific SPDX File.
     * 
     */
    public Output<FileOccurrenceResponse> getSpdxFile() {
        return this.spdxFile;
    }
    /**
     * Describes a specific SPDX Package.
     * 
     */
    @Export(name="spdxPackage", type=PackageInfoOccurrenceResponse.class, parameters={})
    private Output<PackageInfoOccurrenceResponse> spdxPackage;

    /**
     * @return Describes a specific SPDX Package.
     * 
     */
    public Output<PackageInfoOccurrenceResponse> getSpdxPackage() {
        return this.spdxPackage;
    }
    /**
     * Describes a specific relationship between SPDX elements.
     * 
     */
    @Export(name="spdxRelationship", type=RelationshipOccurrenceResponse.class, parameters={})
    private Output<RelationshipOccurrenceResponse> spdxRelationship;

    /**
     * @return Describes a specific relationship between SPDX elements.
     * 
     */
    public Output<RelationshipOccurrenceResponse> getSpdxRelationship() {
        return this.spdxRelationship;
    }
    /**
     * The time this `Occurrence` was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time this `Occurrence` was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Describes an upgrade.
     * 
     */
    @Export(name="upgrade", type=UpgradeOccurrenceResponse.class, parameters={})
    private Output<UpgradeOccurrenceResponse> upgrade;

    /**
     * @return Describes an upgrade.
     * 
     */
    public Output<UpgradeOccurrenceResponse> getUpgrade() {
        return this.upgrade;
    }
    /**
     * Details of a security vulnerability note.
     * 
     */
    @Export(name="vulnerabilityDetails", type=VulnerabilityDetailsResponse.class, parameters={})
    private Output<VulnerabilityDetailsResponse> vulnerabilityDetails;

    /**
     * @return Details of a security vulnerability note.
     * 
     */
    public Output<VulnerabilityDetailsResponse> getVulnerabilityDetails() {
        return this.vulnerabilityDetails;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable OccurrenceArgs.Builder a);
    }
    private static io.pulumi.googlenative.containeranalysis_v1alpha1.OccurrenceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.containeranalysis_v1alpha1.OccurrenceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Occurrence(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Occurrence(String name) {
        this(name, OccurrenceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Occurrence(String name, @Nullable OccurrenceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Occurrence(String name, @Nullable OccurrenceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:containeranalysis/v1alpha1:Occurrence", name, args == null ? OccurrenceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Occurrence(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:containeranalysis/v1alpha1:Occurrence", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Occurrence get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Occurrence(name, id, options);
    }
}
