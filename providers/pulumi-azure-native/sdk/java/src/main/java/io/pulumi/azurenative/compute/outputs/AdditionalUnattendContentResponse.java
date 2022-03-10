// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AdditionalUnattendContentResponse {
    /**
     * The component name. Currently, the only allowable value is Microsoft-Windows-Shell-Setup.
     * 
     */
    private final @Nullable String componentName;
    /**
     * Specifies the XML formatted content that is added to the unattend.xml file for the specified path and component. The XML must be less than 4KB and must include the root element for the setting or feature that is being inserted.
     * 
     */
    private final @Nullable String content;
    /**
     * The pass name. Currently, the only allowable value is OobeSystem.
     * 
     */
    private final @Nullable String passName;
    /**
     * Specifies the name of the setting to which the content applies. Possible values are: FirstLogonCommands and AutoLogon.
     * 
     */
    private final @Nullable String settingName;

    @OutputCustomType.Constructor
    private AdditionalUnattendContentResponse(
        @OutputCustomType.Parameter("componentName") @Nullable String componentName,
        @OutputCustomType.Parameter("content") @Nullable String content,
        @OutputCustomType.Parameter("passName") @Nullable String passName,
        @OutputCustomType.Parameter("settingName") @Nullable String settingName) {
        this.componentName = componentName;
        this.content = content;
        this.passName = passName;
        this.settingName = settingName;
    }

    /**
     * The component name. Currently, the only allowable value is Microsoft-Windows-Shell-Setup.
     * 
    */
    public Optional<String> getComponentName() {
        return Optional.ofNullable(this.componentName);
    }
    /**
     * Specifies the XML formatted content that is added to the unattend.xml file for the specified path and component. The XML must be less than 4KB and must include the root element for the setting or feature that is being inserted.
     * 
    */
    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The pass name. Currently, the only allowable value is OobeSystem.
     * 
    */
    public Optional<String> getPassName() {
        return Optional.ofNullable(this.passName);
    }
    /**
     * Specifies the name of the setting to which the content applies. Possible values are: FirstLogonCommands and AutoLogon.
     * 
    */
    public Optional<String> getSettingName() {
        return Optional.ofNullable(this.settingName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdditionalUnattendContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String componentName;
        private @Nullable String content;
        private @Nullable String passName;
        private @Nullable String settingName;

        public Builder() {
    	      // Empty
        }

        public Builder(AdditionalUnattendContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentName = defaults.componentName;
    	      this.content = defaults.content;
    	      this.passName = defaults.passName;
    	      this.settingName = defaults.settingName;
        }

        public Builder setComponentName(@Nullable String componentName) {
            this.componentName = componentName;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setPassName(@Nullable String passName) {
            this.passName = passName;
            return this;
        }

        public Builder setSettingName(@Nullable String settingName) {
            this.settingName = settingName;
            return this;
        }
        public AdditionalUnattendContentResponse build() {
            return new AdditionalUnattendContentResponse(componentName, content, passName, settingName);
        }
    }
}
