// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.enums.DomainRStudioServerProAppSettingsAccessStatus;
import com.pulumi.awsnative.sagemaker.enums.DomainRStudioServerProAppSettingsUserGroup;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A collection of settings that configure user interaction with the RStudioServerPro app.
 * 
 */
public final class DomainRStudioServerProAppSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainRStudioServerProAppSettingsArgs Empty = new DomainRStudioServerProAppSettingsArgs();

    /**
     * Indicates whether the current user has access to the RStudioServerPro app.
     * 
     */
    @Import(name="accessStatus")
    private @Nullable Output<DomainRStudioServerProAppSettingsAccessStatus> accessStatus;

    /**
     * @return Indicates whether the current user has access to the RStudioServerPro app.
     * 
     */
    public Optional<Output<DomainRStudioServerProAppSettingsAccessStatus>> accessStatus() {
        return Optional.ofNullable(this.accessStatus);
    }

    /**
     * The level of permissions that the user has within the RStudioServerPro app. This value defaults to User. The Admin value allows the user access to the RStudio Administrative Dashboard.
     * 
     */
    @Import(name="userGroup")
    private @Nullable Output<DomainRStudioServerProAppSettingsUserGroup> userGroup;

    /**
     * @return The level of permissions that the user has within the RStudioServerPro app. This value defaults to User. The Admin value allows the user access to the RStudio Administrative Dashboard.
     * 
     */
    public Optional<Output<DomainRStudioServerProAppSettingsUserGroup>> userGroup() {
        return Optional.ofNullable(this.userGroup);
    }

    private DomainRStudioServerProAppSettingsArgs() {}

    private DomainRStudioServerProAppSettingsArgs(DomainRStudioServerProAppSettingsArgs $) {
        this.accessStatus = $.accessStatus;
        this.userGroup = $.userGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainRStudioServerProAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainRStudioServerProAppSettingsArgs $;

        public Builder() {
            $ = new DomainRStudioServerProAppSettingsArgs();
        }

        public Builder(DomainRStudioServerProAppSettingsArgs defaults) {
            $ = new DomainRStudioServerProAppSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessStatus Indicates whether the current user has access to the RStudioServerPro app.
         * 
         * @return builder
         * 
         */
        public Builder accessStatus(@Nullable Output<DomainRStudioServerProAppSettingsAccessStatus> accessStatus) {
            $.accessStatus = accessStatus;
            return this;
        }

        /**
         * @param accessStatus Indicates whether the current user has access to the RStudioServerPro app.
         * 
         * @return builder
         * 
         */
        public Builder accessStatus(DomainRStudioServerProAppSettingsAccessStatus accessStatus) {
            return accessStatus(Output.of(accessStatus));
        }

        /**
         * @param userGroup The level of permissions that the user has within the RStudioServerPro app. This value defaults to User. The Admin value allows the user access to the RStudio Administrative Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder userGroup(@Nullable Output<DomainRStudioServerProAppSettingsUserGroup> userGroup) {
            $.userGroup = userGroup;
            return this;
        }

        /**
         * @param userGroup The level of permissions that the user has within the RStudioServerPro app. This value defaults to User. The Admin value allows the user access to the RStudio Administrative Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder userGroup(DomainRStudioServerProAppSettingsUserGroup userGroup) {
            return userGroup(Output.of(userGroup));
        }

        public DomainRStudioServerProAppSettingsArgs build() {
            return $;
        }
    }

}
