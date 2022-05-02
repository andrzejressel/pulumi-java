// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.transfer.inputs;

import com.pulumi.awsnative.transfer.inputs.WorkflowS3TagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details for a step that creates one or more tags.
 * 
 */
public final class WorkflowStepTagStepDetailsPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowStepTagStepDetailsPropertiesArgs Empty = new WorkflowStepTagStepDetailsPropertiesArgs();

    /**
     * The name of the step, used as an identifier.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the step, used as an identifier.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies which file to use as input to the workflow step.
     * 
     */
    @Import(name="sourceFileLocation")
    private @Nullable Output<String> sourceFileLocation;

    /**
     * @return Specifies which file to use as input to the workflow step.
     * 
     */
    public Optional<Output<String>> sourceFileLocation() {
        return Optional.ofNullable(this.sourceFileLocation);
    }

    /**
     * Array that contains from 1 to 10 key/value pairs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<WorkflowS3TagArgs>> tags;

    /**
     * @return Array that contains from 1 to 10 key/value pairs.
     * 
     */
    public Optional<Output<List<WorkflowS3TagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private WorkflowStepTagStepDetailsPropertiesArgs() {}

    private WorkflowStepTagStepDetailsPropertiesArgs(WorkflowStepTagStepDetailsPropertiesArgs $) {
        this.name = $.name;
        this.sourceFileLocation = $.sourceFileLocation;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowStepTagStepDetailsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowStepTagStepDetailsPropertiesArgs $;

        public Builder() {
            $ = new WorkflowStepTagStepDetailsPropertiesArgs();
        }

        public Builder(WorkflowStepTagStepDetailsPropertiesArgs defaults) {
            $ = new WorkflowStepTagStepDetailsPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the step, used as an identifier.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the step, used as an identifier.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sourceFileLocation Specifies which file to use as input to the workflow step.
         * 
         * @return builder
         * 
         */
        public Builder sourceFileLocation(@Nullable Output<String> sourceFileLocation) {
            $.sourceFileLocation = sourceFileLocation;
            return this;
        }

        /**
         * @param sourceFileLocation Specifies which file to use as input to the workflow step.
         * 
         * @return builder
         * 
         */
        public Builder sourceFileLocation(String sourceFileLocation) {
            return sourceFileLocation(Output.of(sourceFileLocation));
        }

        /**
         * @param tags Array that contains from 1 to 10 key/value pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<WorkflowS3TagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Array that contains from 1 to 10 key/value pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<WorkflowS3TagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Array that contains from 1 to 10 key/value pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(WorkflowS3TagArgs... tags) {
            return tags(List.of(tags));
        }

        public WorkflowStepTagStepDetailsPropertiesArgs build() {
            return $;
        }
    }

}
