// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.ProviderArgs;
import io.pulumi.gcp.Utilities;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The provider type for the google-beta package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:gcp")
public class Provider extends io.pulumi.resources.ProviderResource {
    @OutputExport(name="accessApprovalCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessApprovalCustomEndpoint;

    public Output</* @Nullable */ String> getAccessApprovalCustomEndpoint() {
        return this.accessApprovalCustomEndpoint;
    }
    @OutputExport(name="accessContextManagerCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessContextManagerCustomEndpoint;

    public Output</* @Nullable */ String> getAccessContextManagerCustomEndpoint() {
        return this.accessContextManagerCustomEndpoint;
    }
    @OutputExport(name="accessToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessToken;

    public Output</* @Nullable */ String> getAccessToken() {
        return this.accessToken;
    }
    @OutputExport(name="activeDirectoryCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> activeDirectoryCustomEndpoint;

    public Output</* @Nullable */ String> getActiveDirectoryCustomEndpoint() {
        return this.activeDirectoryCustomEndpoint;
    }
    @OutputExport(name="apiGatewayCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiGatewayCustomEndpoint;

    public Output</* @Nullable */ String> getApiGatewayCustomEndpoint() {
        return this.apiGatewayCustomEndpoint;
    }
    @OutputExport(name="apigeeCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> apigeeCustomEndpoint;

    public Output</* @Nullable */ String> getApigeeCustomEndpoint() {
        return this.apigeeCustomEndpoint;
    }
    @OutputExport(name="appEngineCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> appEngineCustomEndpoint;

    public Output</* @Nullable */ String> getAppEngineCustomEndpoint() {
        return this.appEngineCustomEndpoint;
    }
    @OutputExport(name="artifactRegistryCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> artifactRegistryCustomEndpoint;

    public Output</* @Nullable */ String> getArtifactRegistryCustomEndpoint() {
        return this.artifactRegistryCustomEndpoint;
    }
    @OutputExport(name="assuredWorkloadsCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> assuredWorkloadsCustomEndpoint;

    public Output</* @Nullable */ String> getAssuredWorkloadsCustomEndpoint() {
        return this.assuredWorkloadsCustomEndpoint;
    }
    @OutputExport(name="bigQueryCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> bigQueryCustomEndpoint;

    public Output</* @Nullable */ String> getBigQueryCustomEndpoint() {
        return this.bigQueryCustomEndpoint;
    }
    @OutputExport(name="bigqueryConnectionCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> bigqueryConnectionCustomEndpoint;

    public Output</* @Nullable */ String> getBigqueryConnectionCustomEndpoint() {
        return this.bigqueryConnectionCustomEndpoint;
    }
    @OutputExport(name="bigqueryDataTransferCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> bigqueryDataTransferCustomEndpoint;

    public Output</* @Nullable */ String> getBigqueryDataTransferCustomEndpoint() {
        return this.bigqueryDataTransferCustomEndpoint;
    }
    @OutputExport(name="bigqueryReservationCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> bigqueryReservationCustomEndpoint;

    public Output</* @Nullable */ String> getBigqueryReservationCustomEndpoint() {
        return this.bigqueryReservationCustomEndpoint;
    }
    @OutputExport(name="bigtableCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> bigtableCustomEndpoint;

    public Output</* @Nullable */ String> getBigtableCustomEndpoint() {
        return this.bigtableCustomEndpoint;
    }
    @OutputExport(name="billingCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> billingCustomEndpoint;

    public Output</* @Nullable */ String> getBillingCustomEndpoint() {
        return this.billingCustomEndpoint;
    }
    @OutputExport(name="billingProject", type=String.class, parameters={})
    private Output</* @Nullable */ String> billingProject;

    public Output</* @Nullable */ String> getBillingProject() {
        return this.billingProject;
    }
    @OutputExport(name="binaryAuthorizationCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> binaryAuthorizationCustomEndpoint;

    public Output</* @Nullable */ String> getBinaryAuthorizationCustomEndpoint() {
        return this.binaryAuthorizationCustomEndpoint;
    }
    @OutputExport(name="cloudAssetCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudAssetCustomEndpoint;

    public Output</* @Nullable */ String> getCloudAssetCustomEndpoint() {
        return this.cloudAssetCustomEndpoint;
    }
    @OutputExport(name="cloudBillingCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudBillingCustomEndpoint;

    public Output</* @Nullable */ String> getCloudBillingCustomEndpoint() {
        return this.cloudBillingCustomEndpoint;
    }
    @OutputExport(name="cloudBuildCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudBuildCustomEndpoint;

    public Output</* @Nullable */ String> getCloudBuildCustomEndpoint() {
        return this.cloudBuildCustomEndpoint;
    }
    @OutputExport(name="cloudBuildWorkerPoolCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudBuildWorkerPoolCustomEndpoint;

    public Output</* @Nullable */ String> getCloudBuildWorkerPoolCustomEndpoint() {
        return this.cloudBuildWorkerPoolCustomEndpoint;
    }
    @OutputExport(name="cloudFunctionsCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudFunctionsCustomEndpoint;

    public Output</* @Nullable */ String> getCloudFunctionsCustomEndpoint() {
        return this.cloudFunctionsCustomEndpoint;
    }
    @OutputExport(name="cloudIdentityCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudIdentityCustomEndpoint;

    public Output</* @Nullable */ String> getCloudIdentityCustomEndpoint() {
        return this.cloudIdentityCustomEndpoint;
    }
    @OutputExport(name="cloudIotCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudIotCustomEndpoint;

    public Output</* @Nullable */ String> getCloudIotCustomEndpoint() {
        return this.cloudIotCustomEndpoint;
    }
    @OutputExport(name="cloudResourceManagerCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudResourceManagerCustomEndpoint;

    public Output</* @Nullable */ String> getCloudResourceManagerCustomEndpoint() {
        return this.cloudResourceManagerCustomEndpoint;
    }
    @OutputExport(name="cloudRunCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudRunCustomEndpoint;

    public Output</* @Nullable */ String> getCloudRunCustomEndpoint() {
        return this.cloudRunCustomEndpoint;
    }
    @OutputExport(name="cloudSchedulerCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudSchedulerCustomEndpoint;

    public Output</* @Nullable */ String> getCloudSchedulerCustomEndpoint() {
        return this.cloudSchedulerCustomEndpoint;
    }
    @OutputExport(name="cloudTasksCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudTasksCustomEndpoint;

    public Output</* @Nullable */ String> getCloudTasksCustomEndpoint() {
        return this.cloudTasksCustomEndpoint;
    }
    @OutputExport(name="composerCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> composerCustomEndpoint;

    public Output</* @Nullable */ String> getComposerCustomEndpoint() {
        return this.composerCustomEndpoint;
    }
    @OutputExport(name="computeCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> computeCustomEndpoint;

    public Output</* @Nullable */ String> getComputeCustomEndpoint() {
        return this.computeCustomEndpoint;
    }
    @OutputExport(name="containerAnalysisCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> containerAnalysisCustomEndpoint;

    public Output</* @Nullable */ String> getContainerAnalysisCustomEndpoint() {
        return this.containerAnalysisCustomEndpoint;
    }
    @OutputExport(name="containerAwsCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> containerAwsCustomEndpoint;

    public Output</* @Nullable */ String> getContainerAwsCustomEndpoint() {
        return this.containerAwsCustomEndpoint;
    }
    @OutputExport(name="containerAzureCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> containerAzureCustomEndpoint;

    public Output</* @Nullable */ String> getContainerAzureCustomEndpoint() {
        return this.containerAzureCustomEndpoint;
    }
    @OutputExport(name="containerCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> containerCustomEndpoint;

    public Output</* @Nullable */ String> getContainerCustomEndpoint() {
        return this.containerCustomEndpoint;
    }
    @OutputExport(name="credentials", type=String.class, parameters={})
    private Output</* @Nullable */ String> credentials;

    public Output</* @Nullable */ String> getCredentials() {
        return this.credentials;
    }
    @OutputExport(name="dataCatalogCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataCatalogCustomEndpoint;

    public Output</* @Nullable */ String> getDataCatalogCustomEndpoint() {
        return this.dataCatalogCustomEndpoint;
    }
    @OutputExport(name="dataFusionCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataFusionCustomEndpoint;

    public Output</* @Nullable */ String> getDataFusionCustomEndpoint() {
        return this.dataFusionCustomEndpoint;
    }
    @OutputExport(name="dataLossPreventionCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataLossPreventionCustomEndpoint;

    public Output</* @Nullable */ String> getDataLossPreventionCustomEndpoint() {
        return this.dataLossPreventionCustomEndpoint;
    }
    @OutputExport(name="dataflowCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataflowCustomEndpoint;

    public Output</* @Nullable */ String> getDataflowCustomEndpoint() {
        return this.dataflowCustomEndpoint;
    }
    @OutputExport(name="dataprocCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataprocCustomEndpoint;

    public Output</* @Nullable */ String> getDataprocCustomEndpoint() {
        return this.dataprocCustomEndpoint;
    }
    @OutputExport(name="dataprocMetastoreCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataprocMetastoreCustomEndpoint;

    public Output</* @Nullable */ String> getDataprocMetastoreCustomEndpoint() {
        return this.dataprocMetastoreCustomEndpoint;
    }
    @OutputExport(name="datastoreCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> datastoreCustomEndpoint;

    public Output</* @Nullable */ String> getDatastoreCustomEndpoint() {
        return this.datastoreCustomEndpoint;
    }
    @OutputExport(name="deploymentManagerCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> deploymentManagerCustomEndpoint;

    public Output</* @Nullable */ String> getDeploymentManagerCustomEndpoint() {
        return this.deploymentManagerCustomEndpoint;
    }
    @OutputExport(name="dialogflowCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> dialogflowCustomEndpoint;

    public Output</* @Nullable */ String> getDialogflowCustomEndpoint() {
        return this.dialogflowCustomEndpoint;
    }
    @OutputExport(name="dialogflowCxCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> dialogflowCxCustomEndpoint;

    public Output</* @Nullable */ String> getDialogflowCxCustomEndpoint() {
        return this.dialogflowCxCustomEndpoint;
    }
    @OutputExport(name="dnsCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsCustomEndpoint;

    public Output</* @Nullable */ String> getDnsCustomEndpoint() {
        return this.dnsCustomEndpoint;
    }
    @OutputExport(name="essentialContactsCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> essentialContactsCustomEndpoint;

    public Output</* @Nullable */ String> getEssentialContactsCustomEndpoint() {
        return this.essentialContactsCustomEndpoint;
    }
    @OutputExport(name="eventarcCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventarcCustomEndpoint;

    public Output</* @Nullable */ String> getEventarcCustomEndpoint() {
        return this.eventarcCustomEndpoint;
    }
    @OutputExport(name="filestoreCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> filestoreCustomEndpoint;

    public Output</* @Nullable */ String> getFilestoreCustomEndpoint() {
        return this.filestoreCustomEndpoint;
    }
    @OutputExport(name="firebaseCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> firebaseCustomEndpoint;

    public Output</* @Nullable */ String> getFirebaseCustomEndpoint() {
        return this.firebaseCustomEndpoint;
    }
    @OutputExport(name="firestoreCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> firestoreCustomEndpoint;

    public Output</* @Nullable */ String> getFirestoreCustomEndpoint() {
        return this.firestoreCustomEndpoint;
    }
    @OutputExport(name="gameServicesCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> gameServicesCustomEndpoint;

    public Output</* @Nullable */ String> getGameServicesCustomEndpoint() {
        return this.gameServicesCustomEndpoint;
    }
    @OutputExport(name="gkeHubCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> gkeHubCustomEndpoint;

    public Output</* @Nullable */ String> getGkeHubCustomEndpoint() {
        return this.gkeHubCustomEndpoint;
    }
    @OutputExport(name="gkehubFeatureCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> gkehubFeatureCustomEndpoint;

    public Output</* @Nullable */ String> getGkehubFeatureCustomEndpoint() {
        return this.gkehubFeatureCustomEndpoint;
    }
    @OutputExport(name="googlePartnerName", type=String.class, parameters={})
    private Output</* @Nullable */ String> googlePartnerName;

    public Output</* @Nullable */ String> getGooglePartnerName() {
        return this.googlePartnerName;
    }
    @OutputExport(name="healthcareCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthcareCustomEndpoint;

    public Output</* @Nullable */ String> getHealthcareCustomEndpoint() {
        return this.healthcareCustomEndpoint;
    }
    @OutputExport(name="iamBetaCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> iamBetaCustomEndpoint;

    public Output</* @Nullable */ String> getIamBetaCustomEndpoint() {
        return this.iamBetaCustomEndpoint;
    }
    @OutputExport(name="iamCredentialsCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> iamCredentialsCustomEndpoint;

    public Output</* @Nullable */ String> getIamCredentialsCustomEndpoint() {
        return this.iamCredentialsCustomEndpoint;
    }
    @OutputExport(name="iamCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> iamCustomEndpoint;

    public Output</* @Nullable */ String> getIamCustomEndpoint() {
        return this.iamCustomEndpoint;
    }
    @OutputExport(name="iapCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> iapCustomEndpoint;

    public Output</* @Nullable */ String> getIapCustomEndpoint() {
        return this.iapCustomEndpoint;
    }
    @OutputExport(name="identityPlatformCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> identityPlatformCustomEndpoint;

    public Output</* @Nullable */ String> getIdentityPlatformCustomEndpoint() {
        return this.identityPlatformCustomEndpoint;
    }
    @OutputExport(name="impersonateServiceAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> impersonateServiceAccount;

    public Output</* @Nullable */ String> getImpersonateServiceAccount() {
        return this.impersonateServiceAccount;
    }
    @OutputExport(name="kmsCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsCustomEndpoint;

    public Output</* @Nullable */ String> getKmsCustomEndpoint() {
        return this.kmsCustomEndpoint;
    }
    @OutputExport(name="loggingCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> loggingCustomEndpoint;

    public Output</* @Nullable */ String> getLoggingCustomEndpoint() {
        return this.loggingCustomEndpoint;
    }
    @OutputExport(name="memcacheCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> memcacheCustomEndpoint;

    public Output</* @Nullable */ String> getMemcacheCustomEndpoint() {
        return this.memcacheCustomEndpoint;
    }
    @OutputExport(name="mlEngineCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> mlEngineCustomEndpoint;

    public Output</* @Nullable */ String> getMlEngineCustomEndpoint() {
        return this.mlEngineCustomEndpoint;
    }
    @OutputExport(name="monitoringCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> monitoringCustomEndpoint;

    public Output</* @Nullable */ String> getMonitoringCustomEndpoint() {
        return this.monitoringCustomEndpoint;
    }
    @OutputExport(name="networkConnectivityCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkConnectivityCustomEndpoint;

    public Output</* @Nullable */ String> getNetworkConnectivityCustomEndpoint() {
        return this.networkConnectivityCustomEndpoint;
    }
    @OutputExport(name="networkManagementCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkManagementCustomEndpoint;

    public Output</* @Nullable */ String> getNetworkManagementCustomEndpoint() {
        return this.networkManagementCustomEndpoint;
    }
    @OutputExport(name="networkServicesCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkServicesCustomEndpoint;

    public Output</* @Nullable */ String> getNetworkServicesCustomEndpoint() {
        return this.networkServicesCustomEndpoint;
    }
    @OutputExport(name="notebooksCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> notebooksCustomEndpoint;

    public Output</* @Nullable */ String> getNotebooksCustomEndpoint() {
        return this.notebooksCustomEndpoint;
    }
    @OutputExport(name="orgPolicyCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> orgPolicyCustomEndpoint;

    public Output</* @Nullable */ String> getOrgPolicyCustomEndpoint() {
        return this.orgPolicyCustomEndpoint;
    }
    @OutputExport(name="osConfigCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> osConfigCustomEndpoint;

    public Output</* @Nullable */ String> getOsConfigCustomEndpoint() {
        return this.osConfigCustomEndpoint;
    }
    @OutputExport(name="osLoginCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> osLoginCustomEndpoint;

    public Output</* @Nullable */ String> getOsLoginCustomEndpoint() {
        return this.osLoginCustomEndpoint;
    }
    @OutputExport(name="privatecaCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> privatecaCustomEndpoint;

    public Output</* @Nullable */ String> getPrivatecaCustomEndpoint() {
        return this.privatecaCustomEndpoint;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output</* @Nullable */ String> project;

    public Output</* @Nullable */ String> getProject() {
        return this.project;
    }
    @OutputExport(name="pubsubCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> pubsubCustomEndpoint;

    public Output</* @Nullable */ String> getPubsubCustomEndpoint() {
        return this.pubsubCustomEndpoint;
    }
    @OutputExport(name="pubsubLiteCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> pubsubLiteCustomEndpoint;

    public Output</* @Nullable */ String> getPubsubLiteCustomEndpoint() {
        return this.pubsubLiteCustomEndpoint;
    }
    @OutputExport(name="recaptchaEnterpriseCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> recaptchaEnterpriseCustomEndpoint;

    public Output</* @Nullable */ String> getRecaptchaEnterpriseCustomEndpoint() {
        return this.recaptchaEnterpriseCustomEndpoint;
    }
    @OutputExport(name="redisCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> redisCustomEndpoint;

    public Output</* @Nullable */ String> getRedisCustomEndpoint() {
        return this.redisCustomEndpoint;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    public Output</* @Nullable */ String> getRegion() {
        return this.region;
    }
    @OutputExport(name="requestReason", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestReason;

    public Output</* @Nullable */ String> getRequestReason() {
        return this.requestReason;
    }
    @OutputExport(name="requestTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestTimeout;

    public Output</* @Nullable */ String> getRequestTimeout() {
        return this.requestTimeout;
    }
    @OutputExport(name="resourceManagerCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceManagerCustomEndpoint;

    public Output</* @Nullable */ String> getResourceManagerCustomEndpoint() {
        return this.resourceManagerCustomEndpoint;
    }
    @OutputExport(name="resourceManagerV2CustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceManagerV2CustomEndpoint;

    public Output</* @Nullable */ String> getResourceManagerV2CustomEndpoint() {
        return this.resourceManagerV2CustomEndpoint;
    }
    @OutputExport(name="runtimeConfigCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtimeConfigCustomEndpoint;

    public Output</* @Nullable */ String> getRuntimeConfigCustomEndpoint() {
        return this.runtimeConfigCustomEndpoint;
    }
    @OutputExport(name="runtimeconfigCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtimeconfigCustomEndpoint;

    public Output</* @Nullable */ String> getRuntimeconfigCustomEndpoint() {
        return this.runtimeconfigCustomEndpoint;
    }
    @OutputExport(name="secretManagerCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretManagerCustomEndpoint;

    public Output</* @Nullable */ String> getSecretManagerCustomEndpoint() {
        return this.secretManagerCustomEndpoint;
    }
    @OutputExport(name="securityCenterCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityCenterCustomEndpoint;

    public Output</* @Nullable */ String> getSecurityCenterCustomEndpoint() {
        return this.securityCenterCustomEndpoint;
    }
    @OutputExport(name="securityScannerCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityScannerCustomEndpoint;

    public Output</* @Nullable */ String> getSecurityScannerCustomEndpoint() {
        return this.securityScannerCustomEndpoint;
    }
    @OutputExport(name="serviceDirectoryCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceDirectoryCustomEndpoint;

    public Output</* @Nullable */ String> getServiceDirectoryCustomEndpoint() {
        return this.serviceDirectoryCustomEndpoint;
    }
    @OutputExport(name="serviceManagementCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceManagementCustomEndpoint;

    public Output</* @Nullable */ String> getServiceManagementCustomEndpoint() {
        return this.serviceManagementCustomEndpoint;
    }
    @OutputExport(name="serviceNetworkingCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceNetworkingCustomEndpoint;

    public Output</* @Nullable */ String> getServiceNetworkingCustomEndpoint() {
        return this.serviceNetworkingCustomEndpoint;
    }
    @OutputExport(name="serviceUsageCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceUsageCustomEndpoint;

    public Output</* @Nullable */ String> getServiceUsageCustomEndpoint() {
        return this.serviceUsageCustomEndpoint;
    }
    @OutputExport(name="sourceRepoCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceRepoCustomEndpoint;

    public Output</* @Nullable */ String> getSourceRepoCustomEndpoint() {
        return this.sourceRepoCustomEndpoint;
    }
    @OutputExport(name="spannerCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> spannerCustomEndpoint;

    public Output</* @Nullable */ String> getSpannerCustomEndpoint() {
        return this.spannerCustomEndpoint;
    }
    @OutputExport(name="sqlCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> sqlCustomEndpoint;

    public Output</* @Nullable */ String> getSqlCustomEndpoint() {
        return this.sqlCustomEndpoint;
    }
    @OutputExport(name="storageCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageCustomEndpoint;

    public Output</* @Nullable */ String> getStorageCustomEndpoint() {
        return this.storageCustomEndpoint;
    }
    @OutputExport(name="storageTransferCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageTransferCustomEndpoint;

    public Output</* @Nullable */ String> getStorageTransferCustomEndpoint() {
        return this.storageTransferCustomEndpoint;
    }
    @OutputExport(name="tagsCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> tagsCustomEndpoint;

    public Output</* @Nullable */ String> getTagsCustomEndpoint() {
        return this.tagsCustomEndpoint;
    }
    @OutputExport(name="tpuCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> tpuCustomEndpoint;

    public Output</* @Nullable */ String> getTpuCustomEndpoint() {
        return this.tpuCustomEndpoint;
    }
    @OutputExport(name="vertexAiCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> vertexAiCustomEndpoint;

    public Output</* @Nullable */ String> getVertexAiCustomEndpoint() {
        return this.vertexAiCustomEndpoint;
    }
    @OutputExport(name="vpcAccessCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcAccessCustomEndpoint;

    public Output</* @Nullable */ String> getVpcAccessCustomEndpoint() {
        return this.vpcAccessCustomEndpoint;
    }
    @OutputExport(name="workflowsCustomEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> workflowsCustomEndpoint;

    public Output</* @Nullable */ String> getWorkflowsCustomEndpoint() {
        return this.workflowsCustomEndpoint;
    }
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output</* @Nullable */ String> zone;

    public Output</* @Nullable */ String> getZone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
