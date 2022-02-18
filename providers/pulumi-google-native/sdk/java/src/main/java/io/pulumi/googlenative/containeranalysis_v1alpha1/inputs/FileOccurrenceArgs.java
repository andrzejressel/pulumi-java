// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.LicenseArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * FileOccurrence represents an SPDX File Information section: https://spdx.github.io/spdx-spec/4-file-information/
 * 
 */
public final class FileOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileOccurrenceArgs Empty = new FileOccurrenceArgs();

    /**
     * This field provides a place for the SPDX data creator to record, at the file level, acknowledgements that may be needed to be communicated in some contexts
     * 
     */
    @InputImport(name="attributions")
    private final @Nullable Input<List<String>> attributions;

    public Input<List<String>> getAttributions() {
        return this.attributions == null ? Input.empty() : this.attributions;
    }

    /**
     * This field provides a place for the SPDX file creator to record any general comments about the file
     * 
     */
    @InputImport(name="comment")
    private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    /**
     * This field provides a place for the SPDX file creator to record file contributors
     * 
     */
    @InputImport(name="contributors")
    private final @Nullable Input<List<String>> contributors;

    public Input<List<String>> getContributors() {
        return this.contributors == null ? Input.empty() : this.contributors;
    }

    /**
     * Identify the copyright holder of the file, as well as any dates present
     * 
     */
    @InputImport(name="copyright")
    private final @Nullable Input<String> copyright;

    public Input<String> getCopyright() {
        return this.copyright == null ? Input.empty() : this.copyright;
    }

    /**
     * This field contains the license information actually found in the file, if any
     * 
     */
    @InputImport(name="filesLicenseInfo")
    private final @Nullable Input<List<String>> filesLicenseInfo;

    public Input<List<String>> getFilesLicenseInfo() {
        return this.filesLicenseInfo == null ? Input.empty() : this.filesLicenseInfo;
    }

    /**
     * Uniquely identify any element in an SPDX document which may be referenced by other elements
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * This field contains the license the SPDX file creator has concluded as governing the file or alternative values if the governing license cannot be determined
     * 
     */
    @InputImport(name="licenseConcluded")
    private final @Nullable Input<LicenseArgs> licenseConcluded;

    public Input<LicenseArgs> getLicenseConcluded() {
        return this.licenseConcluded == null ? Input.empty() : this.licenseConcluded;
    }

    /**
     * This field provides a place for the SPDX file creator to record license notices or other such related notices found in the file
     * 
     */
    @InputImport(name="notice")
    private final @Nullable Input<String> notice;

    public Input<String> getNotice() {
        return this.notice == null ? Input.empty() : this.notice;
    }

    public FileOccurrenceArgs(
        @Nullable Input<List<String>> attributions,
        @Nullable Input<String> comment,
        @Nullable Input<List<String>> contributors,
        @Nullable Input<String> copyright,
        @Nullable Input<List<String>> filesLicenseInfo,
        @Nullable Input<String> id,
        @Nullable Input<LicenseArgs> licenseConcluded,
        @Nullable Input<String> notice) {
        this.attributions = attributions;
        this.comment = comment;
        this.contributors = contributors;
        this.copyright = copyright;
        this.filesLicenseInfo = filesLicenseInfo;
        this.id = id;
        this.licenseConcluded = licenseConcluded;
        this.notice = notice;
    }

    private FileOccurrenceArgs() {
        this.attributions = Input.empty();
        this.comment = Input.empty();
        this.contributors = Input.empty();
        this.copyright = Input.empty();
        this.filesLicenseInfo = Input.empty();
        this.id = Input.empty();
        this.licenseConcluded = Input.empty();
        this.notice = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> attributions;
        private @Nullable Input<String> comment;
        private @Nullable Input<List<String>> contributors;
        private @Nullable Input<String> copyright;
        private @Nullable Input<List<String>> filesLicenseInfo;
        private @Nullable Input<String> id;
        private @Nullable Input<LicenseArgs> licenseConcluded;
        private @Nullable Input<String> notice;

        public Builder() {
    	      // Empty
        }

        public Builder(FileOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributions = defaults.attributions;
    	      this.comment = defaults.comment;
    	      this.contributors = defaults.contributors;
    	      this.copyright = defaults.copyright;
    	      this.filesLicenseInfo = defaults.filesLicenseInfo;
    	      this.id = defaults.id;
    	      this.licenseConcluded = defaults.licenseConcluded;
    	      this.notice = defaults.notice;
        }

        public Builder setAttributions(@Nullable Input<List<String>> attributions) {
            this.attributions = attributions;
            return this;
        }

        public Builder setAttributions(@Nullable List<String> attributions) {
            this.attributions = Input.ofNullable(attributions);
            return this;
        }

        public Builder setComment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder setContributors(@Nullable Input<List<String>> contributors) {
            this.contributors = contributors;
            return this;
        }

        public Builder setContributors(@Nullable List<String> contributors) {
            this.contributors = Input.ofNullable(contributors);
            return this;
        }

        public Builder setCopyright(@Nullable Input<String> copyright) {
            this.copyright = copyright;
            return this;
        }

        public Builder setCopyright(@Nullable String copyright) {
            this.copyright = Input.ofNullable(copyright);
            return this;
        }

        public Builder setFilesLicenseInfo(@Nullable Input<List<String>> filesLicenseInfo) {
            this.filesLicenseInfo = filesLicenseInfo;
            return this;
        }

        public Builder setFilesLicenseInfo(@Nullable List<String> filesLicenseInfo) {
            this.filesLicenseInfo = Input.ofNullable(filesLicenseInfo);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLicenseConcluded(@Nullable Input<LicenseArgs> licenseConcluded) {
            this.licenseConcluded = licenseConcluded;
            return this;
        }

        public Builder setLicenseConcluded(@Nullable LicenseArgs licenseConcluded) {
            this.licenseConcluded = Input.ofNullable(licenseConcluded);
            return this;
        }

        public Builder setNotice(@Nullable Input<String> notice) {
            this.notice = notice;
            return this;
        }

        public Builder setNotice(@Nullable String notice) {
            this.notice = Input.ofNullable(notice);
            return this;
        }

        public FileOccurrenceArgs build() {
            return new FileOccurrenceArgs(attributions, comment, contributors, copyright, filesLicenseInfo, id, licenseConcluded, notice);
        }
    }
}
