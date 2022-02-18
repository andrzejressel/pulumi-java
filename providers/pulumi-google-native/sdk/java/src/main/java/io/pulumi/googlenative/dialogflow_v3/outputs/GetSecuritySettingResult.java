// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetSecuritySettingResult {
    /**
     * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. The `DLP De-identify Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent's project. If empty, Dialogflow replaces sensitive info with `[redacted]` text. The template name will have one of the following formats: `projects//locations//deidentifyTemplates/` OR `organizations//locations//deidentifyTemplates/` Note: `deidentify_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    private final String deidentifyTemplate;
    /**
     * The human-readable name of the security settings, unique within the location.
     * 
     */
    private final String displayName;
    /**
     * Controls conversation exporting settings to Insights after conversation is completed. If retention_strategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     * 
     */
    private final GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse insightsExportSettings;
    /**
     * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. The `DLP Inspect Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent's project. If empty, we use the default DLP inspect config. The template name will have one of the following formats: `projects//locations//inspectTemplates/` OR `organizations//locations//inspectTemplates/` Note: `inspect_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    private final String inspectTemplate;
    /**
     * Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name automatically. Format: `projects//locations//securitySettings/`.
     * 
     */
    private final String name;
    /**
     * List of types of data to remove when retention settings triggers purge.
     * 
     */
    private final List<String> purgeDataTypes;
    /**
     * Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging.
     * 
     */
    private final String redactionScope;
    /**
     * Strategy that defines how we do redaction.
     * 
     */
    private final String redactionStrategy;
    /**
     * Retains data in interaction logging for the specified number of days. This does not apply to Cloud logging, which is owned by the user - not Dialogflow. User must set a value lower than Dialogflow's default 365d TTL. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use Dialogflow's default TTL. Note: Interaction logging is a limited access feature. Talk to your Google representative to check availability for you.
     * 
     */
    private final Integer retentionWindowDays;

    @OutputCustomType.Constructor({"deidentifyTemplate","displayName","insightsExportSettings","inspectTemplate","name","purgeDataTypes","redactionScope","redactionStrategy","retentionWindowDays"})
    private GetSecuritySettingResult(
        String deidentifyTemplate,
        String displayName,
        GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse insightsExportSettings,
        String inspectTemplate,
        String name,
        List<String> purgeDataTypes,
        String redactionScope,
        String redactionStrategy,
        Integer retentionWindowDays) {
        this.deidentifyTemplate = Objects.requireNonNull(deidentifyTemplate);
        this.displayName = Objects.requireNonNull(displayName);
        this.insightsExportSettings = Objects.requireNonNull(insightsExportSettings);
        this.inspectTemplate = Objects.requireNonNull(inspectTemplate);
        this.name = Objects.requireNonNull(name);
        this.purgeDataTypes = Objects.requireNonNull(purgeDataTypes);
        this.redactionScope = Objects.requireNonNull(redactionScope);
        this.redactionStrategy = Objects.requireNonNull(redactionStrategy);
        this.retentionWindowDays = Objects.requireNonNull(retentionWindowDays);
    }

    /**
     * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. The `DLP De-identify Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent's project. If empty, Dialogflow replaces sensitive info with `[redacted]` text. The template name will have one of the following formats: `projects//locations//deidentifyTemplates/` OR `organizations//locations//deidentifyTemplates/` Note: `deidentify_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    public String getDeidentifyTemplate() {
        return this.deidentifyTemplate;
    }
    /**
     * The human-readable name of the security settings, unique within the location.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Controls conversation exporting settings to Insights after conversation is completed. If retention_strategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     * 
     */
    public GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse getInsightsExportSettings() {
        return this.insightsExportSettings;
    }
    /**
     * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. The `DLP Inspect Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent's project. If empty, we use the default DLP inspect config. The template name will have one of the following formats: `projects//locations//inspectTemplates/` OR `organizations//locations//inspectTemplates/` Note: `inspect_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    public String getInspectTemplate() {
        return this.inspectTemplate;
    }
    /**
     * Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name automatically. Format: `projects//locations//securitySettings/`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * List of types of data to remove when retention settings triggers purge.
     * 
     */
    public List<String> getPurgeDataTypes() {
        return this.purgeDataTypes;
    }
    /**
     * Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging.
     * 
     */
    public String getRedactionScope() {
        return this.redactionScope;
    }
    /**
     * Strategy that defines how we do redaction.
     * 
     */
    public String getRedactionStrategy() {
        return this.redactionStrategy;
    }
    /**
     * Retains data in interaction logging for the specified number of days. This does not apply to Cloud logging, which is owned by the user - not Dialogflow. User must set a value lower than Dialogflow's default 365d TTL. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use Dialogflow's default TTL. Note: Interaction logging is a limited access feature. Talk to your Google representative to check availability for you.
     * 
     */
    public Integer getRetentionWindowDays() {
        return this.retentionWindowDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecuritySettingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deidentifyTemplate;
        private String displayName;
        private GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse insightsExportSettings;
        private String inspectTemplate;
        private String name;
        private List<String> purgeDataTypes;
        private String redactionScope;
        private String redactionStrategy;
        private Integer retentionWindowDays;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecuritySettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deidentifyTemplate = defaults.deidentifyTemplate;
    	      this.displayName = defaults.displayName;
    	      this.insightsExportSettings = defaults.insightsExportSettings;
    	      this.inspectTemplate = defaults.inspectTemplate;
    	      this.name = defaults.name;
    	      this.purgeDataTypes = defaults.purgeDataTypes;
    	      this.redactionScope = defaults.redactionScope;
    	      this.redactionStrategy = defaults.redactionStrategy;
    	      this.retentionWindowDays = defaults.retentionWindowDays;
        }

        public Builder setDeidentifyTemplate(String deidentifyTemplate) {
            this.deidentifyTemplate = Objects.requireNonNull(deidentifyTemplate);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setInsightsExportSettings(GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse insightsExportSettings) {
            this.insightsExportSettings = Objects.requireNonNull(insightsExportSettings);
            return this;
        }

        public Builder setInspectTemplate(String inspectTemplate) {
            this.inspectTemplate = Objects.requireNonNull(inspectTemplate);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPurgeDataTypes(List<String> purgeDataTypes) {
            this.purgeDataTypes = Objects.requireNonNull(purgeDataTypes);
            return this;
        }

        public Builder setRedactionScope(String redactionScope) {
            this.redactionScope = Objects.requireNonNull(redactionScope);
            return this;
        }

        public Builder setRedactionStrategy(String redactionStrategy) {
            this.redactionStrategy = Objects.requireNonNull(redactionStrategy);
            return this;
        }

        public Builder setRetentionWindowDays(Integer retentionWindowDays) {
            this.retentionWindowDays = Objects.requireNonNull(retentionWindowDays);
            return this;
        }

        public GetSecuritySettingResult build() {
            return new GetSecuritySettingResult(deidentifyTemplate, displayName, insightsExportSettings, inspectTemplate, name, purgeDataTypes, redactionScope, redactionStrategy, retentionWindowDays);
        }
    }
}
