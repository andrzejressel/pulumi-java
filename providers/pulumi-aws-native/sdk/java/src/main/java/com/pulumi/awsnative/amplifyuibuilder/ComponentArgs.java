// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplifyuibuilder;

import com.pulumi.awsnative.amplifyuibuilder.inputs.ComponentBindingPropertiesArgs;
import com.pulumi.awsnative.amplifyuibuilder.inputs.ComponentChildArgs;
import com.pulumi.awsnative.amplifyuibuilder.inputs.ComponentCollectionPropertiesArgs;
import com.pulumi.awsnative.amplifyuibuilder.inputs.ComponentEventsArgs;
import com.pulumi.awsnative.amplifyuibuilder.inputs.ComponentOverridesArgs;
import com.pulumi.awsnative.amplifyuibuilder.inputs.ComponentPropertiesArgs;
import com.pulumi.awsnative.amplifyuibuilder.inputs.ComponentTagsArgs;
import com.pulumi.awsnative.amplifyuibuilder.inputs.ComponentVariantArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComponentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComponentArgs Empty = new ComponentArgs();

    @Import(name="bindingProperties", required=true)
    private Output<ComponentBindingPropertiesArgs> bindingProperties;

    public Output<ComponentBindingPropertiesArgs> bindingProperties() {
        return this.bindingProperties;
    }

    @Import(name="children")
    private @Nullable Output<List<ComponentChildArgs>> children;

    public Optional<Output<List<ComponentChildArgs>>> children() {
        return Optional.ofNullable(this.children);
    }

    @Import(name="collectionProperties")
    private @Nullable Output<ComponentCollectionPropertiesArgs> collectionProperties;

    public Optional<Output<ComponentCollectionPropertiesArgs>> collectionProperties() {
        return Optional.ofNullable(this.collectionProperties);
    }

    @Import(name="componentType", required=true)
    private Output<String> componentType;

    public Output<String> componentType() {
        return this.componentType;
    }

    @Import(name="events")
    private @Nullable Output<ComponentEventsArgs> events;

    public Optional<Output<ComponentEventsArgs>> events() {
        return Optional.ofNullable(this.events);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="overrides", required=true)
    private Output<ComponentOverridesArgs> overrides;

    public Output<ComponentOverridesArgs> overrides() {
        return this.overrides;
    }

    @Import(name="properties", required=true)
    private Output<ComponentPropertiesArgs> properties;

    public Output<ComponentPropertiesArgs> properties() {
        return this.properties;
    }

    @Import(name="schemaVersion")
    private @Nullable Output<String> schemaVersion;

    public Optional<Output<String>> schemaVersion() {
        return Optional.ofNullable(this.schemaVersion);
    }

    @Import(name="sourceId")
    private @Nullable Output<String> sourceId;

    public Optional<Output<String>> sourceId() {
        return Optional.ofNullable(this.sourceId);
    }

    @Import(name="tags")
    private @Nullable Output<ComponentTagsArgs> tags;

    public Optional<Output<ComponentTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="variants", required=true)
    private Output<List<ComponentVariantArgs>> variants;

    public Output<List<ComponentVariantArgs>> variants() {
        return this.variants;
    }

    private ComponentArgs() {}

    private ComponentArgs(ComponentArgs $) {
        this.bindingProperties = $.bindingProperties;
        this.children = $.children;
        this.collectionProperties = $.collectionProperties;
        this.componentType = $.componentType;
        this.events = $.events;
        this.name = $.name;
        this.overrides = $.overrides;
        this.properties = $.properties;
        this.schemaVersion = $.schemaVersion;
        this.sourceId = $.sourceId;
        this.tags = $.tags;
        this.variants = $.variants;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComponentArgs $;

        public Builder() {
            $ = new ComponentArgs();
        }

        public Builder(ComponentArgs defaults) {
            $ = new ComponentArgs(Objects.requireNonNull(defaults));
        }

        public Builder bindingProperties(Output<ComponentBindingPropertiesArgs> bindingProperties) {
            $.bindingProperties = bindingProperties;
            return this;
        }

        public Builder bindingProperties(ComponentBindingPropertiesArgs bindingProperties) {
            return bindingProperties(Output.of(bindingProperties));
        }

        public Builder children(@Nullable Output<List<ComponentChildArgs>> children) {
            $.children = children;
            return this;
        }

        public Builder children(List<ComponentChildArgs> children) {
            return children(Output.of(children));
        }

        public Builder children(ComponentChildArgs... children) {
            return children(List.of(children));
        }

        public Builder collectionProperties(@Nullable Output<ComponentCollectionPropertiesArgs> collectionProperties) {
            $.collectionProperties = collectionProperties;
            return this;
        }

        public Builder collectionProperties(ComponentCollectionPropertiesArgs collectionProperties) {
            return collectionProperties(Output.of(collectionProperties));
        }

        public Builder componentType(Output<String> componentType) {
            $.componentType = componentType;
            return this;
        }

        public Builder componentType(String componentType) {
            return componentType(Output.of(componentType));
        }

        public Builder events(@Nullable Output<ComponentEventsArgs> events) {
            $.events = events;
            return this;
        }

        public Builder events(ComponentEventsArgs events) {
            return events(Output.of(events));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder overrides(Output<ComponentOverridesArgs> overrides) {
            $.overrides = overrides;
            return this;
        }

        public Builder overrides(ComponentOverridesArgs overrides) {
            return overrides(Output.of(overrides));
        }

        public Builder properties(Output<ComponentPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(ComponentPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder schemaVersion(@Nullable Output<String> schemaVersion) {
            $.schemaVersion = schemaVersion;
            return this;
        }

        public Builder schemaVersion(String schemaVersion) {
            return schemaVersion(Output.of(schemaVersion));
        }

        public Builder sourceId(@Nullable Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        public Builder tags(@Nullable Output<ComponentTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(ComponentTagsArgs tags) {
            return tags(Output.of(tags));
        }

        public Builder variants(Output<List<ComponentVariantArgs>> variants) {
            $.variants = variants;
            return this;
        }

        public Builder variants(List<ComponentVariantArgs> variants) {
            return variants(Output.of(variants));
        }

        public Builder variants(ComponentVariantArgs... variants) {
            return variants(List.of(variants));
        }

        public ComponentArgs build() {
            $.bindingProperties = Objects.requireNonNull($.bindingProperties, "expected parameter 'bindingProperties' to be non-null");
            $.componentType = Objects.requireNonNull($.componentType, "expected parameter 'componentType' to be non-null");
            $.overrides = Objects.requireNonNull($.overrides, "expected parameter 'overrides' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.variants = Objects.requireNonNull($.variants, "expected parameter 'variants' to be non-null");
            return $;
        }
    }

}
