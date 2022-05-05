// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.storage.ObjectAccessControlArgs;
import com.pulumi.gcp.storage.inputs.ObjectAccessControlState;
import com.pulumi.gcp.storage.outputs.ObjectAccessControlProjectTeam;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The ObjectAccessControls resources represent the Access Control Lists
 * (ACLs) for objects within Google Cloud Storage. ACLs let you specify
 * who has access to your data and to what extent.
 * 
 * There are two roles that can be assigned to an entity:
 * 
 * READERs can get an object, though the acl property will not be revealed.
 * OWNERs are READERs, and they can get the acl property, update an object,
 * and call all objectAccessControls methods on the object. The owner of an
 * object is always an OWNER.
 * For more information, see Access Control, with the caveat that this API
 * uses READER and OWNER instead of READ and FULL_CONTROL.
 * 
 * To get more information about ObjectAccessControl, see:
 * 
 * * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/storage/docs/access-control/create-manage-lists)
 * 
 * ## Example Usage
 * ### Storage Object Access Control Public Object
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
 *         var bucket = new Bucket(&#34;bucket&#34;, BucketArgs.builder()        
 *             .location(&#34;US&#34;)
 *             .build());
 * 
 *         var object = new BucketObject(&#34;object&#34;, BucketObjectArgs.builder()        
 *             .bucket(bucket.getName())
 *             .source(new FileAsset(&#34;../static/img/header-logo.png&#34;))
 *             .build());
 * 
 *         var publicRule = new ObjectAccessControl(&#34;publicRule&#34;, ObjectAccessControlArgs.builder()        
 *             .object(object.getOutputName())
 *             .bucket(bucket.getName())
 *             .role(&#34;READER&#34;)
 *             .entity(&#34;allUsers&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * ObjectAccessControl can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:storage/objectAccessControl:ObjectAccessControl default {{bucket}}/{{object}}/{{entity}}
 * ```
 * 
 */
@ResourceType(type="gcp:storage/objectAccessControl:ObjectAccessControl")
public class ObjectAccessControl extends com.pulumi.resources.CustomResource {
    /**
     * The name of the bucket.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * The domain associated with the entity.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain associated with the entity.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The email address associated with the entity.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The email address associated with the entity.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * The entity holding the permission, in one of the following forms:
     * * user-{{userId}}
     * * user-{{email}} (such as &#34;user-liz@example.com&#34;)
     * * group-{{groupId}}
     * * group-{{email}} (such as &#34;group-example@googlegroups.com&#34;)
     * * domain-{{domain}} (such as &#34;domain-example.com&#34;)
     * * project-team-{{projectId}}
     * * allUsers
     * * allAuthenticatedUsers
     * 
     */
    @Export(name="entity", type=String.class, parameters={})
    private Output<String> entity;

    /**
     * @return The entity holding the permission, in one of the following forms:
     * * user-{{userId}}
     * * user-{{email}} (such as &#34;user-liz@example.com&#34;)
     * * group-{{groupId}}
     * * group-{{email}} (such as &#34;group-example@googlegroups.com&#34;)
     * * domain-{{domain}} (such as &#34;domain-example.com&#34;)
     * * project-team-{{projectId}}
     * * allUsers
     * * allAuthenticatedUsers
     * 
     */
    public Output<String> entity() {
        return this.entity;
    }
    /**
     * The ID for the entity
     * 
     */
    @Export(name="entityId", type=String.class, parameters={})
    private Output<String> entityId;

    /**
     * @return The ID for the entity
     * 
     */
    public Output<String> entityId() {
        return this.entityId;
    }
    /**
     * The content generation of the object, if applied to an object.
     * 
     */
    @Export(name="generation", type=Integer.class, parameters={})
    private Output<Integer> generation;

    /**
     * @return The content generation of the object, if applied to an object.
     * 
     */
    public Output<Integer> generation() {
        return this.generation;
    }
    /**
     * The name of the object to apply the access control to.
     * 
     */
    @Export(name="object", type=String.class, parameters={})
    private Output<String> object;

    /**
     * @return The name of the object to apply the access control to.
     * 
     */
    public Output<String> object() {
        return this.object;
    }
    /**
     * The project team associated with the entity
     * 
     */
    @Export(name="projectTeams", type=List.class, parameters={ObjectAccessControlProjectTeam.class})
    private Output<List<ObjectAccessControlProjectTeam>> projectTeams;

    /**
     * @return The project team associated with the entity
     * 
     */
    public Output<List<ObjectAccessControlProjectTeam>> projectTeams() {
        return this.projectTeams;
    }
    /**
     * The access permission for the entity.
     * Possible values are `OWNER` and `READER`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The access permission for the entity.
     * Possible values are `OWNER` and `READER`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObjectAccessControl(String name) {
        this(name, ObjectAccessControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObjectAccessControl(String name, ObjectAccessControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObjectAccessControl(String name, ObjectAccessControlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/objectAccessControl:ObjectAccessControl", name, args == null ? ObjectAccessControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ObjectAccessControl(String name, Output<String> id, @Nullable ObjectAccessControlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/objectAccessControl:ObjectAccessControl", name, state, makeResourceOptions(options, id));
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
    public static ObjectAccessControl get(String name, Output<String> id, @Nullable ObjectAccessControlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ObjectAccessControl(name, id, state, options);
    }
}
