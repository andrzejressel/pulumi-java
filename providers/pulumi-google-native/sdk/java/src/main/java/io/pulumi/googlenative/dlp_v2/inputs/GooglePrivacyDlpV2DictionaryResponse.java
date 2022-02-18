// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CloudStoragePathResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2WordListResponse;
import java.util.Objects;


/**
 * Custom information type based on a dictionary of words or phrases. This can be used to match sensitive information specific to the data, such as a list of employee IDs or job titles. Dictionary words are case-insensitive and all characters other than letters and digits in the unicode [Basic Multilingual Plane](https://en.wikipedia.org/wiki/Plane_%28Unicode%29#Basic_Multilingual_Plane) will be replaced with whitespace when scanning for matches, so the dictionary phrase "Sam Johnson" will match all three phrases "sam johnson", "Sam, Johnson", and "Sam (Johnson)". Additionally, the characters surrounding any match must be of a different type than the adjacent characters within the word, so letters must be next to non-letters and digits next to non-digits. For example, the dictionary word "jen" will match the first three letters of the text "jen123" but will return no matches for "jennifer". Dictionary words containing a large number of characters that are not letters or digits may result in unexpected findings because such characters are treated as whitespace. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries. For dictionaries that do not fit within these constraints, consider using `LargeCustomDictionaryConfig` in the `StoredInfoType` API.
 * 
 */
public final class GooglePrivacyDlpV2DictionaryResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2DictionaryResponse Empty = new GooglePrivacyDlpV2DictionaryResponse();

    /**
     * Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * 
     */
    @InputImport(name="cloudStoragePath", required=true)
    private final GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath;

    public GooglePrivacyDlpV2CloudStoragePathResponse getCloudStoragePath() {
        return this.cloudStoragePath;
    }

    /**
     * List of words or phrases to search for.
     * 
     */
    @InputImport(name="wordList", required=true)
    private final GooglePrivacyDlpV2WordListResponse wordList;

    public GooglePrivacyDlpV2WordListResponse getWordList() {
        return this.wordList;
    }

    public GooglePrivacyDlpV2DictionaryResponse(
        GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath,
        GooglePrivacyDlpV2WordListResponse wordList) {
        this.cloudStoragePath = Objects.requireNonNull(cloudStoragePath, "expected parameter 'cloudStoragePath' to be non-null");
        this.wordList = Objects.requireNonNull(wordList, "expected parameter 'wordList' to be non-null");
    }

    private GooglePrivacyDlpV2DictionaryResponse() {
        this.cloudStoragePath = null;
        this.wordList = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DictionaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath;
        private GooglePrivacyDlpV2WordListResponse wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DictionaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudStoragePath = defaults.cloudStoragePath;
    	      this.wordList = defaults.wordList;
        }

        public Builder setCloudStoragePath(GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath) {
            this.cloudStoragePath = Objects.requireNonNull(cloudStoragePath);
            return this;
        }

        public Builder setWordList(GooglePrivacyDlpV2WordListResponse wordList) {
            this.wordList = Objects.requireNonNull(wordList);
            return this;
        }

        public GooglePrivacyDlpV2DictionaryResponse build() {
            return new GooglePrivacyDlpV2DictionaryResponse(cloudStoragePath, wordList);
        }
    }
}
