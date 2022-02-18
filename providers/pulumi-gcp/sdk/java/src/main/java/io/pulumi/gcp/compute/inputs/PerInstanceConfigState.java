// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PerInstanceConfigState extends io.pulumi.resources.ResourceArgs {

    public static final PerInstanceConfigState Empty = new PerInstanceConfigState();

    /**
     * The instance group manager this instance config is part of.
     * 
     */
    @InputImport(name="instanceGroupManager")
    private final @Nullable Input<String> instanceGroupManager;

    public Input<String> getInstanceGroupManager() {
        return this.instanceGroupManager == null ? Input.empty() : this.instanceGroupManager;
    }

    /**
     * The minimal action to perform on the instance during an update.
     * Default is `NONE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @InputImport(name="minimalAction")
    private final @Nullable Input<String> minimalAction;

    public Input<String> getMinimalAction() {
        return this.minimalAction == null ? Input.empty() : this.minimalAction;
    }

    /**
     * The most disruptive action to perform on the instance during an update.
     * Default is `REPLACE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @InputImport(name="mostDisruptiveAllowedAction")
    private final @Nullable Input<String> mostDisruptiveAllowedAction;

    public Input<String> getMostDisruptiveAllowedAction() {
        return this.mostDisruptiveAllowedAction == null ? Input.empty() : this.mostDisruptiveAllowedAction;
    }

    /**
     * The name for this per-instance config and its corresponding instance.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The preserved state for this instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="preservedState")
    private final @Nullable Input<PerInstanceConfigPreservedStateGetArgs> preservedState;

    public Input<PerInstanceConfigPreservedStateGetArgs> getPreservedState() {
        return this.preservedState == null ? Input.empty() : this.preservedState;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * When true, deleting this config will immediately remove any specified state from the underlying instance.
     * When false, deleting this config will *not* immediately remove any state from the underlying instance.
     * State will be removed on the next instance recreation or update.
     * 
     */
    @InputImport(name="removeInstanceStateOnDestroy")
    private final @Nullable Input<Boolean> removeInstanceStateOnDestroy;

    public Input<Boolean> getRemoveInstanceStateOnDestroy() {
        return this.removeInstanceStateOnDestroy == null ? Input.empty() : this.removeInstanceStateOnDestroy;
    }

    /**
     * Zone where the containing instance group manager is located
     * 
     */
    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public PerInstanceConfigState(
        @Nullable Input<String> instanceGroupManager,
        @Nullable Input<String> minimalAction,
        @Nullable Input<String> mostDisruptiveAllowedAction,
        @Nullable Input<String> name,
        @Nullable Input<PerInstanceConfigPreservedStateGetArgs> preservedState,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> removeInstanceStateOnDestroy,
        @Nullable Input<String> zone) {
        this.instanceGroupManager = instanceGroupManager;
        this.minimalAction = minimalAction;
        this.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
        this.name = name;
        this.preservedState = preservedState;
        this.project = project;
        this.removeInstanceStateOnDestroy = removeInstanceStateOnDestroy;
        this.zone = zone;
    }

    private PerInstanceConfigState() {
        this.instanceGroupManager = Input.empty();
        this.minimalAction = Input.empty();
        this.mostDisruptiveAllowedAction = Input.empty();
        this.name = Input.empty();
        this.preservedState = Input.empty();
        this.project = Input.empty();
        this.removeInstanceStateOnDestroy = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerInstanceConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceGroupManager;
        private @Nullable Input<String> minimalAction;
        private @Nullable Input<String> mostDisruptiveAllowedAction;
        private @Nullable Input<String> name;
        private @Nullable Input<PerInstanceConfigPreservedStateGetArgs> preservedState;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> removeInstanceStateOnDestroy;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(PerInstanceConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceGroupManager = defaults.instanceGroupManager;
    	      this.minimalAction = defaults.minimalAction;
    	      this.mostDisruptiveAllowedAction = defaults.mostDisruptiveAllowedAction;
    	      this.name = defaults.name;
    	      this.preservedState = defaults.preservedState;
    	      this.project = defaults.project;
    	      this.removeInstanceStateOnDestroy = defaults.removeInstanceStateOnDestroy;
    	      this.zone = defaults.zone;
        }

        public Builder setInstanceGroupManager(@Nullable Input<String> instanceGroupManager) {
            this.instanceGroupManager = instanceGroupManager;
            return this;
        }

        public Builder setInstanceGroupManager(@Nullable String instanceGroupManager) {
            this.instanceGroupManager = Input.ofNullable(instanceGroupManager);
            return this;
        }

        public Builder setMinimalAction(@Nullable Input<String> minimalAction) {
            this.minimalAction = minimalAction;
            return this;
        }

        public Builder setMinimalAction(@Nullable String minimalAction) {
            this.minimalAction = Input.ofNullable(minimalAction);
            return this;
        }

        public Builder setMostDisruptiveAllowedAction(@Nullable Input<String> mostDisruptiveAllowedAction) {
            this.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
            return this;
        }

        public Builder setMostDisruptiveAllowedAction(@Nullable String mostDisruptiveAllowedAction) {
            this.mostDisruptiveAllowedAction = Input.ofNullable(mostDisruptiveAllowedAction);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPreservedState(@Nullable Input<PerInstanceConfigPreservedStateGetArgs> preservedState) {
            this.preservedState = preservedState;
            return this;
        }

        public Builder setPreservedState(@Nullable PerInstanceConfigPreservedStateGetArgs preservedState) {
            this.preservedState = Input.ofNullable(preservedState);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRemoveInstanceStateOnDestroy(@Nullable Input<Boolean> removeInstanceStateOnDestroy) {
            this.removeInstanceStateOnDestroy = removeInstanceStateOnDestroy;
            return this;
        }

        public Builder setRemoveInstanceStateOnDestroy(@Nullable Boolean removeInstanceStateOnDestroy) {
            this.removeInstanceStateOnDestroy = Input.ofNullable(removeInstanceStateOnDestroy);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public PerInstanceConfigState build() {
            return new PerInstanceConfigState(instanceGroupManager, minimalAction, mostDisruptiveAllowedAction, name, preservedState, project, removeInstanceStateOnDestroy, zone);
        }
    }
}
