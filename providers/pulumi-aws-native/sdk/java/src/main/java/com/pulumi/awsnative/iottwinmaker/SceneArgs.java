// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iottwinmaker;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SceneArgs extends com.pulumi.resources.ResourceArgs {

    public static final SceneArgs Empty = new SceneArgs();

    /**
     * A list of capabilities that the scene uses to render.
     * 
     */
    @Import(name="capabilities")
    private @Nullable Output<List<String>> capabilities;

    /**
     * @return A list of capabilities that the scene uses to render.
     * 
     */
    public Optional<Output<List<String>>> capabilities() {
        return Optional.ofNullable(this.capabilities);
    }

    /**
     * The relative path that specifies the location of the content definition file.
     * 
     */
    @Import(name="contentLocation", required=true)
    private Output<String> contentLocation;

    /**
     * @return The relative path that specifies the location of the content definition file.
     * 
     */
    public Output<String> contentLocation() {
        return this.contentLocation;
    }

    /**
     * The description of the scene.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the scene.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the scene.
     * 
     */
    @Import(name="sceneId", required=true)
    private Output<String> sceneId;

    /**
     * @return The ID of the scene.
     * 
     */
    public Output<String> sceneId() {
        return this.sceneId;
    }

    /**
     * A key-value pair to associate with a resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Object> tags;

    /**
     * @return A key-value pair to associate with a resource.
     * 
     */
    public Optional<Output<Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the scene.
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return The ID of the scene.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private SceneArgs() {}

    private SceneArgs(SceneArgs $) {
        this.capabilities = $.capabilities;
        this.contentLocation = $.contentLocation;
        this.description = $.description;
        this.sceneId = $.sceneId;
        this.tags = $.tags;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SceneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SceneArgs $;

        public Builder() {
            $ = new SceneArgs();
        }

        public Builder(SceneArgs defaults) {
            $ = new SceneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capabilities A list of capabilities that the scene uses to render.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(@Nullable Output<List<String>> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        /**
         * @param capabilities A list of capabilities that the scene uses to render.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(List<String> capabilities) {
            return capabilities(Output.of(capabilities));
        }

        /**
         * @param capabilities A list of capabilities that the scene uses to render.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }

        /**
         * @param contentLocation The relative path that specifies the location of the content definition file.
         * 
         * @return builder
         * 
         */
        public Builder contentLocation(Output<String> contentLocation) {
            $.contentLocation = contentLocation;
            return this;
        }

        /**
         * @param contentLocation The relative path that specifies the location of the content definition file.
         * 
         * @return builder
         * 
         */
        public Builder contentLocation(String contentLocation) {
            return contentLocation(Output.of(contentLocation));
        }

        /**
         * @param description The description of the scene.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the scene.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param sceneId The ID of the scene.
         * 
         * @return builder
         * 
         */
        public Builder sceneId(Output<String> sceneId) {
            $.sceneId = sceneId;
            return this;
        }

        /**
         * @param sceneId The ID of the scene.
         * 
         * @return builder
         * 
         */
        public Builder sceneId(String sceneId) {
            return sceneId(Output.of(sceneId));
        }

        /**
         * @param tags A key-value pair to associate with a resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Object> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A key-value pair to associate with a resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Object tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param workspaceId The ID of the scene.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The ID of the scene.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public SceneArgs build() {
            $.contentLocation = Objects.requireNonNull($.contentLocation, "expected parameter 'contentLocation' to be non-null");
            $.sceneId = Objects.requireNonNull($.sceneId, "expected parameter 'sceneId' to be non-null");
            $.workspaceId = Objects.requireNonNull($.workspaceId, "expected parameter 'workspaceId' to be non-null");
            return $;
        }
    }

}
